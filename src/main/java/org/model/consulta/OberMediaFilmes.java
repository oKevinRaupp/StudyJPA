package org.model.consulta;

import org.infra.DAO;
import org.model.muitospramuitos.Filme;

public class OberMediaFilmes {
    public static void main(String[] args) {
        DAO<NotaFilme> dao = new DAO<>(NotaFilme.class);
        NotaFilme nota = dao.consultarUm("obterMediaGeralDosFilmes");

        System.out.println(nota.getMedia());

        dao.fechar();
    }
}
