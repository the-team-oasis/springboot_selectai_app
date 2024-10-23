package com.example.selectaiapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.selectaiapp.model.Movie;

public interface SelectAIRepository extends JpaRepository<Movie, Long> {
}
