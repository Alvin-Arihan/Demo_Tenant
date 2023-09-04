package com.rpy.Alvin.p.service;

import com.rpy.Alvin.p.DTO.requestdto.TenantDTO;
import com.rpy.Alvin.p.DTO.responsedto.TenantResponse;
import com.rpy.Alvin.p.entity.Tenant;
import com.rpy.Alvin.p.repository.TenantRepository;
import com.rpy.Alvin.p.utility.Utillity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TenantServiceImpl implements TenantService{

    @Autowired
    TenantRepository tenantRepository;
    @Autowired
    Utillity utillity;
    @Override
    public TenantResponse addTenant(TenantDTO tenantDTO) {
        final Tenant tenant = utillity.parseTenantEntity(tenantDTO);
        return  utillity.parseTenantDto(tenantRepository.save(tenant));
    }

    @Override
    public TenantResponse updateTenant(TenantDTO tenantDTO) {
        return null;
    }

    @Override
    public TenantResponse deleteTenant(int tenantId) {
        return null;
    }

    @Override
    public TenantResponse findTenantId(int tenantId) {
        if(tenantId>0){
          return utillity.parseTenantDto(tenantRepository.findById(tenantId)) ;
        }

        return null;
    }

    @Override
    public List<Tenant> findAll() {
        final List<Tenant> tenants = tenantRepository.findAll();
//        return tenants.stream().map(tenant->utillity.parseTenantDto(tenant)).collect(Collectors.toList());
        return tenants;
    }

    @Override
    public List<TenantResponse> findByRoomId(int roomId) {
        return null;
    }
}
