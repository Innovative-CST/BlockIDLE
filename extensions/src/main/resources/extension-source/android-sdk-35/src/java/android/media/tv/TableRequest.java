package android.media.tv;

import android.os.Parcel;
import android.os.Parcelable;

public final class TableRequest extends BroadcastInfoRequest implements Parcelable
{
    @NonNull
    public static final Creator<TableRequest> CREATOR;
    public static final int TABLE_NAME_BAT = 4;
    public static final int TABLE_NAME_CAT = 2;
    public static final int TABLE_NAME_EIT = 6;
    public static final int TABLE_NAME_NIT = 3;
    public static final int TABLE_NAME_PAT = 0;
    public static final int TABLE_NAME_PMT = 1;
    public static final int TABLE_NAME_SDT = 5;
    public static final int TABLE_NAME_SIT = 9;
    public static final int TABLE_NAME_TDT = 7;
    public static final int TABLE_NAME_TOT = 8;
    
    public TableRequest(final int requestId, final int option, final int tableId, final int tableName, final int version) {
        throw new RuntimeException("Stub!");
    }
    
    public int getTableId() {
        throw new RuntimeException("Stub!");
    }
    
    public int getTableName() {
        throw new RuntimeException("Stub!");
    }
    
    public int getVersion() {
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
