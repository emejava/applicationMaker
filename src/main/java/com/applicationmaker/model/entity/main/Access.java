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

@Entity(name="access")
@Table(name="access_tbl")

public class Access {
    @Id
    @SequenceGenerator(name = "accessSeq", sequenceName = "access_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "accessSeq")
    private int id;

    @Column(name = "phone_number", length = 20)
    @NotBlank(message = "empty phone number")
    @Pattern(regexp = ("^[0-9]{11}$"))
    private String phoneNumber;

    @Column(name = "instagram_id", length = 20)
    @NotBlank(message = "empty instagramId")
    @Pattern(regexp = ("^[\\w\\.]{2,20}"))
    private String instagramId;

    @Column(name = "telegram_id", length = 20)
    @NotBlank(message = "empty telgramId")
    @Pattern(regexp = ("^[\\w\\.]{2,20}"))

    private String telegramId;

    @Column(name = "email_address", length = 20)
    @NotBlank(message = "empty email")
    @Pattern(regexp = ("[\\w\\.]+@[\\w\\.]+\\.com"))
    private String email;

}


