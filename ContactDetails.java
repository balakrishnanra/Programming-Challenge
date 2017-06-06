package bala.HCL.StateStreet;

import java.util.HashMap;
import java.util.Map;

public class ContactDetails {

	Map<Integer, Person> persons = new HashMap<Integer, Person>();
	private class Person {
		Person(int id, String name, String phone , String address) {
			this.id = id;
			this.name = name;
			this.address = address;
			this.phone = phone;
		}

		public String toString() {
			return "id:" + id + " name:" + name + " address:" + address + " phone:" + phone;
		}
	
		private int id;
		private String name;
		private String address;
		private String phone;
	}
	public Person getPersons(int id) {
		return persons.get(id);
	}
	
	public void addPersons(Person person) {
		this.persons.put(person.id, person);
	}
	public static void main(String[] args) {
		ContactDetails pTable = new ContactDetails();
		
		ContactDetails.Person person1 = pTable. new Person(1, "Person_Name_1", "Phone_Num_1", "Address_1");
		pTable.addPersons(person1);
		
		ContactDetails.Person person2 = pTable. new Person(2, "Person_Name_2", "Phone_Num_2", "Address_2");
		pTable.addPersons(person2);

		System.out.println(pTable.getPersons(2));
		System.out.println(pTable.getPersons(1));

	}

}