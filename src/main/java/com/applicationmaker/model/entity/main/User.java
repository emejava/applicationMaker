
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

@Entity(name="userEntity")
@Table(name="user_tbl")

public class User {
    @Id
    @SequenceGenerator(name = "userSeq", sequenceName = "user_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "userSeq")
    private int id;

    @Column(name = "status", length = 20)
    @NotBlank(message = "empty status")
    // TODO: enum
    private String status;

    @Column(name = "user_name", length = 20)
    @NotBlank(message = "empty user name")
    @Pattern(regexp = ("^[a-z]{2,20}$"))
    private String userName;

    @Column(name = "password", length = 20)
    @NotBlank(message = "empty password")
    @Pattern(regexp = "[a-z]+[0-9]{2,20}")
    private String password;

    @Column(name = "nick_name", length = 20)
    @NotBlank(message = "empty nickname")
    @Pattern(regexp = ("^[a-z]{2,20}$"))
    private String nickName;

    @Column(name = "role", length = 20)
    @NotBlank(message = "empty role")
    // TODO: enum
    private String role;
}

