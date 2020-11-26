package com.mc.service.serviceImpl;

import com.mc.bean.Guest;
import com.mc.dao.GuestDao;
import com.mc.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImpl implements GuestService {

    @Autowired
    private GuestDao dao;

    @Override
    public List<Guest> list() {
        return dao.getGuestList() ;
    }

    @Override
    public void add(Guest guest) {
        dao.add(guest);
    }

    @Override
    public void update(Guest guest) {
        dao.update(guest);
    }

    @Override
    public Guest getByName(String name) {
        return dao.getGuest(name);
    }

    public void delRole(String name){
        dao.delRole(name);
    }
}
