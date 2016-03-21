package dialogfragments.rahul.com.dialogfragments;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.widget.Toast;

/**
 * Created by hadoop on 22/3/16.
 */public class CustomFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        final LayoutInflater inflater = getActivity().getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.fragment_layout,null)).setPositiveButton("Ok", new DialogInterface.OnClickListener(){

            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(), "Nothing", Toast.LENGTH_LONG).show();
            }
        });
        Dialog d = builder.create();
        d.getWindow().getAttributes().windowAnimations = R.style.dialog_animation_fade;
        d.getWindow().setGravity(Gravity.BOTTOM);
        return d;
    }
}
