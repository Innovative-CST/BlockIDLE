package android.os;

public final class Message implements Parcelable
{
    @NonNull
    public static final Creator<Message> CREATOR;
    public int arg1;
    public int arg2;
    public Object obj;
    public Messenger replyTo;
    public int sendingUid;
    public int what;
    
    public Message() {
        this.sendingUid = -1;
        throw new RuntimeException("Stub!");
    }
    
    public static Message obtain() {
        throw new RuntimeException("Stub!");
    }
    
    public static Message obtain(final Message orig) {
        throw new RuntimeException("Stub!");
    }
    
    public static Message obtain(final Handler h) {
        throw new RuntimeException("Stub!");
    }
    
    public static Message obtain(final Handler h, final Runnable callback) {
        throw new RuntimeException("Stub!");
    }
    
    public static Message obtain(final Handler h, final int what) {
        throw new RuntimeException("Stub!");
    }
    
    public static Message obtain(final Handler h, final int what, final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    public static Message obtain(final Handler h, final int what, final int arg1, final int arg2) {
        throw new RuntimeException("Stub!");
    }
    
    public static Message obtain(final Handler h, final int what, final int arg1, final int arg2, final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    public void recycle() {
        throw new RuntimeException("Stub!");
    }
    
    public void copyFrom(final Message o) {
        throw new RuntimeException("Stub!");
    }
    
    public long getWhen() {
        throw new RuntimeException("Stub!");
    }
    
    public void setTarget(final Handler target) {
        throw new RuntimeException("Stub!");
    }
    
    public Handler getTarget() {
        throw new RuntimeException("Stub!");
    }
    
    public Runnable getCallback() {
        throw new RuntimeException("Stub!");
    }
    
    public Bundle getData() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Bundle peekData() {
        throw new RuntimeException("Stub!");
    }
    
    public void setData(final Bundle data) {
        throw new RuntimeException("Stub!");
    }
    
    public void sendToTarget() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAsynchronous() {
        throw new RuntimeException("Stub!");
    }
    
    public void setAsynchronous(final boolean async) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
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
    
    static {
        CREATOR = null;
    }
}
