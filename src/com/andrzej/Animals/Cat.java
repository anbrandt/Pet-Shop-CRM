package com.andrzej.Animals;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andrzej on 05.06.17.
 *
 *
 *
 */
public class Cat extends AnimalsInTheShop implements Comparable<Cat> {

	private Integer ageOfTheCat;



	public Cat(Integer price, Integer ageOfTheCat) {
		super(price);
		this.ageOfTheCat = ageOfTheCat;
	}

	public Integer getAgeOfTheCat() {
		return ageOfTheCat;
	}

	@Override
	public int compareTo(Cat cat) {
		return getAgeOfTheCat().compareTo(cat.getAgeOfTheCat());
	}
}
