package org.example.demo.Entity;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String firstName;
    private String lastName;
    private String email;

    @OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
    private Adresse adresse;

    @ManyToOne
    @JoinColumn(name="ecole_id")
    private Ecole ecole ;


    @ManyToMany
    @JoinTable(name="etudiants_Module",
            joinColumns = @JoinColumn(name="etudiant_id"),
            inverseJoinColumns = @JoinColumn(name = "module_name"))
    private List<Module> module=new ArrayList<>();
    public Etudiant() {
    }

    public Etudiant(String firstName, String lastName, String email) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
