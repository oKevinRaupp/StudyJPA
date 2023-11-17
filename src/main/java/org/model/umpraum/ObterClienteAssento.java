package org.model.umpraum;

import org.infra.DAO;

public class ObterClienteAssento {
    public static void main(String[] args) {
        DAO<Cliente> daoCliente = new DAO<>(Cliente.class);
        Cliente cliente = daoCliente.obterPorID(3L);
        System.out.println(cliente.getAssento().getCliente().getNome());
        daoCliente.fechar();

        DAO<Assento> daoAssento = new DAO<>(Assento.class);
        Assento assento = daoAssento.obterPorID(2L);
        System.out.println(assento.getCliente().getNome());
        daoAssento.fechar();
    }
}
