package com.mc.dao;

import com.mc.domain.Guest;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class GuestDao {

    static List<Guest> guestList = new ArrayList<>();

    static {
        guestList.add(new Guest("黄晓明","店长"));
        guestList.add(new Guest("秦海璐","会计"));
        guestList.add(new Guest("林大厨","厨师"));
        guestList.add(new Guest("王俊凯","经理"));
        guestList.add(new Guest("前台","杨子"));
    }

    public List<Guest> getGuestList(){
        return guestList;
    }

    public void add(Guest guest){
        guestList.add(guest);
    }

    public void update(Guest newGuest){
        Guest guest1 = getGuest(newGuest.getName());
        guest1.setRole(newGuest.getRole());
    }


    public Guest getGuest(String name){
        for (Guest guest : guestList){
            if (guest.getName().equals(name)){
                return guest;
            }
        }
        return new Guest("","");
    }

    public void delRole(String name){
        guestList.remove(getGuest(name));
    }

}
