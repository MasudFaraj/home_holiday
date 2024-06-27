package org.cammbs_up.holidayhome.modal;

import jakarta.persistence.*;

/**
 * Home
 * Dokumentation
 * validation
 * input
 * logic
 * output
 * Verbesserung der Strukturierung
 * Entfernung von Redundanzen
 *
 * @author Masoud Faraj
 * @version 27.06.2024
 */
@Entity
@Table(name="stammdaten")
public class Home {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_unterkunft", nullable = false)
    private int idAccommodation;
    @Column(name="typ")
    private String type;
    @Column(name="name_der_unterkunft")
    private String accommodationName;
    @Column(name="lage")
    private String position;

    @Column(name="ferienort")
    private String holidayLocation;

    @Column(name="lage_planquadrat")
    private String locationPlanSquare ;


    @Column(name="ferienort")
    private String city;

    @Column(name="groesse_qm")
    private String area;

    @Column(name="anzahl_der_betten_pro_einheit")
    private int numberOfBeds;

    @Column(name="kueche_oder_kochn")
    private String kitchenType;

    @Column(name="dusche_oder_bad")
    private String showerOrBathtub;

    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn(name="preis_id", referencedColumnName = "id_preis")
    private Price price;

    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn(name="id_vermieterIn", referencedColumnName = "id_vermieterIn")
//    private Price price;

    public int getId_accommodation() {
        return idAccommodation;
    }

    public void setId_acommodation(int id_acommodation) {
        this.idAccommodation = id_acommodation;
    }
}
