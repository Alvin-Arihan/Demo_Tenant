package com.rpy.Alvin.p.utility;

import com.rpy.Alvin.p.DTO.requestdto.RoomDTO;
import com.rpy.Alvin.p.DTO.requestdto.TenantDTO;
import com.rpy.Alvin.p.DTO.responsedto.RoomResponse;
import com.rpy.Alvin.p.DTO.responsedto.TenantResponse;
import com.rpy.Alvin.p.entity.Room;
import com.rpy.Alvin.p.entity.Tenant;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Utillity {
//  Logger logger =

    ModelMapper modelMapper = new ModelMapper();


    public Room parseRoomEntity(RoomDTO roomDTO){
        Room roomEntity =null;
        try{
            roomEntity =   modelMapper.map(roomDTO, Room.class);
        }catch (Exception ex){
//            looger.info("Getting Error on roomEnity")

        }
        return roomEntity;
    }
    public RoomResponse parseRoomDto(Room  roomEntity){
        RoomResponse roomDto =null;
        System.out.println( roomEntity );
        try{
            roomDto =   modelMapper.map(roomEntity, RoomResponse.class);
//            roomDto.setTenantset(roomEntity.getTenantset());
        }catch (Exception ex){
//            looger.info("Getting Error on roomEnity");

        }
        return roomDto;
    }

    public Tenant parseTenantEntity(TenantDTO tenantDTO){
        Tenant tenantEntity =null;
        try{
            tenantEntity =   modelMapper.map(tenantDTO, Tenant.class);
        }catch (Exception ex){
//            looger.info("Getting Error on roomEnity");

        }
        return tenantEntity;
    }
    public TenantResponse parseTenantDto(Tenant tenantEntity){
        TenantResponse tenantDto =null;
        try{
            tenantDto =   modelMapper.map(tenantEntity, TenantResponse.class);
        }catch (Exception ex){
//            looger.info("Getting Error on roomEnity");

        }
        return tenantDto;
    }

}
