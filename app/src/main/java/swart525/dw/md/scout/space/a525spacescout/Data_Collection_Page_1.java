package swart525.dw.md.scout.space.a525spacescout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
import android.widget.ToggleButton;


public class Data_Collection_Page_1 extends AppCompatActivity {

    //Defines Variables for Match/Team Number
    public static int GenTeamNum = 0;
    public static String GenOtherResponse = "NA";
    public static String GenStageYes = "False";
    public static String GenStageNo = "False";
    public static String GenTank = "False";
    public static String GenSwerve = "False";
    public static String GenOther = "False";
    public static String GenSource = "False";
    public static String GenGround = "False";
    public static String GenDefenseYes = "False";
    public static String GenDefenseNo = "False";
    public static String GenAprilTagYes = "False";
    public static String GenAprilTagNo = "False";
    // public static String GenCanDock = "False";
    //  public static String GenCanEngage = "False";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data__collection__page_1);

        //Sets up comparison numbers
        final int CompareTeamNum = 1; //Team must be greater than 1

        //final EditText Match_Num_txt = (EditText) findViewById(R.id.Match_Num_Txt);
        final EditText GenTeamNumTXT = (EditText) findViewById(R.id.Gen_TeamNum_TXT);
        //final EditText Initials_txt = (EditText) findViewById(R.id.Init_Txt);
        final EditText GenOtherTXT = (EditText) findViewById(R.id.Gen_Other_TXT);
        //Defines all Checkboxes
        final RadioButton GenStageYesRB = (RadioButton) findViewById(R.id.Gen_StageYes_RB);
        final RadioButton GenStageNoRB = (RadioButton) findViewById(R.id.Gen_StageNo_RB);

        final RadioButton GenTankRB = (RadioButton) findViewById(R.id.Gen_Tank_RB);
        final RadioButton GenSwerveRB = (RadioButton) findViewById(R.id.Gen_Swerve_RB);
        final RadioButton GenOtherRB = (RadioButton) findViewById(R.id.Gen_Other_RB);

        final CheckBox GenSourceCB = (CheckBox) findViewById(R.id.Gen_Source_CB);
        final CheckBox GenGroundCB = (CheckBox) findViewById(R.id.Gen_Ground_CB);

        final RadioButton GenDefenseYesRB = (RadioButton) findViewById(R.id.Gen_DefenseYes_RB);
        final RadioButton GenDefenseNoRB = (RadioButton) findViewById(R.id.Gen_DefenseNo_RB);

        final RadioButton GenAprilTagYesRB = (RadioButton) findViewById(R.id.Gen_AprilTagYes_RB);
        final RadioButton GenAprilTagNoRB = (RadioButton) findViewById(R.id.Gen_AprilTagNo_RB);


        //final CheckBox GenCanDockCB = (CheckBox) findViewById(R.id.Gen_CanDock_CB);
        //final CheckBox GenCanEngageCB = ((CheckBox) findViewById(R.id.Gen_CanEngage_CB);

        //Defines all buttons for locations

        //  final Button RedOtherCB = (Button) findViewById(R.id.Red_Other_B);

        //  final Button BlueOtherCB = (Button) findViewById(R.id.Blue_Other_CB);

        //Clicking Buttons while on page 1

        //Button Red1CB = findViewById(R.id.Red1_B);
        //Toggle the colors of the button when it is touched


        //Defines button needed and actions to cancel a data collection
        Button Cancel_Collection = (Button) findViewById(R.id.Cancel_Collection_B);
        Cancel_Collection.setOnClickListener(new View.OnClickListener() { //Makes onclick listener for button
            @Override
            public void onClick(View v) {
                Intent startintent = new Intent(getApplicationContext(), Start_Page.class);
                startActivity(startintent);
            }
        });
        //Defines Start button and takes to next page as well as recording data
        Button Start_Collection = (Button) findViewById(R.id.Start_Collection);
        Start_Collection.setOnClickListener(new View.OnClickListener() { //Makes onclick listener for button
            @Override
            public void onClick(View v) {
                if (GenTeamNumTXT.getText().toString().isEmpty()) {
                    Toast.makeText(Data_Collection_Page_1.this, "Cannot Continue. Please Enter Team Number!", Toast.LENGTH_LONG).show();
                } else {
                    int Team_Num_Real = Integer.parseInt(GenTeamNumTXT.getText().toString());
                    if (CompareTeamNum < Team_Num_Real) {
                        GenTeamNum = Integer.parseInt(GenTeamNumTXT.getText().toString()); //Sets team num data to txt box information

                        Intent startintent = new Intent(getApplicationContext(), data_Collection_sandstorm.class);
                        startActivity(startintent);
                    } else {
                        Toast.makeText(Data_Collection_Page_1.this, "Did you make a mistake? Please make sure Team Number and Match Number aren't flipped.", Toast.LENGTH_LONG).show();
                    }
                }

                //Collect text input
                GenOtherResponse = GenOtherTXT.getText().toString();
                Intent startintent = new Intent(getApplicationContext(), data_Collection_sandstorm.class);
                startActivity(startintent);


                if (GenStageYesRB.isChecked()) {
                    GenStageYes = "True";
                }
                if (GenStageNoRB.isChecked()) {
                    GenStageYes = "True";
                }

                if (GenTankRB.isChecked()) {
                    GenTank = "True";

                }
                if (GenSwerveRB.isChecked()) {
                    GenSwerve = "True";
                }
                if (GenOtherRB.isChecked()) {
                    GenOther = "True";
                }

                if (GenSourceCB.isChecked()) {
                    GenSource = "True";
                }
                if (GenGroundCB.isChecked()) {
                    GenGround = "True";
                }

                if (GenDefenseYesRB.isChecked()) {
                    GenDefenseYes = "True";
                }
                if (GenDefenseNoRB.isChecked()) {
                    GenDefenseNo = "True";
                }

                if (GenAprilTagYesRB.isChecked()) {
                    GenAprilTagYes = "True";
                }
                if (GenAprilTagNoRB.isChecked()) {
                    GenAprilTagNo = "True";
                }

                //if (GenCanDockCB.isChecked()) {
                //    GenCanDock = "True";
                //}
                //if (GenCanEngageCB.isChecked()) {
                //    GenCanEngage = "True";
                //}
            }
        });
    }

}