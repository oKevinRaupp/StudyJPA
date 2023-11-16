package org.teste.basico;

import org.model.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ObterUsuario {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("StudyJPA");
        EntityManager em = emf.createEntityManager();

        Usuario usuario = em.find(Usuario.class,6L);
        System.out.println(usuario.getNome());

        em.close();
        emf.close();
    }
}
