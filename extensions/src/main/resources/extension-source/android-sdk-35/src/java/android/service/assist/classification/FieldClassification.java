package android.service.assist.classification;

import android.os.Parcel;
import java.util.Set;
import android.view.autofill.AutofillId;
import android.os.Parcelable;

public final class FieldClassification implements Parcelable
{
    @NonNull
    public static final Creator<FieldClassification> CREATOR;
    
    public FieldClassification(@NonNull final AutofillId autofillId, @NonNull final Set<String> hints) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public AutofillId getAutofillId() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<String> getHints() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
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
