package android.hardware;

public class SensorAdditionalInfo
{
    public static final int TYPE_FRAME_BEGIN = 0;
    public static final int TYPE_FRAME_END = 1;
    public static final int TYPE_INTERNAL_TEMPERATURE = 65537;
    public static final int TYPE_SAMPLING = 65540;
    public static final int TYPE_SENSOR_PLACEMENT = 65539;
    public static final int TYPE_UNTRACKED_DELAY = 65536;
    public static final int TYPE_VEC3_CALIBRATION = 65538;
    public final float[] floatValues;
    public final int[] intValues;
    public final Sensor sensor;
    public final int serial;
    public final int type;
    
    SensorAdditionalInfo() {
        this.floatValues = null;
        this.intValues = null;
        this.sensor = null;
        this.serial = 0;
        this.type = 0;
        throw new RuntimeException("Stub!");
    }
}
