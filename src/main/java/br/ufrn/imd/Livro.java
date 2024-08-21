package br.ufrn.imd;

import java.util.Arrays;

public class Livro {
    private String ISBN;
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String genero;
    private int quantidade;

    public Livro(String ISBN, String titulo, String autor, int anoPublicacao, String genero, int quantidade) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.genero = genero;
        this.quantidade = quantidade;
    }


    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return
                new String(ISBN) +
                ", " + titulo +
                ", " + autor +
                ", " + anoPublicacao +
                ", " + genero +
                ", " + quantidade;
    }
}
