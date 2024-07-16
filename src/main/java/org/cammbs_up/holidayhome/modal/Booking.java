package org.cammbs_up.holidayhome.modal;

import jakarta.persistence.*;

import java.time.LocalDate;

/**
 * Booking
 * Dokumentation
 * validation
 * input
 * logic
 * output
 * Verbesserung der Strukturierung
 * Entfernung von Redundanzen
 *
 * @author Masoud Faraj
 * @version 10.07.2024
 */
@Entity
@Table(name="buchungszeitraeume")
public class Booking {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="id_buchungszeitraum")
        private int idBooking;

        @Column(name="start_datum")
        private LocalDate startDate;

        @Column(name="end_datum")
        private LocalDate endDate;

        @OneToOne(cascade = CascadeType.ALL)
        @JoinColumn(name="unterkunft_id",referencedColumnName = "id_unterkunft")
        private Home home;

        public int getIdBooking() {
                return idBooking;
        }

        public void setIdBooking(int idBooking) {
                this.idBooking = idBooking;
        }

        public LocalDate getStartDate() {
                return startDate;
        }

        public void setStartDate(LocalDate startDate) {
                this.startDate = startDate;
        }

        public LocalDate getEndDate() {
                return endDate;
        }

        public void setEndDate(LocalDate endDate) {
                this.endDate = endDate;
        }

        public Home getHome() {
            return home;
        }

        public void setHome(Home home) {
            this.home = home;
        }


}
