package com.rpy.Alvin.p.entity;

import jakarta.persistence.Column;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;


import java.io.Serializable;
import java.util.Date;

public class BaseEntity implements Serializable {


    @CreatedDate
    @Column(name="created_at", nullable = false, updatable = false)
    protected Date createdAt;

    @CreatedBy
    @Column(name="created_by", nullable = false, updatable = false)
    protected Date createdBy;

    @CreatedBy
    @Column(name="updated_by", nullable = false, updatable = false)
    protected Date updatedBy;
    @CreatedDate
    @Column(name="updated_at", nullable = false, updatable = false)
    protected Date updatedAt;
}
