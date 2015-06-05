package au.com.market24seven.myapplicationportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button media_streamer = (Button) findViewById(R.id.media_streamer);
        Button super_duo1 = (Button) findViewById(R.id.super_duo1);
        Button super_duo2 = (Button) findViewById(R.id.super_duo2);
        Button ant_terminator = (Button) findViewById(R.id.ant_terminator);
        Button materialize = (Button) findViewById(R.id.materialize);
        Button capstone = (Button) findViewById(R.id.capstone);

        media_streamer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Toast.makeText(getApplicationContext(),
                        "This button will launch SPOTIFY streamer", Toast.LENGTH_LONG).show();
            }
        });

        super_duo1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Toast.makeText(getApplicationContext(),
                        "This button will launch scores app", Toast.LENGTH_LONG).show();
            }
        });

        super_duo2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Toast.makeText(getApplicationContext(),
                        "This button will launch library app", Toast.LENGTH_LONG).show();
            }
        });

        ant_terminator.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Toast.makeText(getApplicationContext(),
                        "This button will launch build it bigger app", Toast.LENGTH_LONG).show();
            }
        });

        materialize.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Toast.makeText(getApplicationContext(),
                        "This button will launch bacon reader app", Toast.LENGTH_LONG).show();
            }
        });

        capstone.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Toast.makeText(getApplicationContext(),
                        "This button will launch my capstone app", Toast.LENGTH_LONG).show();
            }
        });









    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
