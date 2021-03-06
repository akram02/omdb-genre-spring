package com.newscred.omdb.genre.database.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@Table(name = "users")
public class User {

    @Id
    @Column(nullable = false)
    private UUID id;

    @Column
    private String firstname;

    @Column
    private String middlename;

    @Column
    private String lastname;

    @Column
    private String email;

    @Column
    private String password;

    @Column
    private String address;

    @Column
    private String phone;

    @JsonIgnore
    @OneToOne(mappedBy = "user")
    private UserDetail detail;

}
