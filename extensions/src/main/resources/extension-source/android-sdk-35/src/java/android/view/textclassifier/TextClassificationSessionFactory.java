package android.view.textclassifier;

public interface TextClassificationSessionFactory
{
    @NonNull
    TextClassifier createTextClassificationSession(@NonNull final TextClassificationContext p0);
}
