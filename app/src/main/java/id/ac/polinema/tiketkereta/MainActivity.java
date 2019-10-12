package id.ac.polinema.tiketkereta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import id.ac.polinema.tiketkereta.R;
import id.ac.polinema.tiketkereta.fragment.Pemesanan;

public class MainActivity extends AppCompatActivity implements Pemesanan.OnFragmentInteractionListener{
    private Pemesanan pemesanan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pemesanan = new Pemesanan();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frameout, pemesanan)
                .commit();

    }

    @Override
    public void onSubmitClicked(int total) {

    }
}
