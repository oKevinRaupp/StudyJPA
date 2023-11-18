package org.teste.muitospramuitos;

import org.infra.DAO;
import org.model.muitospramuitos.Ator;
import org.model.muitospramuitos.Filme;

public class NovoFilmeAtor {
    public static void main(String[] args) {
        Filme filmeA = new Filme("SpiderMan",9.9);
        Filme filmeB = new Filme("Teste",7.3);

        Ator atorA = new Ator("Tobey Maguire");
        Ator atorB = new Ator("Tom Holland");
        Ator atorC = new Ator("Andrew Garfield");

        filmeA.adicionarAtor(atorA);
        filmeA.adicionarAtor(atorB);
        filmeA.adicionarAtor(atorC);

        filmeB.adicionarAtor(atorA);

    }
}
