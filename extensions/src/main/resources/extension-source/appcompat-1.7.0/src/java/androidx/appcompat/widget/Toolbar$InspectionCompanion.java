package androidx.appcompat.widget;

import android.view.inspector.PropertyReader;
import androidx.appcompat.R;
import androidx.annotation.NonNull;
import android.view.inspector.PropertyMapper;
import androidx.annotation.RestrictTo;
import androidx.annotation.RequiresApi;
import android.view.inspector.InspectionCompanion;

@RequiresApi(29)
@RestrictTo({ RestrictTo.Scope.LIBRARY })
public final class Toolbar$InspectionCompanion implements InspectionCompanion<Toolbar>
{
    private boolean mPropertiesMapped;
    private int mCollapseContentDescriptionId;
    private int mCollapseIconId;
    private int mContentInsetEndId;
    private int mContentInsetEndWithActionsId;
    private int mContentInsetLeftId;
    private int mContentInsetRightId;
    private int mContentInsetStartId;
    private int mContentInsetStartWithNavigationId;
    private int mLogoId;
    private int mLogoDescriptionId;
    private int mMenuId;
    private int mNavigationContentDescriptionId;
    private int mNavigationIconId;
    private int mPopupThemeId;
    private int mSubtitleId;
    private int mTitleId;
    private int mTitleMarginBottomId;
    private int mTitleMarginEndId;
    private int mTitleMarginStartId;
    private int mTitleMarginTopId;
    
    public Toolbar$InspectionCompanion() {
        this.mPropertiesMapped = false;
    }
    
    public void mapProperties(@NonNull final PropertyMapper propertyMapper) {
        this.mCollapseContentDescriptionId = propertyMapper.mapObject("collapseContentDescription", R.attr.collapseContentDescription);
        this.mCollapseIconId = propertyMapper.mapObject("collapseIcon", R.attr.collapseIcon);
        this.mContentInsetEndId = propertyMapper.mapInt("contentInsetEnd", R.attr.contentInsetEnd);
        this.mContentInsetEndWithActionsId = propertyMapper.mapInt("contentInsetEndWithActions", R.attr.contentInsetEndWithActions);
        this.mContentInsetLeftId = propertyMapper.mapInt("contentInsetLeft", R.attr.contentInsetLeft);
        this.mContentInsetRightId = propertyMapper.mapInt("contentInsetRight", R.attr.contentInsetRight);
        this.mContentInsetStartId = propertyMapper.mapInt("contentInsetStart", R.attr.contentInsetStart);
        this.mContentInsetStartWithNavigationId = propertyMapper.mapInt("contentInsetStartWithNavigation", R.attr.contentInsetStartWithNavigation);
        this.mLogoId = propertyMapper.mapObject("logo", R.attr.logo);
        this.mLogoDescriptionId = propertyMapper.mapObject("logoDescription", R.attr.logoDescription);
        this.mMenuId = propertyMapper.mapObject("menu", R.attr.menu);
        this.mNavigationContentDescriptionId = propertyMapper.mapObject("navigationContentDescription", R.attr.navigationContentDescription);
        this.mNavigationIconId = propertyMapper.mapObject("navigationIcon", R.attr.navigationIcon);
        this.mPopupThemeId = propertyMapper.mapResourceId("popupTheme", R.attr.popupTheme);
        this.mSubtitleId = propertyMapper.mapObject("subtitle", R.attr.subtitle);
        this.mTitleId = propertyMapper.mapObject("title", R.attr.title);
        this.mTitleMarginBottomId = propertyMapper.mapInt("titleMarginBottom", R.attr.titleMarginBottom);
        this.mTitleMarginEndId = propertyMapper.mapInt("titleMarginEnd", R.attr.titleMarginEnd);
        this.mTitleMarginStartId = propertyMapper.mapInt("titleMarginStart", R.attr.titleMarginStart);
        this.mTitleMarginTopId = propertyMapper.mapInt("titleMarginTop", R.attr.titleMarginTop);
        this.mPropertiesMapped = true;
    }
    
    public void readProperties(@NonNull final Toolbar toolbar, @NonNull final PropertyReader propertyReader) {
        if (!this.mPropertiesMapped) {
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
        propertyReader.readObject(this.mCollapseContentDescriptionId, (Object)toolbar.getCollapseContentDescription());
        propertyReader.readObject(this.mCollapseIconId, (Object)toolbar.getCollapseIcon());
        propertyReader.readInt(this.mContentInsetEndId, toolbar.getContentInsetEnd());
        propertyReader.readInt(this.mContentInsetEndWithActionsId, toolbar.getContentInsetEndWithActions());
        propertyReader.readInt(this.mContentInsetLeftId, toolbar.getContentInsetLeft());
        propertyReader.readInt(this.mContentInsetRightId, toolbar.getContentInsetRight());
        propertyReader.readInt(this.mContentInsetStartId, toolbar.getContentInsetStart());
        propertyReader.readInt(this.mContentInsetStartWithNavigationId, toolbar.getContentInsetStartWithNavigation());
        propertyReader.readObject(this.mLogoId, (Object)toolbar.getLogo());
        propertyReader.readObject(this.mLogoDescriptionId, (Object)toolbar.getLogoDescription());
        propertyReader.readObject(this.mMenuId, (Object)toolbar.getMenu());
        propertyReader.readObject(this.mNavigationContentDescriptionId, (Object)toolbar.getNavigationContentDescription());
        propertyReader.readObject(this.mNavigationIconId, (Object)toolbar.getNavigationIcon());
        propertyReader.readResourceId(this.mPopupThemeId, toolbar.getPopupTheme());
        propertyReader.readObject(this.mSubtitleId, (Object)toolbar.getSubtitle());
        propertyReader.readObject(this.mTitleId, (Object)toolbar.getTitle());
        propertyReader.readInt(this.mTitleMarginBottomId, toolbar.getTitleMarginBottom());
        propertyReader.readInt(this.mTitleMarginEndId, toolbar.getTitleMarginEnd());
        propertyReader.readInt(this.mTitleMarginStartId, toolbar.getTitleMarginStart());
        propertyReader.readInt(this.mTitleMarginTopId, toolbar.getTitleMarginTop());
    }
}
