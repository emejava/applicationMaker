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

@Entity(name="carexEntity")
@Table(name="carex_tbl")

public class CarExtra {
    @Id
    @SequenceGenerator(name = "carexSeq", sequenceName = "carex_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "carexSeq")
    private int id;

    @Column(name = "mileage", length = 20)
    @NotBlank (message = "empty mileage")
    private int mileage;

    @Column(name = "damage", length = 20)
    @NotBlank(message = "empty damage")
    @Pattern(regexp = ("^[a-z]{2,20}$"))
    private String damage;
}
