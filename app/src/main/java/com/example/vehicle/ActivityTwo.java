package com.example.vehicle;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class ActivityTwo extends AppCompatActivity {
    private TextView tv_make, tv_colour, tv_doors;
    public static final String VEHICLE = "vehicle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        tv_make = findViewById(R.id.tv_make);
        tv_colour = findViewById(R.id.tv_colour);
        tv_doors = findViewById(R.id.tv_doors);

        Vehicle vehicle = getIntent().getParcelableExtra(VEHICLE);

        tv_make.setText(vehicle.getMake());
        tv_colour.setText(vehicle.getColour());
        tv_doors.setText(String.valueOf(vehicle.getDoors()));





    }
}
