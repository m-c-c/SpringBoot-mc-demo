package com.mc.mappers2;

import com.mc.domain.Guest;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface GuestMapper2 {
    @Select("select * from guest")
     List<Guest> selectAll();
}
