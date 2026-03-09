package android.nfc;

import android.net.Uri;
import android.os.Handler;
import android.os.Bundle;
import android.content.IntentFilter;
import android.app.PendingIntent;
import android.app.Activity;
import android.content.Context;

public final class NfcAdapter
{
    public static final String ACTION_ADAPTER_STATE_CHANGED = "android.nfc.action.ADAPTER_STATE_CHANGED";
    public static final String ACTION_NDEF_DISCOVERED = "android.nfc.action.NDEF_DISCOVERED";
    public static final String ACTION_PREFERRED_PAYMENT_CHANGED = "android.nfc.action.PREFERRED_PAYMENT_CHANGED";
    public static final String ACTION_TAG_DISCOVERED = "android.nfc.action.TAG_DISCOVERED";
    public static final String ACTION_TECH_DISCOVERED = "android.nfc.action.TECH_DISCOVERED";
    public static final String ACTION_TRANSACTION_DETECTED = "android.nfc.action.TRANSACTION_DETECTED";
    public static final String EXTRA_ADAPTER_STATE = "android.nfc.extra.ADAPTER_STATE";
    public static final String EXTRA_AID = "android.nfc.extra.AID";
    public static final String EXTRA_DATA = "android.nfc.extra.DATA";
    public static final String EXTRA_ID = "android.nfc.extra.ID";
    public static final String EXTRA_NDEF_MESSAGES = "android.nfc.extra.NDEF_MESSAGES";
    public static final String EXTRA_PREFERRED_PAYMENT_CHANGED_REASON = "android.nfc.extra.PREFERRED_PAYMENT_CHANGED_REASON";
    public static final String EXTRA_READER_PRESENCE_CHECK_DELAY = "presence";
    public static final String EXTRA_SECURE_ELEMENT_NAME = "android.nfc.extra.SECURE_ELEMENT_NAME";
    public static final String EXTRA_TAG = "android.nfc.extra.TAG";
    public static final int FLAG_LISTEN_DISABLE = 0;
    public static final int FLAG_LISTEN_KEEP = Integer.MIN_VALUE;
    public static final int FLAG_LISTEN_NFC_PASSIVE_A = 1;
    public static final int FLAG_LISTEN_NFC_PASSIVE_B = 2;
    public static final int FLAG_LISTEN_NFC_PASSIVE_F = 4;
    public static final int FLAG_READER_DISABLE = 0;
    public static final int FLAG_READER_KEEP = Integer.MIN_VALUE;
    public static final int FLAG_READER_NFC_A = 1;
    public static final int FLAG_READER_NFC_B = 2;
    public static final int FLAG_READER_NFC_BARCODE = 16;
    public static final int FLAG_READER_NFC_F = 4;
    public static final int FLAG_READER_NFC_V = 8;
    public static final int FLAG_READER_NO_PLATFORM_SOUNDS = 256;
    public static final int FLAG_READER_SKIP_NDEF_CHECK = 128;
    public static final int PREFERRED_PAYMENT_CHANGED = 2;
    public static final int PREFERRED_PAYMENT_LOADED = 1;
    public static final int PREFERRED_PAYMENT_UPDATED = 3;
    public static final int STATE_OFF = 1;
    public static final int STATE_ON = 3;
    public static final int STATE_TURNING_OFF = 4;
    public static final int STATE_TURNING_ON = 2;
    
    NfcAdapter() {
        throw new RuntimeException("Stub!");
    }
    
    public static NfcAdapter getDefaultAdapter(final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isObserveModeSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isObserveModeEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setObserveModeEnabled(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    public void enableForegroundDispatch(final Activity activity, final PendingIntent intent, final IntentFilter[] filters, final String[][] techLists) {
        throw new RuntimeException("Stub!");
    }
    
    public void disableForegroundDispatch(final Activity activity) {
        throw new RuntimeException("Stub!");
    }
    
    public void enableReaderMode(final Activity activity, final ReaderCallback callback, final int flags, final Bundle extras) {
        throw new RuntimeException("Stub!");
    }
    
    public void disableReaderMode(final Activity activity) {
        throw new RuntimeException("Stub!");
    }
    
    public void setDiscoveryTechnology(@NonNull final Activity activity, final int pollTechnology, final int listenTechnology) {
        throw new RuntimeException("Stub!");
    }
    
    public void resetDiscoveryTechnology(@NonNull final Activity activity) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isSecureNfcSupported() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public NfcAntennaInfo getNfcAntennaInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isSecureNfcEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isReaderOptionSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isReaderOptionEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean ignore(final Tag tag, final int debounceMs, final OnTagRemovedListener tagRemovedListener, final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public interface ReaderCallback
    {
        void onTagDiscovered(final Tag p0);
    }
    
    public interface OnTagRemovedListener
    {
        void onTagRemoved();
    }
    
    @Deprecated
    public interface OnNdefPushCompleteCallback
    {
        @Deprecated
        void onNdefPushComplete(final NfcEvent p0);
    }
    
    @Deprecated
    public interface CreateNdefMessageCallback
    {
        @Deprecated
        NdefMessage createNdefMessage(final NfcEvent p0);
    }
    
    @Deprecated
    public interface CreateBeamUrisCallback
    {
        @Deprecated
        Uri[] createBeamUris(final NfcEvent p0);
    }
}
