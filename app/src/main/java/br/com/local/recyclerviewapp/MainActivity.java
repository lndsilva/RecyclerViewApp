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
    private RecyclerView recyclerView;


    private List<Filmes> listarFilmes = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.idRecyclerView);

        this.criarFilmes();

        Adapter adapter = new Adapter(listarFilmes);

        //Gerenciador de layout - 02 tipos de layout (Linear e Grid)

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        //Aplicando o layout instanciado.
        recyclerView.setLayoutManager(layoutManager);

       //Método para melhorar a performance do recyclerView
        recyclerView.setHasFixedSize(true);

        //Implementa uma linha de divisão vertical em cada item
        recyclerView.addItemDecoration(new DividerItemDecoration(getApplicationContext(), LinearLayout.VERTICAL));
        //Insere no objeto RecyclerView os componentes do adapter
        recyclerView.setAdapter(adapter);

        //Adicionando eventos de click na lista de filmes


    }

    public void criarFilmes() {

        Filmes filmes = new Filmes("Feitiço do Tempo", "Comédia", "1993");
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

    }
}
