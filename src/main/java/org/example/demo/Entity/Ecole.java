package org.example.demo.Entity;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Ecole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    private String nom;
    @OneToMany(mappedBy ="ecole")
    private List<Etudiant> etudiants = new ArrayList<>();

    public Ecole(String nom, List<Etudiant> etudiants) {
        this.nom = nom;
        this.etudiants = etudiants;
    }

    public Ecole() {
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public List<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEtudiants(List<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }
}
