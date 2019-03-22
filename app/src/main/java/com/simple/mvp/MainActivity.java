package com.simple.mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements MainView {

    EditText panjang, lebar;
    TextView tvhasil;
    Button hitung;
    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        panjang = findViewById(R.id.panjang);
        lebar = findViewById(R.id.lebar);
        tvhasil = findViewById(R.id.hasil);
        hitung = findViewById(R.id.hitung);

        initPresenter();

        hitung.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          Double alas = Double.valueOf(lebar.getText().toString());
                                          Double tinggi = Double.valueOf(panjang.getText().toString());

                                          presenter.hitungLuas(alas, tinggi);
                                      }
                                  }
        );
    }



    private void initPresenter() {
       presenter = new MainPresenterImp(this);
    }

    @Override
    public void updateTextHasil(Double luas) {
        tvhasil.setText(luas.toString());
    }
}
