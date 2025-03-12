package org.example.demo.Entity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.demo.Entity.Adresse;
import org.example.demo.Entity.Etudiant;

public class Main {
    public static void main(String[] args) {
        Etudiant student = new Etudiant("hajar","elamiry","hajar@gmail.com");
        Adresse address = new Adresse("123 Rue ", "Marrakech");
        student.setAdresse(address);
        address.setEtudiant(student);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(student);
        em.getTransaction().commit();
        em.close();
        emf.close();
        System.out.println("Etudiant et adresse enregistres avec succes !");
    }
}
