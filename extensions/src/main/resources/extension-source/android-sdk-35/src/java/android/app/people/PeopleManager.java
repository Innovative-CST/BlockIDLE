package android.app.people;

import java.util.List;

public final class PeopleManager
{
    PeopleManager() {
        throw new RuntimeException("Stub!");
    }
    
    public void addOrUpdateStatus(@NonNull final String conversationId, @NonNull final ConversationStatus status) {
        throw new RuntimeException("Stub!");
    }
    
    public void clearStatus(@NonNull final String conversationId, @NonNull final String statusId) {
        throw new RuntimeException("Stub!");
    }
    
    public void clearStatuses(@NonNull final String conversationId) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<ConversationStatus> getStatuses(@NonNull final String conversationId) {
        throw new RuntimeException("Stub!");
    }
}
