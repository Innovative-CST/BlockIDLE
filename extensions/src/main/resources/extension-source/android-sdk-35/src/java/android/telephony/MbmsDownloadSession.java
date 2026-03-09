package android.telephony;

import android.telephony.mbms.FileInfo;
import android.telephony.mbms.DownloadProgressListener;
import android.telephony.mbms.DownloadStatusListener;
import android.telephony.mbms.DownloadRequest;
import java.io.File;
import java.util.List;
import android.telephony.mbms.MbmsDownloadSessionCallback;
import java.util.concurrent.Executor;
import android.content.Context;

public class MbmsDownloadSession implements AutoCloseable
{
    public static final String DEFAULT_TOP_LEVEL_TEMP_DIRECTORY = "androidMbmsTempFileRoot";
    public static final String EXTRA_MBMS_COMPLETED_FILE_URI = "android.telephony.extra.MBMS_COMPLETED_FILE_URI";
    public static final String EXTRA_MBMS_DOWNLOAD_REQUEST = "android.telephony.extra.MBMS_DOWNLOAD_REQUEST";
    public static final String EXTRA_MBMS_DOWNLOAD_RESULT = "android.telephony.extra.MBMS_DOWNLOAD_RESULT";
    public static final String EXTRA_MBMS_FILE_INFO = "android.telephony.extra.MBMS_FILE_INFO";
    public static final int RESULT_CANCELLED = 2;
    public static final int RESULT_DOWNLOAD_FAILURE = 6;
    public static final int RESULT_EXPIRED = 3;
    public static final int RESULT_FILE_ROOT_UNREACHABLE = 8;
    public static final int RESULT_IO_ERROR = 4;
    public static final int RESULT_OUT_OF_STORAGE = 7;
    public static final int RESULT_SERVICE_ID_NOT_DEFINED = 5;
    public static final int RESULT_SUCCESSFUL = 1;
    public static final int STATUS_ACTIVELY_DOWNLOADING = 1;
    public static final int STATUS_PENDING_DOWNLOAD = 2;
    public static final int STATUS_PENDING_DOWNLOAD_WINDOW = 4;
    public static final int STATUS_PENDING_REPAIR = 3;
    public static final int STATUS_UNKNOWN = 0;
    
    MbmsDownloadSession() {
        throw new RuntimeException("Stub!");
    }
    
    public static MbmsDownloadSession create(@NonNull final Context context, @NonNull final Executor executor, @NonNull final MbmsDownloadSessionCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public static MbmsDownloadSession create(@NonNull final Context context, @NonNull final Executor executor, final int subscriptionId, @NonNull final MbmsDownloadSessionCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public static int getMaximumServiceAnnouncementSize() {
        throw new RuntimeException("Stub!");
    }
    
    public void requestUpdateFileServices(@NonNull final List<String> classList) {
        throw new RuntimeException("Stub!");
    }
    
    public void addServiceAnnouncement(@NonNull final byte[] contents) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTempFileRootDirectory(@NonNull final File tempFileRootDirectory) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public File getTempFileRootDirectory() {
        throw new RuntimeException("Stub!");
    }
    
    public void download(@NonNull final DownloadRequest request) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<DownloadRequest> listPendingDownloads() {
        throw new RuntimeException("Stub!");
    }
    
    public void addStatusListener(@NonNull final DownloadRequest request, @NonNull final Executor executor, @NonNull final DownloadStatusListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeStatusListener(@NonNull final DownloadRequest request, @NonNull final DownloadStatusListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void addProgressListener(@NonNull final DownloadRequest request, @NonNull final Executor executor, @NonNull final DownloadProgressListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeProgressListener(@NonNull final DownloadRequest request, @NonNull final DownloadProgressListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void cancelDownload(@NonNull final DownloadRequest downloadRequest) {
        throw new RuntimeException("Stub!");
    }
    
    public void requestDownloadState(final DownloadRequest downloadRequest, final FileInfo fileInfo) {
        throw new RuntimeException("Stub!");
    }
    
    public void resetDownloadKnowledge(final DownloadRequest downloadRequest) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void close() {
        throw new RuntimeException("Stub!");
    }
}
