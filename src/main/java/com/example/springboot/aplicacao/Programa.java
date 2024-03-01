package com.example.springboot.aplicacao;

import com.example.springboot.models.ProductModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

import static jakarta.persistence.Persistence.createEntityManagerFactory;


public class Programa {
    public static void main(String[] args) {
        ProductModel p1 = new ProductModel(null, "Pincel", 10);
        EntityManagerFactory emf = createEntityManagerFactory("products-api");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(p1);
        em.getTransaction().commit();
        System.out.println("okay");

    }

}
