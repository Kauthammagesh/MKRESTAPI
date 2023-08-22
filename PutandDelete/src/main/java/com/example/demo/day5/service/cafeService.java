package com.example.demo.day5.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.day5.model.cafeModel;
import com.example.demo.day5.repository.cafeRepository;

@Service
public class cafeService {
 @Autowired
     public cafeRepository crepo;
     //post cafe
     public String savecafe(cafeModel c) {
    	 crepo.save(c);
    	 return "Data is saved";
     }
     //get the data
     public List<cafeModel> getcafe() {
    	 return crepo.findAll();
     }
     //update the data
     public cafeModel updatecafe(cafeModel hm) {
    	 return crepo.saveAndFlush(hm);
     }
     public void deletecafe(int cafe_id) {
    	 System.out.println("Delete");
    	 crepo.deleteById(cafe_id);
     }
     
}
