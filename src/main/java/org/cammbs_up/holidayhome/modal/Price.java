package org.cammbs_up.holidayhome.modal;

import jakarta.persistence.*;

/**
 * Price
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
@Table(name="preise_pro_tag")
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_price", nullable = false)
    private Long idPrice;

    @Column(name="saison_a")
    private double seasonA;
    @Column(name="saison_b")
    private double seasonB;
    @Column(name="saison_c")
    private double seasonC;

    public double getSeasonA() {
        return seasonA;
    }

    public void setSeasonA(double seasonA) {
        this.seasonA = seasonA;
    }

    public double getSeasonB() {
        return seasonB;
    }

    public void setSeasonB(double seasonB) {
        this.seasonB = seasonB;
    }

    public double getSeasonC() {
        return seasonC;
    }

    public void setSeasonC(double seasonC) {
        this.seasonC = seasonC;
    }

    public Long getIdPrice() {
        return idPrice;
    }

    public void setIdPrice(Long idPrice) {
        this.idPrice = idPrice;
    }
}
