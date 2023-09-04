package com.rpy.Alvin.p.DTO.requestdto;

import com.rpy.Alvin.p.constant.UtilityConstant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoomDTO {
   private int id;
   private UtilityConstant.Floor floor;

   private Set<TenantDTO> member;
   private double rent;
   private int allowedMember;


}
