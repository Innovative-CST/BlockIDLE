package android.util.proto;

import java.io.OutputStream;

public final class ProtoOutputStream
{
    public static final long FIELD_COUNT_MASK = 16492674416640L;
    public static final long FIELD_COUNT_PACKED = 5497558138880L;
    public static final long FIELD_COUNT_REPEATED = 2199023255552L;
    public static final int FIELD_COUNT_SHIFT = 40;
    public static final long FIELD_COUNT_SINGLE = 1099511627776L;
    public static final long FIELD_COUNT_UNKNOWN = 0L;
    public static final int FIELD_ID_SHIFT = 3;
    public static final long FIELD_TYPE_BOOL = 34359738368L;
    public static final long FIELD_TYPE_BYTES = 51539607552L;
    public static final long FIELD_TYPE_DOUBLE = 4294967296L;
    public static final long FIELD_TYPE_ENUM = 60129542144L;
    public static final long FIELD_TYPE_FIXED32 = 30064771072L;
    public static final long FIELD_TYPE_FIXED64 = 25769803776L;
    public static final long FIELD_TYPE_FLOAT = 8589934592L;
    public static final long FIELD_TYPE_INT32 = 21474836480L;
    public static final long FIELD_TYPE_INT64 = 12884901888L;
    public static final long FIELD_TYPE_MASK = 1095216660480L;
    public static final long FIELD_TYPE_MESSAGE = 47244640256L;
    public static final long FIELD_TYPE_SFIXED32 = 64424509440L;
    public static final long FIELD_TYPE_SFIXED64 = 68719476736L;
    public static final int FIELD_TYPE_SHIFT = 32;
    public static final long FIELD_TYPE_SINT32 = 73014444032L;
    public static final long FIELD_TYPE_SINT64 = 77309411328L;
    public static final long FIELD_TYPE_STRING = 38654705664L;
    public static final long FIELD_TYPE_UINT32 = 55834574848L;
    public static final long FIELD_TYPE_UINT64 = 17179869184L;
    public static final int WIRE_TYPE_END_GROUP = 4;
    public static final int WIRE_TYPE_FIXED32 = 5;
    public static final int WIRE_TYPE_FIXED64 = 1;
    public static final int WIRE_TYPE_LENGTH_DELIMITED = 2;
    public static final int WIRE_TYPE_MASK = 7;
    public static final int WIRE_TYPE_START_GROUP = 3;
    public static final int WIRE_TYPE_VARINT = 0;
    
    public ProtoOutputStream() {
        throw new RuntimeException("Stub!");
    }
    
    public ProtoOutputStream(final int chunkSize) {
        throw new RuntimeException("Stub!");
    }
    
    public ProtoOutputStream(@NonNull final OutputStream stream) {
        throw new RuntimeException("Stub!");
    }
    
    public int getRawSize() {
        throw new RuntimeException("Stub!");
    }
    
    public void write(final long fieldId, final double val) {
        throw new RuntimeException("Stub!");
    }
    
    public void write(final long fieldId, final float val) {
        throw new RuntimeException("Stub!");
    }
    
    public void write(final long fieldId, final int val) {
        throw new RuntimeException("Stub!");
    }
    
    public void write(final long fieldId, final long val) {
        throw new RuntimeException("Stub!");
    }
    
    public void write(final long fieldId, final boolean val) {
        throw new RuntimeException("Stub!");
    }
    
    public void write(final long fieldId, @Nullable final String val) {
        throw new RuntimeException("Stub!");
    }
    
    public void write(final long fieldId, @Nullable final byte[] val) {
        throw new RuntimeException("Stub!");
    }
    
    public long start(final long fieldId) {
        throw new RuntimeException("Stub!");
    }
    
    public void end(final long token) {
        throw new RuntimeException("Stub!");
    }
    
    public static long makeFieldId(final int id, final long fieldFlags) {
        throw new RuntimeException("Stub!");
    }
    
    public static int checkFieldId(final long fieldId, final long expectedFlags) {
        throw new RuntimeException("Stub!");
    }
    
    public void writeTag(final int id, final int wireType) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public byte[] getBytes() {
        throw new RuntimeException("Stub!");
    }
    
    public void flush() {
        throw new RuntimeException("Stub!");
    }
    
    public void dump(@NonNull final String tag) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static String token2String(final long token) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public static String getFieldTypeString(final long fieldType) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public static String getWireTypeString(final int wireType) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static String getFieldIdString(final long fieldId) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public static String getFieldCountString(final long fieldCount) {
        throw new RuntimeException("Stub!");
    }
    
    public static long makeToken(final int tagSize, final boolean repeated, final int depth, final int objectId, final int offset) {
        throw new RuntimeException("Stub!");
    }
}
