package android.graphics.pdf.content;

import android.os.Parcel;
import android.graphics.RectF;
import java.util.List;
import android.os.Parcelable;

public final class PdfPageGotoLinkContent implements Parcelable
{
    @NonNull
    public static final Creator<PdfPageGotoLinkContent> CREATOR;
    
    public PdfPageGotoLinkContent(@NonNull final List<RectF> bounds, @NonNull final Destination destination) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<RectF> getBounds() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Destination getDestination() {
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
    
    static {
        CREATOR = null;
    }
    
    public static final class Destination implements Parcelable
    {
        @NonNull
        public static final Creator<Destination> CREATOR;
        
        public Destination(final int pageNumber, final float xCoordinate, final float yCoordinate, final float zoom) {
            throw new RuntimeException("Stub!");
        }
        
        public int getPageNumber() {
            throw new RuntimeException("Stub!");
        }
        
        public float getXCoordinate() {
            throw new RuntimeException("Stub!");
        }
        
        public float getYCoordinate() {
            throw new RuntimeException("Stub!");
        }
        
        public float getZoom() {
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
        
        static {
            CREATOR = null;
        }
    }
}
