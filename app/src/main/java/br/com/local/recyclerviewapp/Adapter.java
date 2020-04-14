package br.com.local.recyclerviewapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    private List<Filmes> listaFilmes;

    public Adapter(List<Filmes> lista) {
        this.listaFilmes = lista;
    }

    //criando a visualização com base no xml
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_lista, parent, false);
        return new MyViewHolder(itemLista);
    }

    //Exibindo os componenetes
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Filmes filmes = listaFilmes.get(position);

        holder.titulo.setText(filmes.getTitulo());
        holder.genero.setText(filmes.getGenero());
        holder.ano.setText(filmes.getAno());
    }

    @Override
    public int getItemCount() {
        return listaFilmes.size();
    }

    //objeto view

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView titulo, ano, genero;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            titulo = itemView.findViewById(R.id.txtTitulo);
            ano = itemView.findViewById(R.id.txtAno);
            genero = itemView.findViewById(R.id.txtGenero);
        }
    }

}
