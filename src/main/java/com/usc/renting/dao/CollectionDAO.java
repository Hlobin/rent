package com.usc.renting.dao;

import com.usc.renting.pojo.Collection;
import com.usc.renting.pojo.House;
import com.usc.renting.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CollectionDAO extends JpaRepository<Collection,Integer> {
    Collection getByUserAndHouse(User user, House house);
    List<Collection> getAllByUser(User user);
    void deleteAllByHouse(House house);
}
