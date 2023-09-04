package com.rpy.Alvin.p.service;

import com.rpy.Alvin.p.DTO.requestdto.TenantDTO;
import com.rpy.Alvin.p.DTO.responsedto.TenantResponse;
import com.rpy.Alvin.p.entity.Tenant;

import java.util.List;

public interface TenantService {


    public TenantResponse addTenant(TenantDTO tenantDTO);
    public TenantResponse updateTenant(TenantDTO tenantDTO);
    public TenantResponse deleteTenant(int tenantId);
    public TenantResponse findTenantId(int tenantId);
    public List<Tenant> findAll();
    public List<TenantResponse> findByRoomId(int roomId);

}
