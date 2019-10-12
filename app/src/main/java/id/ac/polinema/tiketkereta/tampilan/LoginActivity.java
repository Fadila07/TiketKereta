package id.ac.polinema.tiketkereta.tampilan;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

import id.ac.polinema.tiketkereta.R;
import id.ac.polinema.tiketkereta.fragment.Login;
import id.ac.polinema.tiketkereta.fragment.Pemesanan;

public class LoginActivity extends AppCompatActivity implements Login.OnFragmentInteractionListener{

    private Login login;
    private Pemesanan pemesanan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = new Login();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_login, login)
                .commit();
    }

    @Override
    public void onLoginClicked() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frameout, pemesanan)
                .commit();
    }
}
