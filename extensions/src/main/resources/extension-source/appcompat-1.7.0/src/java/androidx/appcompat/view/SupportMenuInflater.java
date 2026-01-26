package androidx.appcompat.view;

import java.lang.reflect.Constructor;
import androidx.core.view.MenuItemCompat;
import android.view.View;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.widget.DrawableUtils;
import android.util.Log;
import androidx.appcompat.widget.TintTypedArray;
import android.content.res.TypedArray;
import androidx.appcompat.R;
import android.graphics.PorterDuff;
import android.content.res.ColorStateList;
import androidx.core.view.ActionProvider;
import java.lang.reflect.Method;
import android.view.MenuItem;
import android.content.ContextWrapper;
import android.app.Activity;
import android.view.SubMenu;
import android.util.AttributeSet;
import android.content.res.XmlResourceParser;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import android.view.InflateException;
import androidx.appcompat.view.menu.MenuBuilder;
import org.xmlpull.v1.XmlPullParser;
import android.util.Xml;
import androidx.core.internal.view.SupportMenu;
import android.view.Menu;
import androidx.annotation.LayoutRes;
import android.content.Context;
import androidx.annotation.RestrictTo;
import android.view.MenuInflater;

@RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
public class SupportMenuInflater extends MenuInflater
{
    static final String LOG_TAG = "SupportMenuInflater";
    private static final String XML_MENU = "menu";
    private static final String XML_GROUP = "group";
    private static final String XML_ITEM = "item";
    static final int NO_ID = 0;
    static final Class<?>[] ACTION_VIEW_CONSTRUCTOR_SIGNATURE;
    static final Class<?>[] ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE;
    final Object[] mActionViewConstructorArguments;
    final Object[] mActionProviderConstructorArguments;
    Context mContext;
    private Object mRealOwner;
    
    public SupportMenuInflater(final Context context) {
        super(context);
        this.mContext = context;
        this.mActionViewConstructorArguments = new Object[] { context };
        this.mActionProviderConstructorArguments = this.mActionViewConstructorArguments;
    }
    
    public void inflate(@LayoutRes final int menuRes, final Menu menu) {
        if (!(menu instanceof SupportMenu)) {
            super.inflate(menuRes, menu);
            return;
        }
        XmlResourceParser parser = null;
        boolean wasDispatchingItemsChanged = false;
        try {
            parser = this.mContext.getResources().getLayout(menuRes);
            final AttributeSet attrs = Xml.asAttributeSet((XmlPullParser)parser);
            final MenuBuilder menuBuilder;
            if (menu instanceof MenuBuilder && (menuBuilder = (MenuBuilder)menu).isDispatchingItemsChanged()) {
                menuBuilder.stopDispatchingItemsChanged();
                wasDispatchingItemsChanged = true;
            }
            this.parseMenu((XmlPullParser)parser, attrs, menu);
        }
        catch (final XmlPullParserException e) {
            throw new InflateException("Error inflating menu XML", (Throwable)e);
        }
        catch (final IOException e2) {
            throw new InflateException("Error inflating menu XML", (Throwable)e2);
        }
        finally {
            if (wasDispatchingItemsChanged) {
                ((MenuBuilder)menu).startDispatchingItemsChanged();
            }
            if (parser != null) {
                parser.close();
            }
        }
    }
    
    private void parseMenu(final XmlPullParser parser, final AttributeSet attrs, final Menu menu) throws XmlPullParserException, IOException {
        final MenuState menuState = new MenuState(menu);
        int eventType = parser.getEventType();
        boolean lookingForEndOfUnknownTag = false;
        String unknownTagName = null;
        String tagName;
        while (true) {
            while (eventType != 2) {
                eventType = parser.next();
                if (eventType == 1) {
                    boolean reachedEndOfMenu = false;
                    while (!reachedEndOfMenu) {
                        switch (eventType) {
                            case 2: {
                                if (lookingForEndOfUnknownTag) {
                                    break;
                                }
                                tagName = parser.getName();
                                if (tagName.equals((Object)"group")) {
                                    menuState.readGroup(attrs);
                                    break;
                                }
                                if (tagName.equals((Object)"item")) {
                                    menuState.readItem(attrs);
                                    break;
                                }
                                if (tagName.equals((Object)"menu")) {
                                    final SubMenu subMenu = menuState.addSubMenuItem();
                                    this.parseMenu(parser, attrs, (Menu)subMenu);
                                    break;
                                }
                                lookingForEndOfUnknownTag = true;
                                unknownTagName = tagName;
                                break;
                            }
                            case 3: {
                                tagName = parser.getName();
                                if (lookingForEndOfUnknownTag && tagName.equals((Object)unknownTagName)) {
                                    lookingForEndOfUnknownTag = false;
                                    unknownTagName = null;
                                    break;
                                }
                                if (tagName.equals((Object)"group")) {
                                    menuState.resetGroup();
                                    break;
                                }
                                if (tagName.equals((Object)"item")) {
                                    if (menuState.hasAddedItem()) {
                                        break;
                                    }
                                    if (menuState.itemActionProvider != null && menuState.itemActionProvider.hasSubMenu()) {
                                        menuState.addSubMenuItem();
                                        break;
                                    }
                                    menuState.addItem();
                                    break;
                                }
                                else {
                                    if (tagName.equals((Object)"menu")) {
                                        reachedEndOfMenu = true;
                                        break;
                                    }
                                    break;
                                }
                                break;
                            }
                            case 1: {
                                throw new RuntimeException("Unexpected end of document");
                            }
                        }
                        eventType = parser.next();
                    }
                    return;
                }
            }
            tagName = parser.getName();
            if (tagName.equals((Object)"menu")) {
                eventType = parser.next();
                continue;
            }
            break;
        }
        throw new RuntimeException("Expecting menu, got " + tagName);
    }
    
    Object getRealOwner() {
        if (this.mRealOwner == null) {
            this.mRealOwner = this.findRealOwner(this.mContext);
        }
        return this.mRealOwner;
    }
    
    private Object findRealOwner(final Object owner) {
        if (owner instanceof Activity) {
            return owner;
        }
        if (owner instanceof ContextWrapper) {
            return this.findRealOwner(((ContextWrapper)owner).getBaseContext());
        }
        return owner;
    }
    
    static {
        ACTION_VIEW_CONSTRUCTOR_SIGNATURE = new Class[] { Context.class };
        ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE = SupportMenuInflater.ACTION_VIEW_CONSTRUCTOR_SIGNATURE;
    }
    
    private static class InflatedOnMenuItemClickListener implements MenuItem.OnMenuItemClickListener
    {
        private static final Class<?>[] PARAM_TYPES;
        private Object mRealOwner;
        private Method mMethod;
        
        public InflatedOnMenuItemClickListener(final Object realOwner, final String methodName) {
            this.mRealOwner = realOwner;
            final Class<?> c = realOwner.getClass();
            try {
                this.mMethod = c.getMethod(methodName, InflatedOnMenuItemClickListener.PARAM_TYPES);
            }
            catch (final Exception e) {
                final InflateException ex = new InflateException("Couldn't resolve menu item onClick handler " + methodName + " in class " + c.getName());
                ex.initCause((Throwable)e);
                throw ex;
            }
        }
        
        public boolean onMenuItemClick(final MenuItem item) {
            try {
                if (this.mMethod.getReturnType() == Boolean.TYPE) {
                    return (boolean)this.mMethod.invoke(this.mRealOwner, new Object[] { item });
                }
                this.mMethod.invoke(this.mRealOwner, new Object[] { item });
                return true;
            }
            catch (final Exception e) {
                throw new RuntimeException((Throwable)e);
            }
        }
        
        static {
            PARAM_TYPES = new Class[] { MenuItem.class };
        }
    }
    
    private class MenuState
    {
        private Menu menu;
        private int groupId;
        private int groupCategory;
        private int groupOrder;
        private int groupCheckable;
        private boolean groupVisible;
        private boolean groupEnabled;
        private boolean itemAdded;
        private int itemId;
        private int itemCategoryOrder;
        private CharSequence itemTitle;
        private CharSequence itemTitleCondensed;
        private int itemIconResId;
        private char itemAlphabeticShortcut;
        private int itemAlphabeticModifiers;
        private char itemNumericShortcut;
        private int itemNumericModifiers;
        private int itemCheckable;
        private boolean itemChecked;
        private boolean itemVisible;
        private boolean itemEnabled;
        private int itemShowAsAction;
        private int itemActionViewLayout;
        private String itemActionViewClassName;
        private String itemActionProviderClassName;
        private String itemListenerMethodName;
        ActionProvider itemActionProvider;
        private CharSequence itemContentDescription;
        private CharSequence itemTooltipText;
        private ColorStateList itemIconTintList;
        private PorterDuff.Mode itemIconTintMode;
        private static final int defaultGroupId = 0;
        private static final int defaultItemId = 0;
        private static final int defaultItemCategory = 0;
        private static final int defaultItemOrder = 0;
        private static final int defaultItemCheckable = 0;
        private static final boolean defaultItemChecked = false;
        private static final boolean defaultItemVisible = true;
        private static final boolean defaultItemEnabled = true;
        
        public MenuState(final Menu menu) {
            this.itemIconTintList = null;
            this.itemIconTintMode = null;
            this.menu = menu;
            this.resetGroup();
        }
        
        public void resetGroup() {
            this.groupId = 0;
            this.groupCategory = 0;
            this.groupOrder = 0;
            this.groupCheckable = 0;
            this.groupVisible = true;
            this.groupEnabled = true;
        }
        
        public void readGroup(final AttributeSet attrs) {
            final TypedArray a = SupportMenuInflater.this.mContext.obtainStyledAttributes(attrs, R.styleable.MenuGroup);
            this.groupId = a.getResourceId(R.styleable.MenuGroup_android_id, 0);
            this.groupCategory = a.getInt(R.styleable.MenuGroup_android_menuCategory, 0);
            this.groupOrder = a.getInt(R.styleable.MenuGroup_android_orderInCategory, 0);
            this.groupCheckable = a.getInt(R.styleable.MenuGroup_android_checkableBehavior, 0);
            this.groupVisible = a.getBoolean(R.styleable.MenuGroup_android_visible, true);
            this.groupEnabled = a.getBoolean(R.styleable.MenuGroup_android_enabled, true);
            a.recycle();
        }
        
        public void readItem(final AttributeSet attrs) {
            final TintTypedArray a = TintTypedArray.obtainStyledAttributes(SupportMenuInflater.this.mContext, attrs, R.styleable.MenuItem);
            this.itemId = a.getResourceId(R.styleable.MenuItem_android_id, 0);
            final int category = a.getInt(R.styleable.MenuItem_android_menuCategory, this.groupCategory);
            final int order = a.getInt(R.styleable.MenuItem_android_orderInCategory, this.groupOrder);
            this.itemCategoryOrder = ((category & 0xFFFF0000) | (order & 0xFFFF));
            this.itemTitle = a.getText(R.styleable.MenuItem_android_title);
            this.itemTitleCondensed = a.getText(R.styleable.MenuItem_android_titleCondensed);
            this.itemIconResId = a.getResourceId(R.styleable.MenuItem_android_icon, 0);
            this.itemAlphabeticShortcut = this.getShortcut(a.getString(R.styleable.MenuItem_android_alphabeticShortcut));
            this.itemAlphabeticModifiers = a.getInt(R.styleable.MenuItem_alphabeticModifiers, 4096);
            this.itemNumericShortcut = this.getShortcut(a.getString(R.styleable.MenuItem_android_numericShortcut));
            this.itemNumericModifiers = a.getInt(R.styleable.MenuItem_numericModifiers, 4096);
            if (a.hasValue(R.styleable.MenuItem_android_checkable)) {
                this.itemCheckable = (a.getBoolean(R.styleable.MenuItem_android_checkable, false) ? 1 : 0);
            }
            else {
                this.itemCheckable = this.groupCheckable;
            }
            this.itemChecked = a.getBoolean(R.styleable.MenuItem_android_checked, false);
            this.itemVisible = a.getBoolean(R.styleable.MenuItem_android_visible, this.groupVisible);
            this.itemEnabled = a.getBoolean(R.styleable.MenuItem_android_enabled, this.groupEnabled);
            this.itemShowAsAction = a.getInt(R.styleable.MenuItem_showAsAction, -1);
            this.itemListenerMethodName = a.getString(R.styleable.MenuItem_android_onClick);
            this.itemActionViewLayout = a.getResourceId(R.styleable.MenuItem_actionLayout, 0);
            this.itemActionViewClassName = a.getString(R.styleable.MenuItem_actionViewClass);
            this.itemActionProviderClassName = a.getString(R.styleable.MenuItem_actionProviderClass);
            final boolean hasActionProvider = this.itemActionProviderClassName != null;
            if (hasActionProvider && this.itemActionViewLayout == 0 && this.itemActionViewClassName == null) {
                this.itemActionProvider = this.newInstance(this.itemActionProviderClassName, SupportMenuInflater.ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE, SupportMenuInflater.this.mActionProviderConstructorArguments);
            }
            else {
                if (hasActionProvider) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.itemActionProvider = null;
            }
            this.itemContentDescription = a.getText(R.styleable.MenuItem_contentDescription);
            this.itemTooltipText = a.getText(R.styleable.MenuItem_tooltipText);
            if (a.hasValue(R.styleable.MenuItem_iconTintMode)) {
                this.itemIconTintMode = DrawableUtils.parseTintMode(a.getInt(R.styleable.MenuItem_iconTintMode, -1), this.itemIconTintMode);
            }
            else {
                this.itemIconTintMode = null;
            }
            if (a.hasValue(R.styleable.MenuItem_iconTint)) {
                this.itemIconTintList = a.getColorStateList(R.styleable.MenuItem_iconTint);
            }
            else {
                this.itemIconTintList = null;
            }
            a.recycle();
            this.itemAdded = false;
        }
        
        private char getShortcut(final String shortcutString) {
            if (shortcutString == null) {
                return '\0';
            }
            return shortcutString.charAt(0);
        }
        
        private void setItem(final MenuItem item) {
            item.setChecked(this.itemChecked).setVisible(this.itemVisible).setEnabled(this.itemEnabled).setCheckable(this.itemCheckable >= 1).setTitleCondensed(this.itemTitleCondensed).setIcon(this.itemIconResId);
            if (this.itemShowAsAction >= 0) {
                item.setShowAsAction(this.itemShowAsAction);
            }
            if (this.itemListenerMethodName != null) {
                if (SupportMenuInflater.this.mContext.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                item.setOnMenuItemClickListener((MenuItem.OnMenuItemClickListener)new InflatedOnMenuItemClickListener(SupportMenuInflater.this.getRealOwner(), this.itemListenerMethodName));
            }
            if (this.itemCheckable >= 2) {
                if (item instanceof MenuItemImpl) {
                    ((MenuItemImpl)item).setExclusiveCheckable(true);
                }
                else if (item instanceof MenuItemWrapperICS) {
                    ((MenuItemWrapperICS)item).setExclusiveCheckable(true);
                }
            }
            boolean actionViewSpecified = false;
            if (this.itemActionViewClassName != null) {
                final View actionView = this.newInstance(this.itemActionViewClassName, SupportMenuInflater.ACTION_VIEW_CONSTRUCTOR_SIGNATURE, SupportMenuInflater.this.mActionViewConstructorArguments);
                item.setActionView(actionView);
                actionViewSpecified = true;
            }
            if (this.itemActionViewLayout > 0) {
                if (!actionViewSpecified) {
                    item.setActionView(this.itemActionViewLayout);
                    actionViewSpecified = true;
                }
                else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            if (this.itemActionProvider != null) {
                MenuItemCompat.setActionProvider(item, this.itemActionProvider);
            }
            MenuItemCompat.setContentDescription(item, this.itemContentDescription);
            MenuItemCompat.setTooltipText(item, this.itemTooltipText);
            MenuItemCompat.setAlphabeticShortcut(item, this.itemAlphabeticShortcut, this.itemAlphabeticModifiers);
            MenuItemCompat.setNumericShortcut(item, this.itemNumericShortcut, this.itemNumericModifiers);
            if (this.itemIconTintMode != null) {
                MenuItemCompat.setIconTintMode(item, this.itemIconTintMode);
            }
            if (this.itemIconTintList != null) {
                MenuItemCompat.setIconTintList(item, this.itemIconTintList);
            }
        }
        
        public void addItem() {
            this.itemAdded = true;
            this.setItem(this.menu.add(this.groupId, this.itemId, this.itemCategoryOrder, this.itemTitle));
        }
        
        public SubMenu addSubMenuItem() {
            this.itemAdded = true;
            final SubMenu subMenu = this.menu.addSubMenu(this.groupId, this.itemId, this.itemCategoryOrder, this.itemTitle);
            this.setItem(subMenu.getItem());
            return subMenu;
        }
        
        public boolean hasAddedItem() {
            return this.itemAdded;
        }
        
        private <T> T newInstance(final String className, final Class<?>[] constructorSignature, final Object[] arguments) {
            try {
                final Class<?> clazz = Class.forName(className, false, SupportMenuInflater.this.mContext.getClassLoader());
                final Constructor<?> constructor = clazz.getConstructor(constructorSignature);
                constructor.setAccessible(true);
                return (T)constructor.newInstance(arguments);
            }
            catch (final Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + className, (Throwable)e);
                return null;
            }
        }
    }
}
