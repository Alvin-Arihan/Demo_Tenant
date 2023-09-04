package com.rpy.Alvin.p.repository;

import com.rpy.Alvin.p.constant.UtilityConstant;
import com.rpy.Alvin.p.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface RoomRepository extends JpaRepository<Room, Integer> {
    Room findById(int id);
    Room findByFloor(UtilityConstant.Floor floor);

    Room findByTenantsetName(String name);

    Room findByTenantsetId(int id);
}
