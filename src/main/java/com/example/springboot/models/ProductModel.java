package com.example.springboot.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "produto")
public class ProductModel implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProduct;
    private String nome;
    private BigDecimal valor;


    public ProductModel(){

    }

    public ProductModel(Integer idProduct, String nome, BigDecimal valor) {
        this.idProduct = idProduct;
        this.nome = nome;
        this.valor = valor;
    }


    @Override
    public String toString() {
        return "ProductModel{" +
                "idProduct=" + idProduct +
                ", nome='" + nome + '\'' +
                ", valor=" + valor +
                '}';
    }
}
