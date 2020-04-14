package br.com.local.recyclerviewapp;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterFilmes extends RecyclerView.Adapter<AdapterFilmes.ViewHolder> {

    //Criar o layout com os componentes
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    //Carregar no layout os componentes
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    //Contar os itens que serão carregados no layout
    @Override
    public int getItemCount() {
        return 0;
    }

    //inner class
    //Carrega os componentes do xml para o Adapter
    public class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            TextView titulo, genero,ano;

            titulo = itemView.findViewById(R.id.txtTitulo);
            genero = itemView.findViewById(R.id.txtGenero);
            ano = itemView.findViewById(R.id.txtAno);
        }
    }



}
