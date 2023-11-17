package org.teste.basico;

import org.infra.ProdutoDAO;
import org.model.basico.Produto;

import java.util.List;

public class ObterProdutos {
    public static void main(String[] args) {
        ProdutoDAO produtoDAO = new ProdutoDAO();
        List<Produto> produtos = produtoDAO.obterTodos();

        for(Produto produto: produtos){
            System.out.println("ID: " + produto.getId() + " Nome: " + produto.getNome());
        }
        double precoTotal = produtos.stream().map(Produto::getPreco).reduce(0.0,(t,p) -> t + p).doubleValue();
        System.out.println(precoTotal);
        produtoDAO.fechar();
    }
}
