package com.rpy.Alvin.p.controller;

import com.rpy.Alvin.p.DTO.requestdto.TenantDTO;
import com.rpy.Alvin.p.DTO.responsedto.ResponseDTO;
import com.rpy.Alvin.p.DTO.responsedto.TenantResponse;
import com.rpy.Alvin.p.controller.api.ApiConstant;
import com.rpy.Alvin.p.entity.Tenant;
import com.rpy.Alvin.p.service.TenantServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = ApiConstant.CORE_TENANT_API)
public class TenantController {

    @Autowired
    TenantServiceImpl tenantServiceImpl;
    @PostMapping(value = ApiConstant.ADD_TENANT )
    public ResponseDTO<TenantResponse> addTenantDetails(@RequestBody TenantDTO tenantDTO){
        final TenantResponse tenantDTO1 = tenantServiceImpl.addTenant(tenantDTO);
        final ResponseDTO<TenantResponse> objectResponseDTO = new ResponseDTO<>();
        objectResponseDTO.setMsg("Save data");
        objectResponseDTO.setStatusCode(200);
        objectResponseDTO.setStatus("Successful");
        objectResponseDTO.setData(tenantDTO1);

        return objectResponseDTO ;
    }

    @GetMapping(value = ApiConstant.FETCH_TENANT)
    public List<Tenant> fetchAllTenants(){
     return   tenantServiceImpl.findAll();
    }
    @GetMapping(value = ApiConstant.FETCH_TENANT+"/{id}")
    public TenantResponse fetchTenantById(@PathVariable int id ){
        return   tenantServiceImpl.findTenantId(id);
    }
}
