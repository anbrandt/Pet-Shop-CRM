package com.andrzej.Personel;

/**
 * Created by andrzej on 05.06.17.
 */
public class ShopPersonel {

	private String surname;
	private String employeeID;
	private Integer age;
	private Integer dailyIncome;


	public ShopPersonel(String surname, String employeeID, Integer age, Integer dailyIncome) {
		this.surname = surname;
		this.employeeID = employeeID;
		this.age = age;
		this.dailyIncome = dailyIncome;

	}

	public Integer getDailyIncome() {
		return dailyIncome;
	}

	public void setDailyIncome(Integer dailyIncome) {
		this.dailyIncome = dailyIncome;
	}

	public String getSurname() {
		return surname;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public Integer getAge() {
		return age;
	}
}
