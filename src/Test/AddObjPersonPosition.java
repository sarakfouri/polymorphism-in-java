package Test;

import Entity.Person;
import VectorObject.VectorP;

public class AddObjPersonPosition {

	public static void main (String[] args){
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		
		p1.setName("Jonas");
		p2.setName("Mark");
		p3.setName("Nate");
		
		VectorP  list = new VectorP();
		
		list.AddObject(p1);
		list.AddObject(0, p2);
		list.AddObject(1, p3);
		
		System.out.println(list);
	}
	
	
}
