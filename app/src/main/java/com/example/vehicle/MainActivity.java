package com.example.vehicle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonOne = findViewById(R.id.button2);

        final Vehicle vehicle = new Vehicle ("bmw","blue",4);

        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent (MainActivity.this,ActivityTwo.class);
                intent.putExtra(ActivityTwo.VEHICLE,vehicle);
                startActivity(intent);
            }
        });
    }



}
