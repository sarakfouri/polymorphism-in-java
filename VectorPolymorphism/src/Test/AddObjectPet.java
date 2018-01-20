package Test;



import Entity.Pet;
import VectorObject.VectorP;

public class AddObjectPet {

	public static void main (String[] args){
		Pet p1 = new Pet();
		Pet p2 = new Pet();
		
		p1.setName("Cat");
		p2.setName("Dog");
		
		VectorP list = new VectorP();
		
		list.AddObject(p1);
		list.AddObject(p2);
		System.out.println(list);
	}
	
	
}
