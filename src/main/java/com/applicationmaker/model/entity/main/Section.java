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

@Entity(name="sectionEntity")
@Table(name="section_tbl")

public class Section {
    @Id
    @SequenceGenerator(name = "sectionSeq", sequenceName = "section_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "sectionSeq")
    private int id;

    @Column(name = "section_name", length = 20)
    @NotBlank(message = "empty name")
    @Pattern(regexp = ("^[a-z]{2,20}$"))
    private String name;

    @Column(name = "section_group", length = 20)
    @NotBlank(message = "empty group")
    @Pattern(regexp = ("^[a-z]{2,20}$"))
    private String group;

    @Column(name = "section_head", length = 20)
    @NotBlank(message = "empty head")
    @Pattern(regexp = ("^[a-z]{2,20}$"))
    private String head;

    @Column(name = "aim", length = 50)
    @NotBlank(message = "empty aim")
    @Pattern(regexp = ("^[a-z]{2,50}$"))
    private String aim;

    @Column(name = "parent", length = 20)
    @NotBlank(message = "empty parent")
    @Pattern(regexp = ("^[a-z]{2,20}$"))
    private String parent;


}
