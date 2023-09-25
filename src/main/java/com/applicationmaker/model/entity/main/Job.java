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

@Entity(name="jobEntity")
@Table(name="job_tbl")

public class Job {
    @Id
    @SequenceGenerator(name = "jobSeq", sequenceName = "job_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "jobSeq")
    private int id;

    @Column(name = "position", length = 20)
    @NotBlank(message = "empty position")
    @Pattern(regexp = ("^[a-z]{2,20}$"))
    private String position;

    @Column(name = "duration", length = 20)
    @NotBlank(message = "empty duration")
    @Pattern(regexp = ("^[1-9]{2}[a-z]+ {2,20}$"))

    private String duration;

    @Column(name = "referance", length = 20)
    @NotBlank(message = "empty detail")
    @Pattern(regexp = ("^[a-z]{2,20}$"))
    private String referenceDetail;

}
