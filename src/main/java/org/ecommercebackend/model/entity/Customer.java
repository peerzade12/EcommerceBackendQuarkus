package org.ecommercebackend.model.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.ecommercebackend.model.entity.enums.UserRole;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int custId;

    private String fullName;
    private UserRole role;
    private String username;
    private String email;
    private String password;

    @ManyToMany
    List<Product> products = new ArrayList<>();

    @OneToMany(mappedBy = "customer", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonManagedReference
    List<Order> orders = new ArrayList<>();

    @OneToOne(mappedBy = "customer", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonManagedReference
    Cart cart;

}
