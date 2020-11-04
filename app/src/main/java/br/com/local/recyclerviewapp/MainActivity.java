package br.com.local.recyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //Declarando o RecyclerView e uma lista para carregar os objetos no modelo
    private RecyclerView recyclerView;
    private List<Filmes> listarFilmes = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declarando o xml para o java
        recyclerView = findViewById(R.id.idRecyclerView);
        //Chamando a instância dos Filmes que foram criados.
        criarFilmes();

        //Criando a instância do adaptador para colocar os filmes
        //na lista do RecyclerView

        Adapter adapter = new Adapter(listarFilmes);

        //Gerenciador de layout - 02 tipos de layout (Linear e Grid)

        //Utilizando o LinearLayoutManager - Lista na horizontal ou vertical
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        //Aplicando o layout instanciado.
        recyclerView.setLayoutManager(layoutManager);
        //Para melhorar o fluxo das informações na lista criar setHasFixedSize
        recyclerView.setHasFixedSize(true);
        //Criando uma linha de divisão horizontal em cada item da lista
        recyclerView.addItemDecoration(new DividerItemDecoration(getApplicationContext(),
                LinearLayout.VERTICAL));

        //Adicionando os itens da lista no modelo(adaptador)
        recyclerView.setAdapter(adapter);

        //Adicionando eventos de click na lista de filmes


    }

    public void criarFilmes() {
        //Criando a instância do objeto Filmes
        Filmes filmes = new Filmes("A bela e a fera", "Aventura", "1990");
        //Adicionando os valores no Array de Filmes
        this.listarFilmes.add(filmes);
        filmes = new Filmes("Feitiço do Tempo", "Comédia", "1993");
        this.listarFilmes.add(filmes);
        filmes = new Filmes("Jogo da Imitação", "Suspense", "2014");
        this.listarFilmes.add(filmes);
        filmes = new Filmes("O Poderoso Chefão", "Policial", "1972");
        this.listarFilmes.add(filmes);
        filmes = new Filmes("A Lista de Schindler", "Guerra", "2019");
        this.listarFilmes.add(filmes);
        filmes = new Filmes("Um Sonho de Liberdade", "Drama", "1995");
        this.listarFilmes.add(filmes);
        filmes = new Filmes("O Senhor dos Anéis - O Retorno do Rei", "Aventura", "2003");
        this.listarFilmes.add(filmes);
        filmes = new Filmes("O Rei Leão", "Animação", "2011");
        this.listarFilmes.add(filmes);
        filmes = new Filmes("Forrest Gump - O Contador de Histórias", "Romance", "1994");
        this.listarFilmes.add(filmes);
        filmes = new Filmes("À Espera de um Milagre", "Policial", "2000");
        this.listarFilmes.add(filmes);
        filmes = new Filmes("Intocáveis", "Comédia", "2012");
        this.listarFilmes.add(filmes);
        filmes = new Filmes("Alladim", "Aventura", "2019");
        this.listarFilmes.add(filmes);

    }
}
