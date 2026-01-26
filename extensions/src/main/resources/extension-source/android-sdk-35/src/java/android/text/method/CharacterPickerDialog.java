package android.text.method;

import android.os.Bundle;
import android.text.Editable;
import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.app.Dialog;

public class CharacterPickerDialog extends Dialog implements AdapterView.OnItemClickListener, View.OnClickListener
{
    public CharacterPickerDialog(final Context context, final View view, final Editable text, final String options, final boolean insert) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onItemClick(final AdapterView parent, final View view, final int position, final long id) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onClick(final View v) {
        throw new RuntimeException("Stub!");
    }
}
