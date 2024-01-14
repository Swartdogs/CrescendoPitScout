package swart525.dw.md.scout.space.a525spacescout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class data_collection_TeleOP extends AppCompatActivity {

    //Defines variables for data collection
    //EX: public static String TeleTopCubes = "False";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_collection__tele_op);

        //Defines all checkboxes;
        //EX: final CheckBox TeleTopCubesCB = (CheckBox) findViewById(R.id.Tele_TopCubes_CB);


        //Defines all buttons
        //EX: final Button AutopitCommunityLocation1B = (Button) findViewById(R.id.Autopit_CommunityLocation1_B);

        //Defines all text boxes
        //EX: final EditText CargoStrategytxt = (EditText) findViewById(R.id.Cargo_Strategy_txt);


        //Below defines the button and commands for saving data and switching pages
        final Button To_EndGame = (Button) findViewById(R.id.To_Engame_B);
        To_EndGame.setOnClickListener(new View.OnClickListener()
        { //Makes onclick listener for button
            @Override
           public void onClick(View v) {

               // if (TeleTopCubesCB.isChecked()) {
               //   TeleTopCubes = "True";
                //   }


                    Intent startintent = new Intent(getApplicationContext(), data_collection_end_game.class);
                    startActivity(startintent);
                }

        });

    }
}
