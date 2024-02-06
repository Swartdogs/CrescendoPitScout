package swart525.dw.md.scout.space.a525spacescout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class data_Collection_sandstorm extends AppCompatActivity {

    //Defines variables for use
    public static int AutoNoteStartNum = 0;
    public static String AutoScoreSpeaker = "False";
    public static String AutoScoreAmp = "False";
    public static String TeleopScoreSpeaker = "False";
    public static String TeleopScoreAmp = "False";
    public static String TeleopCoopertitionYes = "False";
    public static String TeleopCoopertitionNo = "False";
    public static String TeleopCoopertitionDepends = "False";
    public static String TeleopHumanPlayerPreferenceNo = "False";
    public static String TeleopHumanPlayerAmpPreference = "False";
    public static String TeleopHumanPlayerSourcePreference = "False";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data__collection_sandstorm);


        //final EditText Match_Num_txt = (EditText) findViewById(R.id.Match_Num_Txt);
        final EditText AutoNoteNumTXT = (EditText) findViewById(R.id.Auto_NoteNum_TXT);

        //Defines all checkboxes for positions
        final CheckBox AutoScoreSpeakerCB = (CheckBox) findViewById(R.id.auto_ScoreSpeaker_CB);
        final CheckBox AutoScoreAmpCB = (CheckBox) findViewById(R.id.auto_ScoreAmp_CB);
        final CheckBox TeleopScoreSpeakerCB = (CheckBox) findViewById(R.id.teleop_ScoreSpeaker_CB);
        final CheckBox TeleopScoreAmpCB = (CheckBox) findViewById(R.id.teleop_ScoreAmp_CB);

        //Defines all radioboxes for positions
        final RadioButton TeleopCoopertitionYesRB = (RadioButton) findViewById(R.id.teleop_CoopertitionYes_RB);
        final RadioButton TeleopCoopertitionNoRB = (RadioButton) findViewById(R.id.teleop_CoopertitionNo_RB);
        final RadioButton TeleopCoopertitionDependsRB = (RadioButton) findViewById(R.id.teleop_CoopertitionDepends_RB);
        final RadioButton TeleopHumanPlayerPreferenceNoRB = (RadioButton) findViewById(R.id.teleop_HumanNo_RB);
        final RadioButton TeleopHumanPlayerSourceCB = (RadioButton) findViewById(R.id.teleop_HumanYesAmp_RB);
        final RadioButton TeleopHumanPlayerAmpCB = (RadioButton) findViewById(R.id.teleop_HumanYesSource_RB);

        //Defines and implements Button to continue along with variable savings
        final Button To_EndGame_B = (Button) findViewById(R.id.To_EndGame_B);

        To_EndGame_B.setOnClickListener(new View.OnClickListener()
        { //Makes onclick listener for button
            @Override
            public void onClick(View v) {
                //Sets note starting amount string to inputted text
                if (AutoNoteNumTXT.getText().toString().isEmpty()) {
                    AutoNoteStartNum = 0;
                } else {
                    AutoNoteStartNum = Integer.parseInt(AutoNoteNumTXT.getText().toString());
                }
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
                if (TeleopCoopertitionYesRB.isChecked()) {
                    TeleopCoopertitionYes = "True";
                }
                if (TeleopCoopertitionNoRB.isChecked()) {
                    TeleopCoopertitionNo = "True";
                }
                if (TeleopCoopertitionDependsRB.isChecked()) {
                    TeleopCoopertitionDepends = "True";
                }
                if (TeleopHumanPlayerPreferenceNoRB.isChecked()) {
                    TeleopHumanPlayerPreferenceNo = "True";
                }
                if (TeleopHumanPlayerSourceCB.isChecked()) {
                    TeleopHumanPlayerSourcePreference = "True";
                }
                if (TeleopHumanPlayerAmpCB.isChecked()) {
                    TeleopHumanPlayerAmpPreference = "True";
                }

                Intent startintent = new Intent(getApplicationContext(), data_collection_end_game.class);
                startActivity(startintent);
            }

        });

    }

};
