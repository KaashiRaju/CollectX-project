package com.example.collectx.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Entity
@Data
@Table(name="Audit_log")
@NoArgsConstructor
@AllArgsConstructor
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
