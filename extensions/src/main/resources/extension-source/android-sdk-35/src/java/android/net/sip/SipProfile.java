package android.net.sip;

import java.text.ParseException;
import android.os.Parcel;
import java.io.Serializable;
import android.os.Parcelable;

@Deprecated
public class SipProfile implements Parcelable, Serializable, Cloneable
{
    @Deprecated
    public static final Creator<SipProfile> CREATOR;
    
    SipProfile() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void writeToParcel(final Parcel out, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String getUriString() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String getDisplayName() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String getUserName() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String getAuthUserName() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String getPassword() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String getSipDomain() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getPort() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String getProtocol() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String getProxyAddress() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String getProfileName() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean getSendKeepAlive() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean getAutoRegistration() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setCallingUid(final int uid) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    @Deprecated
    public static class Builder
    {
        @Deprecated
        public Builder(final SipProfile profile) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public Builder(final String uriString) throws ParseException {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public Builder(final String username, final String serverDomain) throws ParseException {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public Builder setAuthUserName(final String name) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public Builder setProfileName(final String name) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public Builder setPassword(final String password) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public Builder setPort(final int port) throws IllegalArgumentException {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public Builder setProtocol(final String protocol) throws IllegalArgumentException {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public Builder setOutboundProxy(final String outboundProxy) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public Builder setDisplayName(final String displayName) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public Builder setSendKeepAlive(final boolean flag) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public Builder setAutoRegistration(final boolean flag) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public SipProfile build() {
            throw new RuntimeException("Stub!");
        }
    }
}
