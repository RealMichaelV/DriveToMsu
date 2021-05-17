package edu.montclair.vasquezm15.drivetomsu; //package name
import androidx.appcompat.app.AppCompatActivity; // import app components

import android.content.Intent; // import intent
import android.net.Uri; // import uri search within the google maps
import android.os.Bundle; //import android bundle
import android.view.View; //import view
import android.widget.Button; //import button

public class gps extends AppCompatActivity implements View.OnClickListener {
    private Button msu; //assigning button to msu

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gps);

        msu = findViewById(R.id.msu); //msu is assigned to a button msu
        msu.setOnClickListener(this); //set onclicklisterner with this activity which is the gps activity
    }
    @Override
    public void onClick(View v){
        Uri MyIntentUri = Uri.parse("google.navigation:q=Montclair+State+University,+1 Normal Ave+Montclair+NJ 07036"); // uri prase within the navigation of google to search for montclair state university location
        Intent NavIntent = new Intent(Intent.ACTION_VIEW,MyIntentUri); //start the intent within this activity
        NavIntent.setPackage("com.google.android.apps.maps"); //packages of google maps
        startActivity(NavIntent); //start the activity
        finish(); //the closing of the activity
    }
}