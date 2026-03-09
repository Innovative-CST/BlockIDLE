package android.view.inputmethod;

import android.os.Parcel;
import android.os.IBinder;
import android.os.Parcelable;

public final class InputBinding implements Parcelable
{
    @NonNull
    public static final Creator<InputBinding> CREATOR;
    
    public InputBinding(final InputConnection conn, final IBinder connToken, final int uid, final int pid) {
        throw new RuntimeException("Stub!");
    }
    
    public InputBinding(final InputConnection conn, final InputBinding binding) {
        throw new RuntimeException("Stub!");
    }
    
    public InputConnection getConnection() {
        throw new RuntimeException("Stub!");
    }
    
    public IBinder getConnectionToken() {
        throw new RuntimeException("Stub!");
    }
    
    public int getUid() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPid() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
