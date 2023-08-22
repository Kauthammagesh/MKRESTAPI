package com.example.demo.day5.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.day5.model.cafeModel;
import com.example.demo.day5.service.cafeService;

@RestController
public class cafeController {

	@Autowired
	public 	cafeService cserv;
	@PostMapping("/postcafe")
	public String postHotel(@RequestBody cafeModel cr) {
		cserv.savecafe(cr);
		return "Data saved";
	}
	@GetMapping("/getcafe")
	public List<cafeModel>getcafeInfo(){
		return cserv.getcafe();
	}
	@PutMapping("/updatecafe")
	public cafeModel updatecafeInfo(@RequestBody cafeModel ca) {
		return cserv.updatecafe(ca);
	}
	@DeleteMapping("/delete/{id}")
	
	public String deletecafe(@PathVariable("id")int cafeid) {
		cserv.deletecafe(cafeid);
		return "cafe with this"+cafeid+"is deleted";
		
	}
	
}
