package br.ufrn.imd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Aluguel {

    private final List<Livro> catalogo;
    private final Map<Livro, Boolean> livrosAlugados;

    public Aluguel(){
        this.catalogo = new ArrayList<>();
        this.livrosAlugados = new HashMap<>();
    }

    public void adicionarLivro(Livro livro) {
        catalogo.add(livro);
        livrosAlugados.put(livro, false);
    }
    public boolean alugarLivro(Livro livro) {
        if (livrosAlugados.containsKey(livro) && !livrosAlugados.get(livro)) {
            livrosAlugados.put(livro, true);
            System.out.println("Livro alugado: " + livro);
            return true;
        } else {
            System.out.println("Livro não disponível para aluguel: " + livro);
            return false;
        }
    }

    public boolean devolverLivro(Livro livro) {
        if (livrosAlugados.containsKey(livro) && livrosAlugados.get(livro)) {
            livrosAlugados.put(livro, false); // Marca o livro como não alugado
            System.out.println("Livro devolvido: " + livro);
            return true;
        } else {
            System.out.println("Este livro não está alugado: " + livro);
            return false;
        }
    }

    public List<Livro> listarLivrosAlugados() {
        List<Livro> alugados = new ArrayList<>();
        for (Map.Entry<Livro, Boolean> entry : livrosAlugados.entrySet()) {
            if (entry.getValue()) {
                alugados.add(entry.getKey());
            }
        }
        return alugados;
    }

    public void listarCatalogo() {
        System.out.println("Catálogo de Livros:");
        for (Livro livro : catalogo) {
            System.out.println(livro);
        }
    }
}