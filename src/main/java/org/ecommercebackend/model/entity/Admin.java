package org.ecommercebackend.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.ecommercebackend.model.entity.enums.UserRole;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "admins")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private UUID uniqueId;

    private String fullName;
    private String username;
    private String email;
    private String password;
    private UserRole role;

    @ManyToMany
    List<Product> products = new ArrayList<>();

}
