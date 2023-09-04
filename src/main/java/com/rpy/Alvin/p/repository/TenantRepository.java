package com.rpy.Alvin.p.repository;

import com.rpy.Alvin.p.entity.Room;
import com.rpy.Alvin.p.entity.Tenant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TenantRepository extends JpaRepository<Tenant, Integer> {
    Tenant findById(int id);
    List<Tenant> findByName(String name);
    List<Tenant> findByRoomId(int roomId);
    List<Tenant> findByMobile(int mobile);


}
