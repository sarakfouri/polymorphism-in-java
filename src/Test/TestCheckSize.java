package Test;

import Entity.Person;
import VectorObject.VectorP;

public class TestCheckSize {

	public static void main(String[] args){
	
	Person p1 = new Person();
	Person p2 = new Person();
	
	VectorP list = new VectorP();
	
	list.AddObject(p1);
 System.out.println(list.sizetotal());
 list.AddObject(p2);
 System.out.println(list.sizetotal());
 list.remove();
 System.out.println(list.sizetotal());
	}
}
