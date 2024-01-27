package swart525.dw.md.scout.space.a525spacescout;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Actual_Submit extends AppCompatActivity {

    //Names the file it will be saved to
    public String fileName = "Pit_Scouting_Data.CSV";
    public String filePath = "/ScoutData/";

    //This is debugging
    //final View txtDebug =(View)findViewById(R.id.TextViewDebug)

    //Compiles string for CSV file
    public String Final_String =
            Data_Collection_Page_1.GenTeamNum + "," +
            Data_Collection_Page_1.GenOtherResponse + "," +
            Data_Collection_Page_1.GenStageYes + "," +
            Data_Collection_Page_1.GenStageNo + "," +
            Data_Collection_Page_1.GenTank + "," +
            Data_Collection_Page_1.GenSwerve + "," +
            Data_Collection_Page_1.GenOther + "," +
            Data_Collection_Page_1.GenSource + "," +
            Data_Collection_Page_1.GenGround + "," +
            Data_Collection_Page_1.GenDefenseYes + "," +
            Data_Collection_Page_1.GenDefenseNo + "," +
            Data_Collection_Page_1.GenAprilTagYes + "," +
            Data_Collection_Page_1.GenAprilTagNo + "," +
            data_Collection_sandstorm.AutoNoteStartNum + "," +
            data_Collection_sandstorm.AutoScoreSpeaker + "," +
            data_Collection_sandstorm.AutoScoreAmp + "," +
            data_Collection_sandstorm.TeleopScoreSpeaker + "," +
            data_Collection_sandstorm.TeleopScoreAmp + "," +
            data_Collection_sandstorm.TeleopCoopertitionYes + "," +
            data_Collection_sandstorm.TeleopCoopertitionNo + "," +
            data_Collection_sandstorm.TeleopCoopertitionDepends + "," +
            data_Collection_sandstorm.TeleopHumanPlayerPreferenceYes + "," +
            data_Collection_sandstorm.TeleopHumanPlayerPreferenceNo + "," +
            data_Collection_sandstorm.TeleopHumanPlayerAmpPreference + "," +
            data_Collection_sandstorm.TeleopHumanPlayerSourcePreference + "," +
            data_collection_end_game.EndConsistentHangYes + "," +
            data_collection_end_game.EndCosistentHangNo + "," +
            Save_Page.comment;

    File externalStorageDir = Environment.getExternalStorageDirectory();
    public File Scout_Data = new File(externalStorageDir , "/DCIM/" + fileName);

    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actual__submit);
        Button Press_Here = (Button) findViewById(R.id.Press_Here);
        Button Click_to_go_Back = (Button) findViewById(R.id.Backto);

        Click_to_go_Back.setOnClickListener(new View.OnClickListener(){//Makes onclick listener for button
            @Override
            public void onClick(View v) {
                Intent startintent = new Intent(getApplicationContext(), Start_Page.class);
                startActivity(startintent);
            }
        });
    } */


    //Checks for confirmation from external storage
        private boolean isExternalStorageWritable () {
            if (Environment.MEDIA_MOUNTED.equals(Environment.getExternalStorageState())) {
                Log.i("State", "Yes, it is writable!");
                return true;
            } else {
                return false;
            }
        }

        public void Press_Here (View v){
            Toast.makeText(this, "Start", Toast.LENGTH_LONG).show();
            //txtDebug.setTe("test")
            if (isExternalStorageWritable() && checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE)) {
                Toast.makeText(this, "First If", Toast.LENGTH_LONG).show();
                if(Scout_Data.exists() && Scout_Data.isFile() ){
                    try {
                        final Button Press_Here = (Button) findViewById(R.id.Press_Here_B);
                        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(Scout_Data, true)));
                        out.println(Final_String);
                        out.close();
                        Toast.makeText(this, "File Saved", Toast.LENGTH_LONG).show();
                        Press_Here.setVisibility(View.GONE);
                        Intent startintent = new Intent(getApplicationContext(), Start_Page.class);
                        startActivity(startintent);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else {
                    File textFile = new File(Environment.getExternalStorageDirectory().getPath() + "/DCIM", fileName);
                    try {
                        final Button Press_Here = (Button) findViewById(R.id.Press_Here_B);
                        FileOutputStream fos = new FileOutputStream(textFile);
                        Final_String = Final_String + "\n";
                        fos.write(Final_String.getBytes());
                        fos.close();
                        Toast.makeText(this, "File Saved", Toast.LENGTH_LONG).show();
                        Press_Here.setVisibility(View.GONE);
                        Intent startintent = new Intent(getApplicationContext(), Start_Page.class);
                        startActivity(startintent);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            Toast.makeText(this, "No permissions", Toast.LENGTH_LONG).show();
        }

    public boolean checkPermission (String permission) {
        int check = ContextCompat.checkSelfPermission(this, permission);
        return (check == PackageManager.PERMISSION_GRANTED);
    }

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_actual__submit);
            final Button Press_Here = (Button) findViewById(R.id.Press_Here_B);
            Press_Here.setVisibility(View.VISIBLE);

    }
}










