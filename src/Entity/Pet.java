package Entity;

public class Pet {

	
	private String name;
	
	
	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}
public String toString(){
	return this.name;
}
public boolean equals(Object o){
	Pet another = (Pet) o;
	return this.name.equals(another.name);
}
}
