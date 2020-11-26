package com.mc.service;


import com.mc.bean.Guest;

import java.util.List;

public interface GuestService {

    List<Guest> list();

    void add(Guest guest);

    void update(Guest guest);

    Guest getByName(String name);

    void delRole(String name);


}
