package com.cdgn.Work4;

public class FineDinning implements Restaurant {
	@Override
	public double Tot_bill(double base) {
		// TODO Auto-generated method stub
		double tax = base*0.25;
		double service = base*0.2;
		return base+tax+service;
	}

}
