package android.adservices.ondevicepersonalization;

import android.os.OutcomeReceiver;

public interface IsolatedWorker
{
    default void onExecute(@NonNull final ExecuteInput input, @NonNull final OutcomeReceiver<ExecuteOutput, IsolatedServiceException> receiver) {
        throw new RuntimeException("Stub!");
    }
    
    default void onDownloadCompleted(@NonNull final DownloadCompletedInput input, @NonNull final OutcomeReceiver<DownloadCompletedOutput, IsolatedServiceException> receiver) {
        throw new RuntimeException("Stub!");
    }
    
    default void onRender(@NonNull final RenderInput input, @NonNull final OutcomeReceiver<RenderOutput, IsolatedServiceException> receiver) {
        throw new RuntimeException("Stub!");
    }
    
    default void onEvent(@NonNull final EventInput input, @NonNull final OutcomeReceiver<EventOutput, IsolatedServiceException> receiver) {
        throw new RuntimeException("Stub!");
    }
    
    default void onTrainingExamples(@NonNull final TrainingExamplesInput input, @NonNull final OutcomeReceiver<TrainingExamplesOutput, IsolatedServiceException> receiver) {
        throw new RuntimeException("Stub!");
    }
    
    default void onWebTrigger(@NonNull final WebTriggerInput input, @NonNull final OutcomeReceiver<WebTriggerOutput, IsolatedServiceException> receiver) {
        throw new RuntimeException("Stub!");
    }
}
