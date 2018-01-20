package Test;

import java.util.ArrayList;

import Entity.Person;
import VectorObject.VectorP;



public class AddObjectPerson {

	public static void main(String[] args){
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		
		p1.setName("Jhon");
		p2.setName("Anne");
		p3.setName("Mary");
		
 VectorP list = new VectorP();
 
	list.AddObject(p1);
	list.AddObject(p2);
	list.AddObject(p3);
    System.out.println(list);

 
	
	}
	
}
