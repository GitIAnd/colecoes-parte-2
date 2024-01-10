package br.com.api;

import java.lang.reflect.Array;
import java.util.*;

public class TarefaColecoes {

    public static void main(String args[]) {
        listaNomes();
    }

    private static void listaNomes() {

        String listaPessoas = "Jessica-F,Andre-M,Mateus-M,Beatriz-F,Joao-M,Luisa-F";
        String[] arrayPessoas = listaPessoas.split(",");

        List<String> homens = new ArrayList<>();
        List<String> mulheres = new ArrayList<>();

        for (String nome : arrayPessoas) {
            if (nome.contains("-M")) {
                homens.add(nome);
            } else if (nome.contains("-F")) {
                mulheres.add(nome);
            }
        }

        System.out.println(homens);
        System.out.println(mulheres);

    }
}
