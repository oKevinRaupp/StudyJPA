package org.model.umpramuitos;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity

public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(nullable = false)
    private Date data;
    @OneToMany(mappedBy = "pedido",fetch = FetchType.LAZY)
    private List<ItemPedido> itens;

    public Pedido(){
        this(new Date());
    }
    public Pedido(Date data) {
        this.data = data;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }
}
