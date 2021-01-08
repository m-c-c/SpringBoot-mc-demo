package com.mc.mappers;

import com.mc.domain.Guest;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface GuestMapper {
    @Select("select * from guest")
     List<Guest> selectAll();

    @Insert("insert into guest values(1008,#{name},#{role})")
    void save(Guest guest);
}
