package com.mc.service.serviceImpl;


import com.mc.domain.Guest;
import com.mc.mappers.GuestMapper;
import com.mc.mappers2.GuestMapper2;
import com.mc.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GuestServiceImpl implements GuestService {


    @Autowired
    private GuestMapper2 mapper2;

    @Autowired
    private GuestMapper mapper;

//    @Autowired
//    private TkGuestMapper mapper1;

    @Override
    public List<Guest> list() {
        return mapper.selectAll();
    }

    @Override
    public void save(Guest guest) {
        mapper.save(guest);
    }
}
