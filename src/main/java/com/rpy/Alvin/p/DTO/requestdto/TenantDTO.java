package com.rpy.Alvin.p.DTO.requestdto;

import com.rpy.Alvin.p.constant.UtilityConstant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor

public class TenantDTO {

    private int id;
    private String name;
    private String fatherName;
    private String idNumber;
    private String idType;
    private Date dob;
    private String address;
    private int fatherMobile;
    private String email;
    private int mobile;
    private String refName;
    private String refId;
    private String refIdType;
    private int roomId;
    private UtilityConstant.Floor floor;
}
