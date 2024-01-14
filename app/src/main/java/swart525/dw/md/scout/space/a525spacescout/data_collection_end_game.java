package swart525.dw.md.scout.space.a525spacescout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class data_collection_end_game extends AppCompatActivity {

    //Defines needed variables
    public static String TeleEndTopCubes = "False";
    public static String TeleEndMiddleCubes = "False";
    public static String TeleEndBottomCubes = "False";
    public static String TeleEndTopCones = "False";
    public static String TeleEndMiddleCones = "False";
    public static String TeleEndBottomCones = "False";
    public static String TeleEndDefense = "False";
    public static String TeleEndDock = "False";
    public static String TeleEndEngage = "False";
    public static String TeleEndPark = "False";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_collection_end_game);

        //Defines Page Elements


        final CheckBox TeleEndTopCubesCB = (CheckBox) findViewById(R.id.TeleEnd_TopCubes_CB);
        final CheckBox TeleEndMiddleCubesCB = (CheckBox) findViewById(R.id.TeleEnd_MiddleCubes_CB);
        final CheckBox TeleEndBottomCubesCB = (CheckBox) findViewById(R.id.TeleEnd_BottomCubes_CB);
        final CheckBox TeleEndDefenceCB = (CheckBox) findViewById(R.id.TeleEnd_Defence_CB);
        final CheckBox TeleEndTopConesCB = (CheckBox) findViewById(R.id.TeleEnd_TopCones_CB);
        final CheckBox TeleEndMiddleConesCB = (CheckBox) findViewById(R.id.TeleEnd_MiddleCones_CB);
        final CheckBox TeleEndBottomConesCB = (CheckBox) findViewById(R.id.TeleEnd_BottomCones_CB);
        final CheckBox TeleEndDockCB = (CheckBox) findViewById(R.id.TeleEnd_Dock_CB);
        final CheckBox TeleEndEngageCB = (CheckBox) findViewById(R.id.TeleEnd_Engage_CB);
        final CheckBox TeleEndParkCB = (CheckBox) findViewById(R.id.TeleEnd_Park_CB);

        Button To_Submission = (Button) findViewById(R.id.To_Submission_B); //Defines button for later use
        To_Submission.setOnClickListener(new View.OnClickListener() { //Makes onclick listener for button
            @Override
            public void onClick(View v) {


                if (TeleEndTopCubesCB.isChecked()) {
                    TeleEndTopCubes = "True";
                }
                if (TeleEndMiddleCubesCB.isChecked()) {
                    TeleEndMiddleCubes = "True";
                }
                if (TeleEndBottomCubesCB.isChecked()) {
                    TeleEndBottomCubes = "True";
                }
                if (TeleEndDefenceCB.isChecked()) {
                    TeleEndDefense = "True";
                }
                if (TeleEndTopConesCB.isChecked()) {
                    TeleEndTopCones = "True";
                }
                if (TeleEndMiddleConesCB.isChecked()) {
                    TeleEndMiddleCones = "True";
                }
                if (TeleEndBottomConesCB.isChecked()) {
                    TeleEndBottomCones = "True";
                }
                if (TeleEndDockCB.isChecked()) {
                    TeleEndDock = "True";
                }
                if (TeleEndEngageCB.isChecked()) {
                    TeleEndEngage = "True";
                }
                if (TeleEndParkCB.isChecked()) {
                    TeleEndPark = "True";
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


