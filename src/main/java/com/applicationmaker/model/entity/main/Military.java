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

@Entity(name="militaryEntity")
@Table(name="military_tbl")

public class Military {
    @Id
    @SequenceGenerator(name = "militarySeq", sequenceName = "military_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "militarySeq")
    private int id;

    @Column(name = "start_date", length = 20)
    @NotBlank(message = "empty start date")
    @Pattern(regexp = "[0-9]{4}[\\]{1}[0-9]{2}[\\]{1}[0-9]{2}")

    private String startDate;

    @Column(name = "end_date", length = 20)
    @NotBlank(message = "empty end date")
    @Pattern(regexp = "[0-9]{4}[\\]{1}[0-9]{2}[\\]{1}[0-9]{2}")
    private String endDate;

    @Column(name = "type", length = 20)
    @NotBlank(message = "empty type")
    @Pattern(regexp = ("^[a-z]{2,20}$"))
    private String type;

}
