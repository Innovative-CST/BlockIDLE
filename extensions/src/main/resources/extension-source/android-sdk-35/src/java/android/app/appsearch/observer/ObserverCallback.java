package android.app.appsearch.observer;

public interface ObserverCallback
{
    void onSchemaChanged(@NonNull final SchemaChangeInfo p0);
    
    void onDocumentChanged(@NonNull final DocumentChangeInfo p0);
}
