package android.telephony;

public class SmsMessage
{
    public static final int ENCODING_16BIT = 3;
    public static final int ENCODING_7BIT = 1;
    public static final int ENCODING_8BIT = 2;
    public static final int ENCODING_KSC5601 = 4;
    public static final int ENCODING_UNKNOWN = 0;
    public static final String FORMAT_3GPP = "3gpp";
    public static final String FORMAT_3GPP2 = "3gpp2";
    public static final int MAX_USER_DATA_BYTES = 140;
    public static final int MAX_USER_DATA_BYTES_WITH_HEADER = 134;
    public static final int MAX_USER_DATA_SEPTETS = 160;
    public static final int MAX_USER_DATA_SEPTETS_WITH_HEADER = 153;
    
    SmsMessage() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static SmsMessage createFromPdu(final byte[] pdu) {
        throw new RuntimeException("Stub!");
    }
    
    public static SmsMessage createFromPdu(final byte[] pdu, final String format) {
        throw new RuntimeException("Stub!");
    }
    
    public static int getTPLayerLengthForPDU(final String pdu) {
        throw new RuntimeException("Stub!");
    }
    
    public static int[] calculateLength(final CharSequence msgBody, final boolean use7bitOnly) {
        throw new RuntimeException("Stub!");
    }
    
    public static int[] calculateLength(final String messageBody, final boolean use7bitOnly) {
        throw new RuntimeException("Stub!");
    }
    
    public static SubmitPdu getSubmitPdu(final String scAddress, final String destinationAddress, final String message, final boolean statusReportRequested) {
        throw new RuntimeException("Stub!");
    }
    
    public static SubmitPdu getSubmitPdu(final String scAddress, final String destinationAddress, final short destinationPort, final byte[] data, final boolean statusReportRequested) {
        throw new RuntimeException("Stub!");
    }
    
    public String getServiceCenterAddress() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getOriginatingAddress() {
        throw new RuntimeException("Stub!");
    }
    
    public String getDisplayOriginatingAddress() {
        throw new RuntimeException("Stub!");
    }
    
    public String getMessageBody() {
        throw new RuntimeException("Stub!");
    }
    
    public MessageClass getMessageClass() {
        throw new RuntimeException("Stub!");
    }
    
    public String getDisplayMessageBody() {
        throw new RuntimeException("Stub!");
    }
    
    public String getPseudoSubject() {
        throw new RuntimeException("Stub!");
    }
    
    public long getTimestampMillis() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isEmail() {
        throw new RuntimeException("Stub!");
    }
    
    public String getEmailBody() {
        throw new RuntimeException("Stub!");
    }
    
    public String getEmailFrom() {
        throw new RuntimeException("Stub!");
    }
    
    public int getProtocolIdentifier() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isReplace() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isCphsMwiMessage() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isMWIClearMessage() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isMWISetMessage() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isMwiDontStore() {
        throw new RuntimeException("Stub!");
    }
    
    public byte[] getUserData() {
        throw new RuntimeException("Stub!");
    }
    
    public byte[] getPdu() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getStatusOnSim() {
        throw new RuntimeException("Stub!");
    }
    
    public int getStatusOnIcc() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getIndexOnSim() {
        throw new RuntimeException("Stub!");
    }
    
    public int getIndexOnIcc() {
        throw new RuntimeException("Stub!");
    }
    
    public int getStatus() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isStatusReportMessage() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isReplyPathPresent() {
        throw new RuntimeException("Stub!");
    }
    
    public enum MessageClass
    {
        UNKNOWN, 
        CLASS_0, 
        CLASS_1, 
        CLASS_2, 
        CLASS_3;
    }
    
    public static class SubmitPdu
    {
        public byte[] encodedMessage;
        public byte[] encodedScAddress;
        
        SubmitPdu() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }
}
