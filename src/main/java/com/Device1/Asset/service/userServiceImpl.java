package com.Device1.Asset.service;

import com.Device1.Asset.entity.device;
import com.Device1.Asset.entity.users;
import com.Device1.Asset.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userServiceImpl implements userService {

    @Autowired
    private userRepository userrepository;

    @Override
    public users saveUser(users usr) {
            return userrepository.save(usr);
        }

    @Override
    public List<users> fetchUserList() {
        return userrepository.findAll();
    }

    /*
    @Override
    public users fetchUserById(Long MitabeiterId) throws userNotFoundException {

        //return userrepository.findById(MitabeiterId);

        Optional<users> usr = userrepository .findById(MitabeiterId);
        //if(!usr.isPresent()){
            if(usr.isPresent()){
            return usr.get();
           // throw new userNotFoundException("user does not exist!") ;
        }
        //return usr.get();
        throw new userNotFoundException("user does not exist!") ;


    }
*/
    @Override
    public users fetchUser(Long MitabeiterId) {

       // return userrepository.findById(MitabeiterId).orElseThrow();
        return  userrepository.findById(MitabeiterId).orElseThrow();
        }

        /*
    @Override
    public users saveMitabeiterIdToDevice(Long dev, Long MitabeiterId) {
        //check if
        userrepository.findById(MitabeiterId);


    }

/*
    @Override
    public users saveToDevice(Long deviceId,Long mitabeiterId) {

        //check if MitabeiterId is free on the devices DB table
        //if(mitabeiter.getMitabeiterId()== null){
       users usr = new users();
       usr.setMitabeiterId(mitabeiterId);
       device dev = new device();
       dev.
       return userrepository.save(usr);


    }
*/

}



