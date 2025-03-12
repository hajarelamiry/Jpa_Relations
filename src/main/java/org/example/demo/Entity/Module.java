package org.example.demo.Entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

public class Module {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private int heures;


    @ManyToMany
    @JoinTable(name="etudiants_Module",
    joinColumns = @JoinColumn(name="etudiant_id"),
    inverseJoinColumns = @JoinColumn(name = "module_name"))
    private List<Etudiant> etudiants=new ArrayList<>();
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getHeures() {
        return heures;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setHeures(int heures) {
        this.heures = heures;
    }
}
