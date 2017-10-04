package br.com.alura.agenda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListaAlunosMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_alunos_main);

        String[] alunos = {"Danile", "Ronaldo", "Jeferson",  "Felipe"};
        ListView listaDeAlunos = (ListView) findViewById(R.id.lista_alunos);
         ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alunos);
        listaDeAlunos.setAdapter(adapter);
    }
}
