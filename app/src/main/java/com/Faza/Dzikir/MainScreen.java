package com.Faza.Dzikir;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.os.Vibrator;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

@RequiresApi(api = Build.VERSION_CODES.O)
public class MainScreen extends AppCompatActivity implements View.OnClickListener{
    int numOfDzikr = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        ImageButton btnPagi = findViewById(R.id.pagi);
        btnPagi.setOnClickListener(this);

        ImageButton btnPetang = findViewById(R.id.petang);
        btnPetang.setOnClickListener(this);

        ImageButton btnSolat = findViewById(R.id.solat);
        btnSolat.setOnClickListener(this);
    }


    public void onClick(View view) {
        switch (view.getId()){

            case R.id.pagi:
                Toast.makeText(this, "This feature is not available yet...", Toast.LENGTH_SHORT).show();
//                Intent movePagi = new Intent(MainScreen.this, DzikirPagiFragment.class);
//                startActivity(movePagi);
                break;

            case R.id.petang:
                Toast.makeText(this, "This feature is not available yet...", Toast.LENGTH_SHORT).show();
//                Intent movePetang = new Intent(MainScreen.this, DzikirPetangFragment.class);
//                startActivity(movePetang);
                break;

            case R.id.solat:
                Toast.makeText(this, "This feature is not available yet...", Toast.LENGTH_SHORT).show();
//                Intent moveSolat = new Intent(MainScreen.this, DzikirSetelahSolat.class);
//                startActivity(moveSolat);
                break;
        }
    }

    public void displayNum(int num){
        TextView numDzikr = findViewById(R.id.nomDzikir);
        numDzikr.setText(String.valueOf(num));
    }

    public void tambah1(View view){
        numOfDzikr = numOfDzikr +1;
        Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);{
            v.vibrate(VibrationEffect.createOneShot(500, VibrationEffect.DEFAULT_AMPLITUDE));
        }
        displayNum(numOfDzikr);
    }

    public void resetNum(View view) {
        numOfDzikr = 0;
        displayNum(numOfDzikr);
    }


}
