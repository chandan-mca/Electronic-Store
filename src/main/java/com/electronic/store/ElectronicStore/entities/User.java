package com.electronic.store.ElectronicStore.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class User {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private String id;

    @Column(name = "user_name")
    private String name;

    @Column(name = "user_email", unique = true)
    private String email;

    @Column(name = "user_password", length = 10)
    private String password;

    @Column(name = "user_gender")
    private String gender;

    @Column(name = "user_about")
    private String about;

    @Column(name = "image_name", length = 1000)
    private String imageName;
}
