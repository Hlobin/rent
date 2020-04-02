package com.usc.renting.dao;

import com.usc.renting.pojo.Statistics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatisticsDAO extends JpaRepository<Statistics,Integer> {

}
