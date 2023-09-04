package com.rpy.Alvin.p.DTO.responsedto;

import com.rpy.Alvin.p.DTO.requestdto.TenantDTO;
import com.rpy.Alvin.p.constant.UtilityConstant;
import com.rpy.Alvin.p.entity.Tenant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoomResponse {
   private int id;
   private UtilityConstant.Floor floor;

   private Set<Tenant> tenantset;

   private double rent;
   private int allowedMember;


}
