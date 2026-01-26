package android.os;

import java.util.List;

public class Build
{
    public static final String BOARD;
    public static final String BOOTLOADER;
    public static final String BRAND;
    @Deprecated
    public static final String CPU_ABI;
    @Deprecated
    public static final String CPU_ABI2;
    public static final String DEVICE;
    public static final String DISPLAY;
    public static final String FINGERPRINT;
    public static final String HARDWARE;
    public static final String HOST;
    public static final String ID;
    public static final String MANUFACTURER;
    public static final String MODEL;
    @NonNull
    public static final String ODM_SKU;
    public static final String PRODUCT;
    @Deprecated
    public static final String RADIO;
    @Deprecated
    public static final String SERIAL;
    @NonNull
    public static final String SKU;
    @NonNull
    public static final String SOC_MANUFACTURER;
    @NonNull
    public static final String SOC_MODEL;
    public static final String[] SUPPORTED_32_BIT_ABIS;
    public static final String[] SUPPORTED_64_BIT_ABIS;
    public static final String[] SUPPORTED_ABIS;
    public static final String TAGS;
    public static final long TIME;
    public static final String TYPE;
    public static final String UNKNOWN = "unknown";
    public static final String USER;
    
    public Build() {
        throw new RuntimeException("Stub!");
    }
    
    public static String getSerial() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static List<Partition> getFingerprintedPartitions() {
        throw new RuntimeException("Stub!");
    }
    
    public static String getRadioVersion() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        BOARD = null;
        BOOTLOADER = null;
        BRAND = null;
        CPU_ABI = null;
        CPU_ABI2 = null;
        DEVICE = null;
        DISPLAY = null;
        FINGERPRINT = null;
        HARDWARE = null;
        HOST = null;
        ID = null;
        MANUFACTURER = null;
        MODEL = null;
        ODM_SKU = null;
        PRODUCT = null;
        RADIO = null;
        SERIAL = null;
        SKU = null;
        SOC_MANUFACTURER = null;
        SOC_MODEL = null;
        SUPPORTED_32_BIT_ABIS = null;
        SUPPORTED_64_BIT_ABIS = null;
        SUPPORTED_ABIS = null;
        TAGS = null;
        TIME = 0L;
        TYPE = null;
        USER = null;
    }
    
    public static class Partition
    {
        public static final String PARTITION_NAME_SYSTEM = "system";
        
        Partition() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public String getName() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public String getFingerprint() {
            throw new RuntimeException("Stub!");
        }
        
        public long getBuildTimeMillis() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean equals(@Nullable final Object o) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int hashCode() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class VERSION
    {
        public static final String BASE_OS;
        public static final String CODENAME;
        public static final String INCREMENTAL;
        public static final int MEDIA_PERFORMANCE_CLASS;
        public static final int PREVIEW_SDK_INT;
        public static final String RELEASE;
        @NonNull
        public static final String RELEASE_OR_CODENAME;
        @NonNull
        public static final String RELEASE_OR_PREVIEW_DISPLAY;
        @Deprecated
        public static final String SDK;
        public static final int SDK_INT;
        public static final String SECURITY_PATCH;
        
        public VERSION() {
            throw new RuntimeException("Stub!");
        }
        
        static {
            BASE_OS = null;
            CODENAME = null;
            INCREMENTAL = null;
            MEDIA_PERFORMANCE_CLASS = 0;
            PREVIEW_SDK_INT = 0;
            RELEASE = null;
            RELEASE_OR_CODENAME = null;
            RELEASE_OR_PREVIEW_DISPLAY = null;
            SDK = null;
            SDK_INT = 0;
            SECURITY_PATCH = null;
        }
    }
    
    public static class VERSION_CODES
    {
        public static final int BASE = 1;
        public static final int BASE_1_1 = 2;
        public static final int CUPCAKE = 3;
        public static final int CUR_DEVELOPMENT = 10000;
        public static final int DONUT = 4;
        public static final int ECLAIR = 5;
        public static final int ECLAIR_0_1 = 6;
        public static final int ECLAIR_MR1 = 7;
        public static final int FROYO = 8;
        public static final int GINGERBREAD = 9;
        public static final int GINGERBREAD_MR1 = 10;
        public static final int HONEYCOMB = 11;
        public static final int HONEYCOMB_MR1 = 12;
        public static final int HONEYCOMB_MR2 = 13;
        public static final int ICE_CREAM_SANDWICH = 14;
        public static final int ICE_CREAM_SANDWICH_MR1 = 15;
        public static final int JELLY_BEAN = 16;
        public static final int JELLY_BEAN_MR1 = 17;
        public static final int JELLY_BEAN_MR2 = 18;
        public static final int KITKAT = 19;
        public static final int KITKAT_WATCH = 20;
        public static final int LOLLIPOP = 21;
        public static final int LOLLIPOP_MR1 = 22;
        public static final int M = 23;
        public static final int N = 24;
        public static final int N_MR1 = 25;
        public static final int O = 26;
        public static final int O_MR1 = 27;
        public static final int P = 28;
        public static final int Q = 29;
        public static final int R = 30;
        public static final int S = 31;
        public static final int S_V2 = 32;
        public static final int TIRAMISU = 33;
        public static final int UPSIDE_DOWN_CAKE = 34;
        public static final int VANILLA_ICE_CREAM = 35;
        
        public VERSION_CODES() {
            throw new RuntimeException("Stub!");
        }
    }
}
