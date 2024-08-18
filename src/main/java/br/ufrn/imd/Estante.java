package br.ufrn.imd;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Estante {
    public static List<Livro> estante = new ArrayList<>();

    public Estante(List<Livro> estante) {
        Estante.estante = estante;
    }

    public static void carregarEstante(String caminhoArquivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(", ");
                String isbn = dados[0];
                String titulo = dados[1];
                String autor = dados[2];
                int anoPublicacao = Integer.parseInt(dados[3]);
                String genero = dados[4];
                int quantidade = Integer.parseInt(dados[5]);

                Livro livro = new Livro(isbn.toCharArray(), titulo, autor, anoPublicacao, genero, quantidade);
                estante.add(livro);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
