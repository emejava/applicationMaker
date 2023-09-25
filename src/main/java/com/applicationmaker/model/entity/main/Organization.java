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

@Entity(name="organizationEntity")
@Table(name="organization_tbl")

public class Organization {
    @Id
    @SequenceGenerator(name = "organizationSeq", sequenceName = "organization_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "organizationSeq")
    private int id;

    @Column(name = "org_name", length = 20)
    @NotBlank(message = "empty name")
    @Pattern(regexp = ("^[a-z]{2,20}$"))
    private String name;

    @Column(name = "org_type", length = 20)
    @NotBlank(message = "empty type")
    @Pattern(regexp = ("^[a-z]{2,20}$"))
    private String type;

    @Column(name = "field", length = 20)
    @NotBlank(message = "empty field")
    @Pattern(regexp = ("^[a-z]{2,20}$"))
    private String field;

    @Column(name = "org_manager", length = 20)
    @NotBlank(message = "empty manager")
    @Pattern(regexp = ("^[a-z]{2,20}$"))
    private String manager;

    @Column(name = "org_slogan", length = 100)
    @NotBlank(message = "empty slogan")
    @Pattern(regexp = ("^[a-z]{2,100}$"))
    private String slogan;

    @Column(name = "address", length = 50)
    @NotBlank(message = "empty address")
    @Pattern(regexp = ("^[a-z]{2,50}$"))
    private String address;

    @Column(name = "phone_number", length = 20)
    @NotBlank(message = "empty phone number")
    @Pattern(regexp = ("^[0-9]{11}$"))

    private String phoneNumber;

    @Column(name = "description", length = 100)
    @NotBlank(message = "empty description")
    @Pattern(regexp = ("^[a-z]{2,100}$"))

    private String description;



}

