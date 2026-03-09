package android.service.quickaccesswallet;

public interface GetWalletCardsCallback
{
    void onSuccess(@NonNull final GetWalletCardsResponse p0);
    
    void onFailure(@NonNull final GetWalletCardsError p0);
}
