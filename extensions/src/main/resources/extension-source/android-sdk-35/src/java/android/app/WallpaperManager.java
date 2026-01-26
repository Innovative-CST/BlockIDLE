package android.app;

import android.os.Bundle;
import android.os.IBinder;
import java.io.InputStream;
import android.graphics.Rect;
import android.graphics.Bitmap;
import java.io.IOException;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.graphics.drawable.Drawable;
import android.content.Context;

public class WallpaperManager
{
    public static final String ACTION_CHANGE_LIVE_WALLPAPER = "android.service.wallpaper.CHANGE_LIVE_WALLPAPER";
    public static final String ACTION_CROP_AND_SET_WALLPAPER = "android.service.wallpaper.CROP_AND_SET_WALLPAPER";
    public static final String ACTION_LIVE_WALLPAPER_CHOOSER = "android.service.wallpaper.LIVE_WALLPAPER_CHOOSER";
    public static final String COMMAND_DROP = "android.home.drop";
    public static final String COMMAND_SECONDARY_TAP = "android.wallpaper.secondaryTap";
    public static final String COMMAND_TAP = "android.wallpaper.tap";
    public static final String EXTRA_LIVE_WALLPAPER_COMPONENT = "android.service.wallpaper.extra.LIVE_WALLPAPER_COMPONENT";
    public static final int FLAG_LOCK = 2;
    public static final int FLAG_SYSTEM = 1;
    public static final String WALLPAPER_PREVIEW_META_DATA = "android.wallpaper.preview";
    
    WallpaperManager() {
        throw new RuntimeException("Stub!");
    }
    
    public static WallpaperManager getInstance(final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Drawable getDrawable() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Drawable getDrawable(final int which) {
        throw new RuntimeException("Stub!");
    }
    
    public Drawable getBuiltInDrawable() {
        throw new RuntimeException("Stub!");
    }
    
    public Drawable getBuiltInDrawable(final int which) {
        throw new RuntimeException("Stub!");
    }
    
    public Drawable getBuiltInDrawable(final int outWidth, final int outHeight, final boolean scaleToFit, final float horizontalAlignment, final float verticalAlignment) {
        throw new RuntimeException("Stub!");
    }
    
    public Drawable getBuiltInDrawable(final int outWidth, final int outHeight, final boolean scaleToFit, final float horizontalAlignment, final float verticalAlignment, final int which) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Drawable peekDrawable() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Drawable peekDrawable(final int which) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Drawable getFastDrawable() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Drawable getFastDrawable(final int which) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Drawable peekFastDrawable() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Drawable peekFastDrawable(final int which) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ParcelFileDescriptor getWallpaperFile(final int which) {
        throw new RuntimeException("Stub!");
    }
    
    public void addOnColorsChangedListener(@NonNull final OnColorsChangedListener listener, @NonNull final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeOnColorsChangedListener(@NonNull final OnColorsChangedListener callback) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public WallpaperColors getWallpaperColors(final int which) {
        throw new RuntimeException("Stub!");
    }
    
    public void forgetLoadedWallpaper() {
        throw new RuntimeException("Stub!");
    }
    
    public WallpaperInfo getWallpaperInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public WallpaperInfo getWallpaperInfo(final int which) {
        throw new RuntimeException("Stub!");
    }
    
    public int getWallpaperId(final int which) {
        throw new RuntimeException("Stub!");
    }
    
    public Intent getCropAndSetWallpaperIntent(final Uri imageUri) {
        throw new RuntimeException("Stub!");
    }
    
    public void setResource(final int resid) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public int setResource(final int resid, final int which) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void setBitmap(final Bitmap bitmap) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public int setBitmap(final Bitmap fullImage, final Rect visibleCropHint, final boolean allowBackup) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public int setBitmap(final Bitmap fullImage, final Rect visibleCropHint, final boolean allowBackup, final int which) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void setStream(final InputStream bitmapData) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public int setStream(final InputStream bitmapData, final Rect visibleCropHint, final boolean allowBackup) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public int setStream(final InputStream bitmapData, final Rect visibleCropHint, final boolean allowBackup, final int which) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasResourceWallpaper(final int resid) {
        throw new RuntimeException("Stub!");
    }
    
    public int getDesiredMinimumWidth() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDesiredMinimumHeight() {
        throw new RuntimeException("Stub!");
    }
    
    public void suggestDesiredDimensions(final int minimumWidth, final int minimumHeight) {
        throw new RuntimeException("Stub!");
    }
    
    public void setDisplayPadding(final Rect padding) {
        throw new RuntimeException("Stub!");
    }
    
    public void clearWallpaper() {
        throw new RuntimeException("Stub!");
    }
    
    public void setWallpaperOffsets(final IBinder windowToken, final float xOffset, final float yOffset) {
        throw new RuntimeException("Stub!");
    }
    
    public void setWallpaperOffsetSteps(final float xStep, final float yStep) {
        throw new RuntimeException("Stub!");
    }
    
    public void sendWallpaperCommand(final IBinder windowToken, final String action, final int x, final int y, final int z, final Bundle extras) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isWallpaperSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isSetWallpaperAllowed() {
        throw new RuntimeException("Stub!");
    }
    
    public void clearWallpaperOffsets(final IBinder windowToken) {
        throw new RuntimeException("Stub!");
    }
    
    public void clear() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void clear(final int which) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public interface OnColorsChangedListener
    {
        void onColorsChanged(@Nullable final WallpaperColors p0, final int p1);
    }
}
