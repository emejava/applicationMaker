
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

@Entity(name="stuffEntity")
@Table(name="stuff_tbl")

public class Stuff {
    @Id
    @SequenceGenerator(name = "stuffSeq", sequenceName = "stuff_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "stuffSeq")
    private int id;

    @Column(name = "group_name", length = 20)
    @NotBlank(message = "empty group")
    @Pattern(regexp = ("^[a-z]{2,20}$"))
    private String group;

    @Column(name = "subgroup_name", length = 20)
    @NotBlank(message = "empty subgroup")
    @Pattern(regexp = ("^[a-z]{2,20}$"))
    private String subGroup;

    @Column(name = "stuff_name", length = 20)
    @NotBlank(message = "empty name")
    @Pattern(regexp = "[a-z]+[0-9]{2,20}")
    private String name;

    @Column(name = "stuff_code", length = 20)
    @Pattern(regexp = "[0-9]{2,20}")
    @NotBlank(message = "empty code")
    private String code;

    @Column(name = "stuff_barcode", length = 20)
    @NotBlank(message = "empty barcode")
    // TODO: 9/13/2023 document(we have to upload image)
    private String barcode;

    @Column(name = "stuff_model", length = 20)
    @NotBlank(message = "empty model")
    @Pattern(regexp = "[a-z]+[0-9]{2,20}")
    private String model;

    @Column(name = "stuff_detail", length = 100)
    @NotBlank(message = "empty detail")
    @Pattern(regexp = "[a-z]+[0-9]{2,100}")
    private String detail;


    @Column(name = "stuff_brand", length = 20)
    @NotBlank(message = "empty brand")
    @Pattern(regexp = ("^[a-z]{2,20}$"))
    private String brand;

    @Column(name = "stuff_expiredate", length = 20)
    @NotBlank(message = "empty expire date")
    @Pattern(regexp = "[0-9]{4}[\\]{1}[0-9]{2}[\\]{1}[0-9]{2}")
    private String expireDate;

    @Column(name = "stuff_price", length = 20)
    @NotBlank(message = "empty price")
    @Pattern(regexp = ("^[0-9]{2,20}$"))
    private int price;


}
