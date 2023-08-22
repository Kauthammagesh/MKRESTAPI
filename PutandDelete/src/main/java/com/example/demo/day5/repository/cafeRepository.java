package com.example.demo.day5.repository;





import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.day5.model.cafeModel;



public interface cafeRepository extends JpaRepository<cafeModel, Integer> {

}
