package com.applicationmaker.model.entity.main;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;


@NoArgsConstructor
@Getter
@Setter
@SuperBuilder

@Entity(name="driverEntity")
@Table(name="driver_tbl")

public class Driver {
    @Id
    @SequenceGenerator(name = "driverSeq", sequenceName = "driver_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "driverSeq")
    private int id;

    @Column(name = "driver_type", length = 20)
    @NotBlank(message = "empty type")
    @Pattern(regexp = ("^[a-z]{2,20}$"))
    private String type;

    @Column(name = "driver_fullname", length = 20)
    @NotBlank(message = "empty name")
    @Pattern(regexp = ("^[a-z]{2,20}$"))
    private String name;

    @Column(name = "national_code", length = 20)
    @NotBlank(message = "empty national code")
    @Pattern(regexp = ("^[0-9]{2,9}$"))
    private String nationalCode;

    @Column(name = "license_date", length = 20)
    @NotBlank(message = "empty license date")
    @Pattern(regexp = "[0-9]{4}[\\]{1}[0-9]{2}[\\]{1}[0-9]{2}")
    private String licenseDate;

    @Column(name = "birth_date", length = 20)
    @NotBlank(message = "empty birthdate")
    @Pattern(regexp = "[0-9]{4}[\\]{1}[0-9]{2}[\\]{1}[0-9]{2}")

    private String birthDate;

    @Column(name = "expire_date", length = 20)
    @NotBlank(message = "empty expiredate")
    @Pattern(regexp = "[0-9]{4}[\\]{1}[0-9]{2}[\\]{1}[0-9]{2}")

    private String expireDate;

}
