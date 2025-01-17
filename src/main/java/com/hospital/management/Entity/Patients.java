package com.hospital.management.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Patients extends BaseEntity {

    private String patientName;

    private String email;

    private String mobileNumber;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    @ManyToOne
    @JoinColumn(name = "symptom_id")
    private Symptom symptom;

}
