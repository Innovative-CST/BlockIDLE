package android.text.style;

import android.os.Parcel;
import android.text.ParcelableSpan;
import android.text.Layout;

public interface AlignmentSpan extends ParagraphStyle
{
    Layout.Alignment getAlignment();
    
    public static class Standard implements AlignmentSpan, ParcelableSpan
    {
        public Standard(@NonNull final Layout.Alignment align) {
            throw new RuntimeException("Stub!");
        }
        
        public Standard(@NonNull final Parcel src) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int getSpanTypeId() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int describeContents() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void writeToParcel(@NonNull final Parcel dest, final int flags) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public Layout.Alignment getAlignment() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }
}
