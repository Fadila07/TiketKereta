package id.ac.polinema.tiketkereta.tampilan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import id.ac.polinema.tiketkereta.R;

public class Result extends AppCompatActivity {

    private TextView totalText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        totalText = findViewById(R.id.texttotal);
        Bundle extras = getIntent().getExtras();

        if(extras != null){
            String total = extras.get("total").toString();

            totalText.setText(total);
        }
    }
}
