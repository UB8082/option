package com.example.optionmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button submit;
EditText Nama,Email,Telp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit = findViewById(R.id.btnDaftar);
        Nama = findViewById(R.id.editNama);
        Email = findViewById(R.id.editEmail);
        Telp = findViewById(R.id.editTelp);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Nama.getText().toString().equals("") && Email.getText().toString().equals("") && Telp.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Data Harus Diisi", Toast.LENGTH_SHORT).show();
                }
                else if(Nama.getText().toString().equals("") && Email.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Nama dan Email Harus Diisi", Toast.LENGTH_SHORT).show();
                }
                else if(Nama.getText().toString().equals("") && Telp.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Nama dan Nomor Telepon Harus Diisi", Toast.LENGTH_SHORT).show();
                }
                else if(Email.getText().toString().equals("") && Telp.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Email dan Nomor Telepon Harus Diisi", Toast.LENGTH_SHORT).show();
                }
                else if(Nama.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Nama Harus Diisi", Toast.LENGTH_SHORT).show();
                }
                else if(Email.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Email Harus Diisi", Toast.LENGTH_SHORT).show();
                }
                else if(Telp.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Nomor Telepon Harus Diisi", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Pendaftaran Berhasil", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public boolean onCreateOptionMenu (Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.T1){
            startActivity(new Intent(this, Tampilan2.class));
        } else if (item.getItemId() == R.id.T2) {
            startActivity(new Intent(this, Tampilan3.class));
        }else if (item.getItemId()==R.id.T3){
            startActivity(new Intent(this, Tampilan3.class));
        }
        return true;
    }

    }
