package com.rpy.Alvin.p.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.rpy.Alvin.p.constant.UtilityConstant;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.sql.Date;
@EqualsAndHashCode(callSuper = true)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@NoArgsConstructor
@AllArgsConstructor
@Table(name="tenant")
@Entity
public class Tenant  extends BaseEntity  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    private String fatherName;
    private String idNumber;
    private UtilityConstant.IDType idType;
    private Date dob;
    private String address;
    private int fatherMobile;
    private String email;
    private int mobile;
    private String refName;
    private String refId;
    private UtilityConstant.IDType refIdType;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="room_id", nullable=false, referencedColumnName ="id" )
    private Room room;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public UtilityConstant.IDType getIdType() {
        return idType;
    }

    public void setIdType(UtilityConstant.IDType idType) {
        this.idType = idType;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getFatherMobile() {
        return fatherMobile;
    }

    public void setFatherMobile(int fatherMobile) {
        this.fatherMobile = fatherMobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public String getRefName() {
        return refName;
    }

    public void setRefName(String refName) {
        this.refName = refName;
    }

    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId;
    }

    public UtilityConstant.IDType getRefIdType() {
        return refIdType;
    }

    public void setRefIdType(UtilityConstant.IDType refIdType) {
        this.refIdType = refIdType;
    }
//    @JsonBackReference
    public Room getRoom() {
        return room;
    }
//@JsonBackReference
@JsonManagedReference
    public void setRoom(Room room) {
        this.room = room;
    }
}
