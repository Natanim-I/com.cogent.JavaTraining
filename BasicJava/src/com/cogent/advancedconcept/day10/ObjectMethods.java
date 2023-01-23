package com.cogent.advancedconcept.day10;

import java.util.Objects;

class PersonObj{
	String name;
	int age;
	public PersonObj(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "PersonObj [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonObj other = (PersonObj) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
}
public class ObjectMethods {
	public static void main(String[] args) {
		PersonObj p1 = new PersonObj("Nati",21);
		PersonObj p2 = new PersonObj("Natanim", 45);
		PersonObj p3 = new PersonObj("Nati", 21);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
	}
}
