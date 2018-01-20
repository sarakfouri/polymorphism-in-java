package Entity;

public class Person {

	private String name;
	

public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

public String toString(){
	return this.name;
	
}

public boolean equals(Object o){
	Person another = (Person) o;
	return this.name.equals(another.name);
}

}
