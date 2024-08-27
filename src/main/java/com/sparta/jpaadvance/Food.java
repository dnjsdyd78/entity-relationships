package com.sparta.jpaadvance;

import jakarta.persistence.*;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Setter
@Entity
@Table(name = "food")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}