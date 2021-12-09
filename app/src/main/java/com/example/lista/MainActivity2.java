package com.example.lista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    //definisco un array di String
    String[] lista= new String[]{ "Italia", "Francia"};
    ListView listasta;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=(TextView)findViewById(R.id.textView);
        text.setText("ciaoooooo");
        listasta=(ListView)findViewById(R.id.listavieW);
        //collego un'oggetto ad un'altro oggetto.
        //ArrayAdDAPTER
        ArrayAdapter<String> aa= new ArrayAdapter<String>(this, R.layout.activity_main, R.id.textView, lista);
        listasta.setAdapter(aa);
        //setAdapter(accetta solo oggetto Adapter)
        //array si Strighr in contenitore Adapter per poter popolare la listView.


        //passo degli attributi alla seconda activiti, come???
        Intent i = getIntent();
        String messaggioricevuto = i.getStringExtra("messaggio");

        Toast to = Toast.makeText(getApplicationContext(), messaggioricevuto.toString(), Toast.LENGTH_SHORT);
        to.show();
        //tostring---->
        //
    }
}