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

    public Long getIdPrice() {
        return idPrice;
    }

    public void setIdPrice(Long idPrice) {
        this.idPrice = idPrice;
    }
}
