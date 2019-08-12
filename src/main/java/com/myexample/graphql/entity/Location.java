package com.myexample.graphql.entity;

import javax.persistence.*;

@Entity
public class Location {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	@Column
    private String name;
	@Column
    private String address;

    public Location(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Location(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Location() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
