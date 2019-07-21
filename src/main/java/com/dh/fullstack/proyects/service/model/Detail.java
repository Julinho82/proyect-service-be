package com.dh.fullstack.proyects.service.model;

import javax.persistence.*;

@Entity
@Table(name = "detail_table")
public class Detail {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "total_products", nullable = false)
    private Integer totalProducts;

    @Column(name = "total_price", nullable = false)
    private  Long totalPrice;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "detailsale",referencedColumnName = "saleid")
    private Sale sale;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTotalProducts() {
        return totalProducts;
    }

    public void setTotalProducts(Integer totalProducts) {
        this.totalProducts = totalProducts;
    }

    public Long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Long totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }
}
