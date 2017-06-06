package com.andrzej;

import com.andrzej.Animals.Cat;
import com.andrzej.Animals.Lizard;
import com.andrzej.Personel.Manager;
import com.andrzej.Personel.Salesman;

import java.util.*;
import java.util.stream.Stream;

import static java.util.Collections.*;

/**
 * Created by andrzej on 05.06.17.
 * <p>
 * This class contains the backend of the shop
 * <p>
 * - add all cats
 * - add all animals
 * - sort them by age
 * - sort them by price
 * - add salesmans
 * - add managers
 * - sort them by name
 */
public class Shop implements Comparable, Comparator {

	//SALESMANS
	List<Salesman> listOfAllSalesmans = new ArrayList<>();

	public void addSalesmanToTheShop(Salesman salesman) {
		listOfAllSalesmans.add(salesman);
	}

	//MANAGERS
	List<Manager> listOfAllManagers = new ArrayList<>();


	public void addManagerToTheShop(Manager manager) {
		listOfAllManagers.add(manager);
	}


	//CATS

	List<Cat> allCatsInTheShop = new ArrayList<>();
	List<Cat> saledCats = new ArrayList<>();

	public void addCatToTheShop(Cat cat) {
		allCatsInTheShop.add(cat);
	}

	public void removeTheCat(Cat cat) {
		allCatsInTheShop.remove(cat);
	}


	//put the saled cat in the saledCat array list
	public void saleTheCat(Cat cat) {
		allCatsInTheShop.remove(cat);
		saledCats.add(cat);
	}

	public void sale() {

		String inputAnimal;
		String inputSalesman;

		Cat cat = null;
		Lizard lizard = null;
		Salesman salesman = null;

		int lizardindex = 0;
		int catindex = 0;
		Integer price = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("What would you like to buy? Type cat or lizard");
		inputAnimal = scanner.next();

		System.out.println("Who is selling this animal? Write a surname");
		inputSalesman = scanner.next();


		if (inputAnimal.equals("cat")) {
			allCatsInTheShop.stream()
//					.findFirst().ge
			

			System.out.println("The cat costs " + allCatsInTheShop.get(catindex).getPrice());
			saleTheCat(cat);
			System.out.println(allCatsInTheShop.get(catindex).getPrice());
			catindex++;

		} else if (inputAnimal.equals("lizard")) {
			System.out.println("The lizard costs " + allLizardsInTheShop.get(lizardindex).getPrice());
			price = allLizardsInTheShop.get(lizardindex).getPrice();
			saleTheLizard(lizard);
			lizardindex++;

		} else {
			System.out.println("There is no animal like this. You have to choose between cat and lizard");
			sale();
		}

//		System.out.println("Who is selling you this animal? Write a surname");
//		inputSalesman = scanner.next();
//		for (int i = 0; i < listOfAllSalesmans.size(); i++) {
//
//			if (inputSalesman.equals(listOfAllSalesmans.get(i).getSurname())) {
//				System.out.println("You choose the salesman " + listOfAllSalesmans.get(i).getSurname());
//				int income = listOfAllSalesmans.get(i).getDailyIncome();
//				income += price;
//
//				System.out.println("The salesman earned " + listOfAllSalesmans.get(i).getDailyIncome());
//			} else {
//				System.out.println("There is no salesman with this name. You have to choose from this names: ");
//				getAllSalesmans();
//				sale();
//
//			}


//		switch (inputAnimal) {
//			case "cat":
//				System.out.println("The cat costs " + allCatsInTheShop.get(0).getPrice());
//				price = allCatsInTheShop.get(0).getPrice();
//				cat = allCatsInTheShop.remove(0);
//				saledCats.add(cat);
//				System.out.println("Who is selling the animal? Write the surname of the salesman");
//				inputSalesman = scanner.next();
//				for (int i = 0; i < listOfAllSalesmans.size(); i++) {
//					if (inputSalesman.equals(getSalesmanBySurname.(salesman.getSurname()))) {
//
//					}
//
//				}

		}


		//LIZARDS
		List<Lizard> allLizardsInTheShop = new ArrayList<>();
		List<Lizard> saledLizards = new ArrayList<>();

	public void addLizardTotheShop(Lizard lizard) {
		allLizardsInTheShop.add(lizard);
	}

	public void removeTheLizard(Lizard lizard) {
		allLizardsInTheShop.remove(lizard);
	}


	public void saleTheLizard(Lizard lizard) {
		allLizardsInTheShop.remove(lizard);
		saledLizards.add(lizard);
	}

	public void getAllTheLizardsLeftInTheShop() {


		for (int i = 0; i < allLizardsInTheShop.size(); i++) {
			System.out.println(" PRICE " + allLizardsInTheShop.get(i).getPrice());
		}

	}

	public void getAllTheCatsLeftInTheShop() {

		for (int i = 0; i < allCatsInTheShop.size(); i++) {
			System.out.println(" AGE " + allCatsInTheShop.get(i).getAgeOfTheCat()
					+ " PRICE " + allCatsInTheShop.get(i).getPrice());

		}

	}


	//method that prints the salesman we are looking for using surname
	public Salesman getSalesmanBySurname(String surname) {

		boolean isSalesmanFound = false;
		int idx = 0;
		Salesman salesman = null;

		try {

			while (isSalesmanFound == false) {
				salesman = listOfAllSalesmans.get(idx);
				isSalesmanFound = salesman.getSurname().equals(surname);
				idx++;
			}
			System.out.println("Manager is " + salesman.getSurname() + " his ID " + salesman.getAge() + " his AGE " +
					salesman.getAge());
		} catch (IndexOutOfBoundsException e) {
			e.getStackTrace();
			System.out.println("There is no salesman with this name in the system");
		}
		return salesman;
	}

	public void getAllSalesmans() {
		System.out.println("LIST OF ALL SALESMANS");

		for (int i = 0; i < listOfAllSalesmans.size(); i++) {

			System.out.println("[SURNAME] " + listOfAllSalesmans.get(i).getSurname() +
					" [AGE] " + listOfAllSalesmans.get(i).getAge() + " [ID] "
					+ listOfAllSalesmans.get(i).getEmployeeID());

		}

	}

	public void getAllManagers() {

		for (int i = 0; i < listOfAllManagers.size(); i++) {
			System.out.println("[SURNAME] " + listOfAllManagers.get(i).getSurname() +
					" [AGE] " + listOfAllManagers.get(i).getAge() + " [ID] "
					+ listOfAllManagers.get(i).getEmployeeID());
		}
	}

	public Manager getManagerBySurname(String surname) {

		boolean isManagerFound = false;
		int idx = 0;
		Manager manager = null;

		try {

			while (isManagerFound == false) {
				manager = listOfAllManagers.get(idx);
				isManagerFound = manager.getSurname().equals(surname);
				idx++;
			}

		} catch (IndexOutOfBoundsException e) {
			e.getStackTrace();
			System.out.println("There is no manager in the shop with this name");
		}
		System.out.println("Manager is " + manager.getSurname() + " his ID " + manager.getAge() + " his AGE " +
				manager.getAge());
		return manager;

	}

	public List<Cat> sortTheCatsByAge(List<Cat> newlist) {
		Collections.sort(newlist);
		return newlist;
	}

	public List<Lizard> sortLizardsByPrice(List<Lizard> newList) {
		Collections.sort(newList);
		return newList;
	}


	@Override
	public int compareTo(Object o) {
		return 0;
	}


	@Override
	public int compare(Object o, Object t1) {
		return 0;
	}


	//just for the purpose of testing i added psvm here
	public static void main(String[] args) {
		Shop myAnimalShop = new Shop();
//		List<Cat> listOfCats = new ArrayList<>();
		Cat cat1 = new Cat(332, 21);
		Cat cat2 = new Cat(330, 30);
		Cat cat3 = new Cat(331, 4);
		Cat cat4 = new Cat(317, 9);


		Lizard lizard1 = new Lizard(333);
		Lizard lizard2 = new Lizard(332);
		Lizard lizard3 = new Lizard(331);
		Lizard lizard4 = new Lizard(330);

		myAnimalShop.addCatToTheShop(cat1);
		myAnimalShop.addCatToTheShop(cat2);
		myAnimalShop.addCatToTheShop(cat3);
		myAnimalShop.addCatToTheShop(cat4);


		myAnimalShop.addLizardTotheShop(lizard1);
		myAnimalShop.addLizardTotheShop(lizard2);
		myAnimalShop.addLizardTotheShop(lizard3);
		myAnimalShop.addLizardTotheShop(lizard4);


		Manager manager1 = new Manager("Batory", "00001", 44, 0);
		Manager manager2 = new Manager("Chrobry", "00002", 64, 0);

		myAnimalShop.addManagerToTheShop(manager1);
		myAnimalShop.addManagerToTheShop(manager2);

		Salesman salesman1 = new Salesman("Kochanowski", "00011", 23, 1333);
		Salesman salesman2 = new Salesman("Kozłowski", "00012", 33, 0);
		Salesman salesman3 = new Salesman("Miłosz", "00013", 41, 0);
		Salesman salesman4 = new Salesman("Szymborska", "00014", 19, 0);

		myAnimalShop.addSalesmanToTheShop(salesman1);
		myAnimalShop.addSalesmanToTheShop(salesman2);
		myAnimalShop.addSalesmanToTheShop(salesman3);
		myAnimalShop.addSalesmanToTheShop(salesman4);

		myAnimalShop.getAllSalesmans();


		myAnimalShop.getAllTheLizardsLeftInTheShop();
		System.out.println("prize of the cats");
		myAnimalShop.getAllTheCatsLeftInTheShop();
		System.out.println("-----------------------");
//		myAnimalShop.saleTheCat(cat1);
//		System.out.println(myAnimalShop.allCatsInTheShop.size());
//		System.out.println(myAnimalShop.saledCats.size());

		myAnimalShop.getManagerBySurname("Bat2ory");

		System.out.println("--------------------------");

		myAnimalShop.sortTheCatsByAge(myAnimalShop.allCatsInTheShop);
		myAnimalShop.getAllTheCatsLeftInTheShop();

		System.out.println("LIZARDS SORTED ------------------");

		myAnimalShop.sortLizardsByPrice(myAnimalShop.allLizardsInTheShop);
		myAnimalShop.getAllTheLizardsLeftInTheShop();


//		myAnimalShop.sale();
//		System.out.println(myAnimalShop.saledLizards.size());
//		System.out.println(myAnimalShop.saledCats.size());

		myAnimalShop.allLizardsInTheShop.stream()
				.forEach(u -> u.getPrice());


		myAnimalShop.listOfAllManagers.stream()
				.forEach(u -> u.setDailyIncome(1333));

		//UUUUUUUUUU JEA MOJE PIERWSZE WYKORZYSTANIE STREAMÓW W PRAKTYCE
		myAnimalShop.listOfAllManagers.stream()
				.forEach(b -> System.out.println(b.getSurname() + b.getDailyIncome()));


	}

}
