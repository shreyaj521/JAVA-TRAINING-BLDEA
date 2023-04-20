package com.bldea.crorepati.pacakge1;

public class Candidate {
	private String name;
	private int age;
	private String city;
	private String state;
	public static int amount;
	public Candidate(String name, int age, String state, String city) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
		this.state = state;
	
	}
	
	/**
	 * @param amount the amount to set
	 */
	public static void setAmount(int amt) {
		amount = amt;
	}
	/**
	 * @return the amount
	 */
	public int getAmount() {
		return amount;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
}
