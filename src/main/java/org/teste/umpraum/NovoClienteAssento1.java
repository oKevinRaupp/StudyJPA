package org.teste.umpraum;

import org.infra.DAO;
import org.model.umpraum.Assento;
import org.model.umpraum.Cliente;

public class NovoClienteAssento1 {
    public static void main(String[] args) {
        Assento assento = new Assento("16A");
        Cliente cliente = new Cliente("Teste",assento);
        DAO<Object> dao = new DAO<>();

        dao.abrirTransacao().incluirTransacao(cliente).incluirTransacao(assento).fecharTransacao().fechar();


    }
}
