package com.example.springRestMySQL.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
@Table(name = "users")
public class RestUser {

    @Id
    @Column(name="name")
    private String userName;

    @Column(name="password")
    private String userPassword;
}
