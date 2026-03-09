package android.hardware;

import android.os.MemoryFile;
import android.os.Handler;
import java.util.List;

public abstract class SensorManager
{
    public static final int AXIS_MINUS_X = 129;
    public static final int AXIS_MINUS_Y = 130;
    public static final int AXIS_MINUS_Z = 131;
    public static final int AXIS_X = 1;
    public static final int AXIS_Y = 2;
    public static final int AXIS_Z = 3;
    @Deprecated
    public static final int DATA_X = 0;
    @Deprecated
    public static final int DATA_Y = 1;
    @Deprecated
    public static final int DATA_Z = 2;
    public static final float GRAVITY_DEATH_STAR_I = 3.5303614E-7f;
    public static final float GRAVITY_EARTH = 9.80665f;
    public static final float GRAVITY_JUPITER = 23.12f;
    public static final float GRAVITY_MARS = 3.71f;
    public static final float GRAVITY_MERCURY = 3.7f;
    public static final float GRAVITY_MOON = 1.6f;
    public static final float GRAVITY_NEPTUNE = 11.0f;
    public static final float GRAVITY_PLUTO = 0.6f;
    public static final float GRAVITY_SATURN = 8.96f;
    public static final float GRAVITY_SUN = 275.0f;
    public static final float GRAVITY_THE_ISLAND = 4.815162f;
    public static final float GRAVITY_URANUS = 8.69f;
    public static final float GRAVITY_VENUS = 8.87f;
    public static final float LIGHT_CLOUDY = 100.0f;
    public static final float LIGHT_FULLMOON = 0.25f;
    public static final float LIGHT_NO_MOON = 0.001f;
    public static final float LIGHT_OVERCAST = 10000.0f;
    public static final float LIGHT_SHADE = 20000.0f;
    public static final float LIGHT_SUNLIGHT = 110000.0f;
    public static final float LIGHT_SUNLIGHT_MAX = 120000.0f;
    public static final float LIGHT_SUNRISE = 400.0f;
    public static final float MAGNETIC_FIELD_EARTH_MAX = 60.0f;
    public static final float MAGNETIC_FIELD_EARTH_MIN = 30.0f;
    public static final float PRESSURE_STANDARD_ATMOSPHERE = 1013.25f;
    @Deprecated
    public static final int RAW_DATA_INDEX = 3;
    @Deprecated
    public static final int RAW_DATA_X = 3;
    @Deprecated
    public static final int RAW_DATA_Y = 4;
    @Deprecated
    public static final int RAW_DATA_Z = 5;
    @Deprecated
    public static final int SENSOR_ACCELEROMETER = 2;
    @Deprecated
    public static final int SENSOR_ALL = 127;
    public static final int SENSOR_DELAY_FASTEST = 0;
    public static final int SENSOR_DELAY_GAME = 1;
    public static final int SENSOR_DELAY_NORMAL = 3;
    public static final int SENSOR_DELAY_UI = 2;
    @Deprecated
    public static final int SENSOR_LIGHT = 16;
    @Deprecated
    public static final int SENSOR_MAGNETIC_FIELD = 8;
    @Deprecated
    public static final int SENSOR_MAX = 64;
    @Deprecated
    public static final int SENSOR_MIN = 1;
    @Deprecated
    public static final int SENSOR_ORIENTATION = 1;
    @Deprecated
    public static final int SENSOR_ORIENTATION_RAW = 128;
    @Deprecated
    public static final int SENSOR_PROXIMITY = 32;
    public static final int SENSOR_STATUS_ACCURACY_HIGH = 3;
    public static final int SENSOR_STATUS_ACCURACY_LOW = 1;
    public static final int SENSOR_STATUS_ACCURACY_MEDIUM = 2;
    public static final int SENSOR_STATUS_NO_CONTACT = -1;
    public static final int SENSOR_STATUS_UNRELIABLE = 0;
    @Deprecated
    public static final int SENSOR_TEMPERATURE = 4;
    @Deprecated
    public static final int SENSOR_TRICORDER = 64;
    public static final float STANDARD_GRAVITY = 9.80665f;
    
    SensorManager() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getSensors() {
        throw new RuntimeException("Stub!");
    }
    
    public List<Sensor> getSensorList(final int type) {
        throw new RuntimeException("Stub!");
    }
    
    public List<Sensor> getDynamicSensorList(final int type) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Sensor getDefaultSensor(final int type) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Sensor getDefaultSensor(final int type, final boolean wakeUp) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean registerListener(final SensorListener listener, final int sensors) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean registerListener(final SensorListener listener, final int sensors, final int rate) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void unregisterListener(final SensorListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void unregisterListener(final SensorListener listener, final int sensors) {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterListener(final SensorEventListener listener, final Sensor sensor) {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterListener(final SensorEventListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean registerListener(final SensorEventListener listener, final Sensor sensor, final int samplingPeriodUs) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean registerListener(final SensorEventListener listener, final Sensor sensor, final int samplingPeriodUs, final int maxReportLatencyUs) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean registerListener(final SensorEventListener listener, final Sensor sensor, final int samplingPeriodUs, final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean registerListener(final SensorEventListener listener, final Sensor sensor, final int samplingPeriodUs, final int maxReportLatencyUs, final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean flush(final SensorEventListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public SensorDirectChannel createDirectChannel(final MemoryFile mem) {
        throw new RuntimeException("Stub!");
    }
    
    public SensorDirectChannel createDirectChannel(final HardwareBuffer mem) {
        throw new RuntimeException("Stub!");
    }
    
    public void registerDynamicSensorCallback(final DynamicSensorCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void registerDynamicSensorCallback(final DynamicSensorCallback callback, final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterDynamicSensorCallback(final DynamicSensorCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isDynamicSensorDiscoverySupported() {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean getRotationMatrix(final float[] R, final float[] I, final float[] gravity, final float[] geomagnetic) {
        throw new RuntimeException("Stub!");
    }
    
    public static float getInclination(final float[] I) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean remapCoordinateSystem(final float[] inR, final int X, final int Y, final float[] outR) {
        throw new RuntimeException("Stub!");
    }
    
    public static float[] getOrientation(final float[] R, final float[] values) {
        throw new RuntimeException("Stub!");
    }
    
    public static float getAltitude(final float p0, final float p) {
        throw new RuntimeException("Stub!");
    }
    
    public static void getAngleChange(final float[] angleChange, final float[] R, final float[] prevR) {
        throw new RuntimeException("Stub!");
    }
    
    public static void getRotationMatrixFromVector(final float[] R, final float[] rotationVector) {
        throw new RuntimeException("Stub!");
    }
    
    public static void getQuaternionFromVector(final float[] Q, final float[] rv) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean requestTriggerSensor(final TriggerEventListener listener, final Sensor sensor) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean cancelTriggerSensor(final TriggerEventListener listener, final Sensor sensor) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract static class DynamicSensorCallback
    {
        public DynamicSensorCallback() {
            throw new RuntimeException("Stub!");
        }
        
        public void onDynamicSensorConnected(final Sensor sensor) {
            throw new RuntimeException("Stub!");
        }
        
        public void onDynamicSensorDisconnected(final Sensor sensor) {
            throw new RuntimeException("Stub!");
        }
    }
}
