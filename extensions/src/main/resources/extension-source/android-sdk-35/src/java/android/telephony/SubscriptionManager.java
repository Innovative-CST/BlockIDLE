package android.telephony;

import android.net.Uri;
import android.os.ParcelUuid;
import android.app.PendingIntent;
import java.util.List;
import java.util.concurrent.Executor;
import android.content.Context;

public class SubscriptionManager
{
    public static final String ACTION_DEFAULT_SMS_SUBSCRIPTION_CHANGED = "android.telephony.action.DEFAULT_SMS_SUBSCRIPTION_CHANGED";
    public static final String ACTION_DEFAULT_SUBSCRIPTION_CHANGED = "android.telephony.action.DEFAULT_SUBSCRIPTION_CHANGED";
    public static final String ACTION_MANAGE_SUBSCRIPTION_PLANS = "android.telephony.action.MANAGE_SUBSCRIPTION_PLANS";
    public static final String ACTION_REFRESH_SUBSCRIPTION_PLANS = "android.telephony.action.REFRESH_SUBSCRIPTION_PLANS";
    public static final int D2D_SHARING_ALL = 3;
    public static final int D2D_SHARING_ALL_CONTACTS = 1;
    public static final int D2D_SHARING_DISABLED = 0;
    public static final int D2D_SHARING_SELECTED_CONTACTS = 2;
    public static final String D2D_STATUS_SHARING = "d2d_sharing_status";
    public static final String D2D_STATUS_SHARING_SELECTED_CONTACTS = "d2d_sharing_contacts";
    public static final int DATA_ROAMING_DISABLE = 0;
    public static final int DATA_ROAMING_ENABLE = 1;
    public static final int DEFAULT_SUBSCRIPTION_ID = Integer.MAX_VALUE;
    public static final String EXTRA_SLOT_INDEX = "android.telephony.extra.SLOT_INDEX";
    public static final String EXTRA_SUBSCRIPTION_INDEX = "android.telephony.extra.SUBSCRIPTION_INDEX";
    public static final int INVALID_SIM_SLOT_INDEX = -1;
    public static final int INVALID_SUBSCRIPTION_ID = -1;
    public static final int PHONE_NUMBER_SOURCE_CARRIER = 2;
    public static final int PHONE_NUMBER_SOURCE_IMS = 3;
    public static final int PHONE_NUMBER_SOURCE_UICC = 1;
    public static final int SERVICE_CAPABILITY_DATA = 3;
    public static final int SERVICE_CAPABILITY_SMS = 2;
    public static final int SERVICE_CAPABILITY_VOICE = 1;
    public static final int SUBSCRIPTION_TYPE_LOCAL_SIM = 0;
    public static final int SUBSCRIPTION_TYPE_REMOTE_SIM = 1;
    public static final int USAGE_SETTING_DATA_CENTRIC = 2;
    public static final int USAGE_SETTING_DEFAULT = 0;
    public static final int USAGE_SETTING_UNKNOWN = -1;
    public static final int USAGE_SETTING_VOICE_CENTRIC = 1;
    
    SubscriptionManager() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static SubscriptionManager from(final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void addOnSubscriptionsChangedListener(final OnSubscriptionsChangedListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void addOnSubscriptionsChangedListener(@NonNull final Executor executor, @NonNull final OnSubscriptionsChangedListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeOnSubscriptionsChangedListener(final OnSubscriptionsChangedListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void addOnOpportunisticSubscriptionsChangedListener(@NonNull final Executor executor, @NonNull final OnOpportunisticSubscriptionsChangedListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeOnOpportunisticSubscriptionsChangedListener(@NonNull final OnOpportunisticSubscriptionsChangedListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public SubscriptionInfo getActiveSubscriptionInfo(final int subId) {
        throw new RuntimeException("Stub!");
    }
    
    public SubscriptionInfo getActiveSubscriptionInfoForSimSlotIndex(final int slotIndex) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<SubscriptionInfo> getAllSubscriptionInfoList() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public List<SubscriptionInfo> getActiveSubscriptionInfoList() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<SubscriptionInfo> getCompleteActiveSubscriptionInfoList() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public List<SubscriptionInfo> getAccessibleSubscriptionInfoList() {
        throw new RuntimeException("Stub!");
    }
    
    public int getActiveSubscriptionInfoCount() {
        throw new RuntimeException("Stub!");
    }
    
    public int getActiveSubscriptionInfoCountMax() {
        throw new RuntimeException("Stub!");
    }
    
    public static int getSlotIndex(final int subscriptionId) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public int[] getSubscriptionIds(final int slotIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public static int getSubscriptionId(final int slotIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public static int getDefaultSubscriptionId() {
        throw new RuntimeException("Stub!");
    }
    
    public static int getDefaultVoiceSubscriptionId() {
        throw new RuntimeException("Stub!");
    }
    
    public static int getDefaultSmsSubscriptionId() {
        throw new RuntimeException("Stub!");
    }
    
    public static int getDefaultDataSubscriptionId() {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isValidSubscriptionId(final int subscriptionId) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isUsableSubscriptionId(final int subscriptionId) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isNetworkRoaming(final int subId) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isActiveSubscriptionId(final int subscriptionId) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<SubscriptionPlan> getSubscriptionPlans(final int subId) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setSubscriptionPlans(final int subId, @NonNull final List<SubscriptionPlan> plans) {
        throw new RuntimeException("Stub!");
    }
    
    public void setSubscriptionPlans(final int subId, @NonNull final List<SubscriptionPlan> plans, final long expirationDurationMillis) {
        throw new RuntimeException("Stub!");
    }
    
    public void setSubscriptionOverrideUnmetered(final int subId, final boolean overrideUnmetered, final long expirationDurationMillis) {
        throw new RuntimeException("Stub!");
    }
    
    public void setSubscriptionOverrideUnmetered(final int subId, final boolean overrideUnmetered, @NonNull final int[] networkTypes, final long expirationDurationMillis) {
        throw new RuntimeException("Stub!");
    }
    
    public void setSubscriptionOverrideCongested(final int subId, final boolean overrideCongested, final long expirationDurationMillis) {
        throw new RuntimeException("Stub!");
    }
    
    public void setSubscriptionOverrideCongested(final int subId, final boolean overrideCongested, @NonNull final int[] networkTypes, final long expirationDurationMillis) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean canManageSubscription(final SubscriptionInfo info) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<SubscriptionInfo> getOpportunisticSubscriptions() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void switchToSubscription(final int subId, @NonNull final PendingIntent callbackIntent) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setOpportunistic(final boolean opportunistic, final int subId) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public ParcelUuid createSubscriptionGroup(@NonNull final List<Integer> subIdList) {
        throw new RuntimeException("Stub!");
    }
    
    public void addSubscriptionsIntoGroup(@NonNull final List<Integer> subIdList, @NonNull final ParcelUuid groupUuid) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeSubscriptionsFromGroup(@NonNull final List<Integer> subIdList, @NonNull final ParcelUuid groupUuid) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<SubscriptionInfo> getSubscriptionsInGroup(@NonNull final ParcelUuid groupUuid) {
        throw new RuntimeException("Stub!");
    }
    
    public void setDeviceToDeviceStatusSharingPreference(final int subscriptionId, final int sharing) {
        throw new RuntimeException("Stub!");
    }
    
    public int getDeviceToDeviceStatusSharingPreference(final int subscriptionId) {
        throw new RuntimeException("Stub!");
    }
    
    public void setDeviceToDeviceStatusSharingContacts(final int subscriptionId, @NonNull final List<Uri> contacts) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<Uri> getDeviceToDeviceStatusSharingContacts(final int subscriptionId) {
        throw new RuntimeException("Stub!");
    }
    
    public static int getActiveDataSubscriptionId() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getPhoneNumber(final int subscriptionId, final int source) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getPhoneNumber(final int subscriptionId) {
        throw new RuntimeException("Stub!");
    }
    
    public void setCarrierPhoneNumber(final int subscriptionId, @NonNull final String number) {
        throw new RuntimeException("Stub!");
    }
    
    public static class OnOpportunisticSubscriptionsChangedListener
    {
        public OnOpportunisticSubscriptionsChangedListener() {
            throw new RuntimeException("Stub!");
        }
        
        public void onOpportunisticSubscriptionsChanged() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class OnSubscriptionsChangedListener
    {
        public OnSubscriptionsChangedListener() {
            throw new RuntimeException("Stub!");
        }
        
        public void onSubscriptionsChanged() {
            throw new RuntimeException("Stub!");
        }
    }
}
