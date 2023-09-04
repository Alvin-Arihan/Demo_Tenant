package com.rpy.Alvin.p.service;

import com.rpy.Alvin.p.DTO.requestdto.RoomDTO;
import com.rpy.Alvin.p.DTO.responsedto.RoomResponse;
import com.rpy.Alvin.p.entity.Room;
import com.rpy.Alvin.p.repository.RoomRepository;
import com.rpy.Alvin.p.utility.Utillity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service("roomServiceImpl")
public class RoomServiceImpl implements RoomService{

    @Autowired
    RoomRepository roomRepository;
    @Autowired
    Utillity utillity;


    @Override
    public RoomResponse addRoom(RoomDTO roomDTO) {
        Room room = utillity.parseRoomEntity(roomDTO);
        room = roomRepository.save(room);
        return utillity.parseRoomDto(room);
    }

    @Override
    public RoomResponse updateRoom(RoomDTO roomDTO) {
       if(roomDTO.getId()<=0)
           return null;

        Room roomById = roomRepository.findById(roomDTO.getId());
        if(roomById !=null){
             return addRoom(roomDTO);
        }
        return null;
    }

    @Override
    public boolean deleteRoom(int roomId) {
        if(roomId<=0)
            return false;

        Room roomById = roomRepository.findById(roomId);
        if(roomById !=null){
            roomRepository.delete(roomById);
            return true;
        }
        return false;
    }

    @Override
    public RoomResponse findRoomId(int roomId) {
        if(roomId<=0)
            return null;

        return utillity.parseRoomDto(roomRepository.findById(roomId));
   }

    @Override
    public List<RoomResponse> findAll() {
        final List<Room> rooms = roomRepository.findAll();
        return rooms.stream().map(room->utillity.parseRoomDto(room)).collect(Collectors.toList());
    }

    @Override
    public RoomResponse findByTenant(String name) {
        return utillity.parseRoomDto(roomRepository.findByTenantsetName(name));
    }

    @Override
    public RoomResponse findByTenantId(int id) {
        return utillity.parseRoomDto(roomRepository.findByTenantsetId(id));
    }
}
