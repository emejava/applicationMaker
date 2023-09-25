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

@Entity(name="carEntity")
@Table(name="car_tbl")

public class Car {
    @Id
    @SequenceGenerator(name = "carSeq", sequenceName = "car_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "carSeq")
    private int id;

    @Column(name = "type", length = 20)
    @NotBlank(message = "empty type")
    @Pattern(regexp = ("^[a-z]{2,20}$"))
    private String type;

    @Column(name = "system", length = 20)
    @NotBlank(message = "empty system")
    @Pattern(regexp = ("^[a-z]{2,20}$"))
    private String system;

    @Column(name = "model", length = 20)
    @NotBlank(message = "empty model")
    @Pattern(regexp = ("^[a-z]{2,20}$"))
    private  String model;

    @Column(name = "capacity", length = 20)
    @NotBlank(message = "empty capacity")
    private int capacity;

    @Column(name = "fuel", length = 20)
    @NotBlank(message = "empty fuel")
    @Pattern(regexp = ("^[a-z]{2,20}$"))
    private String fuel;

    @Column(name = "motor_number", length = 20)
    @NotBlank(message = "empty motorNumber")
    @Pattern(regexp = ("^[0-9]{2,20}$"))
    private String motorNumber;

    @Column(name = "wheel", length = 20)
    @NotBlank(message = "empty wheel")
    private int wheel;

    @Column(name = "body_number", length = 20)
    @NotBlank(message = "empty bodyNumber")
    @Pattern(regexp = ("^[0-9]{2,20}$"))
    private String bodyNumber;


}
