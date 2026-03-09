package android.net.vcn;

import java.util.Set;

public final class VcnCellUnderlyingNetworkTemplate extends VcnUnderlyingNetworkTemplate
{
    VcnCellUnderlyingNetworkTemplate() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<String> getOperatorPlmnIds() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<Integer> getSimSpecificCarrierIds() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRoaming() {
        throw new RuntimeException("Stub!");
    }
    
    public int getOpportunistic() {
        throw new RuntimeException("Stub!");
    }
    
    public int getCbs() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDun() {
        throw new RuntimeException("Stub!");
    }
    
    public int getIms() {
        throw new RuntimeException("Stub!");
    }
    
    public int getInternet() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMms() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRcs() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMetered(final int matchCriteria) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setOperatorPlmnIds(@NonNull final Set<String> operatorPlmnIds) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSimSpecificCarrierIds(@NonNull final Set<Integer> simSpecificCarrierIds) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setRoaming(final int matchCriteria) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setOpportunistic(final int matchCriteria) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMinUpstreamBandwidthKbps(final int minEntryUpstreamBandwidthKbps, final int minExitUpstreamBandwidthKbps) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMinDownstreamBandwidthKbps(final int minEntryDownstreamBandwidthKbps, final int minExitDownstreamBandwidthKbps) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setCbs(final int matchCriteria) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDun(final int matchCriteria) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setIms(final int matchCriteria) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setInternet(final int matchCriteria) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMms(final int matchCriteria) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setRcs(final int matchCriteria) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public VcnCellUnderlyingNetworkTemplate build() {
            throw new RuntimeException("Stub!");
        }
    }
}
