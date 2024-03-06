package com.example.springboot.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

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
    private Integer value;


    public ProductModel(){

    }

    public ProductModel(Integer idProduct, String nome, int value) {
        this.idProduct = idProduct;
        this.nome = nome;
        this.value = value;
    }


    @Override
    public String toString() {
        return "ProductModel{" +
                "idProduct=" + idProduct +
                ", nome='" + nome + '\'' +
                ", value=" + value +
                '}';
    }
}
