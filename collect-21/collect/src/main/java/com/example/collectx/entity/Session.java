package com.example.collectx.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sessionId;

    private String token;

    private LocalDateTime loginTime;

    private String ipAddress;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;
}