package android.hardware.camera2;

import android.view.Surface;
import android.os.Parcel;
import java.util.List;
import android.hardware.camera2.params.TonemapCurve;
import android.graphics.Rect;
import android.util.Size;
import android.location.Location;
import android.util.Range;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.ColorSpaceTransform;
import android.hardware.camera2.params.RggbChannelVector;
import android.os.Parcelable;

public final class CaptureRequest extends CameraMetadata<Key<?>> implements Parcelable
{
    @NonNull
    public static final Key<Boolean> BLACK_LEVEL_LOCK;
    @NonNull
    public static final Key<Integer> COLOR_CORRECTION_ABERRATION_MODE;
    @NonNull
    public static final Key<RggbChannelVector> COLOR_CORRECTION_GAINS;
    @NonNull
    public static final Key<Integer> COLOR_CORRECTION_MODE;
    @NonNull
    public static final Key<ColorSpaceTransform> COLOR_CORRECTION_TRANSFORM;
    @NonNull
    public static final Key<Integer> CONTROL_AE_ANTIBANDING_MODE;
    @NonNull
    public static final Key<Integer> CONTROL_AE_EXPOSURE_COMPENSATION;
    @NonNull
    public static final Key<Boolean> CONTROL_AE_LOCK;
    @NonNull
    public static final Key<Integer> CONTROL_AE_MODE;
    @NonNull
    public static final Key<Integer> CONTROL_AE_PRECAPTURE_TRIGGER;
    @NonNull
    public static final Key<MeteringRectangle[]> CONTROL_AE_REGIONS;
    @NonNull
    public static final Key<Range<Integer>> CONTROL_AE_TARGET_FPS_RANGE;
    @NonNull
    public static final Key<Integer> CONTROL_AF_MODE;
    @NonNull
    public static final Key<MeteringRectangle[]> CONTROL_AF_REGIONS;
    @NonNull
    public static final Key<Integer> CONTROL_AF_TRIGGER;
    @NonNull
    public static final Key<Integer> CONTROL_AUTOFRAMING;
    @NonNull
    public static final Key<Boolean> CONTROL_AWB_LOCK;
    @NonNull
    public static final Key<Integer> CONTROL_AWB_MODE;
    @NonNull
    public static final Key<MeteringRectangle[]> CONTROL_AWB_REGIONS;
    @NonNull
    public static final Key<Integer> CONTROL_CAPTURE_INTENT;
    @NonNull
    public static final Key<Integer> CONTROL_EFFECT_MODE;
    @NonNull
    public static final Key<Boolean> CONTROL_ENABLE_ZSL;
    @NonNull
    public static final Key<Integer> CONTROL_EXTENDED_SCENE_MODE;
    @NonNull
    public static final Key<Integer> CONTROL_MODE;
    @NonNull
    public static final Key<Integer> CONTROL_POST_RAW_SENSITIVITY_BOOST;
    @NonNull
    public static final Key<Integer> CONTROL_SCENE_MODE;
    @NonNull
    public static final Key<Integer> CONTROL_SETTINGS_OVERRIDE;
    @NonNull
    public static final Key<Integer> CONTROL_VIDEO_STABILIZATION_MODE;
    @NonNull
    public static final Key<Float> CONTROL_ZOOM_RATIO;
    @NonNull
    public static final Creator<CaptureRequest> CREATOR;
    @NonNull
    public static final Key<Integer> DISTORTION_CORRECTION_MODE;
    @NonNull
    public static final Key<Integer> EDGE_MODE;
    @NonNull
    public static final Key<Integer> EXTENSION_STRENGTH;
    @NonNull
    public static final Key<Integer> FLASH_MODE;
    @NonNull
    public static final Key<Integer> FLASH_STRENGTH_LEVEL;
    @NonNull
    public static final Key<Integer> HOT_PIXEL_MODE;
    @NonNull
    public static final Key<Location> JPEG_GPS_LOCATION;
    @NonNull
    public static final Key<Integer> JPEG_ORIENTATION;
    @NonNull
    public static final Key<Byte> JPEG_QUALITY;
    @NonNull
    public static final Key<Byte> JPEG_THUMBNAIL_QUALITY;
    @NonNull
    public static final Key<Size> JPEG_THUMBNAIL_SIZE;
    @NonNull
    public static final Key<Float> LENS_APERTURE;
    @NonNull
    public static final Key<Float> LENS_FILTER_DENSITY;
    @NonNull
    public static final Key<Float> LENS_FOCAL_LENGTH;
    @NonNull
    public static final Key<Float> LENS_FOCUS_DISTANCE;
    @NonNull
    public static final Key<Integer> LENS_OPTICAL_STABILIZATION_MODE;
    @NonNull
    public static final Key<Integer> NOISE_REDUCTION_MODE;
    @NonNull
    public static final Key<Float> REPROCESS_EFFECTIVE_EXPOSURE_FACTOR;
    @NonNull
    public static final Key<Rect> SCALER_CROP_REGION;
    @NonNull
    public static final Key<Integer> SCALER_ROTATE_AND_CROP;
    @NonNull
    public static final Key<Long> SENSOR_EXPOSURE_TIME;
    @NonNull
    public static final Key<Long> SENSOR_FRAME_DURATION;
    @NonNull
    public static final Key<Integer> SENSOR_PIXEL_MODE;
    @NonNull
    public static final Key<Integer> SENSOR_SENSITIVITY;
    @NonNull
    public static final Key<int[]> SENSOR_TEST_PATTERN_DATA;
    @NonNull
    public static final Key<Integer> SENSOR_TEST_PATTERN_MODE;
    @NonNull
    public static final Key<Integer> SHADING_MODE;
    @NonNull
    public static final Key<Integer> STATISTICS_FACE_DETECT_MODE;
    @NonNull
    public static final Key<Boolean> STATISTICS_HOT_PIXEL_MAP_MODE;
    @NonNull
    public static final Key<Integer> STATISTICS_LENS_SHADING_MAP_MODE;
    @NonNull
    public static final Key<Integer> STATISTICS_OIS_DATA_MODE;
    @NonNull
    public static final Key<TonemapCurve> TONEMAP_CURVE;
    @NonNull
    public static final Key<Float> TONEMAP_GAMMA;
    @NonNull
    public static final Key<Integer> TONEMAP_MODE;
    @NonNull
    public static final Key<Integer> TONEMAP_PRESET_CURVE;
    
    CaptureRequest() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public <T> T get(final Key<T> key) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public List<Key<?>> getKeys() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Object getTag() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isReprocess() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        BLACK_LEVEL_LOCK = null;
        COLOR_CORRECTION_ABERRATION_MODE = null;
        COLOR_CORRECTION_GAINS = null;
        COLOR_CORRECTION_MODE = null;
        COLOR_CORRECTION_TRANSFORM = null;
        CONTROL_AE_ANTIBANDING_MODE = null;
        CONTROL_AE_EXPOSURE_COMPENSATION = null;
        CONTROL_AE_LOCK = null;
        CONTROL_AE_MODE = null;
        CONTROL_AE_PRECAPTURE_TRIGGER = null;
        CONTROL_AE_REGIONS = null;
        CONTROL_AE_TARGET_FPS_RANGE = null;
        CONTROL_AF_MODE = null;
        CONTROL_AF_REGIONS = null;
        CONTROL_AF_TRIGGER = null;
        CONTROL_AUTOFRAMING = null;
        CONTROL_AWB_LOCK = null;
        CONTROL_AWB_MODE = null;
        CONTROL_AWB_REGIONS = null;
        CONTROL_CAPTURE_INTENT = null;
        CONTROL_EFFECT_MODE = null;
        CONTROL_ENABLE_ZSL = null;
        CONTROL_EXTENDED_SCENE_MODE = null;
        CONTROL_MODE = null;
        CONTROL_POST_RAW_SENSITIVITY_BOOST = null;
        CONTROL_SCENE_MODE = null;
        CONTROL_SETTINGS_OVERRIDE = null;
        CONTROL_VIDEO_STABILIZATION_MODE = null;
        CONTROL_ZOOM_RATIO = null;
        CREATOR = null;
        DISTORTION_CORRECTION_MODE = null;
        EDGE_MODE = null;
        EXTENSION_STRENGTH = null;
        FLASH_MODE = null;
        FLASH_STRENGTH_LEVEL = null;
        HOT_PIXEL_MODE = null;
        JPEG_GPS_LOCATION = null;
        JPEG_ORIENTATION = null;
        JPEG_QUALITY = null;
        JPEG_THUMBNAIL_QUALITY = null;
        JPEG_THUMBNAIL_SIZE = null;
        LENS_APERTURE = null;
        LENS_FILTER_DENSITY = null;
        LENS_FOCAL_LENGTH = null;
        LENS_FOCUS_DISTANCE = null;
        LENS_OPTICAL_STABILIZATION_MODE = null;
        NOISE_REDUCTION_MODE = null;
        REPROCESS_EFFECTIVE_EXPOSURE_FACTOR = null;
        SCALER_CROP_REGION = null;
        SCALER_ROTATE_AND_CROP = null;
        SENSOR_EXPOSURE_TIME = null;
        SENSOR_FRAME_DURATION = null;
        SENSOR_PIXEL_MODE = null;
        SENSOR_SENSITIVITY = null;
        SENSOR_TEST_PATTERN_DATA = null;
        SENSOR_TEST_PATTERN_MODE = null;
        SHADING_MODE = null;
        STATISTICS_FACE_DETECT_MODE = null;
        STATISTICS_HOT_PIXEL_MAP_MODE = null;
        STATISTICS_LENS_SHADING_MAP_MODE = null;
        STATISTICS_OIS_DATA_MODE = null;
        TONEMAP_CURVE = null;
        TONEMAP_GAMMA = null;
        TONEMAP_MODE = null;
        TONEMAP_PRESET_CURVE = null;
    }
    
    public static final class Builder
    {
        Builder() {
            throw new RuntimeException("Stub!");
        }
        
        public void addTarget(@NonNull final Surface outputTarget) {
            throw new RuntimeException("Stub!");
        }
        
        public void removeTarget(@NonNull final Surface outputTarget) {
            throw new RuntimeException("Stub!");
        }
        
        public <T> void set(@NonNull final Key<T> key, final T value) {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public <T> T get(final Key<T> key) {
            throw new RuntimeException("Stub!");
        }
        
        public <T> Builder setPhysicalCameraKey(@NonNull final Key<T> key, final T value, @NonNull final String physicalCameraId) {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public <T> T getPhysicalCameraKey(final Key<T> key, @NonNull final String physicalCameraId) {
            throw new RuntimeException("Stub!");
        }
        
        public void setTag(@Nullable final Object tag) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public CaptureRequest build() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class Key<T>
    {
        public Key(@NonNull final String name, @NonNull final Class<T> type) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public String getName() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int hashCode() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean equals(final Object o) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }
}
