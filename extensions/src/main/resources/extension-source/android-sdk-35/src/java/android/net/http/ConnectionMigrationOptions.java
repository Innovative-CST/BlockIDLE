package android.net.http;

public class ConnectionMigrationOptions
{
    public static final int MIGRATION_OPTION_DISABLED = 2;
    public static final int MIGRATION_OPTION_ENABLED = 1;
    public static final int MIGRATION_OPTION_UNSPECIFIED = 0;
    
    ConnectionMigrationOptions() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDefaultNetworkMigration() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPathDegradationMigration() {
        throw new RuntimeException("Stub!");
    }
    
    public int getAllowNonDefaultNetworkUsage() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDefaultNetworkMigration(final int state) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPathDegradationMigration(final int state) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAllowNonDefaultNetworkUsage(final int state) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public ConnectionMigrationOptions build() {
            throw new RuntimeException("Stub!");
        }
    }
}
