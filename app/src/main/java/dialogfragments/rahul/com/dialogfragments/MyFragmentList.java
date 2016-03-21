package dialogfragments.rahul.com.dialogfragments;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

/**
 * Created by hadoop on 22/3/16.
 */public class MyFragmentList extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setItems(R.array.test_array,new DialogInterface.OnClickListener(){

            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(),getResources().getStringArray(R.array.test_array)[which], Toast.LENGTH_LONG).show();
            }
        });

        Dialog d = builder.create();
        d.getWindow().getAttributes().windowAnimations = R.style.dialog_animation_fade;
        d.getWindow().setGravity(Gravity.BOTTOM);
        return d;
    }
}
