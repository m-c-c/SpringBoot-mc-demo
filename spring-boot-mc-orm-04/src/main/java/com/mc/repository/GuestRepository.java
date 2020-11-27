package com.mc.repository;


import com.mc.bean.Guest;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * 仓库
 */
public interface GuestRepository extends JpaRepository<Guest,Long> {//仓库的泛型 对应的类,主键


}
