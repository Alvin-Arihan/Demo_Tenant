package com.rpy.Alvin.p.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.rpy.Alvin.p.constant.UtilityConstant;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;
import java.util.Set;
@EqualsAndHashCode(callSuper = true)

@NoArgsConstructor
@AllArgsConstructor
@Table(name="room")
@Entity
public class Room extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(EnumType.STRING)
    private UtilityConstant.Floor floor ;

    private double rent;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "room")
    private List<Tenant> tenantset;
//    @OneToMany
//    private Set<Payment> payments;

    private  int allowedMember;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UtilityConstant.Floor getFloor() {
        return floor;
    }

    public void setFloor(UtilityConstant.Floor floor) {
        this.floor = floor;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }
//    @JsonManagedReference
    @JsonBackReference
    public List<Tenant> getTenantset() {
        return tenantset;
    }

    public void setTenantset(List<Tenant> tenantset) {
        this.tenantset = tenantset;
    }

    public int getAllowedMember() {
        return allowedMember;
    }

    public void setAllowedMember(int allowedMember) {
        this.allowedMember = allowedMember;
    }
}
