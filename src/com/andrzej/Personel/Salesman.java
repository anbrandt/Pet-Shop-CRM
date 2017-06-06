package com.andrzej.Personel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andrzej on 05.06.17.
 */
public class Salesman extends ShopPersonel implements Comparable {



	public Salesman(String surname, String employeeID, Integer age, Integer dailyIncome) {
		super(surname, employeeID, age, dailyIncome);
	}




	@Override
	public int compareTo(Object o) {
		return 0;
	}







}
