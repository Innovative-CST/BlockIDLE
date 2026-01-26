package android.content.res;

import android.content.pm.ApplicationInfo;
import android.content.res.loader.ResourcesLoader;
import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import java.io.InputStream;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.graphics.Typeface;
import android.util.DisplayMetrics;

public class Resources
{
    public static final int ID_NULL = 0;
    
    @Deprecated
    public Resources(final AssetManager assets, final DisplayMetrics metrics, final Configuration config) {
        throw new RuntimeException("Stub!");
    }
    
    public static Resources getSystem() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public CharSequence getText(final int id) throws NotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Typeface getFont(final int id) throws NotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public CharSequence getQuantityText(final int id, final int quantity) throws NotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getString(final int id) throws NotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getString(final int id, final Object... formatArgs) throws NotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getQuantityString(final int id, final int quantity, final Object... formatArgs) throws NotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getQuantityString(final int id, final int quantity) throws NotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public CharSequence getText(final int id, final CharSequence def) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public CharSequence[] getTextArray(final int id) throws NotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String[] getStringArray(final int id) throws NotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public int[] getIntArray(final int id) throws NotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public TypedArray obtainTypedArray(final int id) throws NotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public float getDimension(final int id) throws NotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public int getDimensionPixelOffset(final int id) throws NotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public int getDimensionPixelSize(final int id) throws NotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public float getFraction(final int id, final int base, final int pbase) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Drawable getDrawable(final int id) throws NotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public Drawable getDrawable(final int id, @Nullable final Theme theme) throws NotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public Drawable getDrawableForDensity(final int id, final int density) throws NotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Drawable getDrawableForDensity(final int id, final int density, @Nullable final Theme theme) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Movie getMovie(final int id) throws NotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getColor(final int id) throws NotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public int getColor(final int id, @Nullable final Theme theme) throws NotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public ColorStateList getColorStateList(final int id) throws NotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public ColorStateList getColorStateList(final int id, @Nullable final Theme theme) throws NotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getBoolean(final int id) throws NotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public int getInteger(final int id) throws NotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public float getFloat(final int id) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public XmlResourceParser getLayout(final int id) throws NotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public XmlResourceParser getAnimation(final int id) throws NotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public XmlResourceParser getXml(final int id) throws NotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public InputStream openRawResource(final int id) throws NotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public InputStream openRawResource(final int id, final TypedValue value) throws NotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public AssetFileDescriptor openRawResourceFd(final int id) throws NotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public void getValue(final int id, final TypedValue outValue, final boolean resolveRefs) throws NotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public void getValueForDensity(final int id, final int density, final TypedValue outValue, final boolean resolveRefs) throws NotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public void getValue(final String name, final TypedValue outValue, final boolean resolveRefs) throws NotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public static int getAttributeSetSourceResId(@Nullable final AttributeSet set) {
        throw new RuntimeException("Stub!");
    }
    
    public final Theme newTheme() {
        throw new RuntimeException("Stub!");
    }
    
    public TypedArray obtainAttributes(final AttributeSet set, final int[] attrs) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void updateConfiguration(final Configuration config, final DisplayMetrics metrics) {
        throw new RuntimeException("Stub!");
    }
    
    public DisplayMetrics getDisplayMetrics() {
        throw new RuntimeException("Stub!");
    }
    
    public Configuration getConfiguration() {
        throw new RuntimeException("Stub!");
    }
    
    public int getIdentifier(final String name, final String defType, final String defPackage) {
        throw new RuntimeException("Stub!");
    }
    
    public String getResourceName(final int resid) throws NotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public String getResourcePackageName(final int resid) throws NotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public String getResourceTypeName(final int resid) throws NotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public String getResourceEntryName(final int resid) throws NotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public void parseBundleExtras(final XmlResourceParser parser, final Bundle outBundle) throws IOException, XmlPullParserException {
        throw new RuntimeException("Stub!");
    }
    
    public void parseBundleExtra(final String tagName, final AttributeSet attrs, final Bundle outBundle) throws XmlPullParserException {
        throw new RuntimeException("Stub!");
    }
    
    public final AssetManager getAssets() {
        throw new RuntimeException("Stub!");
    }
    
    public final void flushLayoutCache() {
        throw new RuntimeException("Stub!");
    }
    
    public final void finishPreloading() {
        throw new RuntimeException("Stub!");
    }
    
    public void addLoaders(@NonNull final ResourcesLoader... loaders) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeLoaders(@NonNull final ResourcesLoader... loaders) {
        throw new RuntimeException("Stub!");
    }
    
    public static void registerResourcePaths(@NonNull final String uniqueId, @NonNull final ApplicationInfo appInfo) {
        throw new RuntimeException("Stub!");
    }
    
    public static class NotFoundException extends RuntimeException
    {
        public NotFoundException() {
            throw new RuntimeException("Stub!");
        }
        
        public NotFoundException(final String name) {
            throw new RuntimeException("Stub!");
        }
        
        public NotFoundException(final String name, final Exception cause) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public final class Theme
    {
        Theme() {
            throw new RuntimeException("Stub!");
        }
        
        public void applyStyle(final int resId, final boolean force) {
            throw new RuntimeException("Stub!");
        }
        
        public void setTo(final Theme other) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public TypedArray obtainStyledAttributes(@NonNull final int[] attrs) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public TypedArray obtainStyledAttributes(final int resId, @NonNull final int[] attrs) throws NotFoundException {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public TypedArray obtainStyledAttributes(@Nullable final AttributeSet set, @NonNull final int[] attrs, final int defStyleAttr, final int defStyleRes) {
            throw new RuntimeException("Stub!");
        }
        
        public boolean resolveAttribute(final int resid, final TypedValue outValue, final boolean resolveRefs) {
            throw new RuntimeException("Stub!");
        }
        
        public Resources getResources() {
            throw new RuntimeException("Stub!");
        }
        
        public Drawable getDrawable(final int id) throws NotFoundException {
            throw new RuntimeException("Stub!");
        }
        
        public int getChangingConfigurations() {
            throw new RuntimeException("Stub!");
        }
        
        public void dump(final int priority, final String tag, final String prefix) {
            throw new RuntimeException("Stub!");
        }
        
        public void rebase() {
            throw new RuntimeException("Stub!");
        }
        
        public int getExplicitStyle(@Nullable final AttributeSet set) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public int[] getAttributeResolutionStack(final int defStyleAttr, final int defStyleRes, final int explicitStyleRes) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int hashCode() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean equals(@Nullable final Object o) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }
}
