package android.drm;

import java.io.IOException;
import android.net.Uri;
import android.content.ContentValues;
import java.util.Collection;
import android.content.Context;

@Deprecated
public class DrmManagerClient implements AutoCloseable
{
    @Deprecated
    public static final int ERROR_NONE = 0;
    @Deprecated
    public static final int ERROR_UNKNOWN = -2000;
    
    @Deprecated
    public DrmManagerClient(final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void close() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void release() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public synchronized void setOnInfoListener(final OnInfoListener infoListener) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public synchronized void setOnEventListener(final OnEventListener eventListener) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public synchronized void setOnErrorListener(final OnErrorListener errorListener) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String[] getAvailableDrmEngines() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public Collection<DrmSupportInfo> getAvailableDrmSupportInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public ContentValues getConstraints(final String path, final int action) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public ContentValues getMetadata(final String path) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public ContentValues getConstraints(final Uri uri, final int action) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public ContentValues getMetadata(final Uri uri) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int saveRights(final DrmRights drmRights, final String rightsPath, final String contentPath) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean canHandle(final String path, final String mimeType) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean canHandle(final Uri uri, final String mimeType) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int processDrmInfo(final DrmInfo drmInfo) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public DrmInfo acquireDrmInfo(final DrmInfoRequest drmInfoRequest) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int acquireRights(final DrmInfoRequest drmInfoRequest) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getDrmObjectType(final String path, final String mimeType) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getDrmObjectType(final Uri uri, final String mimeType) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String getOriginalMimeType(final String path) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String getOriginalMimeType(final Uri uri) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int checkRightsStatus(final String path) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int checkRightsStatus(final Uri uri) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int checkRightsStatus(final String path, final int action) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int checkRightsStatus(final Uri uri, final int action) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int removeRights(final String path) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int removeRights(final Uri uri) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int removeAllRights() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int openConvertSession(final String mimeType) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public DrmConvertedStatus convertData(final int convertId, final byte[] inputData) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public DrmConvertedStatus closeConvertSession(final int convertId) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public interface OnInfoListener
    {
        @Deprecated
        void onInfo(final DrmManagerClient p0, final DrmInfoEvent p1);
    }
    
    @Deprecated
    public interface OnEventListener
    {
        @Deprecated
        void onEvent(final DrmManagerClient p0, final DrmEvent p1);
    }
    
    @Deprecated
    public interface OnErrorListener
    {
        @Deprecated
        void onError(final DrmManagerClient p0, final DrmErrorEvent p1);
    }
}
