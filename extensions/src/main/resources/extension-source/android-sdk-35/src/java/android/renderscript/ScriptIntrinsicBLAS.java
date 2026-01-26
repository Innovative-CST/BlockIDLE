package android.renderscript;

@Deprecated
public final class ScriptIntrinsicBLAS extends ScriptIntrinsic
{
    @Deprecated
    public static final int CONJ_TRANSPOSE = 113;
    @Deprecated
    public static final int LEFT = 141;
    @Deprecated
    public static final int LOWER = 122;
    @Deprecated
    public static final int NON_UNIT = 131;
    @Deprecated
    public static final int NO_TRANSPOSE = 111;
    @Deprecated
    public static final int RIGHT = 142;
    @Deprecated
    public static final int TRANSPOSE = 112;
    @Deprecated
    public static final int UNIT = 132;
    @Deprecated
    public static final int UPPER = 121;
    
    ScriptIntrinsicBLAS() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static ScriptIntrinsicBLAS create(final RenderScript rs) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void SGEMV(final int TransA, final float alpha, final Allocation A, final Allocation X, final int incX, final float beta, final Allocation Y, final int incY) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void DGEMV(final int TransA, final double alpha, final Allocation A, final Allocation X, final int incX, final double beta, final Allocation Y, final int incY) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void CGEMV(final int TransA, final Float2 alpha, final Allocation A, final Allocation X, final int incX, final Float2 beta, final Allocation Y, final int incY) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void ZGEMV(final int TransA, final Double2 alpha, final Allocation A, final Allocation X, final int incX, final Double2 beta, final Allocation Y, final int incY) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void SGBMV(final int TransA, final int KL, final int KU, final float alpha, final Allocation A, final Allocation X, final int incX, final float beta, final Allocation Y, final int incY) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void DGBMV(final int TransA, final int KL, final int KU, final double alpha, final Allocation A, final Allocation X, final int incX, final double beta, final Allocation Y, final int incY) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void CGBMV(final int TransA, final int KL, final int KU, final Float2 alpha, final Allocation A, final Allocation X, final int incX, final Float2 beta, final Allocation Y, final int incY) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void ZGBMV(final int TransA, final int KL, final int KU, final Double2 alpha, final Allocation A, final Allocation X, final int incX, final Double2 beta, final Allocation Y, final int incY) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void STRMV(final int Uplo, final int TransA, final int Diag, final Allocation A, final Allocation X, final int incX) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void DTRMV(final int Uplo, final int TransA, final int Diag, final Allocation A, final Allocation X, final int incX) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void CTRMV(final int Uplo, final int TransA, final int Diag, final Allocation A, final Allocation X, final int incX) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void ZTRMV(final int Uplo, final int TransA, final int Diag, final Allocation A, final Allocation X, final int incX) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void STBMV(final int Uplo, final int TransA, final int Diag, final int K, final Allocation A, final Allocation X, final int incX) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void DTBMV(final int Uplo, final int TransA, final int Diag, final int K, final Allocation A, final Allocation X, final int incX) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void CTBMV(final int Uplo, final int TransA, final int Diag, final int K, final Allocation A, final Allocation X, final int incX) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void ZTBMV(final int Uplo, final int TransA, final int Diag, final int K, final Allocation A, final Allocation X, final int incX) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void STPMV(final int Uplo, final int TransA, final int Diag, final Allocation Ap, final Allocation X, final int incX) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void DTPMV(final int Uplo, final int TransA, final int Diag, final Allocation Ap, final Allocation X, final int incX) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void CTPMV(final int Uplo, final int TransA, final int Diag, final Allocation Ap, final Allocation X, final int incX) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void ZTPMV(final int Uplo, final int TransA, final int Diag, final Allocation Ap, final Allocation X, final int incX) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void STRSV(final int Uplo, final int TransA, final int Diag, final Allocation A, final Allocation X, final int incX) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void DTRSV(final int Uplo, final int TransA, final int Diag, final Allocation A, final Allocation X, final int incX) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void CTRSV(final int Uplo, final int TransA, final int Diag, final Allocation A, final Allocation X, final int incX) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void ZTRSV(final int Uplo, final int TransA, final int Diag, final Allocation A, final Allocation X, final int incX) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void STBSV(final int Uplo, final int TransA, final int Diag, final int K, final Allocation A, final Allocation X, final int incX) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void DTBSV(final int Uplo, final int TransA, final int Diag, final int K, final Allocation A, final Allocation X, final int incX) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void CTBSV(final int Uplo, final int TransA, final int Diag, final int K, final Allocation A, final Allocation X, final int incX) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void ZTBSV(final int Uplo, final int TransA, final int Diag, final int K, final Allocation A, final Allocation X, final int incX) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void STPSV(final int Uplo, final int TransA, final int Diag, final Allocation Ap, final Allocation X, final int incX) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void DTPSV(final int Uplo, final int TransA, final int Diag, final Allocation Ap, final Allocation X, final int incX) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void CTPSV(final int Uplo, final int TransA, final int Diag, final Allocation Ap, final Allocation X, final int incX) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void ZTPSV(final int Uplo, final int TransA, final int Diag, final Allocation Ap, final Allocation X, final int incX) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void SSYMV(final int Uplo, final float alpha, final Allocation A, final Allocation X, final int incX, final float beta, final Allocation Y, final int incY) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void SSBMV(final int Uplo, final int K, final float alpha, final Allocation A, final Allocation X, final int incX, final float beta, final Allocation Y, final int incY) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void SSPMV(final int Uplo, final float alpha, final Allocation Ap, final Allocation X, final int incX, final float beta, final Allocation Y, final int incY) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void SGER(final float alpha, final Allocation X, final int incX, final Allocation Y, final int incY, final Allocation A) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void SSYR(final int Uplo, final float alpha, final Allocation X, final int incX, final Allocation A) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void SSPR(final int Uplo, final float alpha, final Allocation X, final int incX, final Allocation Ap) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void SSYR2(final int Uplo, final float alpha, final Allocation X, final int incX, final Allocation Y, final int incY, final Allocation A) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void SSPR2(final int Uplo, final float alpha, final Allocation X, final int incX, final Allocation Y, final int incY, final Allocation Ap) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void DSYMV(final int Uplo, final double alpha, final Allocation A, final Allocation X, final int incX, final double beta, final Allocation Y, final int incY) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void DSBMV(final int Uplo, final int K, final double alpha, final Allocation A, final Allocation X, final int incX, final double beta, final Allocation Y, final int incY) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void DSPMV(final int Uplo, final double alpha, final Allocation Ap, final Allocation X, final int incX, final double beta, final Allocation Y, final int incY) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void DGER(final double alpha, final Allocation X, final int incX, final Allocation Y, final int incY, final Allocation A) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void DSYR(final int Uplo, final double alpha, final Allocation X, final int incX, final Allocation A) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void DSPR(final int Uplo, final double alpha, final Allocation X, final int incX, final Allocation Ap) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void DSYR2(final int Uplo, final double alpha, final Allocation X, final int incX, final Allocation Y, final int incY, final Allocation A) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void DSPR2(final int Uplo, final double alpha, final Allocation X, final int incX, final Allocation Y, final int incY, final Allocation Ap) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void CHEMV(final int Uplo, final Float2 alpha, final Allocation A, final Allocation X, final int incX, final Float2 beta, final Allocation Y, final int incY) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void CHBMV(final int Uplo, final int K, final Float2 alpha, final Allocation A, final Allocation X, final int incX, final Float2 beta, final Allocation Y, final int incY) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void CHPMV(final int Uplo, final Float2 alpha, final Allocation Ap, final Allocation X, final int incX, final Float2 beta, final Allocation Y, final int incY) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void CGERU(final Float2 alpha, final Allocation X, final int incX, final Allocation Y, final int incY, final Allocation A) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void CGERC(final Float2 alpha, final Allocation X, final int incX, final Allocation Y, final int incY, final Allocation A) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void CHER(final int Uplo, final float alpha, final Allocation X, final int incX, final Allocation A) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void CHPR(final int Uplo, final float alpha, final Allocation X, final int incX, final Allocation Ap) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void CHER2(final int Uplo, final Float2 alpha, final Allocation X, final int incX, final Allocation Y, final int incY, final Allocation A) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void CHPR2(final int Uplo, final Float2 alpha, final Allocation X, final int incX, final Allocation Y, final int incY, final Allocation Ap) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void ZHEMV(final int Uplo, final Double2 alpha, final Allocation A, final Allocation X, final int incX, final Double2 beta, final Allocation Y, final int incY) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void ZHBMV(final int Uplo, final int K, final Double2 alpha, final Allocation A, final Allocation X, final int incX, final Double2 beta, final Allocation Y, final int incY) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void ZHPMV(final int Uplo, final Double2 alpha, final Allocation Ap, final Allocation X, final int incX, final Double2 beta, final Allocation Y, final int incY) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void ZGERU(final Double2 alpha, final Allocation X, final int incX, final Allocation Y, final int incY, final Allocation A) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void ZGERC(final Double2 alpha, final Allocation X, final int incX, final Allocation Y, final int incY, final Allocation A) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void ZHER(final int Uplo, final double alpha, final Allocation X, final int incX, final Allocation A) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void ZHPR(final int Uplo, final double alpha, final Allocation X, final int incX, final Allocation Ap) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void ZHER2(final int Uplo, final Double2 alpha, final Allocation X, final int incX, final Allocation Y, final int incY, final Allocation A) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void ZHPR2(final int Uplo, final Double2 alpha, final Allocation X, final int incX, final Allocation Y, final int incY, final Allocation Ap) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void SGEMM(final int TransA, final int TransB, final float alpha, final Allocation A, final Allocation B, final float beta, final Allocation C) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void DGEMM(final int TransA, final int TransB, final double alpha, final Allocation A, final Allocation B, final double beta, final Allocation C) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void CGEMM(final int TransA, final int TransB, final Float2 alpha, final Allocation A, final Allocation B, final Float2 beta, final Allocation C) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void ZGEMM(final int TransA, final int TransB, final Double2 alpha, final Allocation A, final Allocation B, final Double2 beta, final Allocation C) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void SSYMM(final int Side, final int Uplo, final float alpha, final Allocation A, final Allocation B, final float beta, final Allocation C) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void DSYMM(final int Side, final int Uplo, final double alpha, final Allocation A, final Allocation B, final double beta, final Allocation C) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void CSYMM(final int Side, final int Uplo, final Float2 alpha, final Allocation A, final Allocation B, final Float2 beta, final Allocation C) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void ZSYMM(final int Side, final int Uplo, final Double2 alpha, final Allocation A, final Allocation B, final Double2 beta, final Allocation C) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void SSYRK(final int Uplo, final int Trans, final float alpha, final Allocation A, final float beta, final Allocation C) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void DSYRK(final int Uplo, final int Trans, final double alpha, final Allocation A, final double beta, final Allocation C) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void CSYRK(final int Uplo, final int Trans, final Float2 alpha, final Allocation A, final Float2 beta, final Allocation C) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void ZSYRK(final int Uplo, final int Trans, final Double2 alpha, final Allocation A, final Double2 beta, final Allocation C) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void SSYR2K(final int Uplo, final int Trans, final float alpha, final Allocation A, final Allocation B, final float beta, final Allocation C) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void DSYR2K(final int Uplo, final int Trans, final double alpha, final Allocation A, final Allocation B, final double beta, final Allocation C) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void CSYR2K(final int Uplo, final int Trans, final Float2 alpha, final Allocation A, final Allocation B, final Float2 beta, final Allocation C) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void ZSYR2K(final int Uplo, final int Trans, final Double2 alpha, final Allocation A, final Allocation B, final Double2 beta, final Allocation C) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void STRMM(final int Side, final int Uplo, final int TransA, final int Diag, final float alpha, final Allocation A, final Allocation B) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void DTRMM(final int Side, final int Uplo, final int TransA, final int Diag, final double alpha, final Allocation A, final Allocation B) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void CTRMM(final int Side, final int Uplo, final int TransA, final int Diag, final Float2 alpha, final Allocation A, final Allocation B) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void ZTRMM(final int Side, final int Uplo, final int TransA, final int Diag, final Double2 alpha, final Allocation A, final Allocation B) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void STRSM(final int Side, final int Uplo, final int TransA, final int Diag, final float alpha, final Allocation A, final Allocation B) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void DTRSM(final int Side, final int Uplo, final int TransA, final int Diag, final double alpha, final Allocation A, final Allocation B) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void CTRSM(final int Side, final int Uplo, final int TransA, final int Diag, final Float2 alpha, final Allocation A, final Allocation B) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void ZTRSM(final int Side, final int Uplo, final int TransA, final int Diag, final Double2 alpha, final Allocation A, final Allocation B) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void CHEMM(final int Side, final int Uplo, final Float2 alpha, final Allocation A, final Allocation B, final Float2 beta, final Allocation C) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void ZHEMM(final int Side, final int Uplo, final Double2 alpha, final Allocation A, final Allocation B, final Double2 beta, final Allocation C) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void CHERK(final int Uplo, final int Trans, final float alpha, final Allocation A, final float beta, final Allocation C) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void ZHERK(final int Uplo, final int Trans, final double alpha, final Allocation A, final double beta, final Allocation C) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void CHER2K(final int Uplo, final int Trans, final Float2 alpha, final Allocation A, final Allocation B, final float beta, final Allocation C) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void ZHER2K(final int Uplo, final int Trans, final Double2 alpha, final Allocation A, final Allocation B, final double beta, final Allocation C) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void BNNM(final Allocation A, final int a_offset, final Allocation B, final int b_offset, final Allocation C, final int c_offset, final int c_mult) {
        throw new RuntimeException("Stub!");
    }
}
