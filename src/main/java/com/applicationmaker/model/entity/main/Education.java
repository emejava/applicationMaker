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

@Entity(name="educationEntity")
@Table(name="education_tbl")

public class Education {
    @Id
    @SequenceGenerator(name = "educationSeq", sequenceName = "education_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "educationSeq")
    private int id;

    @Column(name = "level", length = 20)
    @NotBlank(message = "empty level")
    private String level;

    @Column(name = "degree", length = 20)
    @NotBlank(message = "empty degree")
// TODO: 9/13/2023  enum
    private String degree;

    @Column(name = "institute_name", length = 20)
    @NotBlank(message = "empty institute name")
    @Pattern(regexp = ("^[a-z]{2,20}$"))
    private String instituteName;

    @Column(name = "duration", length = 20)
    @NotBlank(message = "empty duration")
    @Pattern(regexp = ("^[1-9]{2}[a-z]+ {2,20}$"))
    private String duration;

    @Column(name = "average_point", length = 20)
    @NotBlank(message = "empty average point")
    @Pattern(regexp = ("^[1-9]{2}[\\.]?[1-9]{2}$"))
    private int averagePoint;
}

