package lat.ppam.IFCafe;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import IFCafe.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginButton = findViewById(R.id.login_button);
        loginButton.setOnClickListener(view -> login());
    }

    public void login() {
        //Ambil nilai inputan
        TextView usernameTV = findViewById(R.id.username_text);
        TextView passwordTV = findViewById(R.id.password_text);

        String username = usernameTV.getText().toString();
        String password = passwordTV.getText().toString();

        Log.d("print", "Username = " + username + " dan Password = " + password);
        Log.d("print", String.valueOf(username.equals("imamfirdaus")));
        Log.d("print", String.valueOf(password.equals("1197050051")));
        //Cek apakah username dan password benar
        if (username.equals("imamfirdaus") && password.equals("1197050051")) {
            Log.d("success", "Login berhasil");
            //Jika iya pindah activity
            //Menggunakan Explicit Intent
            Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
            startActivity(intent);
            this.finish();
        }  else {
            Log.d("failed", "Login Gagal");
            //Jika tidak tampilkan pesan error
            Toast toast = Toast.makeText(getApplicationContext(), "Username atau Password salah", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}