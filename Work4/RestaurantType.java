package com.cdgn.Work4;

public class RestaurantType {
	public Restaurant restaurantType(String s) {
		switch(s.toLowerCase()) {
		case "fastfood":{
			return new FastFood(); 
		}
		case "buffet":{
			return new Buffet();
		}
		case "finedinning":{
			return new FineDinning(); 
		}
		default:{
			return null;
		}
		}
	}
}
