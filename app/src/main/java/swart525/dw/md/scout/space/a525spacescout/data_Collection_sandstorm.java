package swart525.dw.md.scout.space.a525spacescout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;

public class data_Collection_sandstorm extends AppCompatActivity {

    //Defines variables for use
    public static String AutoStartNoteYes = "False";
    public static String AutoStartNoteNo = "False";
    public static String AutoScoreSpeaker = "False";
    public static String AutoScoreAmp = "False";
    public static String TeleopScoreSpeaker = "False";
    public static String TeleopScoreAmp = "False";
    public static String TeleopCoopertitionYes = "False";

    public static String TeleopCoopertitionNo = "False";

    public static String TeleopAmpStratNo = "False";
    public static String TeleopAmpStratYes = "False";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data__collection_sandstorm);

        //Defines all checkboxes for positions
        final CheckBox AutoScoreSpeakerCB = (CheckBox) findViewById(R.id.auto_ScoreSpeaker_CB);
        final CheckBox AutoScoreAmpCB = (CheckBox) findViewById(R.id.auto_ScoreAmp_CB);
        final CheckBox TeleopScoreSpeakerCB = (CheckBox) findViewById(R.id.teleop_ScoreSpeaker_CB);
        final CheckBox TeleopScoreAmpCB = (CheckBox) findViewById(R.id.teleop_ScoreAmp_CB);

        //Defines all radioboxes for positions
        final RadioButton AutoStartNoteYesRB = (RadioButton) findViewById(R.id.Auto_StartNoteYes_RB);
        final RadioButton AutoStartNoteNoRB = (RadioButton) findViewById(R.id.Auto_StartNoteNo_RB);
        final RadioButton TeleopCoopertitionYesRB = (RadioButton) findViewById(R.id.teleop_CoopertitionYes_RB);
        final RadioButton TeleopCoopertitionNoRB = (RadioButton) findViewById(R.id.teleop_CoopertitionNo_RB);
        final RadioButton TeleopAmpStratYesRB = (RadioButton) findViewById(R.id.teleop_AmpStratYes_RB);
        final RadioButton TeleopAmpStratNoRB = (RadioButton) findViewById(R.id.teleop_AmpStratNo_RB);


        //Defines and implements Button to continue along with variable savings
        final Button To_EndGame_B = (Button) findViewById(R.id.To_EndGame_B);

        To_EndGame_B.setOnClickListener(new View.OnClickListener()
        { //Makes onclick listener for button
            @Override
            public void onClick(View v) {

                /*add in data collection pieces from checkboxes*/
                if (AutoScoreSpeakerCB.isChecked()) {
                    AutoScoreSpeaker = "True";
                }
                if (AutoScoreAmpCB.isChecked()) {
                    AutoScoreAmp = "True";
                }
                if (TeleopScoreSpeakerCB.isChecked()) {
                    TeleopScoreSpeaker = "True";
                }
                if (TeleopScoreAmpCB.isChecked()) {
                    TeleopScoreAmp = "True";
                }
                //add in data collection pieces from radio buttons
                if (AutoStartNoteYesRB.isChecked()) {
                    AutoStartNoteYes = "True";
                }
                if (AutoStartNoteNoRB.isChecked()) {
                    AutoStartNoteNo = "True";
                }
                if (TeleopCoopertitionYesRB.isChecked()) {
                    TeleopCoopertitionYes = "True";
                }
                if (TeleopCoopertitionNoRB.isChecked()) {
                    TeleopCoopertitionNo = "True";
                }
                if (TeleopAmpStratYesRB.isChecked()) {
                    TeleopAmpStratYes = "True";
                }
                if (TeleopAmpStratNoRB.isChecked()) {
                    TeleopAmpStratNo = "True";
                }


                Intent startintent = new Intent(getApplicationContext(), data_collection_end_game.class);
                startActivity(startintent);
            }
        });

    }

};
