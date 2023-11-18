package org.teste.muitospramuitos;

import org.infra.DAO;
import org.model.muitospramuitos.Sobrinho;
import org.model.muitospramuitos.Tio;

public class NovoTioSobrinho {
    public static void main(String[] args) {

        Tio tio1 = new Tio("Maria");
        Tio tio2 = new Tio("Joao");

        Sobrinho sobrinho1 = new Sobrinho("Kevin");
        Sobrinho sobrinho2 = new Sobrinho("Leticia");

        tio1.getSobrinhos().add(sobrinho1);
        sobrinho1.getTios().add(tio1);

        tio1.getSobrinhos().add(sobrinho2);
        sobrinho2.getTios().add(tio1);

        tio2.getSobrinhos().add(sobrinho1);
        sobrinho1.getTios().add(tio2);

        tio2.getSobrinhos().add(sobrinho2);
        sobrinho2.getTios().add(tio2);

        DAO<Object> dao = new DAO<>(null);
        dao.abrirTransacao().incluirTransacao(tio1).incluirTransacao(tio2)
                .incluirTransacao(sobrinho1).incluirTransacao(sobrinho2).fecharTransacao().fechar();
    }
}
