package com.bergburg.menugrupoexemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InicioActivity extends AppCompatActivity {
    private Button buttonVendedor, buttonCliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        buttonVendedor = findViewById(R.id.buttonVendedor);
        buttonCliente = findViewById(R.id.buttonCliente);

        buttonVendedor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proximaTela(true);
            }
        });
        buttonCliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proximaTela(false);
            }
        });
    }

    private  void proximaTela(Boolean valor){
        Bundle bundle = new Bundle();
        bundle.putBoolean("vendedor",valor);
        Intent intent = new Intent(InicioActivity.this,MainActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}