package org.teste.basico;

import org.model.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class ObterUsuarios {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("StudyJPA");
        EntityManager em = emf.createEntityManager();

        String jpql = "SELECT u FROM Usuario u";
        TypedQuery<Usuario> querry = em.createQuery(jpql,Usuario.class);
        querry.setMaxResults(5);

        List<Usuario> usuarios = querry.getResultList();

        for(Usuario usuario: usuarios){
            System.out.println("ID: " + usuario.getId() + "| Nome: " + usuario.getNome() + "| Email: " + usuario.getNome());
        }

        em.close();
        emf.close();
    }
}
