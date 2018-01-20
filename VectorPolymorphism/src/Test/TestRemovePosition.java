package Test;

import Entity.Pet;
import VectorObject.VectorP;

public class TestRemovePosition {
public static void main (String[] args){
	Pet p1 = new Pet();
	Pet p2 = new Pet();
	Pet p3 = new Pet();
	p1.setName("cat");
	p2.setName("dog");
	p3.setName("bird");
	
	VectorP list = new VectorP();
	
	list.AddObject(p1);
	list.AddObject(p2);
	list.AddObject(p3);
	
	list.remove();
	System.out.println(list);
	list.remove(1);
	System.out.println(list);
}
}
