package com.andrzej.Animals;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andrzej on 05.06.17.
 *
 *
 */
public class Lizard extends AnimalsInTheShop implements Comparable<Lizard> {


	public Lizard(Integer price) {
		super(price);
	}


	@Override
	public int compareTo(Lizard lizard) {
		return getPrice().compareTo(lizard.getPrice());
	}
}
