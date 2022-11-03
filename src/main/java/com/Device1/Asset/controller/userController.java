package com.Device1.Asset.controller;

import com.Device1.Asset.entity.device;
import com.Device1.Asset.entity.users;

import com.Device1.Asset.error.userNotFoundException;
import com.Device1.Asset.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class userController {

    @Autowired
    private userService userservice;

    @PostMapping("/user")
    public users saveUser(@RequestBody users usr) {
        return userservice.saveUser(usr);
    }


    @GetMapping("/users")
    public List<users> fetchUserList(){

        return userservice.fetchUserList();

    }
    /*
    @GetMapping("/user/{MitabeiterId}")
    public users fetchtUserById(@PathVariable ("MitabeiterId") Long  MitabeiterId) throws userNotFoundException {
        return userservice.fetchUserById(MitabeiterId);
    }
*/
    @GetMapping("/users/{MitabeiterId}")
    public users fetchUser(@PathVariable ("MitabeiterId") Long MitabeiterId){
        return userservice.fetchUser(MitabeiterId);

    }

/*

    @PutMapping("/{users}/{device}")
    public users saveMitabeiterIdToDevice(@PathVariable Long dev, @PathVariable Long MitabeiterId){

     //check if deviceId exists
       return userservice.saveMitabeiterIdToDevice(dev,MitabeiterId);

*/





}
