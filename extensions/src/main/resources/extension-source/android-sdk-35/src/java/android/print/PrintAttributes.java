package android.print;

import android.content.pm.PackageManager;
import android.os.Parcel;
import android.os.Parcelable;

public final class PrintAttributes implements Parcelable
{
    public static final int COLOR_MODE_COLOR = 2;
    public static final int COLOR_MODE_MONOCHROME = 1;
    @NonNull
    public static final Creator<PrintAttributes> CREATOR;
    public static final int DUPLEX_MODE_LONG_EDGE = 2;
    public static final int DUPLEX_MODE_NONE = 1;
    public static final int DUPLEX_MODE_SHORT_EDGE = 4;
    
    PrintAttributes() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public MediaSize getMediaSize() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Resolution getResolution() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Margins getMinMargins() {
        throw new RuntimeException("Stub!");
    }
    
    public int getColorMode() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDuplexMode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMediaSize(@NonNull final MediaSize mediaSize) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setResolution(@NonNull final Resolution resolution) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMinMargins(@NonNull final Margins margins) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setColorMode(final int colorMode) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDuplexMode(final int duplexMode) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public PrintAttributes build() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class Margins
    {
        public static final Margins NO_MARGINS;
        
        public Margins(final int leftMils, final int topMils, final int rightMils, final int bottomMils) {
            throw new RuntimeException("Stub!");
        }
        
        public int getLeftMils() {
            throw new RuntimeException("Stub!");
        }
        
        public int getTopMils() {
            throw new RuntimeException("Stub!");
        }
        
        public int getRightMils() {
            throw new RuntimeException("Stub!");
        }
        
        public int getBottomMils() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int hashCode() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean equals(@Nullable final Object obj) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
        
        static {
            NO_MARGINS = null;
        }
    }
    
    public static final class MediaSize
    {
        @NonNull
        public static final MediaSize ANSI_C;
        @NonNull
        public static final MediaSize ANSI_D;
        @NonNull
        public static final MediaSize ANSI_E;
        @NonNull
        public static final MediaSize ANSI_F;
        public static final MediaSize ISO_A0;
        public static final MediaSize ISO_A1;
        public static final MediaSize ISO_A10;
        public static final MediaSize ISO_A2;
        public static final MediaSize ISO_A3;
        public static final MediaSize ISO_A4;
        public static final MediaSize ISO_A5;
        public static final MediaSize ISO_A6;
        public static final MediaSize ISO_A7;
        public static final MediaSize ISO_A8;
        public static final MediaSize ISO_A9;
        public static final MediaSize ISO_B0;
        public static final MediaSize ISO_B1;
        public static final MediaSize ISO_B10;
        public static final MediaSize ISO_B2;
        public static final MediaSize ISO_B3;
        public static final MediaSize ISO_B4;
        public static final MediaSize ISO_B5;
        public static final MediaSize ISO_B6;
        public static final MediaSize ISO_B7;
        public static final MediaSize ISO_B8;
        public static final MediaSize ISO_B9;
        public static final MediaSize ISO_C0;
        public static final MediaSize ISO_C1;
        public static final MediaSize ISO_C10;
        public static final MediaSize ISO_C2;
        public static final MediaSize ISO_C3;
        public static final MediaSize ISO_C4;
        public static final MediaSize ISO_C5;
        public static final MediaSize ISO_C6;
        public static final MediaSize ISO_C7;
        public static final MediaSize ISO_C8;
        public static final MediaSize ISO_C9;
        public static final MediaSize JIS_B0;
        public static final MediaSize JIS_B1;
        public static final MediaSize JIS_B10;
        public static final MediaSize JIS_B2;
        public static final MediaSize JIS_B3;
        public static final MediaSize JIS_B4;
        public static final MediaSize JIS_B5;
        public static final MediaSize JIS_B6;
        public static final MediaSize JIS_B7;
        public static final MediaSize JIS_B8;
        public static final MediaSize JIS_B9;
        public static final MediaSize JIS_EXEC;
        public static final MediaSize JPN_CHOU2;
        public static final MediaSize JPN_CHOU3;
        public static final MediaSize JPN_CHOU4;
        public static final MediaSize JPN_HAGAKI;
        public static final MediaSize JPN_KAHU;
        public static final MediaSize JPN_KAKU2;
        @NonNull
        public static final MediaSize JPN_OE_PHOTO_L;
        public static final MediaSize JPN_OUFUKU;
        public static final MediaSize JPN_YOU4;
        @NonNull
        public static final MediaSize NA_ARCH_A;
        @NonNull
        public static final MediaSize NA_ARCH_B;
        @NonNull
        public static final MediaSize NA_ARCH_C;
        @NonNull
        public static final MediaSize NA_ARCH_D;
        @NonNull
        public static final MediaSize NA_ARCH_E;
        @NonNull
        public static final MediaSize NA_ARCH_E1;
        public static final MediaSize NA_FOOLSCAP;
        public static final MediaSize NA_GOVT_LETTER;
        public static final MediaSize NA_INDEX_3X5;
        public static final MediaSize NA_INDEX_4X6;
        public static final MediaSize NA_INDEX_5X8;
        public static final MediaSize NA_JUNIOR_LEGAL;
        public static final MediaSize NA_LEDGER;
        public static final MediaSize NA_LEGAL;
        public static final MediaSize NA_LETTER;
        public static final MediaSize NA_MONARCH;
        public static final MediaSize NA_QUARTO;
        @NonNull
        public static final MediaSize NA_SUPER_B;
        public static final MediaSize NA_TABLOID;
        public static final MediaSize OM_DAI_PA_KAI;
        public static final MediaSize OM_JUURO_KU_KAI;
        public static final MediaSize OM_PA_KAI;
        public static final MediaSize PRC_1;
        public static final MediaSize PRC_10;
        public static final MediaSize PRC_16K;
        public static final MediaSize PRC_2;
        public static final MediaSize PRC_3;
        public static final MediaSize PRC_4;
        public static final MediaSize PRC_5;
        public static final MediaSize PRC_6;
        public static final MediaSize PRC_7;
        public static final MediaSize PRC_8;
        public static final MediaSize PRC_9;
        public static final MediaSize ROC_16K;
        public static final MediaSize ROC_8K;
        public static final MediaSize UNKNOWN_LANDSCAPE;
        public static final MediaSize UNKNOWN_PORTRAIT;
        
        public MediaSize(@NonNull final String id, @NonNull final String label, final int widthMils, final int heightMils) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public String getId() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public String getLabel(@NonNull final PackageManager packageManager) {
            throw new RuntimeException("Stub!");
        }
        
        public int getWidthMils() {
            throw new RuntimeException("Stub!");
        }
        
        public int getHeightMils() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isPortrait() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public MediaSize asPortrait() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public MediaSize asLandscape() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int hashCode() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean equals(@Nullable final Object obj) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
        
        static {
            ANSI_C = null;
            ANSI_D = null;
            ANSI_E = null;
            ANSI_F = null;
            ISO_A0 = null;
            ISO_A1 = null;
            ISO_A10 = null;
            ISO_A2 = null;
            ISO_A3 = null;
            ISO_A4 = null;
            ISO_A5 = null;
            ISO_A6 = null;
            ISO_A7 = null;
            ISO_A8 = null;
            ISO_A9 = null;
            ISO_B0 = null;
            ISO_B1 = null;
            ISO_B10 = null;
            ISO_B2 = null;
            ISO_B3 = null;
            ISO_B4 = null;
            ISO_B5 = null;
            ISO_B6 = null;
            ISO_B7 = null;
            ISO_B8 = null;
            ISO_B9 = null;
            ISO_C0 = null;
            ISO_C1 = null;
            ISO_C10 = null;
            ISO_C2 = null;
            ISO_C3 = null;
            ISO_C4 = null;
            ISO_C5 = null;
            ISO_C6 = null;
            ISO_C7 = null;
            ISO_C8 = null;
            ISO_C9 = null;
            JIS_B0 = null;
            JIS_B1 = null;
            JIS_B10 = null;
            JIS_B2 = null;
            JIS_B3 = null;
            JIS_B4 = null;
            JIS_B5 = null;
            JIS_B6 = null;
            JIS_B7 = null;
            JIS_B8 = null;
            JIS_B9 = null;
            JIS_EXEC = null;
            JPN_CHOU2 = null;
            JPN_CHOU3 = null;
            JPN_CHOU4 = null;
            JPN_HAGAKI = null;
            JPN_KAHU = null;
            JPN_KAKU2 = null;
            JPN_OE_PHOTO_L = null;
            JPN_OUFUKU = null;
            JPN_YOU4 = null;
            NA_ARCH_A = null;
            NA_ARCH_B = null;
            NA_ARCH_C = null;
            NA_ARCH_D = null;
            NA_ARCH_E = null;
            NA_ARCH_E1 = null;
            NA_FOOLSCAP = null;
            NA_GOVT_LETTER = null;
            NA_INDEX_3X5 = null;
            NA_INDEX_4X6 = null;
            NA_INDEX_5X8 = null;
            NA_JUNIOR_LEGAL = null;
            NA_LEDGER = null;
            NA_LEGAL = null;
            NA_LETTER = null;
            NA_MONARCH = null;
            NA_QUARTO = null;
            NA_SUPER_B = null;
            NA_TABLOID = null;
            OM_DAI_PA_KAI = null;
            OM_JUURO_KU_KAI = null;
            OM_PA_KAI = null;
            PRC_1 = null;
            PRC_10 = null;
            PRC_16K = null;
            PRC_2 = null;
            PRC_3 = null;
            PRC_4 = null;
            PRC_5 = null;
            PRC_6 = null;
            PRC_7 = null;
            PRC_8 = null;
            PRC_9 = null;
            ROC_16K = null;
            ROC_8K = null;
            UNKNOWN_LANDSCAPE = null;
            UNKNOWN_PORTRAIT = null;
        }
    }
    
    public static final class Resolution
    {
        public Resolution(@NonNull final String id, @NonNull final String label, final int horizontalDpi, final int verticalDpi) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public String getId() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public String getLabel() {
            throw new RuntimeException("Stub!");
        }
        
        public int getHorizontalDpi() {
            throw new RuntimeException("Stub!");
        }
        
        public int getVerticalDpi() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int hashCode() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean equals(@Nullable final Object obj) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }
}
