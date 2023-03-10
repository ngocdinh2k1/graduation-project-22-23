package com.graduationproject.backend.backendwebsiteshoe.entity;

import jakarta.persistence.Column;
import lombok.Data;

import java.io.Serializable;

@Data
public class PasswordEntityKey implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    public PasswordEntityKey setPk(Long userId) {
        setUserId(userId);
        return this;
    }
}
