package br.ufrn.imd.Controller;

import br.ufrn.imd.Livro;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LivroController {
    public static List<Livro> estante = new ArrayList<>();


    public static void carregarEstante(String caminhoArquivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            int numerolinha = 0;
            while ((linha = br.readLine()) != null) {
                numerolinha ++;
                String[] dados = linha.split(", ");

                if (linha.trim().isEmpty()) {
                    break;
                }
                if (dados.length < 6) {
                    System.out.println("Linha " + numerolinha + " malformada no arquivo");
                    continue; // Pula para a próxima linha
                }

                String isbn = dados[0];
                String titulo = dados[1];
                String autor = dados[2];
                int anoPublicacao = Integer.parseInt(dados[3]);
                String genero = dados[4];
                int quantidade = Integer.parseInt(dados[5]);

                Livro livro = new Livro(isbn, titulo, autor, anoPublicacao, genero, quantidade);
                estante.add(livro);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    public static void listarLivros(){
        for(Livro livro : estante) {
            System.out.println(livro);
        }
    }
    public static void adicionarLivro(Livro livro){
        estante.add(livro);
        atualizarArquivoLivros();

    }

    public static void excluirLivro(String isbn){
        estante.removeIf(x->x.getISBN().equals(isbn));
        atualizarArquivoLivros();
    }

    private static void atualizarArquivoLivros() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("livros.txt"))) {
            for (Livro livro : estante) {
                writer.write(livro.toString()); // Supondo que o método toString esteja formatado para salvar no formato desejado
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
