package com.applicationmaker.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@Data
@SuperBuilder


@Entity(name="userEntity")
@Table(name="user_tbl")

@NamedQueries({
        @NamedQuery(name = "User.FindByUserName",query = "select oo from userEntity oo where oo.userName=:userName"),
        @NamedQuery(name = "User.FindByUserNameAndPassword",query = "select oo from userEntity oo where oo.userName=:userName and oo.password=:password"),
})
public class User extends Base{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="u_username",length = 20, unique = true)
    @Pattern(regexp = "^[A-Za-z]{10,30}$", message = "Invalid UserName")
    private String userName;


    @Column(name="u_password",length = 20)
    @Pattern(regexp = "^[A-Za-z]{8,30}$", message = "Invalid Password")
    private String password;

    @OneToOne
    private Person person;

    @OneToOne
    private Role role;
}