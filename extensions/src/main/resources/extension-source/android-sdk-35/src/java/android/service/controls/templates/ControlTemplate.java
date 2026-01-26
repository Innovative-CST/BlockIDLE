package android.service.controls.templates;

public abstract class ControlTemplate
{
    public static final int TYPE_ERROR = -1;
    public static final int TYPE_NO_TEMPLATE = 0;
    public static final int TYPE_RANGE = 2;
    public static final int TYPE_STATELESS = 8;
    public static final int TYPE_TEMPERATURE = 7;
    public static final int TYPE_THUMBNAIL = 3;
    public static final int TYPE_TOGGLE = 1;
    public static final int TYPE_TOGGLE_RANGE = 6;
    
    ControlTemplate() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getTemplateId() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract int getTemplateType();
    
    @NonNull
    public static ControlTemplate getErrorTemplate() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static ControlTemplate getNoTemplateObject() {
        throw new RuntimeException("Stub!");
    }
}
