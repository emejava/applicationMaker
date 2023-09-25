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

@Entity(name="insuranceEntity")
@Table(name="insurance_tbl")
public class Insurance {

    @Id
    @SequenceGenerator(name = "insuranceSeq", sequenceName = "insurance_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "insuranceSeq")
    private int id;

    @Column(name = "expire_date", length = 20)
    @NotBlank(message = "empty expire date")
    @Pattern(regexp = "[0-9]{4}[\\]{1}[0-9]{2}[\\]{1}[0-9]{2}")

    private String expireDate;

    @Column(name = "insurance_type", length = 20)
    @NotBlank(message = "empty insurance type")
    @Pattern(regexp = ("^[a-z]{2,20}$"))
    private String type;

}
