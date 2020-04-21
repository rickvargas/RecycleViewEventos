package com.example.recyclevieweventos;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ExibeEventoActivity extends AppCompatActivity {
	TextView textViewId;
	ImageView imageViewPriority;
	TextView textViewPriority;
	TextView textViewDescription;
	TextView textViewCategory;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_exibe_evento);
		
		int id=getIntent().getExtras().getInt("id");
		
		textViewId = findViewById(R.id.textViewId);
		imageViewPriority = findViewById(R.id.imageViewPriority);
		textViewPriority = findViewById(R.id.textViewPriority);
		textViewDescription = findViewById(R.id.textViewDescription);
		textViewCategory = findViewById(R.id.textViewCategory);
		
		EventoController eventoController = new EventoController();
		
		textViewId.setText(eventoController.EVENTOS[id].getId());
		imageViewPriority.setImageResource(eventoController.EVENTOS[id].getImgPrioridade());
		textViewPriority.setText(eventoController.EVENTOS[id].getPrioridade());
		textViewDescription.setText(eventoController.EVENTOS[id].getDescricao());
		textViewCategory.setText(eventoController.EVENTOS[id].getCategoria());
		
	}
}