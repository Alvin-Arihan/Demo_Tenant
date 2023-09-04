package com.rpy.Alvin.p.service;

import com.rpy.Alvin.p.DTO.requestdto.RoomDTO;
import com.rpy.Alvin.p.DTO.responsedto.RoomResponse;
import org.springframework.stereotype.Service;

import java.util.List;

public interface RoomService {

    public RoomResponse addRoom(RoomDTO roomDTO);
    public RoomResponse updateRoom(RoomDTO roomDTO);
    public boolean deleteRoom(int roomId);
    public RoomResponse findRoomId(int roomId);
    public List<RoomResponse> findAll();
    public RoomResponse findByTenant(String name);
    public RoomResponse findByTenantId(int id);
}
