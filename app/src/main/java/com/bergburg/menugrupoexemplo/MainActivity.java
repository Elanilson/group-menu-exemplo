package com.bergburg.menugrupoexemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    private Boolean vendedor = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      Bundle bundle = getIntent().getExtras();
      if(bundle != null){
          vendedor = bundle.getBoolean("vendedor");
      }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        if(vendedor){
            menu.setGroupVisible(R.id.grupoVendedor,true);
        }else{
            menu.setGroupVisible(R.id.grupoCliente,true);
        }
        return super.onPrepareOptionsMenu(menu);
    }
}