package org.teste.basico.umpraum;

import org.infra.DAO;
import org.model.umpraum.Assento;
import org.model.umpraum.Cliente;

public class NovoClienteAssento2 {
    public static void main(String[] args) {
        Assento assento = new Assento("1B");
        Cliente cliente = new Cliente("Rodrigo",assento);
        DAO<Cliente> dao = new DAO<>(Cliente.class);

        dao.incluirAtomico(cliente);
    }
}
