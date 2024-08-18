package br.ufrn.imd;

import java.util.Scanner;

import static br.ufrn.imd.Estante.estante;

public class EstanteController {
    public void listarLivros(){
        for(Livro livro : estante) {
            System.out.println(livro);
        }
    }


}
