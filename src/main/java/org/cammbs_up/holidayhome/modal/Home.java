package org.cammbs_up.holidayhome.modal;

import jakarta.persistence.*;
import java.lang.*;
import java.io.File;

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
    private String city;

    @Column(name="lage_planquadrat")
    private String locationPlanSquare ;

    @Column(name="groesse_qm")
    private String area;

    @Column(name="anzahl_der_betten_pro_einheit")
    private int numberOfBeds;

    @Column(name="anzahl_der_schlafraeume")
    private int numberOfBedrooms;
    @Column(name="anzahl_der_wohnraeume")
    private int numberOfLivingrooms;
    @Column(name="kueche_oder_kochn")
    private String kitchenType;

    @Column(name="dusche_oder_bad")
    private String showerOrBathtub;

    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn(name="preis_id", referencedColumnName = "id_preis")
    private Price price;

    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn(name="id_vermieterIn", referencedColumnName = "id_vermieterIn")
    private Lessor lessor;

    @Column(name="wlan")
    private boolean wlan;
    @Column(name="tv")
    private boolean tv;
    @Column(name="waschmaschine")
    private boolean washingMachine;
    @Column(name="hunde_erlaubt")
    private boolean dogsAllowed;
    @Column(name="nichtraucher")
    private boolean nonSmoker;
    @Column(name="hauseigener_parkplatz")
    private boolean onSiteParking;
    @Column(name="sauna")
        private boolean sauna;

    public boolean isSauna() {
        return sauna;
    }

    public void setSauna(boolean sauna) {
        this.sauna = sauna;
    }

    public String getImage(){
        String path="src/main/resources/static/images/holidayhomebilder/";
        String filename = accommodationName.toLowerCase().replace("\s","") + ".jpg";
        File file = new File(path + filename);
        return (file.exists()) ? filename : "logo_holiday_home.png";
    }
    public int getIdAccommodation() {
        return idAccommodation;
    }

    public void setIdAccommodation(int idAccommodation) {
        this.idAccommodation = idAccommodation;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAccommodationName() {
        return accommodationName;
    }

    public void setAccommodationName(String accommodationName) {
        this.accommodationName = accommodationName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLocationPlanSquare() {
        return locationPlanSquare;
    }

    public void setLocationPlanSquare(String locationPlanSquare) {
        this.locationPlanSquare = locationPlanSquare;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public int getNumberOfLivingrooms() {
        return numberOfLivingrooms;
    }

    public void setNumberOfLivingrooms(int numberOfLivingrooms) {
        this.numberOfLivingrooms = numberOfLivingrooms;
    }

    public String getKitchenType() {
        return kitchenType;
    }

    public void setKitchenType(String kitchenType) {
        this.kitchenType = kitchenType;
    }

    public String getShowerOrBathtub() {
        return showerOrBathtub;
    }

    public void setShowerOrBathtub(String showerOrBathtub) {
        this.showerOrBathtub = showerOrBathtub;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public Lessor getLessor() {
        return lessor;
    }

    public void setLessor(Lessor lessor) {
        this.lessor = lessor;
    }

    public boolean isWlan() {
        return wlan;
    }

    public void setWlan(boolean wlan) {
        this.wlan = wlan;
    }

    public boolean isTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public boolean isWashingMachine() {
        return washingMachine;
    }

    public void setWashingMachine(boolean washingMachine) {
        this.washingMachine = washingMachine;
    }

    public boolean isDogsAllowed() {
        return dogsAllowed;
    }

    public void setDogsAllowed(boolean dogsAllowed) {
        this.dogsAllowed = dogsAllowed;
    }

    public boolean isNonSmoker() {
        return nonSmoker;
    }

    public void setNonSmoker(boolean nonSmoker) {
        this.nonSmoker = nonSmoker;
    }

    public boolean isOnSiteParking() {
        return onSiteParking;
    }

    public void setOnSiteParking(boolean onSiteParking) {
        this.onSiteParking = onSiteParking;
    }

    public int getId_accommodation() {
        return idAccommodation;
    }

    public void setId_acommodation(int id_acommodation) {
        this.idAccommodation = id_acommodation;
    }
}
