package org.teste.basico;

import org.model.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlterarUsuario1 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("StudyJPA");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Usuario usuario = em.find(Usuario.class,6L);

        usuario.setNome("Leonardo");
        usuario.setEmail("email@teste.com.br");

        em.merge(usuario);
        em.getTransaction().commit();


        em.close();
        emf.close();
    }
}
