package android.adservices.ondevicepersonalization;

import java.util.List;
import java.time.Instant;

public class LogReader
{
    LogReader() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<RequestLogRecord> getRequests(@NonNull final Instant startTime, @NonNull final Instant endTime) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<EventLogRecord> getJoinedEvents(@NonNull final Instant startTime, @NonNull final Instant endTime) {
        throw new RuntimeException("Stub!");
    }
}
