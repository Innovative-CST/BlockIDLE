package android.hardware;

import java.util.List;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import java.io.IOException;

@Deprecated
public class Camera
{
    @Deprecated
    public static final String ACTION_NEW_PICTURE = "android.hardware.action.NEW_PICTURE";
    @Deprecated
    public static final String ACTION_NEW_VIDEO = "android.hardware.action.NEW_VIDEO";
    @Deprecated
    public static final int CAMERA_ERROR_EVICTED = 2;
    @Deprecated
    public static final int CAMERA_ERROR_SERVER_DIED = 100;
    @Deprecated
    public static final int CAMERA_ERROR_UNKNOWN = 1;
    
    Camera() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static int getNumberOfCameras() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static void getCameraInfo(final int cameraId, final CameraInfo cameraInfo) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static Camera open(final int cameraId) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static Camera open() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected void finalize() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final void release() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final native void unlock();
    
    @Deprecated
    public final native void lock();
    
    @Deprecated
    public final native void reconnect() throws IOException;
    
    @Deprecated
    public final void setPreviewDisplay(final SurfaceHolder holder) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final native void setPreviewTexture(final SurfaceTexture p0) throws IOException;
    
    @Deprecated
    public final native void startPreview();
    
    @Deprecated
    public final void stopPreview() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final void setPreviewCallback(final PreviewCallback cb) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final void setOneShotPreviewCallback(final PreviewCallback cb) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final void setPreviewCallbackWithBuffer(final PreviewCallback cb) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final void addCallbackBuffer(final byte[] callbackBuffer) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final void autoFocus(final AutoFocusCallback cb) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final void cancelAutoFocus() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setAutoFocusMoveCallback(final AutoFocusMoveCallback cb) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final void takePicture(final ShutterCallback shutter, final PictureCallback raw, final PictureCallback jpeg) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final void takePicture(final ShutterCallback shutter, final PictureCallback raw, final PictureCallback postview, final PictureCallback jpeg) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final native void startSmoothZoom(final int p0);
    
    @Deprecated
    public final native void stopSmoothZoom();
    
    @Deprecated
    public final native void setDisplayOrientation(final int p0);
    
    @Deprecated
    public final boolean enableShutterSound(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final void setZoomChangeListener(final OnZoomChangeListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final void setFaceDetectionListener(final FaceDetectionListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final void startFaceDetection() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final void stopFaceDetection() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final void setErrorCallback(final ErrorCallback cb) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setParameters(final Parameters params) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Parameters getParameters() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static class Area
    {
        @Deprecated
        public Rect rect;
        @Deprecated
        public int weight;
        
        @Deprecated
        public Area(final Rect rect, final int weight) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @Override
        public boolean equals(@Nullable final Object obj) {
            throw new RuntimeException("Stub!");
        }
    }
    
    @Deprecated
    public static class CameraInfo
    {
        @Deprecated
        public static final int CAMERA_FACING_BACK = 0;
        @Deprecated
        public static final int CAMERA_FACING_FRONT = 1;
        @Deprecated
        public boolean canDisableShutterSound;
        @Deprecated
        public int facing;
        @Deprecated
        public int orientation;
        
        @Deprecated
        public CameraInfo() {
            throw new RuntimeException("Stub!");
        }
    }
    
    @Deprecated
    public static class Face
    {
        @Deprecated
        public int id;
        @Deprecated
        public Point leftEye;
        @Deprecated
        public Point mouth;
        @Deprecated
        public Rect rect;
        @Deprecated
        public Point rightEye;
        @Deprecated
        public int score;
        
        @Deprecated
        public Face() {
            this.id = -1;
            throw new RuntimeException("Stub!");
        }
    }
    
    @Deprecated
    public class Parameters
    {
        @Deprecated
        public static final String ANTIBANDING_50HZ = "50hz";
        @Deprecated
        public static final String ANTIBANDING_60HZ = "60hz";
        @Deprecated
        public static final String ANTIBANDING_AUTO = "auto";
        @Deprecated
        public static final String ANTIBANDING_OFF = "off";
        @Deprecated
        public static final String EFFECT_AQUA = "aqua";
        @Deprecated
        public static final String EFFECT_BLACKBOARD = "blackboard";
        @Deprecated
        public static final String EFFECT_MONO = "mono";
        @Deprecated
        public static final String EFFECT_NEGATIVE = "negative";
        @Deprecated
        public static final String EFFECT_NONE = "none";
        @Deprecated
        public static final String EFFECT_POSTERIZE = "posterize";
        @Deprecated
        public static final String EFFECT_SEPIA = "sepia";
        @Deprecated
        public static final String EFFECT_SOLARIZE = "solarize";
        @Deprecated
        public static final String EFFECT_WHITEBOARD = "whiteboard";
        @Deprecated
        public static final String FLASH_MODE_AUTO = "auto";
        @Deprecated
        public static final String FLASH_MODE_OFF = "off";
        @Deprecated
        public static final String FLASH_MODE_ON = "on";
        @Deprecated
        public static final String FLASH_MODE_RED_EYE = "red-eye";
        @Deprecated
        public static final String FLASH_MODE_TORCH = "torch";
        @Deprecated
        public static final int FOCUS_DISTANCE_FAR_INDEX = 2;
        @Deprecated
        public static final int FOCUS_DISTANCE_NEAR_INDEX = 0;
        @Deprecated
        public static final int FOCUS_DISTANCE_OPTIMAL_INDEX = 1;
        @Deprecated
        public static final String FOCUS_MODE_AUTO = "auto";
        @Deprecated
        public static final String FOCUS_MODE_CONTINUOUS_PICTURE = "continuous-picture";
        @Deprecated
        public static final String FOCUS_MODE_CONTINUOUS_VIDEO = "continuous-video";
        @Deprecated
        public static final String FOCUS_MODE_EDOF = "edof";
        @Deprecated
        public static final String FOCUS_MODE_FIXED = "fixed";
        @Deprecated
        public static final String FOCUS_MODE_INFINITY = "infinity";
        @Deprecated
        public static final String FOCUS_MODE_MACRO = "macro";
        @Deprecated
        public static final int PREVIEW_FPS_MAX_INDEX = 1;
        @Deprecated
        public static final int PREVIEW_FPS_MIN_INDEX = 0;
        @Deprecated
        public static final String SCENE_MODE_ACTION = "action";
        @Deprecated
        public static final String SCENE_MODE_AUTO = "auto";
        @Deprecated
        public static final String SCENE_MODE_BARCODE = "barcode";
        @Deprecated
        public static final String SCENE_MODE_BEACH = "beach";
        @Deprecated
        public static final String SCENE_MODE_CANDLELIGHT = "candlelight";
        @Deprecated
        public static final String SCENE_MODE_FIREWORKS = "fireworks";
        @Deprecated
        public static final String SCENE_MODE_HDR = "hdr";
        @Deprecated
        public static final String SCENE_MODE_LANDSCAPE = "landscape";
        @Deprecated
        public static final String SCENE_MODE_NIGHT = "night";
        @Deprecated
        public static final String SCENE_MODE_NIGHT_PORTRAIT = "night-portrait";
        @Deprecated
        public static final String SCENE_MODE_PARTY = "party";
        @Deprecated
        public static final String SCENE_MODE_PORTRAIT = "portrait";
        @Deprecated
        public static final String SCENE_MODE_SNOW = "snow";
        @Deprecated
        public static final String SCENE_MODE_SPORTS = "sports";
        @Deprecated
        public static final String SCENE_MODE_STEADYPHOTO = "steadyphoto";
        @Deprecated
        public static final String SCENE_MODE_SUNSET = "sunset";
        @Deprecated
        public static final String SCENE_MODE_THEATRE = "theatre";
        @Deprecated
        public static final String WHITE_BALANCE_AUTO = "auto";
        @Deprecated
        public static final String WHITE_BALANCE_CLOUDY_DAYLIGHT = "cloudy-daylight";
        @Deprecated
        public static final String WHITE_BALANCE_DAYLIGHT = "daylight";
        @Deprecated
        public static final String WHITE_BALANCE_FLUORESCENT = "fluorescent";
        @Deprecated
        public static final String WHITE_BALANCE_INCANDESCENT = "incandescent";
        @Deprecated
        public static final String WHITE_BALANCE_SHADE = "shade";
        @Deprecated
        public static final String WHITE_BALANCE_TWILIGHT = "twilight";
        @Deprecated
        public static final String WHITE_BALANCE_WARM_FLUORESCENT = "warm-fluorescent";
        
        Parameters() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public String flatten() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void unflatten(final String flattened) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void remove(final String key) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void set(final String key, final String value) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void set(final String key, final int value) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public String get(final String key) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public int getInt(final String key) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void setPreviewSize(final int width, final int height) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public Size getPreviewSize() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public List<Size> getSupportedPreviewSizes() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public List<Size> getSupportedVideoSizes() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public Size getPreferredPreviewSizeForVideo() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void setJpegThumbnailSize(final int width, final int height) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public Size getJpegThumbnailSize() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public List<Size> getSupportedJpegThumbnailSizes() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void setJpegThumbnailQuality(final int quality) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public int getJpegThumbnailQuality() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void setJpegQuality(final int quality) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public int getJpegQuality() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void setPreviewFrameRate(final int fps) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public int getPreviewFrameRate() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public List<Integer> getSupportedPreviewFrameRates() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void setPreviewFpsRange(final int min, final int max) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void getPreviewFpsRange(final int[] range) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public List<int[]> getSupportedPreviewFpsRange() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void setPreviewFormat(final int pixel_format) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public int getPreviewFormat() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public List<Integer> getSupportedPreviewFormats() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void setPictureSize(final int width, final int height) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public Size getPictureSize() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public List<Size> getSupportedPictureSizes() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void setPictureFormat(final int pixel_format) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public int getPictureFormat() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public List<Integer> getSupportedPictureFormats() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void setRotation(final int rotation) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void setGpsLatitude(final double latitude) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void setGpsLongitude(final double longitude) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void setGpsAltitude(final double altitude) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void setGpsTimestamp(final long timestamp) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void setGpsProcessingMethod(final String processing_method) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void removeGpsData() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public String getWhiteBalance() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void setWhiteBalance(final String value) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public List<String> getSupportedWhiteBalance() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public String getColorEffect() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void setColorEffect(final String value) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public List<String> getSupportedColorEffects() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public String getAntibanding() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void setAntibanding(final String antibanding) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public List<String> getSupportedAntibanding() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public String getSceneMode() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void setSceneMode(final String value) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public List<String> getSupportedSceneModes() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public String getFlashMode() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void setFlashMode(final String value) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public List<String> getSupportedFlashModes() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public String getFocusMode() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void setFocusMode(final String value) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public List<String> getSupportedFocusModes() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public float getFocalLength() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public float getHorizontalViewAngle() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public float getVerticalViewAngle() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public int getExposureCompensation() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void setExposureCompensation(final int value) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public int getMaxExposureCompensation() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public int getMinExposureCompensation() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public float getExposureCompensationStep() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void setAutoExposureLock(final boolean toggle) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public boolean getAutoExposureLock() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public boolean isAutoExposureLockSupported() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void setAutoWhiteBalanceLock(final boolean toggle) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public boolean getAutoWhiteBalanceLock() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public boolean isAutoWhiteBalanceLockSupported() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public int getZoom() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void setZoom(final int value) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public boolean isZoomSupported() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public int getMaxZoom() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public List<Integer> getZoomRatios() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public boolean isSmoothZoomSupported() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void getFocusDistances(final float[] output) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public int getMaxNumFocusAreas() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public List<Area> getFocusAreas() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void setFocusAreas(final List<Area> focusAreas) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public int getMaxNumMeteringAreas() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public List<Area> getMeteringAreas() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void setMeteringAreas(final List<Area> meteringAreas) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public int getMaxNumDetectedFaces() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void setRecordingHint(final boolean hint) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public boolean isVideoSnapshotSupported() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void setVideoStabilization(final boolean toggle) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public boolean getVideoStabilization() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public boolean isVideoStabilizationSupported() {
            throw new RuntimeException("Stub!");
        }
    }
    
    @Deprecated
    public class Size
    {
        @Deprecated
        public int height;
        @Deprecated
        public int width;
        
        @Deprecated
        public Size(final int w, final int h) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @Override
        public boolean equals(@Nullable final Object obj) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @Override
        public int hashCode() {
            throw new RuntimeException("Stub!");
        }
    }
    
    @Deprecated
    public interface ShutterCallback
    {
        @Deprecated
        void onShutter();
    }
    
    @Deprecated
    public interface PreviewCallback
    {
        @Deprecated
        void onPreviewFrame(final byte[] p0, final Camera p1);
    }
    
    @Deprecated
    public interface PictureCallback
    {
        @Deprecated
        void onPictureTaken(final byte[] p0, final Camera p1);
    }
    
    @Deprecated
    public interface OnZoomChangeListener
    {
        @Deprecated
        void onZoomChange(final int p0, final boolean p1, final Camera p2);
    }
    
    @Deprecated
    public interface FaceDetectionListener
    {
        @Deprecated
        void onFaceDetection(final Face[] p0, final Camera p1);
    }
    
    @Deprecated
    public interface ErrorCallback
    {
        @Deprecated
        void onError(final int p0, final Camera p1);
    }
    
    @Deprecated
    public interface AutoFocusMoveCallback
    {
        @Deprecated
        void onAutoFocusMoving(final boolean p0, final Camera p1);
    }
    
    @Deprecated
    public interface AutoFocusCallback
    {
        @Deprecated
        void onAutoFocus(final boolean p0, final Camera p1);
    }
}
