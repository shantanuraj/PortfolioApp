package io.sixth.udacity.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button spotifyButton;
    private Button scoresButton;
    private Button libraryButton;
    private Button biggerButton;
    private Button xyzButton;
    private Button capstoneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        spotifyButton = (Button) findViewById(R.id.button_spotify);
        scoresButton = (Button) findViewById(R.id.button_scores);
        libraryButton = (Button) findViewById(R.id.button_library);
        biggerButton = (Button) findViewById(R.id.button_bigger);
        xyzButton = (Button) findViewById(R.id.button_xyz);
        capstoneButton = (Button) findViewById(R.id.button_capstone);

        setButtons();
    }

    @Override
    public void onClick(View v) {
        Button button = (Button) v;
        Toast.makeText(this,
                getString(R.string.launch) + " " + button.getText(),
                Toast.LENGTH_SHORT).show();
    }

    private void setButtons() {
        spotifyButton.setOnClickListener(this);
        scoresButton.setOnClickListener(this);
        libraryButton.setOnClickListener(this);
        biggerButton.setOnClickListener(this);
        xyzButton.setOnClickListener(this);
        capstoneButton.setOnClickListener(this);
    }
}
