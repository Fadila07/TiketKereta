package id.ac.polinema.tiketkereta.tampilan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import id.ac.polinema.tiketkereta.R;

public class welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    public void clicklogin(View view) {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }

    public void clickhelp(View view) {
        Intent intent = new Intent(this, Help.class);
        startActivity(intent);
    }
}
