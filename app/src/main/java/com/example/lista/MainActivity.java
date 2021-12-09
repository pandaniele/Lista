package com.example.lista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button but;
TextView aa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aa=(TextView)findViewById(R.id.textView2);
        but=(Button)findViewById(R.id.button);
    }
    public void funzione(View v) {
        Intent i=new Intent(getApplicationContext(), MainActivity2.class);
        //acrtivity da far partire
        i.putExtra("messaggio",aa.getText()); //?
        //pacchetto aggiuntivo: CHIAVE VALORE
        startActivity(i);
        //
//indicce valoore---- chiave-valore=array eterogeneo di dati
        // 0 100 int       numero 1000
        //                 an ciao
    }
}