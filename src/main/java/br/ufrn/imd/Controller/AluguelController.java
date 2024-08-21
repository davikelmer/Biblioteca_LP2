package br.ufrn.imd.Controller;

import br.ufrn.imd.Livro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static br.ufrn.imd.Controller.LivroController.estante;

public class AluguelController {

    private final Map<Livro, Boolean> livrosAlugados;

    public AluguelController(){
        this.livrosAlugados = new HashMap<>();
    }

    public void adicionarLivro(Livro livro) {
        estante.add(livro);
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
            livrosAlugados.put(livro, false);
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
}