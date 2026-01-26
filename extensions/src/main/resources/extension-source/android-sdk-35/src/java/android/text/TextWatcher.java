package android.text;

public interface TextWatcher extends NoCopySpan
{
    void beforeTextChanged(final CharSequence p0, final int p1, final int p2, final int p3);
    
    void onTextChanged(final CharSequence p0, final int p1, final int p2, final int p3);
    
    void afterTextChanged(final Editable p0);
}
