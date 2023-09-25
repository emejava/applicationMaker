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

@Entity(name="healthEntity")
@Table(name="health_tbl")

public class Health {
    @Id
    @SequenceGenerator(name = "healthSeq", sequenceName = "health_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "healthSeq")
    private int id;

    @Column(name = "insurance", length = 20)
    @NotBlank(message = "empty insurance type")
    // TODO: 9/13/2023 enum
    private String insurance;

    @Column(name = "drugs", length = 20)
    @NotBlank(message = "empty drugs")
    @Pattern(regexp = ("^[a-z]+[1-9]+ {2,20}$"))
    private String drugs;

    @Column(name = "weight", length = 20)
    @NotBlank(message = "empty weight")
    @Pattern(regexp = ("^[1-9]{3}$"))

    private int weight;

    @Column(name = "height", length = 20)
    @NotBlank(message = "empty height")
    @Pattern(regexp = ("^[1-9]{3}$"))

    private int height;

    @Column(name = "blood_presure", length = 20)
    @NotBlank(message = "empty blood presure")
    @Pattern(regexp = ("^[1-9]{2}[\\]?[1-9]{2}$"))

    private String bloodPressure;

    @Column(name = "heart_rate", length = 20)
    @NotBlank(message = "empty heart rate")
    @Pattern(regexp = ("^[0-9]{2,20}$"))

    private int heartRate;

    @Column(name = "disease", length = 20)
    @NotBlank(message = "empty disease")
    @Pattern(regexp = ("^[a-z]{2,20}$"))
    private String disease;

    @Column(name = "illness_reputation", length = 20)
    @NotBlank(message = "empty reputation")
    @Pattern(regexp = ("^[a-z]{2,20}$"))
    private String reputation;

    @Column(name = "allergies", length = 20)
    @NotBlank(message = "empty allergies")
    @Pattern(regexp = ("^[a-z]{2,20}$"))
    private String allergies;

    @Column(name = "injuries", length = 20)
    @NotBlank(message = "empty injuries")
    @Pattern(regexp = ("^[a-z]{2,20}$"))
    private String injuries;


}
