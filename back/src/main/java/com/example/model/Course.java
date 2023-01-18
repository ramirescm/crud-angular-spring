package com.example.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    @Column(length = 200, nullable = false)
    public String name;
    @Column(length = 200, nullable = false)
    public String category;
}
