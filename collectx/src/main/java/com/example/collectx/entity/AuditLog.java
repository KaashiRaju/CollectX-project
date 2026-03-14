package com.example.collectx.entity;


import jakarta.persistence.*;



import java.time.LocalDateTime;

@Entity
public class AuditLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long auditId;

    private String action;

    private String resource;

    private LocalDateTime timestamp;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;
}
