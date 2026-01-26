package android.adservices.adselection;

import android.adservices.common.AdSelectionSignals;

public class AddAdSelectionOverrideRequest
{
    public AddAdSelectionOverrideRequest(@NonNull final AdSelectionConfig adSelectionConfig, @NonNull final String decisionLogicJs, @NonNull final AdSelectionSignals trustedScoringSignals, @NonNull final PerBuyerDecisionLogic perBuyerDecisionLogic) {
        throw new RuntimeException("Stub!");
    }
    
    public AddAdSelectionOverrideRequest(@NonNull final AdSelectionConfig adSelectionConfig, @NonNull final String decisionLogicJs, @NonNull final AdSelectionSignals trustedScoringSignals) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public AdSelectionConfig getAdSelectionConfig() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getDecisionLogicJs() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public AdSelectionSignals getTrustedScoringSignals() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public PerBuyerDecisionLogic getPerBuyerDecisionLogic() {
        throw new RuntimeException("Stub!");
    }
}
