package android.content.pm;

import java.util.Set;
import android.net.Uri;
import android.content.Intent;
import android.os.UserHandle;
import android.os.PersistableBundle;
import java.io.FileNotFoundException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.Certificate;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Closeable;
import android.icu.util.ULocale;
import android.os.Parcel;
import android.os.Parcelable;
import android.app.PendingIntent;
import android.os.Handler;
import java.util.function.Consumer;
import java.util.concurrent.Executor;
import android.content.IntentSender;
import java.util.List;
import android.graphics.Bitmap;
import java.io.IOException;

public class PackageInstaller
{
    public static final String ACTION_SESSION_COMMITTED = "android.content.pm.action.SESSION_COMMITTED";
    public static final String ACTION_SESSION_DETAILS = "android.content.pm.action.SESSION_DETAILS";
    public static final String ACTION_SESSION_UPDATED = "android.content.pm.action.SESSION_UPDATED";
    public static final String EXTRA_INSTALL_CONSTRAINTS = "android.content.pm.extra.INSTALL_CONSTRAINTS";
    public static final String EXTRA_INSTALL_CONSTRAINTS_RESULT = "android.content.pm.extra.INSTALL_CONSTRAINTS_RESULT";
    public static final String EXTRA_OTHER_PACKAGE_NAME = "android.content.pm.extra.OTHER_PACKAGE_NAME";
    public static final String EXTRA_PACKAGE_NAME = "android.content.pm.extra.PACKAGE_NAME";
    public static final String EXTRA_PRE_APPROVAL = "android.content.pm.extra.PRE_APPROVAL";
    public static final String EXTRA_SESSION = "android.content.pm.extra.SESSION";
    public static final String EXTRA_SESSION_ID = "android.content.pm.extra.SESSION_ID";
    public static final String EXTRA_STATUS = "android.content.pm.extra.STATUS";
    public static final String EXTRA_STATUS_MESSAGE = "android.content.pm.extra.STATUS_MESSAGE";
    public static final String EXTRA_STORAGE_PATH = "android.content.pm.extra.STORAGE_PATH";
    public static final String EXTRA_UNARCHIVE_ALL_USERS = "android.content.pm.extra.UNARCHIVE_ALL_USERS";
    public static final String EXTRA_UNARCHIVE_ID = "android.content.pm.extra.UNARCHIVE_ID";
    public static final String EXTRA_UNARCHIVE_PACKAGE_NAME = "android.content.pm.extra.UNARCHIVE_PACKAGE_NAME";
    public static final String EXTRA_UNARCHIVE_STATUS = "android.content.pm.extra.UNARCHIVE_STATUS";
    public static final int PACKAGE_SOURCE_DOWNLOADED_FILE = 4;
    public static final int PACKAGE_SOURCE_LOCAL_FILE = 3;
    public static final int PACKAGE_SOURCE_OTHER = 1;
    public static final int PACKAGE_SOURCE_STORE = 2;
    public static final int PACKAGE_SOURCE_UNSPECIFIED = 0;
    public static final int STATUS_FAILURE = 1;
    public static final int STATUS_FAILURE_ABORTED = 3;
    public static final int STATUS_FAILURE_BLOCKED = 2;
    public static final int STATUS_FAILURE_CONFLICT = 5;
    public static final int STATUS_FAILURE_INCOMPATIBLE = 7;
    public static final int STATUS_FAILURE_INVALID = 4;
    public static final int STATUS_FAILURE_STORAGE = 6;
    public static final int STATUS_FAILURE_TIMEOUT = 8;
    public static final int STATUS_PENDING_USER_ACTION = -1;
    public static final int STATUS_SUCCESS = 0;
    public static final int UNARCHIVAL_ERROR_INSTALLER_DISABLED = 4;
    public static final int UNARCHIVAL_ERROR_INSTALLER_UNINSTALLED = 5;
    public static final int UNARCHIVAL_ERROR_INSUFFICIENT_STORAGE = 2;
    public static final int UNARCHIVAL_ERROR_NO_CONNECTIVITY = 3;
    public static final int UNARCHIVAL_ERROR_USER_ACTION_NEEDED = 1;
    public static final int UNARCHIVAL_GENERIC_ERROR = 100;
    public static final int UNARCHIVAL_OK = 0;
    
    PackageInstaller() {
        throw new RuntimeException("Stub!");
    }
    
    public int createSession(@NonNull final SessionParams params) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Session openSession(final int sessionId) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void updateSessionAppIcon(final int sessionId, @Nullable final Bitmap appIcon) {
        throw new RuntimeException("Stub!");
    }
    
    public void updateSessionAppLabel(final int sessionId, @Nullable final CharSequence appLabel) {
        throw new RuntimeException("Stub!");
    }
    
    public void abandonSession(final int sessionId) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public SessionInfo getSessionInfo(final int sessionId) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<SessionInfo> getAllSessions() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<SessionInfo> getMySessions() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<SessionInfo> getStagedSessions() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public SessionInfo getActiveStagedSession() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<SessionInfo> getActiveStagedSessions() {
        throw new RuntimeException("Stub!");
    }
    
    public void uninstall(@NonNull final String packageName, @NonNull final IntentSender statusReceiver) {
        throw new RuntimeException("Stub!");
    }
    
    public void uninstall(@NonNull final VersionedPackage versionedPackage, @NonNull final IntentSender statusReceiver) {
        throw new RuntimeException("Stub!");
    }
    
    public void uninstall(@NonNull final VersionedPackage versionedPackage, final int flags, @NonNull final IntentSender statusReceiver) {
        throw new RuntimeException("Stub!");
    }
    
    public void installExistingPackage(@NonNull final String packageName, final int installReason, @Nullable final IntentSender statusReceiver) {
        throw new RuntimeException("Stub!");
    }
    
    public void uninstallExistingPackage(@NonNull final String packageName, @Nullable final IntentSender statusReceiver) {
        throw new RuntimeException("Stub!");
    }
    
    public void installPackageArchived(@NonNull final ArchivedPackageInfo archivedPackageInfo, @NonNull final SessionParams sessionParams, @NonNull final IntentSender statusReceiver) {
        throw new RuntimeException("Stub!");
    }
    
    public void checkInstallConstraints(@NonNull final List<String> packageNames, @NonNull final InstallConstraints constraints, @NonNull final Executor executor, @NonNull final Consumer<InstallConstraintsResult> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void waitForInstallConstraints(@NonNull final List<String> packageNames, @NonNull final InstallConstraints constraints, @NonNull final IntentSender callback, final long timeoutMillis) {
        throw new RuntimeException("Stub!");
    }
    
    public void commitSessionAfterInstallConstraintsAreMet(final int sessionId, @NonNull final IntentSender statusReceiver, @NonNull final InstallConstraints constraints, final long timeoutMillis) {
        throw new RuntimeException("Stub!");
    }
    
    public void registerSessionCallback(@NonNull final SessionCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void registerSessionCallback(@NonNull final SessionCallback callback, @NonNull final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterSessionCallback(@NonNull final SessionCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void requestArchive(@NonNull final String packageName, @NonNull final IntentSender statusReceiver) throws PackageManager.NameNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public void requestUnarchive(@NonNull final String packageName, @NonNull final IntentSender statusReceiver) throws IOException, PackageManager.NameNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public void reportUnarchivalStatus(final int unarchiveId, final int status, final long requiredStorageBytes, @Nullable final PendingIntent userActionIntent) throws PackageManager.NameNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public void reportUnarchivalState(@NonNull final UnarchivalState unarchivalState) throws PackageManager.NameNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public static final class InstallConstraints implements Parcelable
    {
        @NonNull
        public static final Creator<InstallConstraints> CREATOR;
        @NonNull
        public static final InstallConstraints GENTLE_UPDATE;
        
        InstallConstraints() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isDeviceIdleRequired() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isAppNotForegroundRequired() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isAppNotInteractingRequired() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isAppNotTopVisibleRequired() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isNotInCallRequired() {
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
        
        @Override
        public void writeToParcel(@NonNull final Parcel dest, final int flags) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int describeContents() {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CREATOR = null;
            GENTLE_UPDATE = null;
        }
        
        public static final class Builder
        {
            public Builder() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setDeviceIdleRequired() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setAppNotForegroundRequired() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setAppNotInteractingRequired() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setAppNotTopVisibleRequired() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setNotInCallRequired() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public InstallConstraints build() {
                throw new RuntimeException("Stub!");
            }
        }
    }
    
    public static final class InstallConstraintsResult implements Parcelable
    {
        @NonNull
        public static final Creator<InstallConstraintsResult> CREATOR;
        
        InstallConstraintsResult() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean areAllConstraintsSatisfied() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void writeToParcel(@NonNull final Parcel dest, final int flags) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int describeContents() {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CREATOR = null;
        }
    }
    
    public static final class PreapprovalDetails implements Parcelable
    {
        @NonNull
        public static final Creator<PreapprovalDetails> CREATOR;
        
        PreapprovalDetails() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void writeToParcel(@NonNull final Parcel dest, final int flags) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int describeContents() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public Bitmap getIcon() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public CharSequence getLabel() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public ULocale getLocale() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public String getPackageName() {
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
            public Builder setIcon(@NonNull final Bitmap value) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setLabel(@NonNull final CharSequence value) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setLocale(@NonNull final ULocale value) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setPackageName(@NonNull final String value) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public PreapprovalDetails build() {
                throw new RuntimeException("Stub!");
            }
        }
    }
    
    public static class Session implements Closeable
    {
        Session() {
            throw new RuntimeException("Stub!");
        }
        
        public void setStagingProgress(final float progress) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public OutputStream openWrite(@NonNull final String name, final long offsetBytes, final long lengthBytes) throws IOException {
            throw new RuntimeException("Stub!");
        }
        
        public void fsync(@NonNull final OutputStream out) throws IOException {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public String[] getNames() throws IOException {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public InputStream openRead(@NonNull final String name) throws IOException {
            throw new RuntimeException("Stub!");
        }
        
        public void removeSplit(@NonNull final String splitName) throws IOException {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void setChecksums(@NonNull final String name, @NonNull final List<Checksum> checksums, @Nullable final byte[] signature) throws IOException {
            throw new RuntimeException("Stub!");
        }
        
        public void requestChecksums(@NonNull final String name, final int required, @NonNull final List<Certificate> trustedInstallers, @NonNull final Executor executor, @NonNull final PackageManager.OnChecksumsReadyListener onChecksumsReadyListener) throws CertificateEncodingException, FileNotFoundException {
            throw new RuntimeException("Stub!");
        }
        
        public void commit(@NonNull final IntentSender statusReceiver) {
            throw new RuntimeException("Stub!");
        }
        
        public void transfer(@NonNull final String packageName) throws PackageManager.NameNotFoundException {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void close() {
            throw new RuntimeException("Stub!");
        }
        
        public void abandon() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isMultiPackage() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isStaged() {
            throw new RuntimeException("Stub!");
        }
        
        public int getParentSessionId() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public int[] getChildSessionIds() {
            throw new RuntimeException("Stub!");
        }
        
        public void addChildSessionId(final int sessionId) {
            throw new RuntimeException("Stub!");
        }
        
        public void removeChildSessionId(final int sessionId) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public PersistableBundle getAppMetadata() {
            throw new RuntimeException("Stub!");
        }
        
        public void setAppMetadata(@Nullable final PersistableBundle data) throws IOException {
            throw new RuntimeException("Stub!");
        }
        
        public void requestUserPreapproval(@NonNull final PreapprovalDetails details, @NonNull final IntentSender statusReceiver) {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isApplicationEnabledSettingPersistent() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isRequestUpdateOwnership() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public abstract static class SessionCallback
    {
        public SessionCallback() {
            throw new RuntimeException("Stub!");
        }
        
        public abstract void onCreated(final int p0);
        
        public abstract void onBadgingChanged(final int p0);
        
        public abstract void onActiveChanged(final int p0, final boolean p1);
        
        public abstract void onProgressChanged(final int p0, final float p1);
        
        public abstract void onFinished(final int p0, final boolean p1);
    }
    
    public static class SessionInfo implements Parcelable
    {
        public static final Creator<SessionInfo> CREATOR;
        public static final int INVALID_ID = -1;
        public static final int SESSION_ACTIVATION_FAILED = 2;
        public static final int SESSION_CONFLICT = 4;
        public static final int SESSION_NO_ERROR = 0;
        public static final int SESSION_UNKNOWN_ERROR = 3;
        public static final int SESSION_VERIFICATION_FAILED = 1;
        @Deprecated
        public static final int STAGED_SESSION_ACTIVATION_FAILED = 2;
        @Deprecated
        public static final int STAGED_SESSION_CONFLICT = 4;
        @Deprecated
        public static final int STAGED_SESSION_NO_ERROR = 0;
        @Deprecated
        public static final int STAGED_SESSION_UNKNOWN = 3;
        @Deprecated
        public static final int STAGED_SESSION_VERIFICATION_FAILED = 1;
        
        SessionInfo() {
            throw new RuntimeException("Stub!");
        }
        
        public int getSessionId() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public UserHandle getUser() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public String getInstallerPackageName() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public String getInstallerAttributionTag() {
            throw new RuntimeException("Stub!");
        }
        
        public float getProgress() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isActive() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isSealed() {
            throw new RuntimeException("Stub!");
        }
        
        public int getInstallReason() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public String getAppPackageName() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public Bitmap getAppIcon() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public CharSequence getAppLabel() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public Intent createDetailsIntent() {
            throw new RuntimeException("Stub!");
        }
        
        public int getMode() {
            throw new RuntimeException("Stub!");
        }
        
        public int getInstallLocation() {
            throw new RuntimeException("Stub!");
        }
        
        public long getSize() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public Uri getOriginatingUri() {
            throw new RuntimeException("Stub!");
        }
        
        public int getOriginatingUid() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public Uri getReferrerUri() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean getDontKillApp() {
            throw new RuntimeException("Stub!");
        }
        
        public int getPackageSource() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isMultiPackage() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isStaged() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isStagedSessionActive() {
            throw new RuntimeException("Stub!");
        }
        
        public int getParentSessionId() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean hasParentSessionId() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public int[] getChildSessionIds() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isStagedSessionApplied() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isStagedSessionReady() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isStagedSessionFailed() {
            throw new RuntimeException("Stub!");
        }
        
        public int getStagedSessionErrorCode() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public String getStagedSessionErrorMessage() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isCommitted() {
            throw new RuntimeException("Stub!");
        }
        
        public long getCreatedMillis() {
            throw new RuntimeException("Stub!");
        }
        
        public long getUpdatedMillis() {
            throw new RuntimeException("Stub!");
        }
        
        public int getRequireUserAction() {
            throw new RuntimeException("Stub!");
        }
        
        public int getInstallerUid() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isApplicationEnabledSettingPersistent() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isPreApprovalRequested() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isRequestUpdateOwnership() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isUnarchival() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int describeContents() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void writeToParcel(final Parcel dest, final int flags) {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CREATOR = null;
        }
    }
    
    public static class SessionParams implements Parcelable
    {
        public static final Creator<SessionParams> CREATOR;
        public static final int MODE_FULL_INSTALL = 1;
        public static final int MODE_INHERIT_EXISTING = 2;
        public static final int PERMISSION_STATE_DEFAULT = 0;
        public static final int PERMISSION_STATE_DENIED = 2;
        public static final int PERMISSION_STATE_GRANTED = 1;
        @NonNull
        public static final Set<String> RESTRICTED_PERMISSIONS_ALL;
        public static final int USER_ACTION_NOT_REQUIRED = 2;
        public static final int USER_ACTION_REQUIRED = 1;
        public static final int USER_ACTION_UNSPECIFIED = 0;
        
        public SessionParams(final int mode) {
            throw new RuntimeException("Stub!");
        }
        
        public void setInstallLocation(final int installLocation) {
            throw new RuntimeException("Stub!");
        }
        
        public void setSize(final long sizeBytes) {
            throw new RuntimeException("Stub!");
        }
        
        public void setAppPackageName(@Nullable final String appPackageName) {
            throw new RuntimeException("Stub!");
        }
        
        public void setAppIcon(@Nullable final Bitmap appIcon) {
            throw new RuntimeException("Stub!");
        }
        
        public void setAppLabel(@Nullable final CharSequence appLabel) {
            throw new RuntimeException("Stub!");
        }
        
        public void setOriginatingUri(@Nullable final Uri originatingUri) {
            throw new RuntimeException("Stub!");
        }
        
        public void setOriginatingUid(final int originatingUid) {
            throw new RuntimeException("Stub!");
        }
        
        public void setReferrerUri(@Nullable final Uri referrerUri) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public SessionParams setPermissionState(@NonNull final String permissionName, final int state) {
            throw new RuntimeException("Stub!");
        }
        
        public void setPackageSource(final int packageSource) {
            throw new RuntimeException("Stub!");
        }
        
        public void setWhitelistedRestrictedPermissions(@Nullable final Set<String> permissions) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void setAutoRevokePermissionsMode(final boolean shouldAutoRevoke) {
            throw new RuntimeException("Stub!");
        }
        
        public void setDontKillApp(final boolean dontKillApp) {
            throw new RuntimeException("Stub!");
        }
        
        public void setInstallReason(final int installReason) {
            throw new RuntimeException("Stub!");
        }
        
        public void setInstallerPackageName(@Nullable final String installerPackageName) {
            throw new RuntimeException("Stub!");
        }
        
        public void setMultiPackage() {
            throw new RuntimeException("Stub!");
        }
        
        public void setRequireUserAction(final int requireUserAction) {
            throw new RuntimeException("Stub!");
        }
        
        public void setInstallScenario(final int installScenario) {
            throw new RuntimeException("Stub!");
        }
        
        public void setApplicationEnabledSettingPersistent() {
            throw new RuntimeException("Stub!");
        }
        
        public void setRequestUpdateOwnership(final boolean enable) {
            throw new RuntimeException("Stub!");
        }
        
        public void setUnarchiveId(final int unarchiveId) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int describeContents() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void writeToParcel(final Parcel dest, final int flags) {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CREATOR = null;
            RESTRICTED_PERMISSIONS_ALL = null;
        }
    }
    
    public static final class UnarchivalState
    {
        UnarchivalState() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public static UnarchivalState createOkState(final int unarchiveId) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public static UnarchivalState createUserActionRequiredState(final int unarchiveId, @NonNull final PendingIntent userActionIntent) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public static UnarchivalState createInsufficientStorageState(final int unarchiveId, final long requiredStorageBytes, @Nullable final PendingIntent userActionIntent) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public static UnarchivalState createNoConnectivityState(final int unarchiveId) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public static UnarchivalState createGenericErrorState(final int unarchiveId) {
            throw new RuntimeException("Stub!");
        }
    }
}
