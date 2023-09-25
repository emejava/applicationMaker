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

@Entity(name="documentEntity")
@Table(name="document_tbl")

public class Document {
    @Id
    @SequenceGenerator(name = "documentSeq", sequenceName = "document_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "documentSeq")
    private int id;


    @Column(name = "date_time", length = 20)
    @NotBlank(message = "empty date and time")
// TODO: 9/13/2023 ?
    private String dateTime;

    @Column(name = "title", length = 20)
    @NotBlank(message = "empty title")
    @Pattern(regexp = ("^[a-z]{2,20}$"))
    private String title;

    @Column(name = "code", length = 20)
    @NotBlank(message = "empty code")
    @Pattern(regexp = ("^[0-9]{2,20}$"))
    private String code;

    @Column(name = "detail", length = 50)
    @NotBlank(message = "empty detail")
    @Pattern(regexp = ("^[a-z]{2,50}$"))
    private String detail;

    @Column(name = "type", length = 20)
    @NotBlank(message = "empty type")
    @Pattern(regexp = ("^[a-z]{2,20}$"))
    private String type;

    @Column(name = "user", length = 20)
    @NotBlank(message = "empty user")
    @Pattern(regexp = ("^[a-z]{2,20}$"))
    private String user;

    @Column(name = "amount", length = 20)
    @NotBlank(message = "empty amount")
    private int amount;




}

