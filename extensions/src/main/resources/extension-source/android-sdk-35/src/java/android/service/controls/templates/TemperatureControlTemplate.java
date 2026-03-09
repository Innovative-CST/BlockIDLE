package android.service.controls.templates;

public final class TemperatureControlTemplate extends ControlTemplate
{
    public static final int FLAG_MODE_COOL = 8;
    public static final int FLAG_MODE_ECO = 32;
    public static final int FLAG_MODE_HEAT = 4;
    public static final int FLAG_MODE_HEAT_COOL = 16;
    public static final int FLAG_MODE_OFF = 2;
    public static final int MODE_COOL = 3;
    public static final int MODE_ECO = 5;
    public static final int MODE_HEAT = 2;
    public static final int MODE_HEAT_COOL = 4;
    public static final int MODE_OFF = 1;
    public static final int MODE_UNKNOWN = 0;
    
    public TemperatureControlTemplate(@NonNull final String templateId, @NonNull final ControlTemplate controlTemplate, final int currentMode, final int currentActiveMode, final int modesFlag) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public ControlTemplate getTemplate() {
        throw new RuntimeException("Stub!");
    }
    
    public int getCurrentMode() {
        throw new RuntimeException("Stub!");
    }
    
    public int getCurrentActiveMode() {
        throw new RuntimeException("Stub!");
    }
    
    public int getModes() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getTemplateType() {
        throw new RuntimeException("Stub!");
    }
}
