package com.example.demo.day5.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cafemodel")

public class cafeModel {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int cafeid;
     @Column(name="cafename")
     private String cafeName;
     private String address;
	public int getCafeid() {
		return cafeid;
	}
	public void setCafeid(int cafeid) {
		this.cafeid = cafeid;
	}
	public String getCafeName() {
		return cafeName;
	}
	public void setCafeName(String cafeName) {
		this.cafeName = cafeName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	 
	
}
