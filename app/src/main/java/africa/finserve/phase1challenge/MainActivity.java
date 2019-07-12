package africa.finserve.phase1challenge;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button aboutAlc,myProfile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        aboutAlc = (Button) findViewById(R.id.about_alc);
        myProfile = (Button) findViewById(R.id.my_profile);

        aboutAlc.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // Switching to Register screen
                Intent i = new Intent(getApplicationContext(), AboutAlcActivity.class);
                startActivity(i);
            }
        });

        myProfile.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // Switching to Register screen
                Intent i = new Intent(getApplicationContext(), ProfileActivity.class);
                startActivity(i);
            }
        });

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
