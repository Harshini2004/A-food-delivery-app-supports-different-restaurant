package com.cdgn.Work4;

public class Buffet implements Restaurant {
	@Override
	public double Tot_bill(double base) {
		// TODO Auto-generated method stub
		double tax = base*0.08;
		double service = base*0.15;
		return base+tax+service;
	}

}
