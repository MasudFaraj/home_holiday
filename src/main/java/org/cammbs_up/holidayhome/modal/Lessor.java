package org.cammbs_up.holidayhome.modal;

import jakarta.persistence.*;

/**
 * Lessor
 * Dokumentation
 * validation
 * input
 * logic
 * output
 * Verbesserung der Strukturierung
 * Entfernung von Redundanzen
 *
 * @author Masoud Faraj
 * @version 28.06.2024
 */
@Entity
@Table(name="vermieterinnen")
public class Lessor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vermieterIn", nullable = false)
    private Long idLessor;

    @Column(name="nachnamen")
    private String lastname;
    @Column(name="vornamen")
    private String firstname;
    public Long getIdLessor() {
        return idLessor;
    }
    public void setIdLessor(Long idLessor) {
        this.idLessor = idLessor;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
}
