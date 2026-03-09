package androidx.appcompat.app;

import android.util.LongSparseArray;
import androidx.annotation.RequiresApi;
import java.util.Map;
import android.util.Log;
import android.os.Build;
import androidx.annotation.NonNull;
import android.content.res.Resources;
import java.lang.reflect.Field;

class ResourcesFlusher
{
    private static final String TAG = "ResourcesFlusher";
    private static Field sDrawableCacheField;
    private static boolean sDrawableCacheFieldFetched;
    private static Class<?> sThemedResourceCacheClazz;
    private static boolean sThemedResourceCacheClazzFetched;
    private static Field sThemedResourceCache_mUnthemedEntriesField;
    private static boolean sThemedResourceCache_mUnthemedEntriesFieldFetched;
    private static Field sResourcesImplField;
    private static boolean sResourcesImplFieldFetched;
    
    static void flush(@NonNull final Resources resources) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            flushNougats(resources);
        }
        else if (Build.VERSION.SDK_INT >= 23) {
            flushMarshmallows(resources);
        }
        else if (Build.VERSION.SDK_INT >= 21) {
            flushLollipops(resources);
        }
    }
    
    @RequiresApi(21)
    private static void flushLollipops(@NonNull final Resources resources) {
        if (!ResourcesFlusher.sDrawableCacheFieldFetched) {
            try {
                (ResourcesFlusher.sDrawableCacheField = Resources.class.getDeclaredField("mDrawableCache")).setAccessible(true);
            }
            catch (final NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", (Throwable)e);
            }
            ResourcesFlusher.sDrawableCacheFieldFetched = true;
        }
        if (ResourcesFlusher.sDrawableCacheField != null) {
            Map drawableCache = null;
            try {
                drawableCache = (Map)ResourcesFlusher.sDrawableCacheField.get((Object)resources);
            }
            catch (final IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", (Throwable)e2);
            }
            if (drawableCache != null) {
                drawableCache.clear();
            }
        }
    }
    
    @RequiresApi(23)
    private static void flushMarshmallows(@NonNull final Resources resources) {
        if (!ResourcesFlusher.sDrawableCacheFieldFetched) {
            try {
                (ResourcesFlusher.sDrawableCacheField = Resources.class.getDeclaredField("mDrawableCache")).setAccessible(true);
            }
            catch (final NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", (Throwable)e);
            }
            ResourcesFlusher.sDrawableCacheFieldFetched = true;
        }
        Object drawableCache = null;
        if (ResourcesFlusher.sDrawableCacheField != null) {
            try {
                drawableCache = ResourcesFlusher.sDrawableCacheField.get((Object)resources);
            }
            catch (final IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", (Throwable)e2);
            }
        }
        if (drawableCache == null) {
            return;
        }
        flushThemedResourcesCache(drawableCache);
    }
    
    @RequiresApi(24)
    private static void flushNougats(@NonNull final Resources resources) {
        if (!ResourcesFlusher.sResourcesImplFieldFetched) {
            try {
                (ResourcesFlusher.sResourcesImplField = Resources.class.getDeclaredField("mResourcesImpl")).setAccessible(true);
            }
            catch (final NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", (Throwable)e);
            }
            ResourcesFlusher.sResourcesImplFieldFetched = true;
        }
        if (ResourcesFlusher.sResourcesImplField == null) {
            return;
        }
        Object resourcesImpl = null;
        try {
            resourcesImpl = ResourcesFlusher.sResourcesImplField.get((Object)resources);
        }
        catch (final IllegalAccessException e2) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", (Throwable)e2);
        }
        if (resourcesImpl == null) {
            return;
        }
        if (!ResourcesFlusher.sDrawableCacheFieldFetched) {
            try {
                (ResourcesFlusher.sDrawableCacheField = resourcesImpl.getClass().getDeclaredField("mDrawableCache")).setAccessible(true);
            }
            catch (final NoSuchFieldException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", (Throwable)e3);
            }
            ResourcesFlusher.sDrawableCacheFieldFetched = true;
        }
        Object drawableCache = null;
        if (ResourcesFlusher.sDrawableCacheField != null) {
            try {
                drawableCache = ResourcesFlusher.sDrawableCacheField.get(resourcesImpl);
            }
            catch (final IllegalAccessException e4) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", (Throwable)e4);
            }
        }
        if (drawableCache != null) {
            flushThemedResourcesCache(drawableCache);
        }
    }
    
    private static void flushThemedResourcesCache(@NonNull final Object cache) {
        if (!ResourcesFlusher.sThemedResourceCacheClazzFetched) {
            try {
                ResourcesFlusher.sThemedResourceCacheClazz = Class.forName("android.content.res.ThemedResourceCache");
            }
            catch (final ClassNotFoundException e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", (Throwable)e);
            }
            ResourcesFlusher.sThemedResourceCacheClazzFetched = true;
        }
        if (ResourcesFlusher.sThemedResourceCacheClazz == null) {
            return;
        }
        if (!ResourcesFlusher.sThemedResourceCache_mUnthemedEntriesFieldFetched) {
            try {
                (ResourcesFlusher.sThemedResourceCache_mUnthemedEntriesField = ResourcesFlusher.sThemedResourceCacheClazz.getDeclaredField("mUnthemedEntries")).setAccessible(true);
            }
            catch (final NoSuchFieldException ee) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", (Throwable)ee);
            }
            ResourcesFlusher.sThemedResourceCache_mUnthemedEntriesFieldFetched = true;
        }
        if (ResourcesFlusher.sThemedResourceCache_mUnthemedEntriesField == null) {
            return;
        }
        LongSparseArray unthemedEntries = null;
        try {
            unthemedEntries = (LongSparseArray)ResourcesFlusher.sThemedResourceCache_mUnthemedEntriesField.get(cache);
        }
        catch (final IllegalAccessException e2) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", (Throwable)e2);
        }
        if (unthemedEntries != null) {
            unthemedEntries.clear();
        }
    }
    
    private ResourcesFlusher() {
    }
}
