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

@Entity(name="expertiesEntity")
@Table(name="experties_tbl")

public class Experties {
    @Id
    @SequenceGenerator(name = "expertiesSeq", sequenceName = "experties_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "expertiesSeq")
    private int id;

    @Column(name = "type", length = 20)
    @NotBlank(message = "empty type")
    @Pattern(regexp = ("^[a-z]{2,20}$"))
    private String type;

    @Column(name = "exprience_level", length = 20)
    @NotBlank(message = "empty level")
    @Pattern(regexp = ("^[a-z]{2,20}$"))
    private String level;

    @Column(name = "institute", length = 20)
    @NotBlank(message = "empty institute")
    @Pattern(regexp = ("^[a-z]{2,20}$"))
    private String institute;

    @Column(name = "duration", length = 20)
    @NotBlank(message = "empty duration")
    @Pattern(regexp = ("^[1-9]{2}[a-z]+ {2,20}$"))
    private String duration;
}
