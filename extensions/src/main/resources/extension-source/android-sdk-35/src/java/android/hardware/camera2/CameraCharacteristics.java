package android.hardware.camera2;

import java.util.Set;
import android.hardware.camera2.params.RecommendedStreamConfigurationMap;
import java.util.List;
import android.util.SizeF;
import android.graphics.Rect;
import android.hardware.camera2.params.ColorSpaceTransform;
import android.hardware.camera2.params.BlackLevelPattern;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.hardware.camera2.params.MultiResolutionStreamConfigurationMap;
import android.hardware.camera2.params.MandatoryStreamCombination;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.hardware.camera2.params.ColorSpaceProfiles;
import android.util.Size;
import android.hardware.camera2.params.DeviceStateSensorOrientationMap;
import android.hardware.camera2.params.Capability;
import android.util.Rational;
import android.util.Range;

public final class CameraCharacteristics extends CameraMetadata<Key<?>>
{
    @NonNull
    public static final Key<int[]> AUTOMOTIVE_LENS_FACING;
    @NonNull
    public static final Key<Integer> AUTOMOTIVE_LOCATION;
    @NonNull
    public static final Key<int[]> COLOR_CORRECTION_AVAILABLE_ABERRATION_MODES;
    @NonNull
    public static final Key<int[]> CONTROL_AE_AVAILABLE_ANTIBANDING_MODES;
    @NonNull
    public static final Key<int[]> CONTROL_AE_AVAILABLE_MODES;
    @NonNull
    public static final Key<Range<Integer>[]> CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES;
    @NonNull
    public static final Key<Range<Integer>> CONTROL_AE_COMPENSATION_RANGE;
    @NonNull
    public static final Key<Rational> CONTROL_AE_COMPENSATION_STEP;
    @NonNull
    public static final Key<Boolean> CONTROL_AE_LOCK_AVAILABLE;
    @NonNull
    public static final Key<int[]> CONTROL_AF_AVAILABLE_MODES;
    @NonNull
    public static final Key<Boolean> CONTROL_AUTOFRAMING_AVAILABLE;
    @NonNull
    public static final Key<int[]> CONTROL_AVAILABLE_EFFECTS;
    @NonNull
    public static final Key<Capability[]> CONTROL_AVAILABLE_EXTENDED_SCENE_MODE_CAPABILITIES;
    @NonNull
    public static final Key<int[]> CONTROL_AVAILABLE_MODES;
    @NonNull
    public static final Key<int[]> CONTROL_AVAILABLE_SCENE_MODES;
    @NonNull
    public static final Key<int[]> CONTROL_AVAILABLE_SETTINGS_OVERRIDES;
    @NonNull
    public static final Key<int[]> CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES;
    @NonNull
    public static final Key<int[]> CONTROL_AWB_AVAILABLE_MODES;
    @NonNull
    public static final Key<Boolean> CONTROL_AWB_LOCK_AVAILABLE;
    @NonNull
    public static final Key<Range<Float>> CONTROL_LOW_LIGHT_BOOST_INFO_LUMINANCE_RANGE;
    @NonNull
    public static final Key<Integer> CONTROL_MAX_REGIONS_AE;
    @NonNull
    public static final Key<Integer> CONTROL_MAX_REGIONS_AF;
    @NonNull
    public static final Key<Integer> CONTROL_MAX_REGIONS_AWB;
    @NonNull
    public static final Key<Range<Integer>> CONTROL_POST_RAW_SENSITIVITY_BOOST_RANGE;
    @NonNull
    public static final Key<Range<Float>> CONTROL_ZOOM_RATIO_RANGE;
    @NonNull
    public static final Key<Boolean> DEPTH_DEPTH_IS_EXCLUSIVE;
    @NonNull
    public static final Key<int[]> DISTORTION_CORRECTION_AVAILABLE_MODES;
    @NonNull
    public static final Key<int[]> EDGE_AVAILABLE_EDGE_MODES;
    @NonNull
    public static final Key<Boolean> FLASH_INFO_AVAILABLE;
    @NonNull
    public static final Key<Integer> FLASH_INFO_STRENGTH_DEFAULT_LEVEL;
    @NonNull
    public static final Key<Integer> FLASH_INFO_STRENGTH_MAXIMUM_LEVEL;
    @NonNull
    public static final Key<Integer> FLASH_SINGLE_STRENGTH_DEFAULT_LEVEL;
    @NonNull
    public static final Key<Integer> FLASH_SINGLE_STRENGTH_MAX_LEVEL;
    @NonNull
    public static final Key<Integer> FLASH_TORCH_STRENGTH_DEFAULT_LEVEL;
    @NonNull
    public static final Key<Integer> FLASH_TORCH_STRENGTH_MAX_LEVEL;
    @NonNull
    public static final Key<int[]> HOT_PIXEL_AVAILABLE_HOT_PIXEL_MODES;
    @NonNull
    public static final Key<DeviceStateSensorOrientationMap> INFO_DEVICE_STATE_SENSOR_ORIENTATION_MAP;
    @NonNull
    public static final Key<Integer> INFO_SESSION_CONFIGURATION_QUERY_VERSION;
    @NonNull
    public static final Key<Integer> INFO_SUPPORTED_HARDWARE_LEVEL;
    @NonNull
    public static final Key<String> INFO_VERSION;
    @NonNull
    public static final Key<Size[]> JPEG_AVAILABLE_THUMBNAIL_SIZES;
    @NonNull
    public static final Key<float[]> LENS_DISTORTION;
    @NonNull
    public static final Key<float[]> LENS_DISTORTION_MAXIMUM_RESOLUTION;
    @NonNull
    public static final Key<Integer> LENS_FACING;
    @NonNull
    public static final Key<float[]> LENS_INFO_AVAILABLE_APERTURES;
    @NonNull
    public static final Key<float[]> LENS_INFO_AVAILABLE_FILTER_DENSITIES;
    @NonNull
    public static final Key<float[]> LENS_INFO_AVAILABLE_FOCAL_LENGTHS;
    @NonNull
    public static final Key<int[]> LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION;
    @NonNull
    public static final Key<Integer> LENS_INFO_FOCUS_DISTANCE_CALIBRATION;
    @NonNull
    public static final Key<Float> LENS_INFO_HYPERFOCAL_DISTANCE;
    @NonNull
    public static final Key<Float> LENS_INFO_MINIMUM_FOCUS_DISTANCE;
    @NonNull
    public static final Key<float[]> LENS_INTRINSIC_CALIBRATION;
    @NonNull
    public static final Key<float[]> LENS_INTRINSIC_CALIBRATION_MAXIMUM_RESOLUTION;
    @NonNull
    public static final Key<Integer> LENS_POSE_REFERENCE;
    @NonNull
    public static final Key<float[]> LENS_POSE_ROTATION;
    @NonNull
    public static final Key<float[]> LENS_POSE_TRANSLATION;
    @Deprecated
    @NonNull
    public static final Key<float[]> LENS_RADIAL_DISTORTION;
    @NonNull
    public static final Key<Integer> LOGICAL_MULTI_CAMERA_SENSOR_SYNC_TYPE;
    @NonNull
    public static final Key<int[]> NOISE_REDUCTION_AVAILABLE_NOISE_REDUCTION_MODES;
    @NonNull
    public static final Key<Integer> REPROCESS_MAX_CAPTURE_STALL;
    @NonNull
    public static final Key<int[]> REQUEST_AVAILABLE_CAPABILITIES;
    @NonNull
    public static final Key<ColorSpaceProfiles> REQUEST_AVAILABLE_COLOR_SPACE_PROFILES;
    @NonNull
    public static final Key<DynamicRangeProfiles> REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES;
    @NonNull
    public static final Key<Integer> REQUEST_MAX_NUM_INPUT_STREAMS;
    @NonNull
    public static final Key<Integer> REQUEST_MAX_NUM_OUTPUT_PROC;
    @NonNull
    public static final Key<Integer> REQUEST_MAX_NUM_OUTPUT_PROC_STALLING;
    @NonNull
    public static final Key<Integer> REQUEST_MAX_NUM_OUTPUT_RAW;
    @NonNull
    public static final Key<Integer> REQUEST_PARTIAL_RESULT_COUNT;
    @NonNull
    public static final Key<Byte> REQUEST_PIPELINE_MAX_DEPTH;
    @NonNull
    public static final Key<Long> REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE;
    @NonNull
    public static final Key<Float> SCALER_AVAILABLE_MAX_DIGITAL_ZOOM;
    @NonNull
    public static final Key<int[]> SCALER_AVAILABLE_ROTATE_AND_CROP_MODES;
    @NonNull
    public static final Key<long[]> SCALER_AVAILABLE_STREAM_USE_CASES;
    @NonNull
    public static final Key<Integer> SCALER_CROPPING_TYPE;
    @NonNull
    public static final Key<Size> SCALER_DEFAULT_SECURE_IMAGE_SIZE;
    @NonNull
    public static final Key<MandatoryStreamCombination[]> SCALER_MANDATORY_CONCURRENT_STREAM_COMBINATIONS;
    @NonNull
    public static final Key<MandatoryStreamCombination[]> SCALER_MANDATORY_MAXIMUM_RESOLUTION_STREAM_COMBINATIONS;
    @NonNull
    public static final Key<MandatoryStreamCombination[]> SCALER_MANDATORY_PREVIEW_STABILIZATION_OUTPUT_STREAM_COMBINATIONS;
    @NonNull
    public static final Key<MandatoryStreamCombination[]> SCALER_MANDATORY_STREAM_COMBINATIONS;
    @NonNull
    public static final Key<MandatoryStreamCombination[]> SCALER_MANDATORY_TEN_BIT_OUTPUT_STREAM_COMBINATIONS;
    @NonNull
    public static final Key<MandatoryStreamCombination[]> SCALER_MANDATORY_USE_CASE_STREAM_COMBINATIONS;
    @NonNull
    public static final Key<MultiResolutionStreamConfigurationMap> SCALER_MULTI_RESOLUTION_STREAM_CONFIGURATION_MAP;
    @NonNull
    public static final Key<StreamConfigurationMap> SCALER_STREAM_CONFIGURATION_MAP;
    @NonNull
    public static final Key<StreamConfigurationMap> SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION;
    @NonNull
    public static final Key<int[]> SENSOR_AVAILABLE_TEST_PATTERN_MODES;
    @NonNull
    public static final Key<BlackLevelPattern> SENSOR_BLACK_LEVEL_PATTERN;
    @NonNull
    public static final Key<ColorSpaceTransform> SENSOR_CALIBRATION_TRANSFORM1;
    @NonNull
    public static final Key<ColorSpaceTransform> SENSOR_CALIBRATION_TRANSFORM2;
    @NonNull
    public static final Key<ColorSpaceTransform> SENSOR_COLOR_TRANSFORM1;
    @NonNull
    public static final Key<ColorSpaceTransform> SENSOR_COLOR_TRANSFORM2;
    @NonNull
    public static final Key<ColorSpaceTransform> SENSOR_FORWARD_MATRIX1;
    @NonNull
    public static final Key<ColorSpaceTransform> SENSOR_FORWARD_MATRIX2;
    @NonNull
    public static final Key<Rect> SENSOR_INFO_ACTIVE_ARRAY_SIZE;
    @NonNull
    public static final Key<Rect> SENSOR_INFO_ACTIVE_ARRAY_SIZE_MAXIMUM_RESOLUTION;
    @NonNull
    public static final Key<Size> SENSOR_INFO_BINNING_FACTOR;
    @NonNull
    public static final Key<Integer> SENSOR_INFO_COLOR_FILTER_ARRANGEMENT;
    @NonNull
    public static final Key<Range<Long>> SENSOR_INFO_EXPOSURE_TIME_RANGE;
    @NonNull
    public static final Key<Boolean> SENSOR_INFO_LENS_SHADING_APPLIED;
    @NonNull
    public static final Key<Long> SENSOR_INFO_MAX_FRAME_DURATION;
    @NonNull
    public static final Key<SizeF> SENSOR_INFO_PHYSICAL_SIZE;
    @NonNull
    public static final Key<Size> SENSOR_INFO_PIXEL_ARRAY_SIZE;
    @NonNull
    public static final Key<Size> SENSOR_INFO_PIXEL_ARRAY_SIZE_MAXIMUM_RESOLUTION;
    @NonNull
    public static final Key<Rect> SENSOR_INFO_PRE_CORRECTION_ACTIVE_ARRAY_SIZE;
    @NonNull
    public static final Key<Rect> SENSOR_INFO_PRE_CORRECTION_ACTIVE_ARRAY_SIZE_MAXIMUM_RESOLUTION;
    @NonNull
    public static final Key<Range<Integer>> SENSOR_INFO_SENSITIVITY_RANGE;
    @NonNull
    public static final Key<Integer> SENSOR_INFO_TIMESTAMP_SOURCE;
    @NonNull
    public static final Key<Integer> SENSOR_INFO_WHITE_LEVEL;
    @NonNull
    public static final Key<Integer> SENSOR_MAX_ANALOG_SENSITIVITY;
    @NonNull
    public static final Key<Rect[]> SENSOR_OPTICAL_BLACK_REGIONS;
    @NonNull
    public static final Key<Integer> SENSOR_ORIENTATION;
    @NonNull
    public static final Key<Integer> SENSOR_READOUT_TIMESTAMP;
    @NonNull
    public static final Key<Integer> SENSOR_REFERENCE_ILLUMINANT1;
    @NonNull
    public static final Key<Byte> SENSOR_REFERENCE_ILLUMINANT2;
    @NonNull
    public static final Key<int[]> SHADING_AVAILABLE_MODES;
    @NonNull
    public static final Key<int[]> STATISTICS_INFO_AVAILABLE_FACE_DETECT_MODES;
    @NonNull
    public static final Key<boolean[]> STATISTICS_INFO_AVAILABLE_HOT_PIXEL_MAP_MODES;
    @NonNull
    public static final Key<int[]> STATISTICS_INFO_AVAILABLE_LENS_SHADING_MAP_MODES;
    @NonNull
    public static final Key<int[]> STATISTICS_INFO_AVAILABLE_OIS_DATA_MODES;
    @NonNull
    public static final Key<Integer> STATISTICS_INFO_MAX_FACE_COUNT;
    @NonNull
    public static final Key<Integer> SYNC_MAX_LATENCY;
    @NonNull
    public static final Key<int[]> TONEMAP_AVAILABLE_TONE_MAP_MODES;
    @NonNull
    public static final Key<Integer> TONEMAP_MAX_CURVE_POINTS;
    
    CameraCharacteristics() {
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
    
    @NonNull
    public List<Key<?>> getKeysNeedingPermission() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public RecommendedStreamConfigurationMap getRecommendedStreamConfigurationMap(final int usecase) {
        throw new RuntimeException("Stub!");
    }
    
    public List<CaptureRequest.Key<?>> getAvailableSessionKeys() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<Key<?>> getAvailableSessionCharacteristicsKeys() {
        throw new RuntimeException("Stub!");
    }
    
    public List<CaptureRequest.Key<?>> getAvailablePhysicalCameraRequestKeys() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<CaptureRequest.Key<?>> getAvailableCaptureRequestKeys() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<CaptureResult.Key<?>> getAvailableCaptureResultKeys() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<String> getPhysicalCameraIds() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        AUTOMOTIVE_LENS_FACING = null;
        AUTOMOTIVE_LOCATION = null;
        COLOR_CORRECTION_AVAILABLE_ABERRATION_MODES = null;
        CONTROL_AE_AVAILABLE_ANTIBANDING_MODES = null;
        CONTROL_AE_AVAILABLE_MODES = null;
        CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES = null;
        CONTROL_AE_COMPENSATION_RANGE = null;
        CONTROL_AE_COMPENSATION_STEP = null;
        CONTROL_AE_LOCK_AVAILABLE = null;
        CONTROL_AF_AVAILABLE_MODES = null;
        CONTROL_AUTOFRAMING_AVAILABLE = null;
        CONTROL_AVAILABLE_EFFECTS = null;
        CONTROL_AVAILABLE_EXTENDED_SCENE_MODE_CAPABILITIES = null;
        CONTROL_AVAILABLE_MODES = null;
        CONTROL_AVAILABLE_SCENE_MODES = null;
        CONTROL_AVAILABLE_SETTINGS_OVERRIDES = null;
        CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES = null;
        CONTROL_AWB_AVAILABLE_MODES = null;
        CONTROL_AWB_LOCK_AVAILABLE = null;
        CONTROL_LOW_LIGHT_BOOST_INFO_LUMINANCE_RANGE = null;
        CONTROL_MAX_REGIONS_AE = null;
        CONTROL_MAX_REGIONS_AF = null;
        CONTROL_MAX_REGIONS_AWB = null;
        CONTROL_POST_RAW_SENSITIVITY_BOOST_RANGE = null;
        CONTROL_ZOOM_RATIO_RANGE = null;
        DEPTH_DEPTH_IS_EXCLUSIVE = null;
        DISTORTION_CORRECTION_AVAILABLE_MODES = null;
        EDGE_AVAILABLE_EDGE_MODES = null;
        FLASH_INFO_AVAILABLE = null;
        FLASH_INFO_STRENGTH_DEFAULT_LEVEL = null;
        FLASH_INFO_STRENGTH_MAXIMUM_LEVEL = null;
        FLASH_SINGLE_STRENGTH_DEFAULT_LEVEL = null;
        FLASH_SINGLE_STRENGTH_MAX_LEVEL = null;
        FLASH_TORCH_STRENGTH_DEFAULT_LEVEL = null;
        FLASH_TORCH_STRENGTH_MAX_LEVEL = null;
        HOT_PIXEL_AVAILABLE_HOT_PIXEL_MODES = null;
        INFO_DEVICE_STATE_SENSOR_ORIENTATION_MAP = null;
        INFO_SESSION_CONFIGURATION_QUERY_VERSION = null;
        INFO_SUPPORTED_HARDWARE_LEVEL = null;
        INFO_VERSION = null;
        JPEG_AVAILABLE_THUMBNAIL_SIZES = null;
        LENS_DISTORTION = null;
        LENS_DISTORTION_MAXIMUM_RESOLUTION = null;
        LENS_FACING = null;
        LENS_INFO_AVAILABLE_APERTURES = null;
        LENS_INFO_AVAILABLE_FILTER_DENSITIES = null;
        LENS_INFO_AVAILABLE_FOCAL_LENGTHS = null;
        LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION = null;
        LENS_INFO_FOCUS_DISTANCE_CALIBRATION = null;
        LENS_INFO_HYPERFOCAL_DISTANCE = null;
        LENS_INFO_MINIMUM_FOCUS_DISTANCE = null;
        LENS_INTRINSIC_CALIBRATION = null;
        LENS_INTRINSIC_CALIBRATION_MAXIMUM_RESOLUTION = null;
        LENS_POSE_REFERENCE = null;
        LENS_POSE_ROTATION = null;
        LENS_POSE_TRANSLATION = null;
        LENS_RADIAL_DISTORTION = null;
        LOGICAL_MULTI_CAMERA_SENSOR_SYNC_TYPE = null;
        NOISE_REDUCTION_AVAILABLE_NOISE_REDUCTION_MODES = null;
        REPROCESS_MAX_CAPTURE_STALL = null;
        REQUEST_AVAILABLE_CAPABILITIES = null;
        REQUEST_AVAILABLE_COLOR_SPACE_PROFILES = null;
        REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES = null;
        REQUEST_MAX_NUM_INPUT_STREAMS = null;
        REQUEST_MAX_NUM_OUTPUT_PROC = null;
        REQUEST_MAX_NUM_OUTPUT_PROC_STALLING = null;
        REQUEST_MAX_NUM_OUTPUT_RAW = null;
        REQUEST_PARTIAL_RESULT_COUNT = null;
        REQUEST_PIPELINE_MAX_DEPTH = null;
        REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE = null;
        SCALER_AVAILABLE_MAX_DIGITAL_ZOOM = null;
        SCALER_AVAILABLE_ROTATE_AND_CROP_MODES = null;
        SCALER_AVAILABLE_STREAM_USE_CASES = null;
        SCALER_CROPPING_TYPE = null;
        SCALER_DEFAULT_SECURE_IMAGE_SIZE = null;
        SCALER_MANDATORY_CONCURRENT_STREAM_COMBINATIONS = null;
        SCALER_MANDATORY_MAXIMUM_RESOLUTION_STREAM_COMBINATIONS = null;
        SCALER_MANDATORY_PREVIEW_STABILIZATION_OUTPUT_STREAM_COMBINATIONS = null;
        SCALER_MANDATORY_STREAM_COMBINATIONS = null;
        SCALER_MANDATORY_TEN_BIT_OUTPUT_STREAM_COMBINATIONS = null;
        SCALER_MANDATORY_USE_CASE_STREAM_COMBINATIONS = null;
        SCALER_MULTI_RESOLUTION_STREAM_CONFIGURATION_MAP = null;
        SCALER_STREAM_CONFIGURATION_MAP = null;
        SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION = null;
        SENSOR_AVAILABLE_TEST_PATTERN_MODES = null;
        SENSOR_BLACK_LEVEL_PATTERN = null;
        SENSOR_CALIBRATION_TRANSFORM1 = null;
        SENSOR_CALIBRATION_TRANSFORM2 = null;
        SENSOR_COLOR_TRANSFORM1 = null;
        SENSOR_COLOR_TRANSFORM2 = null;
        SENSOR_FORWARD_MATRIX1 = null;
        SENSOR_FORWARD_MATRIX2 = null;
        SENSOR_INFO_ACTIVE_ARRAY_SIZE = null;
        SENSOR_INFO_ACTIVE_ARRAY_SIZE_MAXIMUM_RESOLUTION = null;
        SENSOR_INFO_BINNING_FACTOR = null;
        SENSOR_INFO_COLOR_FILTER_ARRANGEMENT = null;
        SENSOR_INFO_EXPOSURE_TIME_RANGE = null;
        SENSOR_INFO_LENS_SHADING_APPLIED = null;
        SENSOR_INFO_MAX_FRAME_DURATION = null;
        SENSOR_INFO_PHYSICAL_SIZE = null;
        SENSOR_INFO_PIXEL_ARRAY_SIZE = null;
        SENSOR_INFO_PIXEL_ARRAY_SIZE_MAXIMUM_RESOLUTION = null;
        SENSOR_INFO_PRE_CORRECTION_ACTIVE_ARRAY_SIZE = null;
        SENSOR_INFO_PRE_CORRECTION_ACTIVE_ARRAY_SIZE_MAXIMUM_RESOLUTION = null;
        SENSOR_INFO_SENSITIVITY_RANGE = null;
        SENSOR_INFO_TIMESTAMP_SOURCE = null;
        SENSOR_INFO_WHITE_LEVEL = null;
        SENSOR_MAX_ANALOG_SENSITIVITY = null;
        SENSOR_OPTICAL_BLACK_REGIONS = null;
        SENSOR_ORIENTATION = null;
        SENSOR_READOUT_TIMESTAMP = null;
        SENSOR_REFERENCE_ILLUMINANT1 = null;
        SENSOR_REFERENCE_ILLUMINANT2 = null;
        SHADING_AVAILABLE_MODES = null;
        STATISTICS_INFO_AVAILABLE_FACE_DETECT_MODES = null;
        STATISTICS_INFO_AVAILABLE_HOT_PIXEL_MAP_MODES = null;
        STATISTICS_INFO_AVAILABLE_LENS_SHADING_MAP_MODES = null;
        STATISTICS_INFO_AVAILABLE_OIS_DATA_MODES = null;
        STATISTICS_INFO_MAX_FACE_COUNT = null;
        SYNC_MAX_LATENCY = null;
        TONEMAP_AVAILABLE_TONE_MAP_MODES = null;
        TONEMAP_MAX_CURVE_POINTS = null;
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
