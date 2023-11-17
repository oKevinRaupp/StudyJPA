package org.teste.basico;

import org.infra.DAO;
import org.model.basico.Produto;

public class NovoProduto {
    public static void main(String[] args) {
        Produto produto = new Produto("Mouse Gamer",120D);
        DAO<Produto> dao = new DAO<>(Produto.class);

        dao.incluirAtomico(produto).fechar();

    }
}
