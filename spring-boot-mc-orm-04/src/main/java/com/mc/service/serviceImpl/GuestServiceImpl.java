package com.mc.service.serviceImpl;



import com.mc.domain.Guest;
import com.mc.repository.GuestRepository;
import com.mc.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImpl implements GuestService {

    @Autowired
    private GuestRepository repository;

    @Override
    public List<Guest> list() {
        return repository.findAll();
    }


}
