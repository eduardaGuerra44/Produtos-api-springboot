package com.example.springboot.aplicacao;

import com.example.springboot.models.ProductModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

import static jakarta.persistence.Persistence.createEntityManagerFactory;


public class Programa {
    public static void main(String[] args) {
        EntityManagerFactory emf = createEntityManagerFactory("products-api");
        EntityManager em = emf.createEntityManager();



    }

}
