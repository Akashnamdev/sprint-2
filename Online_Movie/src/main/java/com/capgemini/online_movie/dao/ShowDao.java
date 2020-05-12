package com.capgemini.online_movie.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.capgemini.online_movie.entity.Show;
public interface ShowDao extends JpaRepository<Show, Integer> {
}