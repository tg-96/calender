package com.org.core;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class SimpleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
