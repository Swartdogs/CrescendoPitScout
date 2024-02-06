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
    public static String EndCosistentHangNo = "False";
    public static String EndSoloHang = "False";
    public static String EndHarmonyHang = "False";
    public static String EndScoreTrapYes = "False";
    public static String EndScoreTrapNo = "False";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_collection_end_game);

        //Defines Page Elements
        final RadioButton EndHarmonyHangRB = (RadioButton) findViewById(R.id.End_YesHarmony_RB);
        final RadioButton EndSoloHangRB = (RadioButton) findViewById(R.id.End_YesSolo_RB);
        final RadioButton EndConsistentHangNoRB = (RadioButton) findViewById(R.id.End_ConsistentHangNo_RB);
        final RadioButton EndScoreTrapYesRB = (RadioButton) findViewById(R.id.End_ScoreTrapYes_RB);
        final RadioButton EndScoreTrapNoRB = (RadioButton) findViewById(R.id.End_ScoreTrapNo_RB);


        Button To_Submission = (Button) findViewById(R.id.To_Submission_B); //Defines button for later use
        To_Submission.setOnClickListener(new View.OnClickListener() { //Makes onclick listener for button
            @Override
            public void onClick(View v) {

                //EndConsistentHangYesRB.setOnCheckedChangeListener(EndHarmonyHangCB.setEnabled(true));
               //EndConsistentHangYesRB.setOnCheckedChangeListener(EndSoloHangCB.setEnabled(true));

               //EndConsistentHangYesRB.setOnClickListener(new View.OnClickListener() {
                    //@Override
                   // public void onClick(View view) {
                      //  EndSoloHangCB.setVisibility(View.VISIBLE);
                      //  EndHarmonyHangCB.setVisibility(View.VISIBLE);
                  //  }
               // });

                //EndSoloHangCB.setVisibility(View.VISIBLE);
                //EndHarmonyHangCB.setVisibility(View.VISIBLE);

               // EndConsistentHangNoRB.setOnCheckedChangeListener(EndHarmonyHangCB.setEnabled(false));
               // EndConsistentHangNoRB.setOnCheckedChangeListener(EndSoloHangCB.setEnabled(false));

                //EndSoloHangCB.setVisibility(View.INVISIBLE);
                //EndHarmonyHangCB.setVisibility(View.INVISIBLE);
                  //  EndConsistentHangYes = "True";
                //}
                if (EndConsistentHangNoRB.isChecked()) {
                    EndCosistentHangNo = "True";
                }
                if (EndHarmonyHangRB.isChecked()) {
                    EndHarmonyHang = "True";
                }
                if (EndSoloHangRB.isChecked()) {
                    EndSoloHang = "True";
                }
                if (EndScoreTrapYesRB.isChecked()) {
                    EndScoreTrapYes = "True";
                }
                if (EndScoreTrapNoRB.isChecked()) {
                    EndScoreTrapNo = "True";
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


