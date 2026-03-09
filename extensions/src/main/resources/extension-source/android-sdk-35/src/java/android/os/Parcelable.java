package android.os;

public interface Parcelable
{
    public static final int CONTENTS_FILE_DESCRIPTOR = 1;
    public static final int PARCELABLE_WRITE_RETURN_VALUE = 1;
    
    int describeContents();
    
    void writeToParcel(@NonNull final Parcel p0, final int p1);
    
    public interface Creator<T>
    {
        T createFromParcel(final Parcel p0);
        
        T[] newArray(final int p0);
    }
    
    public interface ClassLoaderCreator<T> extends Creator<T>
    {
        T createFromParcel(final Parcel p0, final ClassLoader p1);
    }
}
