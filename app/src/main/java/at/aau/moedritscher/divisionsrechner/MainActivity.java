package at.aau.moedritscher.divisionsrechner;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText eTDivd;
    EditText eTDivr;

    TextView tVOut;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eTDivd = (EditText) findViewById(R.id.eTDivd);
        eTDivr = (EditText) findViewById(R.id.eTDivr);
        tVOut = (TextView) findViewById(R.id.tVOut);


    }

    public void onClickDiv(View view){


        double divd = Double.parseDouble(eTDivd.getText().toString());
        double divr = Double.parseDouble(eTDivr.getText().toString());

        if(divr!=0){

            double out = divd/divr;
            tVOut.setText(""+out);
        }else{
            AlertDialog.Builder builder = new AlertDialog.Builder(getBaseContext());
            builder.setMessage("Divison durch 0")
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            // FIRE ZE MISSILES!
                        }
                    });

            builder.create();
        }



    }



}
