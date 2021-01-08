package com.mc.service.serviceImpl;


import com.mc.domain.Guest;
import com.mc.mapper.GuestMapper;
import com.mc.service.GuestService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service
public class GuestServiceImpl extends ServiceImpl<GuestMapper,Guest> implements GuestService { }
