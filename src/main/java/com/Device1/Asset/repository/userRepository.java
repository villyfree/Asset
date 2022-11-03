package com.Device1.Asset.repository;

import com.Device1.Asset.entity.users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface userRepository extends JpaRepository<users, Long> {
   // users save(users usr, Long deviceId);


    //Optional<Object> findById(Long mitabeiterId, users usr);
}
