package com.capgemini.online_movie.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.online_movie.entity.Seat;

public interface SeatDao extends JpaRepository<Seat, Integer> {

}