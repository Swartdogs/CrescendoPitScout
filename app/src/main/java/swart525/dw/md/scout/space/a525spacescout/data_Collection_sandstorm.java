package swart525.dw.md.scout.space.a525spacescout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class data_Collection_sandstorm extends AppCompatActivity {

    //Defines variables for use
    public static String AutoEngage = "False";
    public static String AutoDock = "False";
    public static String AutoMobility = "False";
    public static String AutoTop = "False";
    public static String AutoMiddle = "False";
    public static String AutoBottom = "False";
    public static String AutoCones0 = "False";
    public static String AutoCones1 = "False";
    public static String AutoCones2 = "False";
    public static String AutoCones3 = "False";
    public static String AutoCubes0 = "False";
    public static String AutoCubes1 = "False";
    public static String AutoCubes2 = "False";
    public static String AutoCubes3 = "False";
    public static String AutoColorReliance = "False";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data__collection_sandstorm);

        //Defines all checkboxes for positions
        final CheckBox AutoCubes0CB = (CheckBox) findViewById(R.id.Auto_Cubes0_CB);
        final CheckBox AutoCones0CB = (CheckBox) findViewById(R.id.Auto_Cones0_CB);
        final CheckBox AutoMobilityCB = (CheckBox) findViewById(R.id.Auto_Mobility_CB);
        final CheckBox AutoTopCB = (CheckBox) findViewById(R.id.Auto_Top_CB);
        final CheckBox AutoMiddleCB = (CheckBox) findViewById(R.id.Auto_Middle_CB);
        final CheckBox AutoBottomCB = (CheckBox) findViewById(R.id.Auto_Bottom_CB);
        final CheckBox AutoCones1CB = (CheckBox) findViewById(R.id.Auto_Cones1_CB);
        final CheckBox AutoCones2CB = (CheckBox) findViewById(R.id.Auto_Cones2_CB);
        final CheckBox AutoCones3CB = (CheckBox) findViewById(R.id.Auto_Cones3_CB);
        final CheckBox AutoCubes1CB = (CheckBox) findViewById(R.id.Auto_Cubes1_CB);
        final CheckBox AutoCubes2CB = (CheckBox) findViewById(R.id.Auto_Cubes2_CB);
        final CheckBox AutoCubes3CB = (CheckBox) findViewById(R.id.Auto_Cubes3_CB);
        final CheckBox AutoDockCB = (CheckBox) findViewById(R.id.Auto_Dock_CB);
        final CheckBox AutoEngageCB = (CheckBox) findViewById(R.id.Auto_Engage_CB);
        final CheckBox AutoColorRelianceCB = (CheckBox) findViewById(R.id.Auto_ColorReliance_CB);

        //Defines and implements Button to continue along with variable savings
        final Button To_EndGame_B = (Button) findViewById(R.id.To_EndGame_B);

        To_EndGame_B.setOnClickListener(new View.OnClickListener()
        { //Makes onclick listener for button
            @Override
            public void onClick(View v) {

                /*add in data collection pieces from checkboxes*/
                if (AutoDockCB.isChecked()) {
                    AutoDock = "True";
                }
                if (AutoEngageCB.isChecked()) {
                    AutoEngage = "True";
                }
                if (AutoMobilityCB.isChecked()) {
                    AutoMobility = "True";
                }
                if (AutoTopCB.isChecked()) {
                    AutoTop = "True";
                }
                if (AutoMiddleCB.isChecked()) {
                    AutoMiddle = "True";
                }
                if (AutoBottomCB.isChecked()) {
                    AutoBottom = "True";
                }
                if (AutoCubes0CB.isChecked()) {
                    AutoCubes0 = "True";
                }
                if (AutoCones0CB.isChecked()) {
                    AutoCones0 = "True";
                }
                if (AutoCones1CB.isChecked()) {
                    AutoCones1 = "True";
                }
                if (AutoCones2CB.isChecked()) {
                    AutoCones2 = "True";
                }
                if (AutoCones3CB.isChecked()) {
                    AutoCones3 = "True";
                }
                if (AutoCubes1CB.isChecked()) {
                    AutoCubes1 = "True";
                }
                if (AutoCubes2CB.isChecked()) {
                    AutoCubes2 = "True";
                }
                if (AutoCubes3CB.isChecked()) {
                    AutoCubes3 = "True";
                }
                if (AutoColorRelianceCB.isChecked()) {
                    AutoColorReliance = "True";
                }

                Intent startintent = new Intent(getApplicationContext(), data_collection_end_game.class);
                startActivity(startintent);
            }
        });

    }

}
