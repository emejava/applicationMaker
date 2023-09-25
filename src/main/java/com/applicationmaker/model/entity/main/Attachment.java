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

@Entity(name="attachmentEntity")
@Table(name="attachment_tbl")

public class Attachment {
    @Id
    @SequenceGenerator(name = "attachmentSeq", sequenceName = "attachment_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "attachmentSeq")
    private int id;

    @Column(name = "type", length = 20)
    @NotBlank(message = "empty type")
    @Pattern(regexp = ("^[a-z]{2,20}$"))
    private String type;

    @Column(name = "address", length = 20)
    @NotBlank(message = "empty address")
    @Pattern(regexp = ("^[a-z]{2,20}$"))
    private String address;

    @Column(name = "description", length = 50)
    @NotBlank(message = "empty description")
    @Pattern(regexp = ("^[a-z]{2,50}$"))
    private String description;

    @Column(name = "title", length = 20)
    @NotBlank(message = "empty title")
    @Pattern(regexp = ("^[a-z]{2,20}$"))
    private String title;

    @Column(name = "referance_code", length = 20)
    @NotBlank(message = "empty referenceCode")
    @Pattern(regexp = ("^[0-9]{2,20}$"))
    private String referenceCode;

    @Column(name = "size", length = 20)
    @NotBlank(message = "empty size")
    @Pattern(regexp = ("^[0-9]{2,20}$"))
    private String size;

}
