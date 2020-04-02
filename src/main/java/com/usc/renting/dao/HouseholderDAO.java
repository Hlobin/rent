package com.usc.renting.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usc.renting.pojo.Householder;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HouseholderDAO extends JpaRepository<Householder,Integer>
{
    List<Householder> findByNameLike(String name);
//    根据电话找到户主
    Householder findByTel(String tel);

    int countByIdNot(int id);
}