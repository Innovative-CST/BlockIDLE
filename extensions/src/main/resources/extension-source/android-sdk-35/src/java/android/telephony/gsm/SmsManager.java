package android.telephony.gsm;

import java.util.ArrayList;
import android.app.PendingIntent;

@Deprecated
public final class SmsManager
{
    @Deprecated
    public static final int RESULT_ERROR_GENERIC_FAILURE = 1;
    @Deprecated
    public static final int RESULT_ERROR_NO_SERVICE = 4;
    @Deprecated
    public static final int RESULT_ERROR_NULL_PDU = 3;
    @Deprecated
    public static final int RESULT_ERROR_RADIO_OFF = 2;
    @Deprecated
    public static final int STATUS_ON_SIM_FREE = 0;
    @Deprecated
    public static final int STATUS_ON_SIM_READ = 1;
    @Deprecated
    public static final int STATUS_ON_SIM_SENT = 5;
    @Deprecated
    public static final int STATUS_ON_SIM_UNREAD = 3;
    @Deprecated
    public static final int STATUS_ON_SIM_UNSENT = 7;
    
    SmsManager() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static SmsManager getDefault() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void sendTextMessage(final String destinationAddress, final String scAddress, final String text, final PendingIntent sentIntent, final PendingIntent deliveryIntent) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public ArrayList<String> divideMessage(final String text) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void sendMultipartTextMessage(final String destinationAddress, final String scAddress, final ArrayList<String> parts, final ArrayList<PendingIntent> sentIntents, final ArrayList<PendingIntent> deliveryIntents) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void sendDataMessage(final String destinationAddress, final String scAddress, final short destinationPort, final byte[] data, final PendingIntent sentIntent, final PendingIntent deliveryIntent) {
        throw new RuntimeException("Stub!");
    }
}
