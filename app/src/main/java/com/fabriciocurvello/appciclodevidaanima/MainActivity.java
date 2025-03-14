package com.fabriciocurvello.appciclodevidaanima;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "------ MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);  // Herança
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main); // Vínculo entre JAVA e XML
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Toast.makeText(this, "Executou onCreate()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "Executou onCreate()");
    } // fim do onCreate()

    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(this, "Executou onStart()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "Executou onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(this, "Executou onResume()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "Executou onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Toast.makeText(this, "Executou onPause()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "Executou onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Toast.makeText(this, "Executou onStop()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "Executou onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast.makeText(this, "Executou onDestroy()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "Executou onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Toast.makeText(this, "Executou onRestart()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "Executou onRestart()");
    }
}