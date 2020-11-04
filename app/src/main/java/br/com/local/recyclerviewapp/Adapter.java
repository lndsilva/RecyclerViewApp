package br.com.local.recyclerviewapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    //Variável global do tipo Lista que irá receber os filmes adicionados;
    private List<Filmes> listaFilmes;

     //Construtor que recebe por parâmetro os filmes adicionados;
    public Adapter(List<Filmes> lista) {
        this.listaFilmes = lista;
    }

    //criando a visualização com base no xml
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //Criando o layout e inserindo o modelo.
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_lista, parent, false);
        //Retornado o layout inserido para o método construtor
        return new MyViewHolder(itemLista);
    }

    //Exibindo os componentes no RecyclerView
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        //Instanciando o objeto Filmes
        Filmes filmes = listaFilmes.get(position);
        //Escrevendo nos itens da Recyclerview com os valores
        holder.titulo.setText(filmes.getTitulo());
        holder.genero.setText(filmes.getGenero());
        holder.ano.setText(filmes.getAno());

    }

    @Override
    public int getItemCount() {
        return listaFilmes.size();
    }

    //Esta classe irá montar o layout com os objetos

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
