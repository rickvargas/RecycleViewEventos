package com.example.recyclevieweventos;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    EventoController eventoController;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eventoController = new EventoController();

        recyclerView = findViewById(R.id.recylerView);

        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        EventoAdapterRecyclerView eventoAdapterRecyclerView =
                new EventoAdapterRecyclerView(
                        getApplicationContext(),
                        R.layout.list_item_evento,
                        eventoController.EVENTOS
                );

        recyclerView.setAdapter(eventoAdapterRecyclerView);

    }
}
