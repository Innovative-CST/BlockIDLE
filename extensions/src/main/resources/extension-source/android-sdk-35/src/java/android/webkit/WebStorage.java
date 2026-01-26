package android.webkit;

import java.util.Map;

public class WebStorage
{
    WebStorage() {
        throw new RuntimeException("Stub!");
    }
    
    public void getOrigins(final ValueCallback<Map> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void getUsageForOrigin(final String origin, final ValueCallback<Long> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void getQuotaForOrigin(final String origin, final ValueCallback<Long> callback) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setQuotaForOrigin(final String origin, final long quota) {
        throw new RuntimeException("Stub!");
    }
    
    public void deleteOrigin(final String origin) {
        throw new RuntimeException("Stub!");
    }
    
    public void deleteAllData() {
        throw new RuntimeException("Stub!");
    }
    
    public static WebStorage getInstance() {
        throw new RuntimeException("Stub!");
    }
    
    public static class Origin
    {
        Origin() {
            throw new RuntimeException("Stub!");
        }
        
        public String getOrigin() {
            throw new RuntimeException("Stub!");
        }
        
        public long getQuota() {
            throw new RuntimeException("Stub!");
        }
        
        public long getUsage() {
            throw new RuntimeException("Stub!");
        }
    }
    
    @Deprecated
    public interface QuotaUpdater
    {
        @Deprecated
        void updateQuota(final long p0);
    }
}
