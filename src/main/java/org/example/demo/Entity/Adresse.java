package org.example.demo.Entity;

import jakarta.persistence.*;

@Entity
public class Adresse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String street;
    private String city;

    @OneToOne
    @JoinColumn(name="student_id")
    private Etudiant student;

    public Adresse() {
    }

    public Adresse(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public Etudiant getEtudiant() {
        return student;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.student = etudiant;
    }
}

