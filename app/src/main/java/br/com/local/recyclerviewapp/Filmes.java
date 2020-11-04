package br.com.local.recyclerviewapp;

public class Filmes {
    //Criando as variáveis globais
    private String titulo;
    private String genero;
    private String ano;

    //Criando o método construtor sem parâmetros - ALT+INSERT

    public Filmes() {
    }

    //Criando o método construtor com parâmetros - ALT+INSERT

    public Filmes(String titulo, String genero, String ano) {
        this.titulo = titulo;
        this.genero = genero;
        this.ano = ano;
    }
    //Criando os métodos GET e SET - ALT+INSERT

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
}
