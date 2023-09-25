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

@Entity(name="personEntity")
@Table(name="person_tbl")

public class Person {
    @Id
    @SequenceGenerator(name = "pesonSeq", sequenceName = "person_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "personSeq")
    private int id;

    @Column(name = "first_name", length = 20)
    @NotBlank(message = "empty name")
    @Pattern(regexp = ("^[a-z]{2,20}$"))
    private String name;

    @Column(name = "last_name", length = 20)
    @NotBlank(message = "empty family")
    @Pattern(regexp = ("^[a-z]{2,20}$"))
    private String family;

    @Column(name = "birth_date", length = 20)
    @NotBlank(message = "empty birth date")
    @Pattern(regexp = "[0-9]{4}[\\]{1}[0-9]{2}[\\]{1}[0-9]{2}")
    private String birthDate;

    @Column(name = "father_name", length = 20)
    @NotBlank(message = "empty father's name")
    @Pattern(regexp = ("^[a-z]{2,20}$"))
    private String fatherName;

    @Column(name = "gender", length = 20)
    @NotBlank(message = "empty gender")
    // TODO: 9/13/2023 enum
    private String gender;

    @Column(name = "national_code", length = 20)
    @NotBlank(message = "empty national code")
    @Pattern(regexp = ("^[0-9]{2,9}$"))
    private String nationalCode;

    @Column(name = "expire_date", length = 20)
    @NotBlank(message = "empty expire date")
    @Pattern(regexp = "[0-9]{4}[\\]{1}[0-9]{2}[\\]{1}[0-9]{2}")
    private String expireDate;

}
