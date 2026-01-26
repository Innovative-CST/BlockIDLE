package android.telephony;

import java.io.IOException;
import android.telephony.data.NetworkSlicingConfig;
import android.telephony.emergency.EmergencyNumber;
import java.util.Map;
import java.util.function.Consumer;
import android.net.Uri;
import android.os.Handler;
import android.app.PendingIntent;
import java.io.InputStream;
import android.os.ParcelUuid;
import android.os.OutcomeReceiver;
import java.util.concurrent.Executor;
import java.nio.file.Path;
import java.util.List;
import android.os.PersistableBundle;
import android.telecom.PhoneAccountHandle;

public class TelephonyManager
{
    public static final String ACTION_CARRIER_MESSAGING_CLIENT_SERVICE = "android.telephony.action.CARRIER_MESSAGING_CLIENT_SERVICE";
    public static final String ACTION_CARRIER_SIGNAL_DEFAULT_NETWORK_AVAILABLE = "android.telephony.action.CARRIER_SIGNAL_DEFAULT_NETWORK_AVAILABLE";
    public static final String ACTION_CARRIER_SIGNAL_PCO_VALUE = "android.telephony.action.CARRIER_SIGNAL_PCO_VALUE";
    public static final String ACTION_CARRIER_SIGNAL_REDIRECTED = "android.telephony.action.CARRIER_SIGNAL_REDIRECTED";
    public static final String ACTION_CARRIER_SIGNAL_REQUEST_NETWORK_FAILED = "android.telephony.action.CARRIER_SIGNAL_REQUEST_NETWORK_FAILED";
    public static final String ACTION_CARRIER_SIGNAL_RESET = "android.telephony.action.CARRIER_SIGNAL_RESET";
    public static final String ACTION_CONFIGURE_VOICEMAIL = "android.telephony.action.CONFIGURE_VOICEMAIL";
    public static final String ACTION_MULTI_SIM_CONFIG_CHANGED = "android.telephony.action.MULTI_SIM_CONFIG_CHANGED";
    public static final String ACTION_NETWORK_COUNTRY_CHANGED = "android.telephony.action.NETWORK_COUNTRY_CHANGED";
    public static final String ACTION_PHONE_STATE_CHANGED = "android.intent.action.PHONE_STATE";
    public static final String ACTION_RESET_MOBILE_NETWORK_SETTINGS = "android.telephony.action.RESET_MOBILE_NETWORK_SETTINGS";
    public static final String ACTION_RESPOND_VIA_MESSAGE = "android.intent.action.RESPOND_VIA_MESSAGE";
    public static final String ACTION_SECRET_CODE = "android.telephony.action.SECRET_CODE";
    public static final String ACTION_SHOW_VOICEMAIL_NOTIFICATION = "android.telephony.action.SHOW_VOICEMAIL_NOTIFICATION";
    public static final String ACTION_SUBSCRIPTION_CARRIER_IDENTITY_CHANGED = "android.telephony.action.SUBSCRIPTION_CARRIER_IDENTITY_CHANGED";
    public static final String ACTION_SUBSCRIPTION_SPECIFIC_CARRIER_IDENTITY_CHANGED = "android.telephony.action.SUBSCRIPTION_SPECIFIC_CARRIER_IDENTITY_CHANGED";
    public static final int ALLOWED_NETWORK_TYPES_REASON_CARRIER = 2;
    public static final int ALLOWED_NETWORK_TYPES_REASON_USER = 0;
    public static final int APPTYPE_CSIM = 4;
    public static final int APPTYPE_ISIM = 5;
    public static final int APPTYPE_RUIM = 3;
    public static final int APPTYPE_SIM = 1;
    public static final int APPTYPE_UNKNOWN = 0;
    public static final int APPTYPE_USIM = 2;
    public static final int AUTHTYPE_EAP_AKA = 129;
    public static final int AUTHTYPE_EAP_SIM = 128;
    public static final int AUTHTYPE_GBA_BOOTSTRAP = 132;
    public static final int AUTHTYPE_GBA_NAF_KEY_EXTERNAL = 133;
    public static final int CALL_COMPOSER_STATUS_BUSINESS_ONLY = 2;
    public static final int CALL_COMPOSER_STATUS_OFF = 0;
    public static final int CALL_COMPOSER_STATUS_ON = 1;
    public static final int CALL_STATE_IDLE = 0;
    public static final int CALL_STATE_OFFHOOK = 2;
    public static final int CALL_STATE_RINGING = 1;
    public static final String CAPABILITY_SLICING_CONFIG_SUPPORTED = "CAPABILITY_SLICING_CONFIG_SUPPORTED";
    public static final int CARRIER_RESTRICTION_STATUS_NOT_RESTRICTED = 1;
    public static final int CARRIER_RESTRICTION_STATUS_RESTRICTED = 2;
    public static final int CARRIER_RESTRICTION_STATUS_RESTRICTED_TO_CALLER = 3;
    public static final int CARRIER_RESTRICTION_STATUS_UNKNOWN = 0;
    public static final int CDMA_ROAMING_MODE_AFFILIATED = 1;
    public static final int CDMA_ROAMING_MODE_ANY = 2;
    public static final int CDMA_ROAMING_MODE_HOME = 0;
    public static final int CDMA_ROAMING_MODE_RADIO_DEFAULT = -1;
    public static final int DATA_ACTIVITY_DORMANT = 4;
    public static final int DATA_ACTIVITY_IN = 1;
    public static final int DATA_ACTIVITY_INOUT = 3;
    public static final int DATA_ACTIVITY_NONE = 0;
    public static final int DATA_ACTIVITY_OUT = 2;
    public static final int DATA_CONNECTED = 2;
    public static final int DATA_CONNECTING = 1;
    public static final int DATA_DISCONNECTED = 0;
    public static final int DATA_DISCONNECTING = 4;
    public static final int DATA_ENABLED_REASON_CARRIER = 2;
    public static final int DATA_ENABLED_REASON_OVERRIDE = 4;
    public static final int DATA_ENABLED_REASON_POLICY = 1;
    public static final int DATA_ENABLED_REASON_THERMAL = 3;
    public static final int DATA_ENABLED_REASON_UNKNOWN = -1;
    public static final int DATA_ENABLED_REASON_USER = 0;
    public static final int DATA_HANDOVER_IN_PROGRESS = 5;
    public static final int DATA_SUSPENDED = 3;
    public static final int DATA_UNKNOWN = -1;
    public static final int DEFAULT_PORT_INDEX = 0;
    public static final int ERI_FLASH = 2;
    public static final int ERI_OFF = 1;
    public static final int ERI_ON = 0;
    public static final String EVENT_DISPLAY_EMERGENCY_MESSAGE = "android.telephony.event.DISPLAY_EMERGENCY_MESSAGE";
    public static final String EXTRA_ACTIVE_SIM_SUPPORTED_COUNT = "android.telephony.extra.ACTIVE_SIM_SUPPORTED_COUNT";
    public static final String EXTRA_APN_PROTOCOL = "android.telephony.extra.APN_PROTOCOL";
    public static final String EXTRA_APN_TYPE = "android.telephony.extra.APN_TYPE";
    public static final String EXTRA_CALL_VOICEMAIL_INTENT = "android.telephony.extra.CALL_VOICEMAIL_INTENT";
    public static final String EXTRA_CARRIER_ID = "android.telephony.extra.CARRIER_ID";
    public static final String EXTRA_CARRIER_NAME = "android.telephony.extra.CARRIER_NAME";
    public static final String EXTRA_DATA_FAIL_CAUSE = "android.telephony.extra.DATA_FAIL_CAUSE";
    public static final String EXTRA_DEFAULT_NETWORK_AVAILABLE = "android.telephony.extra.DEFAULT_NETWORK_AVAILABLE";
    public static final String EXTRA_EMERGENCY_CALL_TO_SATELLITE_HANDOVER_TYPE = "android.telephony.extra.EMERGENCY_CALL_TO_SATELLITE_HANDOVER_TYPE";
    public static final String EXTRA_EMERGENCY_CALL_TO_SATELLITE_LAUNCH_INTENT = "android.telephony.extra.EMERGENCY_CALL_TO_SATELLITE_LAUNCH_INTENT";
    public static final String EXTRA_HIDE_PUBLIC_SETTINGS = "android.telephony.extra.HIDE_PUBLIC_SETTINGS";
    @Deprecated
    public static final String EXTRA_INCOMING_NUMBER = "incoming_number";
    public static final String EXTRA_IS_REFRESH = "android.telephony.extra.IS_REFRESH";
    public static final String EXTRA_LAST_KNOWN_NETWORK_COUNTRY = "android.telephony.extra.LAST_KNOWN_NETWORK_COUNTRY";
    public static final String EXTRA_LAUNCH_VOICEMAIL_SETTINGS_INTENT = "android.telephony.extra.LAUNCH_VOICEMAIL_SETTINGS_INTENT";
    public static final String EXTRA_NETWORK_COUNTRY = "android.telephony.extra.NETWORK_COUNTRY";
    public static final String EXTRA_NOTIFICATION_COUNT = "android.telephony.extra.NOTIFICATION_COUNT";
    public static final String EXTRA_PCO_ID = "android.telephony.extra.PCO_ID";
    public static final String EXTRA_PCO_VALUE = "android.telephony.extra.PCO_VALUE";
    public static final String EXTRA_PHONE_ACCOUNT_HANDLE = "android.telephony.extra.PHONE_ACCOUNT_HANDLE";
    public static final String EXTRA_REDIRECTION_URL = "android.telephony.extra.REDIRECTION_URL";
    public static final String EXTRA_SPECIFIC_CARRIER_ID = "android.telephony.extra.SPECIFIC_CARRIER_ID";
    public static final String EXTRA_SPECIFIC_CARRIER_NAME = "android.telephony.extra.SPECIFIC_CARRIER_NAME";
    public static final String EXTRA_STATE = "state";
    public static final String EXTRA_STATE_IDLE;
    public static final String EXTRA_STATE_OFFHOOK;
    public static final String EXTRA_STATE_RINGING;
    public static final String EXTRA_SUBSCRIPTION_ID = "android.telephony.extra.SUBSCRIPTION_ID";
    public static final String EXTRA_VOICEMAIL_NUMBER = "android.telephony.extra.VOICEMAIL_NUMBER";
    public static final int INCLUDE_LOCATION_DATA_COARSE = 1;
    public static final int INCLUDE_LOCATION_DATA_FINE = 2;
    public static final int INCLUDE_LOCATION_DATA_NONE = 0;
    public static final String METADATA_HIDE_VOICEMAIL_SETTINGS_MENU = "android.telephony.HIDE_VOICEMAIL_SETTINGS_MENU";
    public static final int MULTISIM_ALLOWED = 0;
    public static final int MULTISIM_NOT_SUPPORTED_BY_CARRIER = 2;
    public static final int MULTISIM_NOT_SUPPORTED_BY_HARDWARE = 1;
    public static final int NETWORK_SELECTION_MODE_AUTO = 1;
    public static final int NETWORK_SELECTION_MODE_MANUAL = 2;
    public static final int NETWORK_SELECTION_MODE_UNKNOWN = 0;
    public static final int NETWORK_TYPE_1xRTT = 7;
    public static final long NETWORK_TYPE_BITMASK_1xRTT = 64L;
    public static final long NETWORK_TYPE_BITMASK_CDMA = 8L;
    public static final long NETWORK_TYPE_BITMASK_EDGE = 2L;
    public static final long NETWORK_TYPE_BITMASK_EHRPD = 8192L;
    public static final long NETWORK_TYPE_BITMASK_EVDO_0 = 16L;
    public static final long NETWORK_TYPE_BITMASK_EVDO_A = 32L;
    public static final long NETWORK_TYPE_BITMASK_EVDO_B = 2048L;
    public static final long NETWORK_TYPE_BITMASK_GPRS = 1L;
    public static final long NETWORK_TYPE_BITMASK_GSM = 32768L;
    public static final long NETWORK_TYPE_BITMASK_HSDPA = 128L;
    public static final long NETWORK_TYPE_BITMASK_HSPA = 512L;
    public static final long NETWORK_TYPE_BITMASK_HSPAP = 16384L;
    public static final long NETWORK_TYPE_BITMASK_HSUPA = 256L;
    public static final long NETWORK_TYPE_BITMASK_IWLAN = 131072L;
    public static final long NETWORK_TYPE_BITMASK_LTE = 4096L;
    @Deprecated
    public static final long NETWORK_TYPE_BITMASK_LTE_CA = 262144L;
    public static final long NETWORK_TYPE_BITMASK_NR = 524288L;
    public static final long NETWORK_TYPE_BITMASK_TD_SCDMA = 65536L;
    public static final long NETWORK_TYPE_BITMASK_UMTS = 4L;
    public static final long NETWORK_TYPE_BITMASK_UNKNOWN = 0L;
    public static final int NETWORK_TYPE_CDMA = 4;
    public static final int NETWORK_TYPE_EDGE = 2;
    public static final int NETWORK_TYPE_EHRPD = 14;
    public static final int NETWORK_TYPE_EVDO_0 = 5;
    public static final int NETWORK_TYPE_EVDO_A = 6;
    public static final int NETWORK_TYPE_EVDO_B = 12;
    public static final int NETWORK_TYPE_GPRS = 1;
    public static final int NETWORK_TYPE_GSM = 16;
    public static final int NETWORK_TYPE_HSDPA = 8;
    public static final int NETWORK_TYPE_HSPA = 10;
    public static final int NETWORK_TYPE_HSPAP = 15;
    public static final int NETWORK_TYPE_HSUPA = 9;
    @Deprecated
    public static final int NETWORK_TYPE_IDEN = 11;
    public static final int NETWORK_TYPE_IWLAN = 18;
    public static final int NETWORK_TYPE_LTE = 13;
    public static final int NETWORK_TYPE_NR = 20;
    public static final int NETWORK_TYPE_TD_SCDMA = 17;
    public static final int NETWORK_TYPE_UMTS = 3;
    public static final int NETWORK_TYPE_UNKNOWN = 0;
    public static final int PHONE_TYPE_CDMA = 2;
    public static final int PHONE_TYPE_GSM = 1;
    public static final int PHONE_TYPE_NONE = 0;
    public static final int PHONE_TYPE_SIP = 3;
    public static final int PREMIUM_CAPABILITY_PRIORITIZE_LATENCY = 34;
    public static final int PURCHASE_PREMIUM_CAPABILITY_RESULT_ALREADY_IN_PROGRESS = 4;
    public static final int PURCHASE_PREMIUM_CAPABILITY_RESULT_ALREADY_PURCHASED = 3;
    public static final int PURCHASE_PREMIUM_CAPABILITY_RESULT_CARRIER_DISABLED = 7;
    public static final int PURCHASE_PREMIUM_CAPABILITY_RESULT_CARRIER_ERROR = 8;
    public static final int PURCHASE_PREMIUM_CAPABILITY_RESULT_ENTITLEMENT_CHECK_FAILED = 13;
    public static final int PURCHASE_PREMIUM_CAPABILITY_RESULT_FEATURE_NOT_SUPPORTED = 10;
    public static final int PURCHASE_PREMIUM_CAPABILITY_RESULT_NETWORK_NOT_AVAILABLE = 12;
    public static final int PURCHASE_PREMIUM_CAPABILITY_RESULT_NOT_DEFAULT_DATA_SUBSCRIPTION = 14;
    public static final int PURCHASE_PREMIUM_CAPABILITY_RESULT_NOT_FOREGROUND = 5;
    public static final int PURCHASE_PREMIUM_CAPABILITY_RESULT_PENDING_NETWORK_SETUP = 15;
    public static final int PURCHASE_PREMIUM_CAPABILITY_RESULT_REQUEST_FAILED = 11;
    public static final int PURCHASE_PREMIUM_CAPABILITY_RESULT_SUCCESS = 1;
    public static final int PURCHASE_PREMIUM_CAPABILITY_RESULT_THROTTLED = 2;
    public static final int PURCHASE_PREMIUM_CAPABILITY_RESULT_TIMEOUT = 9;
    public static final int PURCHASE_PREMIUM_CAPABILITY_RESULT_USER_CANCELED = 6;
    public static final int PURCHASE_PREMIUM_CAPABILITY_RESULT_USER_DISABLED = 16;
    public static final int SET_OPPORTUNISTIC_SUB_INACTIVE_SUBSCRIPTION = 2;
    public static final int SET_OPPORTUNISTIC_SUB_NO_OPPORTUNISTIC_SUB_AVAILABLE = 3;
    public static final int SET_OPPORTUNISTIC_SUB_REMOTE_SERVICE_EXCEPTION = 4;
    public static final int SET_OPPORTUNISTIC_SUB_SUCCESS = 0;
    public static final int SET_OPPORTUNISTIC_SUB_VALIDATION_FAILED = 1;
    public static final int SIM_STATE_ABSENT = 1;
    public static final int SIM_STATE_CARD_IO_ERROR = 8;
    public static final int SIM_STATE_CARD_RESTRICTED = 9;
    public static final int SIM_STATE_NETWORK_LOCKED = 4;
    public static final int SIM_STATE_NOT_READY = 6;
    public static final int SIM_STATE_PERM_DISABLED = 7;
    public static final int SIM_STATE_PIN_REQUIRED = 2;
    public static final int SIM_STATE_PUK_REQUIRED = 3;
    public static final int SIM_STATE_READY = 5;
    public static final int SIM_STATE_UNKNOWN = 0;
    public static final int UNINITIALIZED_CARD_ID = -2;
    public static final int UNKNOWN_CARRIER_ID = -1;
    public static final int UNSUPPORTED_CARD_ID = -1;
    public static final int UPDATE_AVAILABLE_NETWORKS_ABORTED = 2;
    public static final int UPDATE_AVAILABLE_NETWORKS_DISABLE_MODEM_FAIL = 5;
    public static final int UPDATE_AVAILABLE_NETWORKS_ENABLE_MODEM_FAIL = 6;
    public static final int UPDATE_AVAILABLE_NETWORKS_INVALID_ARGUMENTS = 3;
    public static final int UPDATE_AVAILABLE_NETWORKS_MULTIPLE_NETWORKS_NOT_SUPPORTED = 7;
    public static final int UPDATE_AVAILABLE_NETWORKS_NO_CARRIER_PRIVILEGE = 4;
    public static final int UPDATE_AVAILABLE_NETWORKS_NO_OPPORTUNISTIC_SUB_AVAILABLE = 8;
    public static final int UPDATE_AVAILABLE_NETWORKS_REMOTE_SERVICE_EXCEPTION = 9;
    public static final int UPDATE_AVAILABLE_NETWORKS_SERVICE_IS_DISABLED = 10;
    public static final int UPDATE_AVAILABLE_NETWORKS_SUCCESS = 0;
    public static final int UPDATE_AVAILABLE_NETWORKS_UNKNOWN_FAILURE = 1;
    public static final int USSD_ERROR_SERVICE_UNAVAIL = -2;
    public static final int USSD_RETURN_FAILURE = -1;
    public static final String VVM_TYPE_CVVM = "vvm_type_cvvm";
    public static final String VVM_TYPE_OMTP = "vvm_type_omtp";
    
    TelephonyManager() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getPhoneCount() {
        throw new RuntimeException("Stub!");
    }
    
    public int getActiveModemCount() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSupportedModemCount() {
        throw new RuntimeException("Stub!");
    }
    
    public TelephonyManager createForSubscriptionId(final int subId) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public TelephonyManager createForPhoneAccountHandle(final PhoneAccountHandle phoneAccountHandle) {
        throw new RuntimeException("Stub!");
    }
    
    public static long getMaximumCallComposerPictureSize() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getDeviceSoftwareVersion() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String getDeviceId() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String getDeviceId(final int slotIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public String getImei() {
        throw new RuntimeException("Stub!");
    }
    
    public String getImei(final int slotIndex) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getTypeAllocationCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getTypeAllocationCode(final int slotIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public String getMeid() {
        throw new RuntimeException("Stub!");
    }
    
    public String getMeid(final int slotIndex) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getManufacturerCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getManufacturerCode(final int slotIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public String getNai() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public CellLocation getCellLocation() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPhoneType() {
        throw new RuntimeException("Stub!");
    }
    
    public String getNetworkOperatorName() {
        throw new RuntimeException("Stub!");
    }
    
    public String getNetworkOperator() {
        throw new RuntimeException("Stub!");
    }
    
    public String getNetworkSpecifier() {
        throw new RuntimeException("Stub!");
    }
    
    public PersistableBundle getCarrierConfig() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isNetworkRoaming() {
        throw new RuntimeException("Stub!");
    }
    
    public String getNetworkCountryIso() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getNetworkCountryIso(final int slotIndex) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getNetworkType() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDataNetworkType() {
        throw new RuntimeException("Stub!");
    }
    
    public int getVoiceNetworkType() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasIccCard() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSimState() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSimState(final int slotIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public String getSimOperator() {
        throw new RuntimeException("Stub!");
    }
    
    public String getSimOperatorName() {
        throw new RuntimeException("Stub!");
    }
    
    public String getSimCountryIso() {
        throw new RuntimeException("Stub!");
    }
    
    public String getSimSerialNumber() {
        throw new RuntimeException("Stub!");
    }
    
    public int getCardIdForDefaultEuicc() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<UiccCardInfo> getUiccCardsInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public String getSubscriberId() {
        throw new RuntimeException("Stub!");
    }
    
    public void uploadCallComposerPicture(@NonNull final Path pictureToUpload, @NonNull final String contentType, @NonNull final Executor executor, @NonNull final OutcomeReceiver<ParcelUuid, CallComposerException> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void uploadCallComposerPicture(@NonNull final InputStream pictureToUpload, @NonNull final String contentType, @NonNull final Executor executor, @NonNull final OutcomeReceiver<ParcelUuid, CallComposerException> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public String getGroupIdLevel1() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String getLine1Number() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean setLine1NumberForDisplay(final String alphaTag, final String number) {
        throw new RuntimeException("Stub!");
    }
    
    public String getVoiceMailNumber() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setVoiceMailNumber(final String alphaTag, final String number) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getVisualVoicemailPackageName() {
        throw new RuntimeException("Stub!");
    }
    
    public void setVisualVoicemailSmsFilterSettings(final VisualVoicemailSmsFilterSettings settings) {
        throw new RuntimeException("Stub!");
    }
    
    public void sendVisualVoicemailSms(final String number, final int port, final String text, final PendingIntent sentIntent) {
        throw new RuntimeException("Stub!");
    }
    
    public String getVoiceMailAlphaTag() {
        throw new RuntimeException("Stub!");
    }
    
    public void sendDialerSpecialCode(final String inputCode) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getCallState() {
        throw new RuntimeException("Stub!");
    }
    
    public int getCallStateForSubscription() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDataActivity() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDataState() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void listen(final PhoneStateListener listener, final int events) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isVoiceCapable() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isDeviceVoiceCapable() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isSmsCapable() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isDeviceSmsCapable() {
        throw new RuntimeException("Stub!");
    }
    
    public List<CellInfo> getAllCellInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public void requestCellInfoUpdate(@NonNull final Executor executor, @NonNull final CellInfoCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public String getMmsUserAgent() {
        throw new RuntimeException("Stub!");
    }
    
    public String getMmsUAProfUrl() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public IccOpenLogicalChannelResponse iccOpenLogicalChannel(final String AID) {
        throw new RuntimeException("Stub!");
    }
    
    public IccOpenLogicalChannelResponse iccOpenLogicalChannel(final String AID, final int p2) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean iccCloseLogicalChannel(final int channel) {
        throw new RuntimeException("Stub!");
    }
    
    public String iccTransmitApduLogicalChannel(final int channel, final int cla, final int instruction, final int p1, final int p2, final int p3, final String data) {
        throw new RuntimeException("Stub!");
    }
    
    public String iccTransmitApduBasicChannel(final int cla, final int instruction, final int p1, final int p2, final int p3, final String data) {
        throw new RuntimeException("Stub!");
    }
    
    public byte[] iccExchangeSimIO(final int fileID, final int command, final int p1, final int p2, final int p3, final String filePath) {
        throw new RuntimeException("Stub!");
    }
    
    public String sendEnvelopeWithStatus(final String content) {
        throw new RuntimeException("Stub!");
    }
    
    public void rebootModem() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSubscriptionId() {
        throw new RuntimeException("Stub!");
    }
    
    public String getIccAuthentication(final int appType, final int authType, final String data) {
        throw new RuntimeException("Stub!");
    }
    
    public String[] getForbiddenPlmns() {
        throw new RuntimeException("Stub!");
    }
    
    public int setForbiddenPlmns(@NonNull final List<String> fplmns) {
        throw new RuntimeException("Stub!");
    }
    
    public void setNetworkSelectionModeAutomatic() {
        throw new RuntimeException("Stub!");
    }
    
    public NetworkScan requestNetworkScan(final NetworkScanRequest request, final Executor executor, final TelephonyScanManager.NetworkScanCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public NetworkScan requestNetworkScan(final int includeLocationData, @NonNull final NetworkScanRequest request, @NonNull final Executor executor, @NonNull final TelephonyScanManager.NetworkScanCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setNetworkSelectionModeManual(final String operatorNumeric, final boolean persistSelection) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setNetworkSelectionModeManual(@NonNull final String operatorNumeric, final boolean persistSelection, final int ran) {
        throw new RuntimeException("Stub!");
    }
    
    public int getNetworkSelectionMode() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getManualNetworkSelectionPlmn() {
        throw new RuntimeException("Stub!");
    }
    
    public void setAllowedNetworkTypesForReason(final int reason, final long allowedNetworkTypes) {
        throw new RuntimeException("Stub!");
    }
    
    public long getAllowedNetworkTypesForReason(final int reason) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setPreferredNetworkTypeToGlobal() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasCarrierPrivileges() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setOperatorBrandOverride(final String brand) {
        throw new RuntimeException("Stub!");
    }
    
    public void setCallComposerStatus(final int status) {
        throw new RuntimeException("Stub!");
    }
    
    public int getCallComposerStatus() {
        throw new RuntimeException("Stub!");
    }
    
    public void sendUssdRequest(final String ussdRequest, final UssdResponseCallback callback, final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isConcurrentVoiceAndDataSupported() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setDataEnabled(final boolean enable) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isDataEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isDataRoamingEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean canChangeDtmfToneLength() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isWorldPhone() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isTtyModeSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isRttSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isHearingAidCompatibilitySupported() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public PhoneAccountHandle getPhoneAccountHandle() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSubscriptionId(@NonNull final PhoneAccountHandle phoneAccountHandle) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ServiceState getServiceState() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ServiceState getServiceState(final int includeLocationData) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Uri getVoicemailRingtoneUri(final PhoneAccountHandle accountHandle) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setVoicemailRingtoneUri(final PhoneAccountHandle phoneAccountHandle, final Uri uri) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isVoicemailVibrationEnabled(final PhoneAccountHandle accountHandle) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setVoicemailVibrationEnabled(final PhoneAccountHandle phoneAccountHandle, final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    public int getSimCarrierId() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CharSequence getSimCarrierIdName() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSimSpecificCarrierId() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CharSequence getSimSpecificCarrierIdName() {
        throw new RuntimeException("Stub!");
    }
    
    public int getCarrierIdFromSimMccMnc() {
        throw new RuntimeException("Stub!");
    }
    
    public void getCarrierRestrictionStatus(@NonNull final Executor executor, @NonNull final Consumer<Integer> resultListener) {
        throw new RuntimeException("Stub!");
    }
    
    public void setDataEnabledForReason(final int reason, final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isDataEnabledForReason(final int reason) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isManualNetworkSelectionAllowed() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public SignalStrength getSignalStrength() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isDataConnectionAllowed() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isDataCapable() {
        throw new RuntimeException("Stub!");
    }
    
    public long getSupportedRadioAccessFamily() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Map<Integer, List<EmergencyNumber>> getEmergencyNumberList() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Map<Integer, List<EmergencyNumber>> getEmergencyNumberList(final int categories) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isEmergencyNumber(@NonNull final String number) {
        throw new RuntimeException("Stub!");
    }
    
    public void setPreferredOpportunisticDataSubscription(final int subId, final boolean needValidation, @Nullable final Executor executor, @Nullable final Consumer<Integer> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public int getPreferredOpportunisticDataSubscription() {
        throw new RuntimeException("Stub!");
    }
    
    public void updateAvailableNetworks(@NonNull final List<AvailableNetworkInfo> availableNetworks, @Nullable final Executor executor, @Nullable final Consumer<Integer> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isModemEnabledForSlot(final int slotIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public int isMultiSimSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public void switchMultiSimConfig(final int numOfSims) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean doesSwitchMultiSimConfigTriggerReboot() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<String> getEquivalentHomePlmns() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isRadioInterfaceCapabilitySupported(@NonNull final String capability) {
        throw new RuntimeException("Stub!");
    }
    
    public void registerTelephonyCallback(@NonNull final Executor executor, @NonNull final TelephonyCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void registerTelephonyCallback(final int includeLocationData, @NonNull final Executor executor, @NonNull final TelephonyCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterTelephonyCallback(@NonNull final TelephonyCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void setSignalStrengthUpdateRequest(@NonNull final SignalStrengthUpdateRequest request) {
        throw new RuntimeException("Stub!");
    }
    
    public void clearSignalStrengthUpdateRequest(@NonNull final SignalStrengthUpdateRequest request) {
        throw new RuntimeException("Stub!");
    }
    
    public void getNetworkSlicingConfiguration(@NonNull final Executor executor, @NonNull final OutcomeReceiver<NetworkSlicingConfig, NetworkSlicingException> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isPremiumCapabilityAvailableForPurchase(final int capability) {
        throw new RuntimeException("Stub!");
    }
    
    public void purchasePremiumCapability(final int capability, @NonNull final Executor executor, @NonNull final Consumer<Integer> callback) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getPrimaryImei() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        EXTRA_STATE_IDLE = null;
        EXTRA_STATE_OFFHOOK = null;
        EXTRA_STATE_RINGING = null;
    }
    
    public static class CallComposerException extends Exception
    {
        public static final int ERROR_AUTHENTICATION_FAILED = 3;
        public static final int ERROR_FILE_TOO_LARGE = 2;
        public static final int ERROR_INPUT_CLOSED = 4;
        public static final int ERROR_IO_EXCEPTION = 5;
        public static final int ERROR_NETWORK_UNAVAILABLE = 6;
        public static final int ERROR_REMOTE_END_CLOSED = 1;
        public static final int ERROR_UNKNOWN = 0;
        
        public CallComposerException(final int errorCode, @Nullable final IOException ioException) {
            throw new RuntimeException("Stub!");
        }
        
        public int getErrorCode() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public IOException getIOException() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public abstract static class CellInfoCallback
    {
        public static final int ERROR_MODEM_ERROR = 2;
        public static final int ERROR_TIMEOUT = 1;
        
        public CellInfoCallback() {
            throw new RuntimeException("Stub!");
        }
        
        public abstract void onCellInfo(@NonNull final List<CellInfo> p0);
        
        public void onError(final int errorCode, @Nullable final Throwable detail) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public class ModemErrorException extends NetworkSlicingException
    {
        ModemErrorException() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class NetworkSlicingException extends Exception
    {
        NetworkSlicingException() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public class TimeoutException extends NetworkSlicingException
    {
        TimeoutException() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public abstract static class UssdResponseCallback
    {
        public UssdResponseCallback() {
            throw new RuntimeException("Stub!");
        }
        
        public void onReceiveUssdResponse(final TelephonyManager telephonyManager, final String request, final CharSequence response) {
            throw new RuntimeException("Stub!");
        }
        
        public void onReceiveUssdResponseFailed(final TelephonyManager telephonyManager, final String request, final int failureCode) {
            throw new RuntimeException("Stub!");
        }
    }
}
