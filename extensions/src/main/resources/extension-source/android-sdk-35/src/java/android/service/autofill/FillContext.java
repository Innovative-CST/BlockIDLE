package android.service.autofill;

import android.os.Parcel;
import android.view.autofill.AutofillId;
import android.app.assist.AssistStructure;
import android.os.Parcelable;

public final class FillContext implements Parcelable
{
    @NonNull
    public static final Creator<FillContext> CREATOR;
    
    FillContext() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRequestId() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public AssistStructure getStructure() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public AutofillId getFocusedId() {
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
