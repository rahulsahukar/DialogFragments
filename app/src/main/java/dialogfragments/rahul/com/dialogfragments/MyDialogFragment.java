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
 */public class MyDialogFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage("Is this a message?").setPositiveButton("YES", new DialogInterface.OnClickListener(){

            public void onClick(DialogInterface dialog, int id) {
                Toast.makeText(getActivity(),"Yes",Toast.LENGTH_LONG).show();
            }
        }).setNegativeButton("NO", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                Toast.makeText(getActivity(), "No", Toast.LENGTH_LONG).show();
            }
        });

        Dialog d = builder.create();
        d.getWindow().getAttributes().windowAnimations = R.style.dialog_animation_fade;
        d.getWindow().setGravity(Gravity.BOTTOM);
        return d;
    }
}
