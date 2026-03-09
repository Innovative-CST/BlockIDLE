package android.health.connect;

import android.health.connect.changelog.ChangeLogTokenResponse;
import android.health.connect.changelog.ChangeLogTokenRequest;
import android.health.connect.changelog.ChangeLogsResponse;
import android.health.connect.changelog.ChangeLogsRequest;
import java.time.Period;
import java.time.Duration;
import android.os.OutcomeReceiver;
import java.util.concurrent.Executor;
import android.health.connect.datatypes.Record;
import java.util.List;

public class HealthConnectManager
{
    public static final String ACTION_MANAGE_HEALTH_PERMISSIONS = "android.health.connect.action.MANAGE_HEALTH_PERMISSIONS";
    public static final String ACTION_REQUEST_EXERCISE_ROUTE = "android.health.connect.action.REQUEST_EXERCISE_ROUTE";
    public static final String CATEGORY_HEALTH_PERMISSIONS = "android.intent.category.HEALTH_PERMISSIONS";
    public static final String EXTRA_EXERCISE_ROUTE = "android.health.connect.extra.EXERCISE_ROUTE";
    public static final String EXTRA_SESSION_ID = "android.health.connect.extra.SESSION_ID";
    
    HealthConnectManager() {
        throw new RuntimeException("Stub!");
    }
    
    public void insertRecords(@NonNull final List<Record> records, @NonNull final Executor executor, @NonNull final OutcomeReceiver<InsertRecordsResponse, HealthConnectException> callback) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public <T> void aggregate(@NonNull final AggregateRecordsRequest<T> request, @NonNull final Executor executor, @NonNull final OutcomeReceiver<AggregateRecordsResponse<T>, HealthConnectException> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public <T> void aggregateGroupByDuration(@NonNull final AggregateRecordsRequest<T> request, @NonNull final Duration duration, @NonNull final Executor executor, @NonNull final OutcomeReceiver<List<AggregateRecordsGroupedByDurationResponse<T>>, HealthConnectException> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public <T> void aggregateGroupByPeriod(@NonNull final AggregateRecordsRequest<T> request, @NonNull final Period period, @NonNull final Executor executor, @NonNull final OutcomeReceiver<List<AggregateRecordsGroupedByPeriodResponse<T>>, HealthConnectException> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void deleteRecords(@NonNull final List<RecordIdFilter> recordIds, @NonNull final Executor executor, @NonNull final OutcomeReceiver<Void, HealthConnectException> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void deleteRecords(@NonNull final Class<? extends Record> recordType, @NonNull final TimeRangeFilter timeRangeFilter, @NonNull final Executor executor, @NonNull final OutcomeReceiver<Void, HealthConnectException> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void getChangeLogs(@NonNull final ChangeLogsRequest changeLogsRequest, @NonNull final Executor executor, @NonNull final OutcomeReceiver<ChangeLogsResponse, HealthConnectException> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void getChangeLogToken(@NonNull final ChangeLogTokenRequest request, @NonNull final Executor executor, @NonNull final OutcomeReceiver<ChangeLogTokenResponse, HealthConnectException> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public <T extends Record> void readRecords(@NonNull final ReadRecordsRequest<T> request, @NonNull final Executor executor, @NonNull final OutcomeReceiver<ReadRecordsResponse<T>, HealthConnectException> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void updateRecords(@NonNull final List<Record> records, @NonNull final Executor executor, @NonNull final OutcomeReceiver<Void, HealthConnectException> callback) {
        throw new RuntimeException("Stub!");
    }
}
