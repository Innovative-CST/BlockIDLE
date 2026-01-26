package android.telephony.gsm;

@Deprecated
public class SmsMessage
{
    @Deprecated
    public static final int ENCODING_16BIT = 3;
    @Deprecated
    public static final int ENCODING_7BIT = 1;
    @Deprecated
    public static final int ENCODING_8BIT = 2;
    @Deprecated
    public static final int ENCODING_UNKNOWN = 0;
    @Deprecated
    public static final int MAX_USER_DATA_BYTES = 140;
    @Deprecated
    public static final int MAX_USER_DATA_SEPTETS = 160;
    @Deprecated
    public static final int MAX_USER_DATA_SEPTETS_WITH_HEADER = 153;
    
    @Deprecated
    public SmsMessage() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static SmsMessage createFromPdu(final byte[] pdu) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static int getTPLayerLengthForPDU(final String pdu) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static int[] calculateLength(final CharSequence messageBody, final boolean use7bitOnly) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static int[] calculateLength(final String messageBody, final boolean use7bitOnly) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static SubmitPdu getSubmitPdu(final String scAddress, final String destinationAddress, final String message, final boolean statusReportRequested) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static SubmitPdu getSubmitPdu(final String scAddress, final String destinationAddress, final short destinationPort, final byte[] data, final boolean statusReportRequested) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String getServiceCenterAddress() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String getOriginatingAddress() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String getDisplayOriginatingAddress() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String getMessageBody() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public MessageClass getMessageClass() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String getDisplayMessageBody() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String getPseudoSubject() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public long getTimestampMillis() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isEmail() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String getEmailBody() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String getEmailFrom() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getProtocolIdentifier() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isReplace() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isCphsMwiMessage() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isMWIClearMessage() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isMWISetMessage() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isMwiDontStore() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public byte[] getUserData() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public byte[] getPdu() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getStatusOnSim() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getIndexOnSim() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getStatus() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isStatusReportMessage() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isReplyPathPresent() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public enum MessageClass
    {
        @Deprecated
        UNKNOWN, 
        @Deprecated
        CLASS_0, 
        @Deprecated
        CLASS_1, 
        @Deprecated
        CLASS_2, 
        @Deprecated
        CLASS_3;
    }
    
    @Deprecated
    public static class SubmitPdu
    {
        @Deprecated
        public byte[] encodedMessage;
        @Deprecated
        public byte[] encodedScAddress;
        
        @Deprecated
        public SubmitPdu() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }
}
