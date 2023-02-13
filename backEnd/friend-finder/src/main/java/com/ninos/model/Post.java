package com.ninos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "image")
    private String image;

    @Column(name = "text")
    private String text;

    @Column(name = "likes")
    private Integer like;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


}
