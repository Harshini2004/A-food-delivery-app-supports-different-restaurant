package com.cdgn.Work4;

public class FastFood implements Restaurant {
	@Override
	public double Tot_bill(double base) {
		// TODO Auto-generated method stub
		double tax = base*0.05;
		double service = base*0.02;
		return base+tax+service;
	}
}
