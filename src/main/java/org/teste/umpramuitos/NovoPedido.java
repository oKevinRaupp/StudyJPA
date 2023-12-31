package org.teste.umpramuitos;

import org.infra.DAO;
import org.model.basico.Produto;
import org.model.umpramuitos.ItemPedido;
import org.model.umpramuitos.Pedido;

public class NovoPedido {
    public static void main(String[] args) {
        DAO<Object> dao = new DAO<>();

        Pedido pedido = new Pedido();
        Produto produto = new Produto("Iphone 15",4900D);
        ItemPedido item = new ItemPedido(pedido,produto,100);

        dao.abrirTransacao().incluirTransacao(produto).incluirTransacao(pedido)
                .incluirTransacao(item).fecharTransacao().fechar();

    }
}
