package com.metaenlace.citasmedicas.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "patient")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private UserApp user;

    @Column(name = "nss")
    private String nss;

    @Column(name = "num_card", length = 10)
    private String numCard;

    @Column(name = "phone", length = 10)
    private String phone;

    @Column(name = "address")
    private String address;

}