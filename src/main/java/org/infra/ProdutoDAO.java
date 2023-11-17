package org.infra;

import org.model.basico.Produto;

public class ProdutoDAO extends DAO<Produto>{
    public ProdutoDAO(){
        super(Produto.class);
    }
}
