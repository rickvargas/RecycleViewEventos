package com.example.recyclevieweventos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class EventoAdapterRecyclerView extends RecyclerView.Adapter<EventoAdapterRecyclerView.MyViewHolder> {
    Context mContext;
    int mResource;
    Evento[] mDataset;

    public EventoAdapterRecyclerView(Context mContext, int mResource, Evento[] mDataset) {
        this.mContext = mContext;
        this.mResource = mResource;
        this.mDataset = mDataset;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //Criando  propriedade LayoutInflater
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        View convertView = layoutInflater.inflate(mResource,parent,false);

        MyViewHolder myViewHolder = new MyViewHolder(convertView);

        return myViewHolder ;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Evento evento = mDataset[position];
        // Populando item da view

        holder.textViewId.setText(evento.getId());
        holder.imageViewPriority.setImageResource(evento.getImgPrioridade());
        holder.textViewPriority.setText(evento.getPrioridade());
        holder.textViewDescription.setText(evento.getDescricao());
        holder.textViewCategory.setText(evento.getCategoria());

    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }


    public  class MyViewHolder extends RecyclerView.ViewHolder{
        TextView textViewId;
        ImageView imageViewPriority;
        TextView textViewPriority;
        TextView textViewDescription;
        TextView textViewCategory;

        public MyViewHolder(@NonNull View convertView) {
            super(convertView);
    
            textViewId = convertView.findViewById(R.id.textViewId);
            textViewPriority = convertView.findViewById(R.id.textViewPriority);
            imageViewPriority = convertView.findViewById(R.id.imageViewPriority);
            textViewDescription = convertView.findViewById(R.id.textViewDescription);
            textViewCategory = convertView.findViewById(R.id.textViewCategory);
            
        }
    }
}
