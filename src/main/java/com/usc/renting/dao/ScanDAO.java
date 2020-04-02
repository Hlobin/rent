package com.usc.renting.dao;

import com.usc.renting.pojo.Scan;
import com.usc.renting.pojo.House;
import com.usc.renting.pojo.Message;
import com.usc.renting.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScanDAO extends JpaRepository<Scan,Integer> {
    Scan getByUserAndHouse(User user, House house);

    List<Scan> getAllByUserOrderById(User user);

    void deleteAllByHouse(House house);

    int countByIdIsNot(Integer id);
}
