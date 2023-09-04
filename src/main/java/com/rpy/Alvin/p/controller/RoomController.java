package com.rpy.Alvin.p.controller;



import com.rpy.Alvin.p.DTO.requestdto.RoomDTO;
import com.rpy.Alvin.p.DTO.requestdto.TenantDTO;
import com.rpy.Alvin.p.DTO.responsedto.ResponseDTO;
import com.rpy.Alvin.p.DTO.responsedto.RoomResponse;
import com.rpy.Alvin.p.controller.api.ApiConstant;
import com.rpy.Alvin.p.service.RoomService;
import com.rpy.Alvin.p.service.RoomServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(ApiConstant.CORE_ROOM_API)
public class RoomController {

    @Autowired
    RoomServiceImpl roomServiceImpl;

    @GetMapping()
    public ResponseDTO<List<RoomResponse>> fetchAllRoom1(){
        final List<RoomResponse> roomDTOs = roomServiceImpl.findAll();
        ResponseDTO<List<RoomResponse>> responseDTO =new ResponseDTO<>();
        responseDTO.setStatus("Successful");
        responseDTO.setMsg("Request updated Successfully");
        responseDTO.setStatusCode(200);
        responseDTO.setData(roomDTOs);
        return responseDTO;
    }
    @PostMapping(ApiConstant.ADD_ROOM)
    public ResponseDTO<RoomResponse> addRoom(@RequestBody RoomDTO roomDTO){
        final RoomResponse roomDTO1 = roomServiceImpl.addRoom(roomDTO);
        ResponseDTO<RoomResponse> responseDTO =new ResponseDTO<>();
        responseDTO.setStatus("Successful");
        responseDTO.setMsg("Request add Successfully");
        responseDTO.setStatusCode(200);
        responseDTO.setData(roomDTO1);
        return responseDTO;
    }
    @PostMapping(ApiConstant.UPDATE_ROOM)
    public ResponseDTO<RoomResponse> updateRoom(@RequestBody RoomDTO roomDTO){
        final RoomResponse roomDTO1 = roomServiceImpl.updateRoom(roomDTO);
        ResponseDTO<RoomResponse> responseDTO =new ResponseDTO<>();
        responseDTO.setStatus("Successful");
        responseDTO.setMsg("Request updated Successfully");
        responseDTO.setStatusCode(200);
        responseDTO.setData(roomDTO1);
        return responseDTO;
    }

    @GetMapping(value=ApiConstant.FETCH_ROOM)
    public ResponseDTO<List<RoomResponse>> fetchAllRoom(){
        final List<RoomResponse> roomDTOs = roomServiceImpl.findAll();
        ResponseDTO<List<RoomResponse>> responseDTO =new ResponseDTO<>();
        responseDTO.setStatus("Successful");
        responseDTO.setMsg("Request updated Successfully");
        responseDTO.setStatusCode(200);
        responseDTO.setData(roomDTOs);
        return responseDTO;
    }

    @GetMapping(ApiConstant.FETCH_ROOM_BY_ID)
    public ResponseDTO<RoomResponse> fetchRoomById(@PathVariable int roomId){
        final RoomResponse roomDTO1 = roomServiceImpl.findRoomId(roomId);
        ResponseDTO<RoomResponse> responseDTO =new ResponseDTO<>();
        responseDTO.setStatus("Successful");
        responseDTO.setMsg("Request updated Successfully");
        responseDTO.setStatusCode(200);
        responseDTO.setData(roomDTO1);
        return responseDTO;
    }
    @GetMapping(ApiConstant.FETCH_ROOM_BY_TENANT_ID)
    public ResponseDTO<RoomResponse> fetchRoomByTenantId(@PathVariable int tenantId){
        final RoomResponse roomDTO1 = roomServiceImpl.findByTenantId(tenantId);
        ResponseDTO<RoomResponse> responseDTO =new ResponseDTO<>();
        responseDTO.setStatus("Successful");
        responseDTO.setMsg("Request updated Successfully");
        responseDTO.setStatusCode(200);
        responseDTO.setData(roomDTO1);
        return responseDTO;
    }
    @GetMapping(ApiConstant.FETCH_ROOM_BY_TENANT_NAME)
    public ResponseDTO<RoomResponse> updateRoom(@PathVariable String name){
        final RoomResponse roomDTO1 = roomServiceImpl.findByTenant(name);
        ResponseDTO<RoomResponse> responseDTO =new ResponseDTO<>();
        responseDTO.setStatus("Successful");
        responseDTO.setMsg("Request updated Successfully");
        responseDTO.setStatusCode(200);
        responseDTO.setData(roomDTO1);
        return responseDTO;
    }
    @GetMapping(ApiConstant.DELETE_ROOM)
    public ResponseDTO<Boolean> deleteRoom(@PathVariable int roomId){
        final Boolean roomDTO1 = roomServiceImpl.deleteRoom(roomId);
        ResponseDTO<Boolean> responseDTO =new ResponseDTO<>();
        responseDTO.setStatus("Successful");
        responseDTO.setMsg("Request updated Successfully");
        responseDTO.setStatusCode(200);
        responseDTO.setData(roomDTO1);
        return responseDTO;
    }
}
