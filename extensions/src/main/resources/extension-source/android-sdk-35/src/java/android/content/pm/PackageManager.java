package android.content.pm;

import android.util.AndroidException;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import java.util.function.Function;
import java.io.File;
import java.security.cert.CertificateEncodingException;
import android.os.Bundle;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.os.UserHandle;
import android.graphics.drawable.Drawable;
import java.util.Set;
import android.content.ComponentName;
import java.util.function.Consumer;
import java.util.concurrent.Executor;
import android.content.IntentSender;
import android.content.Intent;
import java.security.cert.Certificate;
import java.util.List;

public abstract class PackageManager
{
    public static final int CERT_INPUT_RAW_X509 = 0;
    public static final int CERT_INPUT_SHA256 = 1;
    public static final int COMPONENT_ENABLED_STATE_DEFAULT = 0;
    public static final int COMPONENT_ENABLED_STATE_DISABLED = 2;
    public static final int COMPONENT_ENABLED_STATE_DISABLED_UNTIL_USED = 4;
    public static final int COMPONENT_ENABLED_STATE_DISABLED_USER = 3;
    public static final int COMPONENT_ENABLED_STATE_ENABLED = 1;
    public static final int DELETE_ARCHIVE = 16;
    public static final int DONT_KILL_APP = 1;
    public static final String EXTRA_VERIFICATION_ID = "android.content.pm.extra.VERIFICATION_ID";
    public static final String EXTRA_VERIFICATION_RESULT = "android.content.pm.extra.VERIFICATION_RESULT";
    public static final String FEATURE_ACTIVITIES_ON_SECONDARY_DISPLAYS = "android.software.activities_on_secondary_displays";
    public static final String FEATURE_APP_WIDGETS = "android.software.app_widgets";
    public static final String FEATURE_AUDIO_LOW_LATENCY = "android.hardware.audio.low_latency";
    public static final String FEATURE_AUDIO_OUTPUT = "android.hardware.audio.output";
    public static final String FEATURE_AUDIO_PRO = "android.hardware.audio.pro";
    public static final String FEATURE_AUTOFILL = "android.software.autofill";
    public static final String FEATURE_AUTOMOTIVE = "android.hardware.type.automotive";
    public static final String FEATURE_BACKUP = "android.software.backup";
    public static final String FEATURE_BLUETOOTH = "android.hardware.bluetooth";
    public static final String FEATURE_BLUETOOTH_LE = "android.hardware.bluetooth_le";
    public static final String FEATURE_CAMERA = "android.hardware.camera";
    public static final String FEATURE_CAMERA_ANY = "android.hardware.camera.any";
    public static final String FEATURE_CAMERA_AR = "android.hardware.camera.ar";
    public static final String FEATURE_CAMERA_AUTOFOCUS = "android.hardware.camera.autofocus";
    public static final String FEATURE_CAMERA_CAPABILITY_MANUAL_POST_PROCESSING = "android.hardware.camera.capability.manual_post_processing";
    public static final String FEATURE_CAMERA_CAPABILITY_MANUAL_SENSOR = "android.hardware.camera.capability.manual_sensor";
    public static final String FEATURE_CAMERA_CAPABILITY_RAW = "android.hardware.camera.capability.raw";
    public static final String FEATURE_CAMERA_CONCURRENT = "android.hardware.camera.concurrent";
    public static final String FEATURE_CAMERA_EXTERNAL = "android.hardware.camera.external";
    public static final String FEATURE_CAMERA_FLASH = "android.hardware.camera.flash";
    public static final String FEATURE_CAMERA_FRONT = "android.hardware.camera.front";
    public static final String FEATURE_CAMERA_LEVEL_FULL = "android.hardware.camera.level.full";
    public static final String FEATURE_CANT_SAVE_STATE = "android.software.cant_save_state";
    public static final String FEATURE_COMPANION_DEVICE_SETUP = "android.software.companion_device_setup";
    @Deprecated
    public static final String FEATURE_CONNECTION_SERVICE = "android.software.connectionservice";
    public static final String FEATURE_CONSUMER_IR = "android.hardware.consumerir";
    public static final String FEATURE_CONTROLS = "android.software.controls";
    public static final String FEATURE_CREDENTIALS = "android.software.credentials";
    public static final String FEATURE_DEVICE_ADMIN = "android.software.device_admin";
    public static final String FEATURE_DEVICE_LOCK = "android.software.device_lock";
    public static final String FEATURE_EMBEDDED = "android.hardware.type.embedded";
    public static final String FEATURE_ETHERNET = "android.hardware.ethernet";
    public static final String FEATURE_EXPANDED_PICTURE_IN_PICTURE = "android.software.expanded_picture_in_picture";
    public static final String FEATURE_FACE = "android.hardware.biometrics.face";
    public static final String FEATURE_FAKETOUCH = "android.hardware.faketouch";
    public static final String FEATURE_FAKETOUCH_MULTITOUCH_DISTINCT = "android.hardware.faketouch.multitouch.distinct";
    public static final String FEATURE_FAKETOUCH_MULTITOUCH_JAZZHAND = "android.hardware.faketouch.multitouch.jazzhand";
    public static final String FEATURE_FINGERPRINT = "android.hardware.fingerprint";
    public static final String FEATURE_FREEFORM_WINDOW_MANAGEMENT = "android.software.freeform_window_management";
    public static final String FEATURE_GAMEPAD = "android.hardware.gamepad";
    public static final String FEATURE_HARDWARE_KEYSTORE = "android.hardware.hardware_keystore";
    public static final String FEATURE_HIFI_SENSORS = "android.hardware.sensor.hifi_sensors";
    public static final String FEATURE_HOME_SCREEN = "android.software.home_screen";
    public static final String FEATURE_IDENTITY_CREDENTIAL_HARDWARE = "android.hardware.identity_credential";
    public static final String FEATURE_IDENTITY_CREDENTIAL_HARDWARE_DIRECT_ACCESS = "android.hardware.identity_credential_direct_access";
    public static final String FEATURE_INPUT_METHODS = "android.software.input_methods";
    public static final String FEATURE_IPSEC_TUNNELS = "android.software.ipsec_tunnels";
    public static final String FEATURE_IPSEC_TUNNEL_MIGRATION = "android.software.ipsec_tunnel_migration";
    public static final String FEATURE_IRIS = "android.hardware.biometrics.iris";
    public static final String FEATURE_KEYSTORE_APP_ATTEST_KEY = "android.hardware.keystore.app_attest_key";
    public static final String FEATURE_KEYSTORE_LIMITED_USE_KEY = "android.hardware.keystore.limited_use_key";
    public static final String FEATURE_KEYSTORE_SINGLE_USE_KEY = "android.hardware.keystore.single_use_key";
    public static final String FEATURE_LEANBACK = "android.software.leanback";
    public static final String FEATURE_LEANBACK_ONLY = "android.software.leanback_only";
    public static final String FEATURE_LIVE_TV = "android.software.live_tv";
    public static final String FEATURE_LIVE_WALLPAPER = "android.software.live_wallpaper";
    public static final String FEATURE_LOCATION = "android.hardware.location";
    public static final String FEATURE_LOCATION_GPS = "android.hardware.location.gps";
    public static final String FEATURE_LOCATION_NETWORK = "android.hardware.location.network";
    public static final String FEATURE_MANAGED_USERS = "android.software.managed_users";
    public static final String FEATURE_MICROPHONE = "android.hardware.microphone";
    public static final String FEATURE_MIDI = "android.software.midi";
    public static final String FEATURE_NFC = "android.hardware.nfc";
    public static final String FEATURE_NFC_BEAM = "android.sofware.nfc.beam";
    public static final String FEATURE_NFC_HOST_CARD_EMULATION = "android.hardware.nfc.hce";
    public static final String FEATURE_NFC_HOST_CARD_EMULATION_NFCF = "android.hardware.nfc.hcef";
    public static final String FEATURE_NFC_OFF_HOST_CARD_EMULATION_ESE = "android.hardware.nfc.ese";
    public static final String FEATURE_NFC_OFF_HOST_CARD_EMULATION_UICC = "android.hardware.nfc.uicc";
    public static final String FEATURE_OPENGLES_DEQP_LEVEL = "android.software.opengles.deqp.level";
    public static final String FEATURE_OPENGLES_EXTENSION_PACK = "android.hardware.opengles.aep";
    public static final String FEATURE_PC = "android.hardware.type.pc";
    public static final String FEATURE_PICTURE_IN_PICTURE = "android.software.picture_in_picture";
    public static final String FEATURE_PRINTING = "android.software.print";
    public static final String FEATURE_RAM_LOW = "android.hardware.ram.low";
    public static final String FEATURE_RAM_NORMAL = "android.hardware.ram.normal";
    public static final String FEATURE_SCREEN_LANDSCAPE = "android.hardware.screen.landscape";
    public static final String FEATURE_SCREEN_PORTRAIT = "android.hardware.screen.portrait";
    public static final String FEATURE_SECURELY_REMOVES_USERS = "android.software.securely_removes_users";
    public static final String FEATURE_SECURE_LOCK_SCREEN = "android.software.secure_lock_screen";
    public static final String FEATURE_SECURITY_MODEL_COMPATIBLE = "android.hardware.security.model.compatible";
    public static final String FEATURE_SENSOR_ACCELEROMETER = "android.hardware.sensor.accelerometer";
    public static final String FEATURE_SENSOR_ACCELEROMETER_LIMITED_AXES = "android.hardware.sensor.accelerometer_limited_axes";
    public static final String FEATURE_SENSOR_ACCELEROMETER_LIMITED_AXES_UNCALIBRATED = "android.hardware.sensor.accelerometer_limited_axes_uncalibrated";
    public static final String FEATURE_SENSOR_AMBIENT_TEMPERATURE = "android.hardware.sensor.ambient_temperature";
    public static final String FEATURE_SENSOR_BAROMETER = "android.hardware.sensor.barometer";
    public static final String FEATURE_SENSOR_COMPASS = "android.hardware.sensor.compass";
    public static final String FEATURE_SENSOR_DYNAMIC_HEAD_TRACKER = "android.hardware.sensor.dynamic.head_tracker";
    public static final String FEATURE_SENSOR_GYROSCOPE = "android.hardware.sensor.gyroscope";
    public static final String FEATURE_SENSOR_GYROSCOPE_LIMITED_AXES = "android.hardware.sensor.gyroscope_limited_axes";
    public static final String FEATURE_SENSOR_GYROSCOPE_LIMITED_AXES_UNCALIBRATED = "android.hardware.sensor.gyroscope_limited_axes_uncalibrated";
    public static final String FEATURE_SENSOR_HEADING = "android.hardware.sensor.heading";
    public static final String FEATURE_SENSOR_HEART_RATE = "android.hardware.sensor.heartrate";
    public static final String FEATURE_SENSOR_HEART_RATE_ECG = "android.hardware.sensor.heartrate.ecg";
    public static final String FEATURE_SENSOR_HINGE_ANGLE = "android.hardware.sensor.hinge_angle";
    public static final String FEATURE_SENSOR_LIGHT = "android.hardware.sensor.light";
    public static final String FEATURE_SENSOR_PROXIMITY = "android.hardware.sensor.proximity";
    public static final String FEATURE_SENSOR_RELATIVE_HUMIDITY = "android.hardware.sensor.relative_humidity";
    public static final String FEATURE_SENSOR_STEP_COUNTER = "android.hardware.sensor.stepcounter";
    public static final String FEATURE_SENSOR_STEP_DETECTOR = "android.hardware.sensor.stepdetector";
    public static final String FEATURE_SE_OMAPI_ESE = "android.hardware.se.omapi.ese";
    public static final String FEATURE_SE_OMAPI_SD = "android.hardware.se.omapi.sd";
    public static final String FEATURE_SE_OMAPI_UICC = "android.hardware.se.omapi.uicc";
    public static final String FEATURE_SIP = "android.software.sip";
    public static final String FEATURE_SIP_VOIP = "android.software.sip.voip";
    public static final String FEATURE_STRONGBOX_KEYSTORE = "android.hardware.strongbox_keystore";
    public static final String FEATURE_TELECOM = "android.software.telecom";
    public static final String FEATURE_TELEPHONY = "android.hardware.telephony";
    public static final String FEATURE_TELEPHONY_CALLING = "android.hardware.telephony.calling";
    public static final String FEATURE_TELEPHONY_CDMA = "android.hardware.telephony.cdma";
    public static final String FEATURE_TELEPHONY_DATA = "android.hardware.telephony.data";
    public static final String FEATURE_TELEPHONY_EUICC = "android.hardware.telephony.euicc";
    public static final String FEATURE_TELEPHONY_EUICC_MEP = "android.hardware.telephony.euicc.mep";
    public static final String FEATURE_TELEPHONY_GSM = "android.hardware.telephony.gsm";
    public static final String FEATURE_TELEPHONY_IMS = "android.hardware.telephony.ims";
    public static final String FEATURE_TELEPHONY_MBMS = "android.hardware.telephony.mbms";
    public static final String FEATURE_TELEPHONY_MESSAGING = "android.hardware.telephony.messaging";
    public static final String FEATURE_TELEPHONY_RADIO_ACCESS = "android.hardware.telephony.radio.access";
    public static final String FEATURE_TELEPHONY_SUBSCRIPTION = "android.hardware.telephony.subscription";
    @Deprecated
    public static final String FEATURE_TELEVISION = "android.hardware.type.television";
    public static final String FEATURE_TOUCHSCREEN = "android.hardware.touchscreen";
    public static final String FEATURE_TOUCHSCREEN_MULTITOUCH = "android.hardware.touchscreen.multitouch";
    public static final String FEATURE_TOUCHSCREEN_MULTITOUCH_DISTINCT = "android.hardware.touchscreen.multitouch.distinct";
    public static final String FEATURE_TOUCHSCREEN_MULTITOUCH_JAZZHAND = "android.hardware.touchscreen.multitouch.jazzhand";
    public static final String FEATURE_USB_ACCESSORY = "android.hardware.usb.accessory";
    public static final String FEATURE_USB_HOST = "android.hardware.usb.host";
    public static final String FEATURE_UWB = "android.hardware.uwb";
    public static final String FEATURE_VERIFIED_BOOT = "android.software.verified_boot";
    public static final String FEATURE_VR_HEADTRACKING = "android.hardware.vr.headtracking";
    @Deprecated
    public static final String FEATURE_VR_MODE = "android.software.vr.mode";
    public static final String FEATURE_VR_MODE_HIGH_PERFORMANCE = "android.hardware.vr.high_performance";
    public static final String FEATURE_VULKAN_DEQP_LEVEL = "android.software.vulkan.deqp.level";
    public static final String FEATURE_VULKAN_HARDWARE_COMPUTE = "android.hardware.vulkan.compute";
    public static final String FEATURE_VULKAN_HARDWARE_LEVEL = "android.hardware.vulkan.level";
    public static final String FEATURE_VULKAN_HARDWARE_VERSION = "android.hardware.vulkan.version";
    public static final String FEATURE_WALLET_LOCATION_BASED_SUGGESTIONS = "android.software.wallet_location_based_suggestions";
    public static final String FEATURE_WATCH = "android.hardware.type.watch";
    public static final String FEATURE_WEBVIEW = "android.software.webview";
    public static final String FEATURE_WIFI = "android.hardware.wifi";
    public static final String FEATURE_WIFI_AWARE = "android.hardware.wifi.aware";
    public static final String FEATURE_WIFI_DIRECT = "android.hardware.wifi.direct";
    public static final String FEATURE_WIFI_PASSPOINT = "android.hardware.wifi.passpoint";
    public static final String FEATURE_WIFI_RTT = "android.hardware.wifi.rtt";
    public static final String FEATURE_WINDOW_MAGNIFICATION = "android.software.window_magnification";
    public static final int FLAG_PERMISSION_WHITELIST_INSTALLER = 2;
    public static final int FLAG_PERMISSION_WHITELIST_SYSTEM = 1;
    public static final int FLAG_PERMISSION_WHITELIST_UPGRADE = 4;
    public static final int GET_ACTIVITIES = 1;
    @Deprecated
    public static final int GET_ATTRIBUTIONS = Integer.MIN_VALUE;
    public static final long GET_ATTRIBUTIONS_LONG = 2147483648L;
    public static final int GET_CONFIGURATIONS = 16384;
    @Deprecated
    public static final int GET_DISABLED_COMPONENTS = 512;
    @Deprecated
    public static final int GET_DISABLED_UNTIL_USED_COMPONENTS = 32768;
    public static final int GET_GIDS = 256;
    public static final int GET_INSTRUMENTATION = 16;
    @Deprecated
    public static final int GET_INTENT_FILTERS = 32;
    public static final int GET_META_DATA = 128;
    public static final int GET_PERMISSIONS = 4096;
    public static final int GET_PROVIDERS = 8;
    public static final int GET_RECEIVERS = 2;
    public static final int GET_RESOLVED_FILTER = 64;
    public static final int GET_SERVICES = 4;
    public static final int GET_SHARED_LIBRARY_FILES = 1024;
    @Deprecated
    public static final int GET_SIGNATURES = 64;
    public static final int GET_SIGNING_CERTIFICATES = 134217728;
    @Deprecated
    public static final int GET_UNINSTALLED_PACKAGES = 8192;
    public static final int GET_URI_PERMISSION_PATTERNS = 2048;
    public static final int INSTALL_REASON_DEVICE_RESTORE = 2;
    public static final int INSTALL_REASON_DEVICE_SETUP = 3;
    public static final int INSTALL_REASON_POLICY = 1;
    public static final int INSTALL_REASON_UNKNOWN = 0;
    public static final int INSTALL_REASON_USER = 4;
    public static final int INSTALL_SCENARIO_BULK = 2;
    public static final int INSTALL_SCENARIO_BULK_SECONDARY = 3;
    public static final int INSTALL_SCENARIO_DEFAULT = 0;
    public static final int INSTALL_SCENARIO_FAST = 1;
    public static final int MATCH_ALL = 131072;
    public static final int MATCH_APEX = 1073741824;
    public static final long MATCH_ARCHIVED_PACKAGES = 4294967296L;
    public static final int MATCH_DEFAULT_ONLY = 65536;
    public static final int MATCH_DIRECT_BOOT_AUTO = 268435456;
    public static final int MATCH_DIRECT_BOOT_AWARE = 524288;
    public static final int MATCH_DIRECT_BOOT_UNAWARE = 262144;
    public static final int MATCH_DISABLED_COMPONENTS = 512;
    public static final int MATCH_DISABLED_UNTIL_USED_COMPONENTS = 32768;
    public static final int MATCH_SYSTEM_ONLY = 1048576;
    public static final int MATCH_UNINSTALLED_PACKAGES = 8192;
    public static final long MAXIMUM_VERIFICATION_TIMEOUT = 3600000L;
    public static final int PERMISSION_DENIED = -1;
    public static final int PERMISSION_GRANTED = 0;
    public static final String PROPERTY_COMPAT_OVERRIDE_LANDSCAPE_TO_PORTRAIT = "android.camera.PROPERTY_COMPAT_OVERRIDE_LANDSCAPE_TO_PORTRAIT";
    public static final String PROPERTY_MEDIA_CAPABILITIES = "android.media.PROPERTY_MEDIA_CAPABILITIES";
    public static final String PROPERTY_SELF_CERTIFIED_NETWORK_CAPABILITIES = "android.net.PROPERTY_SELF_CERTIFIED_NETWORK_CAPABILITIES";
    public static final String PROPERTY_SPECIAL_USE_FGS_SUBTYPE = "android.app.PROPERTY_SPECIAL_USE_FGS_SUBTYPE";
    public static final int SIGNATURE_FIRST_NOT_SIGNED = -1;
    public static final int SIGNATURE_MATCH = 0;
    public static final int SIGNATURE_NEITHER_SIGNED = 1;
    public static final int SIGNATURE_NO_MATCH = -3;
    public static final int SIGNATURE_SECOND_NOT_SIGNED = -2;
    public static final int SIGNATURE_UNKNOWN_PACKAGE = -4;
    public static final int SYNCHRONOUS = 2;
    @NonNull
    public static final List<Certificate> TRUST_ALL;
    @NonNull
    public static final List<Certificate> TRUST_NONE;
    public static final int VERIFICATION_ALLOW = 1;
    public static final int VERIFICATION_REJECT = -1;
    public static final int VERSION_CODE_HIGHEST = -1;
    
    @Deprecated
    public PackageManager() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract PackageInfo getPackageInfo(@NonNull final String p0, final int p1) throws NameNotFoundException;
    
    @NonNull
    public PackageInfo getPackageInfo(@NonNull final String packageName, @NonNull final PackageInfoFlags flags) throws NameNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public abstract PackageInfo getPackageInfo(@NonNull final VersionedPackage p0, final int p1) throws NameNotFoundException;
    
    @NonNull
    public PackageInfo getPackageInfo(@NonNull final VersionedPackage versionedPackage, @NonNull final PackageInfoFlags flags) throws NameNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public abstract String[] currentToCanonicalPackageNames(@NonNull final String[] p0);
    
    public abstract String[] canonicalToCurrentPackageNames(@NonNull final String[] p0);
    
    @Nullable
    public abstract Intent getLaunchIntentForPackage(@NonNull final String p0);
    
    @Nullable
    public abstract Intent getLeanbackLaunchIntentForPackage(@NonNull final String p0);
    
    @NonNull
    public IntentSender getLaunchIntentSenderForPackage(@NonNull final String packageName) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract int[] getPackageGids(@NonNull final String p0) throws NameNotFoundException;
    
    public abstract int[] getPackageGids(@NonNull final String p0, final int p1) throws NameNotFoundException;
    
    @Nullable
    public int[] getPackageGids(@NonNull final String packageName, @NonNull final PackageInfoFlags flags) throws NameNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public abstract int getPackageUid(@NonNull final String p0, final int p1) throws NameNotFoundException;
    
    public int getPackageUid(@NonNull final String packageName, @NonNull final PackageInfoFlags flags) throws NameNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public abstract PermissionInfo getPermissionInfo(@NonNull final String p0, final int p1) throws NameNotFoundException;
    
    @NonNull
    public abstract List<PermissionInfo> queryPermissionsByGroup(@Nullable final String p0, final int p1) throws NameNotFoundException;
    
    @NonNull
    public abstract PermissionGroupInfo getPermissionGroupInfo(@NonNull final String p0, final int p1) throws NameNotFoundException;
    
    @NonNull
    public abstract List<PermissionGroupInfo> getAllPermissionGroups(final int p0);
    
    public void getPlatformPermissionsForGroup(@NonNull final String permissionGroupName, @NonNull final Executor executor, @NonNull final Consumer<List<String>> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void getGroupOfPlatformPermission(@NonNull final String permissionName, @NonNull final Executor executor, @NonNull final Consumer<String> callback) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public abstract ApplicationInfo getApplicationInfo(@NonNull final String p0, final int p1) throws NameNotFoundException;
    
    @NonNull
    public ApplicationInfo getApplicationInfo(@NonNull final String packageName, @NonNull final ApplicationInfoFlags flags) throws NameNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public int getTargetSdkVersion(@NonNull final String packageName) throws NameNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public abstract ActivityInfo getActivityInfo(@NonNull final ComponentName p0, final int p1) throws NameNotFoundException;
    
    @NonNull
    public ActivityInfo getActivityInfo(@NonNull final ComponentName component, @NonNull final ComponentInfoFlags flags) throws NameNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public abstract ActivityInfo getReceiverInfo(@NonNull final ComponentName p0, final int p1) throws NameNotFoundException;
    
    @NonNull
    public ActivityInfo getReceiverInfo(@NonNull final ComponentName component, @NonNull final ComponentInfoFlags flags) throws NameNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public abstract ServiceInfo getServiceInfo(@NonNull final ComponentName p0, final int p1) throws NameNotFoundException;
    
    @NonNull
    public ServiceInfo getServiceInfo(@NonNull final ComponentName component, @NonNull final ComponentInfoFlags flags) throws NameNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public abstract ProviderInfo getProviderInfo(@NonNull final ComponentName p0, final int p1) throws NameNotFoundException;
    
    @NonNull
    public ProviderInfo getProviderInfo(@NonNull final ComponentName component, @NonNull final ComponentInfoFlags flags) throws NameNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public ModuleInfo getModuleInfo(@NonNull final String packageName, final int flags) throws NameNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<ModuleInfo> getInstalledModules(final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public abstract List<PackageInfo> getInstalledPackages(final int p0);
    
    @NonNull
    public List<PackageInfo> getInstalledPackages(@NonNull final PackageInfoFlags flags) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public abstract List<PackageInfo> getPackagesHoldingPermissions(@NonNull final String[] p0, final int p1);
    
    @NonNull
    public List<PackageInfo> getPackagesHoldingPermissions(@NonNull final String[] permissions, @NonNull final PackageInfoFlags flags) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract int checkPermission(@NonNull final String p0, @NonNull final String p1);
    
    public abstract boolean isPermissionRevokedByPolicy(@NonNull final String p0, @NonNull final String p1);
    
    public abstract boolean addPermission(@NonNull final PermissionInfo p0);
    
    public abstract boolean addPermissionAsync(@NonNull final PermissionInfo p0);
    
    public abstract void removePermission(@NonNull final String p0);
    
    @NonNull
    public Set<String> getWhitelistedRestrictedPermissions(@NonNull final String packageName, final int whitelistFlag) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean addWhitelistedRestrictedPermission(@NonNull final String packageName, @NonNull final String permName, final int whitelistFlags) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean removeWhitelistedRestrictedPermission(@NonNull final String packageName, @NonNull final String permName, final int whitelistFlags) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setAutoRevokeWhitelisted(@NonNull final String packageName, final boolean whitelisted) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAutoRevokeWhitelisted(@NonNull final String packageName) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public CharSequence getBackgroundPermissionOptionLabel() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract int checkSignatures(@NonNull final String p0, @NonNull final String p1);
    
    public abstract int checkSignatures(final int p0, final int p1);
    
    @Nullable
    public abstract String[] getPackagesForUid(final int p0);
    
    @Nullable
    public abstract String getNameForUid(final int p0);
    
    @NonNull
    public abstract List<ApplicationInfo> getInstalledApplications(final int p0);
    
    @NonNull
    public List<ApplicationInfo> getInstalledApplications(@NonNull final ApplicationInfoFlags flags) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract boolean isInstantApp();
    
    public abstract boolean isInstantApp(@NonNull final String p0);
    
    public abstract int getInstantAppCookieMaxBytes();
    
    @NonNull
    public abstract byte[] getInstantAppCookie();
    
    public abstract void clearInstantAppCookie();
    
    public abstract void updateInstantAppCookie(@Nullable final byte[] p0);
    
    @Nullable
    public abstract String[] getSystemSharedLibraryNames();
    
    @NonNull
    public abstract List<SharedLibraryInfo> getSharedLibraries(final int p0);
    
    @NonNull
    public List<SharedLibraryInfo> getSharedLibraries(@NonNull final PackageInfoFlags flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public abstract ChangedPackages getChangedPackages(final int p0);
    
    @NonNull
    public abstract FeatureInfo[] getSystemAvailableFeatures();
    
    public abstract boolean hasSystemFeature(@NonNull final String p0);
    
    public abstract boolean hasSystemFeature(@NonNull final String p0, final int p1);
    
    @Nullable
    public abstract ResolveInfo resolveActivity(@NonNull final Intent p0, final int p1);
    
    @Nullable
    public ResolveInfo resolveActivity(@NonNull final Intent intent, @NonNull final ResolveInfoFlags flags) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public abstract List<ResolveInfo> queryIntentActivities(@NonNull final Intent p0, final int p1);
    
    @NonNull
    public List<ResolveInfo> queryIntentActivities(@NonNull final Intent intent, @NonNull final ResolveInfoFlags flags) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public abstract List<ResolveInfo> queryIntentActivityOptions(@Nullable final ComponentName p0, @Nullable final Intent[] p1, @NonNull final Intent p2, final int p3);
    
    @NonNull
    public List<ResolveInfo> queryIntentActivityOptions(@Nullable final ComponentName caller, @Nullable final List<Intent> specifics, @NonNull final Intent intent, @NonNull final ResolveInfoFlags flags) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public abstract List<ResolveInfo> queryBroadcastReceivers(@NonNull final Intent p0, final int p1);
    
    @NonNull
    public List<ResolveInfo> queryBroadcastReceivers(@NonNull final Intent intent, @NonNull final ResolveInfoFlags flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public abstract ResolveInfo resolveService(@NonNull final Intent p0, final int p1);
    
    @Nullable
    public ResolveInfo resolveService(@NonNull final Intent intent, @NonNull final ResolveInfoFlags flags) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public abstract List<ResolveInfo> queryIntentServices(@NonNull final Intent p0, final int p1);
    
    @NonNull
    public List<ResolveInfo> queryIntentServices(@NonNull final Intent intent, @NonNull final ResolveInfoFlags flags) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public abstract List<ResolveInfo> queryIntentContentProviders(@NonNull final Intent p0, final int p1);
    
    @NonNull
    public List<ResolveInfo> queryIntentContentProviders(@NonNull final Intent intent, @NonNull final ResolveInfoFlags flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public abstract ProviderInfo resolveContentProvider(@NonNull final String p0, final int p1);
    
    @Nullable
    public ProviderInfo resolveContentProvider(@NonNull final String authority, @NonNull final ComponentInfoFlags flags) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public abstract List<ProviderInfo> queryContentProviders(@Nullable final String p0, final int p1, final int p2);
    
    @NonNull
    public List<ProviderInfo> queryContentProviders(@Nullable final String processName, final int uid, @NonNull final ComponentInfoFlags flags) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public abstract InstrumentationInfo getInstrumentationInfo(@NonNull final ComponentName p0, final int p1) throws NameNotFoundException;
    
    @NonNull
    public abstract List<InstrumentationInfo> queryInstrumentation(@NonNull final String p0, final int p1);
    
    @Nullable
    public abstract Drawable getDrawable(@NonNull final String p0, final int p1, @Nullable final ApplicationInfo p2);
    
    @NonNull
    public abstract Drawable getActivityIcon(@NonNull final ComponentName p0) throws NameNotFoundException;
    
    @NonNull
    public abstract Drawable getActivityIcon(@NonNull final Intent p0) throws NameNotFoundException;
    
    @Nullable
    public abstract Drawable getActivityBanner(@NonNull final ComponentName p0) throws NameNotFoundException;
    
    @Nullable
    public abstract Drawable getActivityBanner(@NonNull final Intent p0) throws NameNotFoundException;
    
    @NonNull
    public abstract Drawable getDefaultActivityIcon();
    
    @NonNull
    public abstract Drawable getApplicationIcon(@NonNull final ApplicationInfo p0);
    
    @NonNull
    public abstract Drawable getApplicationIcon(@NonNull final String p0) throws NameNotFoundException;
    
    @Nullable
    public abstract Drawable getApplicationBanner(@NonNull final ApplicationInfo p0);
    
    @Nullable
    public abstract Drawable getApplicationBanner(@NonNull final String p0) throws NameNotFoundException;
    
    @Nullable
    public abstract Drawable getActivityLogo(@NonNull final ComponentName p0) throws NameNotFoundException;
    
    @Nullable
    public abstract Drawable getActivityLogo(@NonNull final Intent p0) throws NameNotFoundException;
    
    @Nullable
    public abstract Drawable getApplicationLogo(@NonNull final ApplicationInfo p0);
    
    @Nullable
    public abstract Drawable getApplicationLogo(@NonNull final String p0) throws NameNotFoundException;
    
    @NonNull
    public abstract Drawable getUserBadgedIcon(@NonNull final Drawable p0, @NonNull final UserHandle p1);
    
    @NonNull
    public abstract Drawable getUserBadgedDrawableForDensity(@NonNull final Drawable p0, @NonNull final UserHandle p1, @Nullable final Rect p2, final int p3);
    
    @NonNull
    public abstract CharSequence getUserBadgedLabel(@NonNull final CharSequence p0, @NonNull final UserHandle p1);
    
    @Nullable
    public abstract CharSequence getText(@NonNull final String p0, final int p1, @Nullable final ApplicationInfo p2);
    
    @Nullable
    public abstract XmlResourceParser getXml(@NonNull final String p0, final int p1, @Nullable final ApplicationInfo p2);
    
    @NonNull
    public abstract CharSequence getApplicationLabel(@NonNull final ApplicationInfo p0);
    
    @NonNull
    public abstract Resources getResourcesForActivity(@NonNull final ComponentName p0) throws NameNotFoundException;
    
    @NonNull
    public abstract Resources getResourcesForApplication(@NonNull final ApplicationInfo p0) throws NameNotFoundException;
    
    @NonNull
    public Resources getResourcesForApplication(@NonNull final ApplicationInfo app, @Nullable final Configuration configuration) throws NameNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public abstract Resources getResourcesForApplication(@NonNull final String p0) throws NameNotFoundException;
    
    @Nullable
    public PackageInfo getPackageArchiveInfo(@NonNull final String archiveFilePath, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public PackageInfo getPackageArchiveInfo(@NonNull final String archiveFilePath, @NonNull final PackageInfoFlags flags) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void verifyPendingInstall(final int p0, final int p1);
    
    public abstract void extendVerificationTimeout(final int p0, final int p1, final long p2);
    
    public abstract void setInstallerPackageName(@NonNull final String p0, @Nullable final String p1);
    
    @Deprecated
    @Nullable
    public abstract String getInstallerPackageName(@NonNull final String p0);
    
    @NonNull
    public InstallSourceInfo getInstallSourceInfo(@NonNull final String packageName) throws NameNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAppArchivable(@NonNull final String packageName) throws NameNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public abstract void addPackageToPreferred(@NonNull final String p0);
    
    @Deprecated
    public abstract void removePackageFromPreferred(@NonNull final String p0);
    
    @Deprecated
    @NonNull
    public abstract List<PackageInfo> getPreferredPackages(final int p0);
    
    @Deprecated
    public abstract void addPreferredActivity(@NonNull final IntentFilter p0, final int p1, @Nullable final ComponentName[] p2, @NonNull final ComponentName p3);
    
    @Deprecated
    public abstract void clearPackagePreferredActivities(@NonNull final String p0);
    
    @Deprecated
    public abstract int getPreferredActivities(@NonNull final List<IntentFilter> p0, @NonNull final List<ComponentName> p1, @Nullable final String p2);
    
    public abstract void setComponentEnabledSetting(@NonNull final ComponentName p0, final int p1, final int p2);
    
    public void setComponentEnabledSettings(@NonNull final List<ComponentEnabledSetting> settings) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract int getComponentEnabledSetting(@NonNull final ComponentName p0);
    
    public boolean getSyntheticAppDetailsActivityEnabled(@NonNull final String packageName) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void setApplicationEnabledSetting(@NonNull final String p0, final int p1, final int p2);
    
    public abstract int getApplicationEnabledSetting(@NonNull final String p0);
    
    public abstract boolean isSafeMode();
    
    public boolean isPackageSuspended(@NonNull final String packageName) throws NameNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isPackageSuspended() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Bundle getSuspendedPackageAppExtras() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isPackageStopped(@NonNull final String packageName) throws NameNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void setApplicationCategoryHint(@NonNull final String p0, final int p1);
    
    public boolean isDeviceUpgrading() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public abstract PackageInstaller getPackageInstaller();
    
    public abstract boolean canRequestPackageInstalls();
    
    public boolean hasSigningCertificate(@NonNull final String packageName, @NonNull final byte[] certificate, final int type) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasSigningCertificate(final int uid, @NonNull final byte[] certificate, final int type) {
        throw new RuntimeException("Stub!");
    }
    
    public void requestChecksums(@NonNull final String packageName, final boolean includeSplits, final int required, @NonNull final List<Certificate> trustedInstallers, @NonNull final OnChecksumsReadyListener onChecksumsReadyListener) throws CertificateEncodingException, NameNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAutoRevokeWhitelisted() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isDefaultApplicationIcon(@NonNull final Drawable drawable) {
        throw new RuntimeException("Stub!");
    }
    
    public void setMimeGroup(@NonNull final String mimeGroup, @NonNull final Set<String> mimeTypes) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<String> getMimeGroup(@NonNull final String mimeGroup) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Property getProperty(@NonNull final String propertyName, @NonNull final String packageName) throws NameNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Property getProperty(@NonNull final String propertyName, @NonNull final ComponentName component) throws NameNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<Property> queryApplicationProperty(@NonNull final String propertyName) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<Property> queryActivityProperty(@NonNull final String propertyName) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<Property> queryProviderProperty(@NonNull final String propertyName) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<Property> queryReceiverProperty(@NonNull final String propertyName) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<Property> queryServiceProperty(@NonNull final String propertyName) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean canPackageQuery(@NonNull final String sourcePackageName, @NonNull final String targetPackageName) throws NameNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public boolean[] canPackageQuery(@NonNull final String sourcePackageName, @NonNull final String[] targetPackageNames) throws NameNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ArchivedPackageInfo getArchivedPackage(@NonNull final String packageName) {
        throw new RuntimeException("Stub!");
    }
    
    public void relinquishUpdateOwnership(@NonNull final String targetPackage) {
        throw new RuntimeException("Stub!");
    }
    
    public <T> T parseAndroidManifest(@NonNull final File apkFile, @NonNull final Function<XmlResourceParser, T> parserFunction) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    static {
        TRUST_ALL = null;
        TRUST_NONE = null;
    }
    
    public static final class ApplicationInfoFlags
    {
        ApplicationInfoFlags() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public static ApplicationInfoFlags of(final long value) {
            throw new RuntimeException("Stub!");
        }
        
        public long getValue() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class ComponentEnabledSetting implements Parcelable
    {
        @NonNull
        public static final Creator<ComponentEnabledSetting> CREATOR;
        
        public ComponentEnabledSetting(@NonNull final ComponentName componentName, final int newState, final int flags) {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public ComponentName getComponentName() {
            throw new RuntimeException("Stub!");
        }
        
        public int getEnabledState() {
            throw new RuntimeException("Stub!");
        }
        
        public int getEnabledFlags() {
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
    
    public static final class ComponentInfoFlags
    {
        ComponentInfoFlags() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public static ComponentInfoFlags of(final long value) {
            throw new RuntimeException("Stub!");
        }
        
        public long getValue() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class NameNotFoundException extends AndroidException
    {
        public NameNotFoundException() {
            throw new RuntimeException("Stub!");
        }
        
        public NameNotFoundException(final String name) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class PackageInfoFlags
    {
        PackageInfoFlags() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public static PackageInfoFlags of(final long value) {
            throw new RuntimeException("Stub!");
        }
        
        public long getValue() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class Property implements Parcelable
    {
        @NonNull
        public static final Creator<Property> CREATOR;
        
        Property() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public String getName() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public String getPackageName() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public String getClassName() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean getBoolean() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isBoolean() {
            throw new RuntimeException("Stub!");
        }
        
        public float getFloat() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isFloat() {
            throw new RuntimeException("Stub!");
        }
        
        public int getInteger() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isInteger() {
            throw new RuntimeException("Stub!");
        }
        
        public int getResourceId() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isResourceId() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public String getString() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isString() {
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
    
    public static final class ResolveInfoFlags
    {
        ResolveInfoFlags() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public static ResolveInfoFlags of(final long value) {
            throw new RuntimeException("Stub!");
        }
        
        public long getValue() {
            throw new RuntimeException("Stub!");
        }
    }
    
    @FunctionalInterface
    public interface OnChecksumsReadyListener
    {
        void onChecksumsReady(@NonNull final List<ApkChecksum> p0);
    }
}
