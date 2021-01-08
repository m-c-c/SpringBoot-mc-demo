package com.mc.service;


import com.mc.domain.Guest;

import java.util.List;

public interface GuestService {

    List<Guest> list();

    void save(Guest guest);


}
