package com.fives.nativeandroidapp;
import io.flutter.embedding.android.FlutterActivity;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button switch_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switch_button=findViewById(R.id.switch_button);


        switch_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                startActivity(
                        FlutterActivity.createDefaultIntent(MainActivity
                                .this)
                );
            }
        });
    }
}