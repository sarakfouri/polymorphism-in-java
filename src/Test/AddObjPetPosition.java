package Test;

import Entity.Pet;
import VectorObject.VectorP;

public class AddObjPetPosition {

	public static void main(String[] args){
	Pet p1 = new Pet();
	Pet p2 = new Pet();
	Pet p3 = new Pet();
	
	p1.setName("Cat");
	p2.setName("Dog");
	p3.setName("Bird");
	
	VectorP list = new VectorP();
	
	list.AddObject(p1);
	list.AddObject(0, p2);
	list.AddObject(1, p3);
	
	System.out.println(list);
	
	
	
	
	}
	
}
