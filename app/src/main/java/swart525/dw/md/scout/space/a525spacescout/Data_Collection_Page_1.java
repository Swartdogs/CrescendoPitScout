package swart525.dw.md.scout.space.a525spacescout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ToggleButton;


public class Data_Collection_Page_1 extends AppCompatActivity {

    //Defines Variables for Match/Team Number
    public static int GenTeamNum = 0;
    public static String GenCubes = "False";
    public static String GenCones = "False";
    public static String GenSubstation = "False";
    public static String GenGround = "False";
    public static String GenSideways = "False";
    public static String GenRightSideUp = "False";
   // public static String GenCanDock = "False";
  //  public static String GenCanEngage = "False";

    public static String GenBlueZone1 = "False";
    public static String GenBlueZone2 = "False";
    public static String GenBlueZone3 = "False";
    public static String GenBlueZone4 = "False";
    public static String GenRedZone1 = "False";
    public static String GenRedZone2 = "False";
    public static String GenRedZone3 = "False";
    public static String GenRedZone4 = "False";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data__collection__page_1);

        //Sets up comparison numbers
        final int CompareTeamNum = 1; //Team must be greater than 1

        //final EditText Match_Num_txt = (EditText) findViewById(R.id.Match_Num_Txt);
        final EditText GenTeamNumTXT = (EditText) findViewById(R.id.Gen_TeamNum_TXT);
        //final EditText Initials_txt = (EditText) findViewById(R.id.Init_Txt);

        //Defines all Checkboxes
        final CheckBox GenCubesCB = (CheckBox) findViewById(R.id.Gen_Cubes_CB);
        final CheckBox GenConesCB = (CheckBox) findViewById(R.id.Gen_Cones_CB);

        final CheckBox GenSubstationCB = (CheckBox) findViewById(R.id.Gen_Substation_CB);
        final CheckBox GenGroundCB = (CheckBox) findViewById(R.id.Gen_Ground_CB);
        final CheckBox GenSidewaysCB = (CheckBox) findViewById(R.id.Gen_Sideways_CB);
        final CheckBox GenRightSideUpCB = (CheckBox) findViewById(R.id.Gen_RightSideUp_CB);

        //final CheckBox GenCanDockCB = (CheckBox) findViewById(R.id.Gen_CanDock_CB);
        //final CheckBox GenCanEngageCB = ((CheckBox) findViewById(R.id.Gen_CanEngage_CB);

        //Defines all buttons for locations
        final ToggleButton GenBlueZone1TB = (ToggleButton) findViewById(R.id.Gen_BlueZone1_TB);
        final ToggleButton GenBlueZone2TB = (ToggleButton) findViewById(R.id.Gen_BlueZone2_TB);
        final ToggleButton GenBlueZone3TB = (ToggleButton) findViewById(R.id.Gen_BlueZone3_TB);
        final ToggleButton GenBlueZone4TB = (ToggleButton) findViewById(R.id.Gen_BlueZone4_TB);
        final ToggleButton GenRedZone1TB = (ToggleButton) findViewById(R.id.Gen_RedZone1_TB);
        final ToggleButton GenRedZone2TB = (ToggleButton) findViewById(R.id.Gen_RedZone2_TB);
        final ToggleButton GenRedZone3TB = (ToggleButton) findViewById(R.id.Gen_RedZone3_TB);
        final ToggleButton GenRedZone4TB = (ToggleButton) findViewById(R.id.Gen_RedZone4_TB);
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
                if(GenTeamNumTXT.getText().toString().isEmpty()) {
                    Toast.makeText(Data_Collection_Page_1.this, "Cannot Continue. Please Enter Team Number!", Toast.LENGTH_LONG).show();
                }
                else
                {int Team_Num_Real = Integer.parseInt(GenTeamNumTXT.getText().toString());
                        if(CompareTeamNum < Team_Num_Real) {
                            GenTeamNum = Integer.parseInt(GenTeamNumTXT.getText().toString()); //Sets team num data to txt box information

                            Intent startintent = new Intent(getApplicationContext(), data_Collection_sandstorm.class);
                            startActivity(startintent);
                            }
                        else {
                            Toast.makeText(Data_Collection_Page_1.this, "Did you make a mistake? Please make sure Team Number and Match Number aren't flipped.", Toast.LENGTH_LONG).show();
                        }
                    }
                if (GenCubesCB.isChecked()) {
                    GenCubes = "True";
                }
                if (GenConesCB.isChecked()) {
                    GenCones = "True";
                }
                if (GenSubstationCB.isChecked()) {
                    GenSubstation = "True";
                }
                if (GenGroundCB.isChecked()) {
                    GenGround = "True";
                }
                if (GenSidewaysCB.isChecked()) {
                    GenSideways = "True";
                }
                if (GenRightSideUpCB.isChecked()) {
                    GenRightSideUp = "True";
                }
                //if (GenCanDockCB.isChecked()) {
                //    GenCanDock = "True";
                //}
                //if (GenCanEngageCB.isChecked()) {
                //    GenCanEngage = "True";
                //}
            }
        });
        GenBlueZone1TB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (GenBlueZone1TB.isChecked()) {
                    GenBlueZone1TB.setBackgroundResource(R.color.button_yes_blue);
                    GenBlueZone1TB.setText("YES");
                    GenBlueZone1 = "True";
                }
                else {
                    GenBlueZone1TB.setBackgroundResource(R.color.button_no);
                    GenBlueZone1TB.setText("NO");
                    GenBlueZone1 = "False";
                }
            }
        });

        GenBlueZone2TB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (GenBlueZone2TB.isChecked()) {
                    GenBlueZone2TB.setBackgroundResource(R.color.button_yes_blue);
                    GenBlueZone2TB.setText("YES");
                    GenBlueZone2 = "True";
                }
                else {
                    GenBlueZone2TB.setBackgroundResource(R.color.button_no);
                    GenBlueZone2TB.setText("NO");
                    GenBlueZone2 = "False";
                }
            }
        });

        GenBlueZone3TB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (GenBlueZone3TB.isChecked()) {
                    GenBlueZone3TB.setBackgroundResource(R.color.button_yes_blue);
                    GenBlueZone3TB.setText("YES");
                    GenBlueZone3 = "True";
                }
                else {
                    GenBlueZone3TB.setBackgroundResource(R.color.button_no);
                    GenBlueZone3TB.setText("NO");
                    GenBlueZone3 = "False";
                }
            }
        });

        GenBlueZone4TB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (GenBlueZone4TB.isChecked()) {
                    GenBlueZone4TB.setBackgroundResource(R.color.button_yes_blue);
                    GenBlueZone4TB.setText("YES");
                    GenBlueZone4 = "True";
                }
                else {
                    GenBlueZone4TB.setBackgroundResource(R.color.button_no);
                    GenBlueZone4TB.setText("NO");
                    GenBlueZone4 = "False";
                }
            }
        });

        GenRedZone1TB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (GenRedZone1TB.isChecked()) {
                    GenRedZone1TB.setBackgroundResource(R.color.button_yes_red);
                    GenRedZone1TB.setText("YES");
                    GenRedZone1 = "True";
                }
                else {
                    GenRedZone1TB.setBackgroundResource(R.color.button_no);
                    GenRedZone1TB.setText("NO");
                    GenRedZone1 = "False";
                }
            }
        });

        GenRedZone2TB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (GenRedZone2TB.isChecked()) {
                    GenRedZone2TB.setBackgroundResource(R.color.button_yes_red);
                    GenRedZone2TB.setText("YES");
                    GenRedZone2 = "True";
                }
                else {
                    GenRedZone2TB.setBackgroundResource(R.color.button_no);
                    GenRedZone2TB.setText("NO");
                    GenRedZone2 = "False";
                }
            }
        });

        GenRedZone3TB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (GenRedZone3TB.isChecked()) {
                    GenRedZone3TB.setBackgroundResource(R.color.button_yes_red);
                    GenRedZone3TB.setText("YES");
                    GenRedZone3 = "True";
                }
                else {
                    GenRedZone3TB.setBackgroundResource(R.color.button_no);
                    GenRedZone3TB.setText("NO");
                    GenRedZone3 = "False";
                }
            }
        });

        GenRedZone4TB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (GenRedZone4TB.isChecked()) {
                    GenRedZone4TB.setBackgroundResource(R.color.button_yes_red);
                    GenRedZone4TB.setText("YES");
                    GenRedZone4 = "True";
                }
                else {
                    GenRedZone4TB.setBackgroundResource(R.color.button_no);
                    GenRedZone4TB.setText("NO");
                    GenRedZone4 = "False";
                }

            }
        });

}}
