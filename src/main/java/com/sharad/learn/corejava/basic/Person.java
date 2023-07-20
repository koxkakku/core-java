package com.sharad.learn.corejava.basic;

import java.io.Serializable;
import java.util.Objects;

/**
 * Description : Class Person
 * 
 * @author koxkakku
 *
 */
public class Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5761165888000022614L;

	@Override
	public String toString() {
		return "Person [name=" + name + ", dateOfBerth=" + dateOfBerth + ", gender=" + gender + ", country=" + country
				+ ", salary=" + salary + "]";
	}

	private String name;
	private String dateOfBerth;
	private String gender;
	private String country;
	private double salary;

	public Person(String name, String dateOfBerth, String gender, String country, double salary) {
		super();
		this.name = name;
		this.dateOfBerth = dateOfBerth;
		this.gender = gender;
		this.country = country;
		this.salary = salary;
	}

	public Person() {
	}

	/**
	 * Method to getName
	 * @return of type String
	 */
	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(country, dateOfBerth, gender, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(country, other.country) && Objects.equals(dateOfBerth, other.dateOfBerth)
				&& Objects.equals(gender, other.gender) && Objects.equals(name, other.name);
	}

	/**
	 * Method to setName
	 * @param name of type String
	 */
	public void setName(String name) {
		this.name = name;
	}

	public String getDateOfBerth() {
		return dateOfBerth;
	}

	public void setDateOfBerth(String dateOfBerth) {
		this.dateOfBerth = dateOfBerth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
