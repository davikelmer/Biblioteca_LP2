package br.ufrn.imd;

import java.util.Arrays;

public class Livro {
    private char[] ISBN = new char[13];
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String genero;
    private int quantidade;

    public Livro(char[] ISBN, String titulo, String autor, int anoPublicacao, String genero, int quantidade) {
        if (ISBN.length == 13) {
            this.ISBN = ISBN;
        } else {
            throw new IllegalArgumentException("ISBN deve ter 13 caracteres.");
        }
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.genero = genero;
        this.quantidade = quantidade;
    }

    public char[] getISBN() {
        return ISBN;
    }

    public void setISBN(char[] ISBN) {
        if (ISBN.length == 13) {
            this.ISBN = ISBN;
        } else {
            throw new IllegalArgumentException("ISBN deve ter 13 caracteres.");
        }
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
        return "Livro{" +
                ", ISBN=" + Arrays.toString(ISBN) +
                ", Titulo='" + titulo + '\'' +
                ", Autor='" + autor + '\'' +
                ", Ano de Publicação=" + anoPublicacao +
                ", Gênero=" + genero +
                ", Quantidade=" + quantidade +
                '}';
    }
}
