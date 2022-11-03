package com.Device1.Asset.service;

import com.Device1.Asset.entity.users;

import java.util.List;

public interface userService {

    public users saveUser(users usr);

    public List<users> fetchUserList();

   // public users fetchUserById(Long mitabeiterId) throws userNotFoundException;

    public users fetchUser(Long mitabeiter_id);


   // users saveMitabeiterIdToDevice(Long dev, Long MitabeiterId);
}
