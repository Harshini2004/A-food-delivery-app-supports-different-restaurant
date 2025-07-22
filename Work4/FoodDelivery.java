package com.cdgn.Work4;

import java.util.Scanner;

public class FoodDelivery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Select one option\n1.FastFood\n2.Buffet\n3.FineDinning");
		String s = sc.nextLine();
		RestaurantType r = new RestaurantType();
		Restaurant res;
		if(r.restaurantType(s)!=null) {
			System.out.println("Enter base price");
			int n = sc.nextInt();
			res = r.restaurantType(s);
			System.out.println("Total bill : "+res.Tot_bill(n));
		}else {
			System.out.println("Invalid restaurant Type");
		}
	}

}
