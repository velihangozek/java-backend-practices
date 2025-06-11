package org.velihangozek.library.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "publishers")
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "publisher_id", columnDefinition = "serial")
    private int id;

    @Column(name = "publisher_name", nullable = false, unique = true)
    private String name;

    @Column(name = "publisher_establishment_year")
    private int establishmentYear;

    @Column(name = "publisher_address")
    private String address;


}
