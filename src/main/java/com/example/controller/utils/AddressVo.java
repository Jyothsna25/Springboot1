package com.example.controller.utils;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class AddressVo 
{
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
		private long id;
		private String name;
		private String city;
		private long mobile;

}
