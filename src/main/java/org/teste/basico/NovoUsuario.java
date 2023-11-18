package org.teste.basico;

import org.model.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NovoUsuario {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("StudyJPA");
        EntityManager em = emf.createEntityManager();

        Usuario novoUsuario = new Usuario("testeUsuario","email@teste.com");


        em.getTransaction().begin();
        em.persist(novoUsuario);
        em.getTransaction().commit();

        System.out.println("O Id que foi gerado foi o: " + novoUsuario.getId());

        em.close();
        emf.close();

    }
}
