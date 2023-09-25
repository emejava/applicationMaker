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

@Entity(name="serviceEntity")
@Table(name="service_tbl")

public class Service {
    @Id
    @SequenceGenerator(name = "serviceSeq", sequenceName = "service_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "serviceSeq")
    private int id;

    @Column(name = "service_group", length = 20)
    @NotBlank(message = "empty group")
    // TODO: 9/13/2023 Enum
    private String group;

    @Column(name = "service_subgroup", length = 20)
    @NotBlank(message = "empty subgroup")
    // TODO: 9/13/2023 Enum
    private String subGroup;

    @Column(name = "provider", length = 20)
    @NotBlank(message = "empty provider")
    @Pattern(regexp = "^[a-z]${2,20}")
    private String provider;

    @Column(name = "service_name", length = 20)
    @NotBlank(message = "empty name")
    // TODO: 9/13/2023 Enum
    private String name;

    @Column(name = "day", length = 20)
    @NotBlank(message = "empty day")
    // TODO: 9/13/2023 enum
    private String day;

    @Column(name = "start_time", length = 20)
    @NotBlank(message = "empty start time")
    @Pattern(regexp = "^[0-9]{2}[':][0-9]{2}")
    private String startTime;

    @Column(name = "end_time", length = 20)
    @NotBlank(message = "empty end time")
    @Pattern(regexp = "^[0-9]{2}[':][0-9]{2}")
    private String endTime;

    @Column(name = "description", length = 100)
    @NotBlank(message = "empty description")
    @Pattern(regexp = "[a-z]+[0-9]{2,100}")
    private String description;

    @Column(name = "progress", length = 20)
    @NotBlank(message = "empty progress")
    @Pattern(regexp = ("^[a-z]{2,20}$"))
    private String progress;

    @Column(name = "service_price", length = 20)
    @NotBlank(message = "empty service")
    @Pattern(regexp = ("^[0-9]+ {2,20}$"))

    private int price;

}

