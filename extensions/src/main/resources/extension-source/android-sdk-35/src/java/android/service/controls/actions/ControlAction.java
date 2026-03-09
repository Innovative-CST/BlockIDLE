package android.service.controls.actions;

public abstract class ControlAction
{
    public static final int RESPONSE_CHALLENGE_ACK = 3;
    public static final int RESPONSE_CHALLENGE_PASSPHRASE = 5;
    public static final int RESPONSE_CHALLENGE_PIN = 4;
    public static final int RESPONSE_FAIL = 2;
    public static final int RESPONSE_OK = 1;
    public static final int RESPONSE_UNKNOWN = 0;
    public static final int TYPE_BOOLEAN = 1;
    public static final int TYPE_COMMAND = 5;
    public static final int TYPE_ERROR = -1;
    public static final int TYPE_FLOAT = 2;
    public static final int TYPE_MODE = 4;
    
    ControlAction() {
        throw new RuntimeException("Stub!");
    }
    
    public static final boolean isValidResponse(final int response) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract int getActionType();
    
    @NonNull
    public String getTemplateId() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getChallengeValue() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static ControlAction getErrorAction() {
        throw new RuntimeException("Stub!");
    }
}
