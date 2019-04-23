package com.example.confirmationdialog;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String result = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// declare String result = ""; outside of the method
        final String[] myitems = {" Easy ", " Medium ", " Hard ", " Very Hard ", " Extreme "};
        AlertDialog myDialog;

        AlertDialog.Builder myBuilder = new AlertDialog.Builder(MainActivity.this,R.style.confirmationDialogTheme);
        myBuilder.setTitle("Select difficulty level");
        myBuilder.setSingleChoiceItems(myitems, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                result = myitems[which];

            }
        });
        myBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, result, Toast.LENGTH_SHORT).show();
            }
        });
        myBuilder.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        myDialog = myBuilder.create();
        myDialog.show();


    }
}
