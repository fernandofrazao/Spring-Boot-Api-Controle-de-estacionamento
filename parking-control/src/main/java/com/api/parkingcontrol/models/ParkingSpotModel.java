package com.api.parkingcontrol.models;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "TB_PARKING_SPOT")

public class ParkingSpotModel implements Serializable {
    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)// será gerado os numeros das vagas automático
    private UUID id;

    @Column(nullable = false, unique = true, length = 10)
    private String parkingSpotNumber;

    @Column(nullable = false, unique = true, length = 7)
    private String licensePlateCar;

    @Column(nullable = false, length = 70)
    private String brandCar;

    @Column(nullable = false, length = 70)
    private String modelCar;

    @Column(nullable = false, length = 70)
    private String colorCar;

    @Column(nullable = false)
    private LocalDateTime registrationDate;

    @Column(nullable = false, length = 130)
    private String responsibleName;

    @Column(nullable = false, length = 30)
    private String apartment;

    @Column(nullable = false, length = 30)
    private String block;


    public void setId(UUID id) {
        this.id = id;
    }

    public void setParkingSpotNumber(String parkingSpotNumber) {
        this.parkingSpotNumber = parkingSpotNumber;
    }

    public void setlicensePlateCar(String licensePlateCar) {
        this.licensePlateCar = licensePlateCar;
    }

    public void setBrandCar(String brandCar) {
        this.brandCar= brandCar;
    }

    public void setModeldCar(String modeldCar) {
        this.modelCar= modeldCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate= registrationDate;
    }

    public void setResponsibleNane(String responsible_name) {
        this.responsibleName = responsible_name;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public UUID getId() {
        return id;
    }

    public String getparking_spot_number() {
        return parkingSpotNumber;
    }

    public String getlicense_plate_car() {
        return licensePlateCar;
    }

    public String getbrand_car() {
        return brandCar;
    }

    public String getmodel_car() {
        return modelCar;
    }

    public String getColorCar() {
        return colorCar;
    }

    public LocalDateTime getregistration_date() {
        return registrationDate;
    }

    public String getResponsibleName() {
        return responsibleName;
    }

    public String getapartment() {
        return apartment;
    }

    public String getblock() {
        return block;
    }

    public String getParkingSpotNumber() {
        return parkingSpotNumber;
    }

    public String getLicensePlateCar() {
        return licensePlateCar;
    }

    public void setLicensePlateCar(String licensePlateCar) {
        this.licensePlateCar = licensePlateCar;
    }

    public String getBrandCar() {
        return brandCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setResponsibleName(String responsibleName) {
        this.responsibleName = responsibleName;
    }

    public String getApartment() {
        return apartment;
    }

    public String getBlock() {
        return block;
    }
}

