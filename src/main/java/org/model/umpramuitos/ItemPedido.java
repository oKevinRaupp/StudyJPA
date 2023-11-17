package org.model.umpramuitos;

import org.model.basico.Produto;

import javax.persistence.*;

@Entity
public class ItemPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @ManyToOne
    private Pedido pedido;
    @ManyToOne
    private Produto produto;

    @Column(nullable = false)
    private int quantidade;
    @Column(nullable = false)
    private Double preco;

    public ItemPedido(){}
    public ItemPedido(Pedido pedido, Produto produto, int quantidade) {
        super();
        setPedido(pedido);
        setProduto(produto);
        setQuantidade(quantidade);
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;

        if(produto != null && this.preco == null){
            this.setPreco(produto.getPreco());
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
