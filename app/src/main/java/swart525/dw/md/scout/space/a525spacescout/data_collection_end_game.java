package swart525.dw.md.scout.space.a525spacescout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;

public class data_collection_end_game extends AppCompatActivity {

    //Defines needed variables
    public static String EndConsistentHangYes = "False";
    public static String EndCosistentHangNo = "False";
    public static String EndSoloHang = "False";
    public static String EndHarmonyHang = "False";
    public static String EndHumanPlayerPreferenceYes = "False";
    public static String EndHumanPlayerPreferenceNo = "False";
    public static String EndHumanPlayerAmpPreference = "False";
    public static String EndHumanPlayerSourcePreference = "False";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_collection_end_game);

        //Defines Page Elements
        final RadioButton EndConsistentHangYesRB = (RadioButton) findViewById(R.id.End_ConsistentHangYes_RB);
        final RadioButton EndConsistentHangNoRB = (RadioButton) findViewById(R.id.End_ConsistentHangNo_RB);
        final RadioButton EndHumanPlayerPreferenceYesRB = (RadioButton) findViewById(R.id.End_HumanPlayerPreferenceYes_RB);
        final RadioButton EndHumanPlayerPreferenceNoRB = (RadioButton) findViewById(R.id.End_HumanPlayerPreferenceNo_RB);
        final CheckBox EndSoloHangCB = (CheckBox) findViewById(R.id.End_SoloHang_CB);
        final CheckBox EndHarmonyHangCB = (CheckBox) findViewById(R.id.End_HarmonyHang_CB);
        final CheckBox EndHumanPlayerSourceCB = (CheckBox) findViewById(R.id.End_HumanPlayerSource_CB);
        final CheckBox EndHumanPlayerAmpCB = (CheckBox) findViewById(R.id.End_HumanPlayerAmp_CB);

        Button To_Submission = (Button) findViewById(R.id.To_Submission_B); //Defines button for later use
        To_Submission.setOnClickListener(new View.OnClickListener() { //Makes onclick listener for button
            @Override
            public void onClick(View v) {

                if (EndConsistentHangYesRB.isChecked()) {
                    EndConsistentHangYes = "True";
                    EndHarmonyHangCB.setEnabled(true);
                    EndSoloHangCB.setEnabled(true);
                }
                if (EndConsistentHangNoRB.isChecked()) {
                    EndCosistentHangNo = "True";
                    EndHarmonyHangCB.setEnabled(false);
                    EndSoloHangCB.setEnabled(false);
                }
                if (EndHarmonyHangCB.isChecked()) {
                    EndHarmonyHang = "True";
                }
                if (EndSoloHangCB.isChecked()) {
                    EndSoloHang = "True";
                }
                if (EndHumanPlayerPreferenceYesRB.isChecked()) {
                    EndHumanPlayerSourcePreference = "True";
                    EndHumanPlayerAmpCB.setEnabled(true);
                    EndHumanPlayerSourceCB.setEnabled(true);
                }
                if (EndHumanPlayerPreferenceNoRB.isChecked()) {
                    EndHumanPlayerPreferenceNo = "True";
                    EndHumanPlayerAmpCB.setEnabled(false);
                    EndHumanPlayerSourceCB.setEnabled(false);
                }
                if (EndHumanPlayerAmpCB.isChecked()) {
                    EndHumanPlayerAmpPreference = "True";
                }
                if (EndHumanPlayerSourceCB.isChecked()) {
                    EndHumanPlayerSourcePreference = "True";
                }

                //Ending position variables
                //Because these are radio buttons, they may need to be changed to isChecked
                //if (NoHangCB.isChecked()) {
                //    NoHang = "True";
                //}

                Intent startintent = new Intent(getApplicationContext(), Save_Page.class);
                startActivity(startintent);
            }
        });


    }

}


