package VectorObject;

public class VectorP {

	private Object[] obj = new Object[100];
	private int TotalObj = 0;
	
	// methods adds
	public void AddObject (Object o){
		this.doubleSize();
		this.obj[this.TotalObj] = o;
		this.TotalObj++;
	}
	public void AddObject (int position, Object o){
		this.doubleSize();
		if (!this.check(position)){
			throw new IllegalArgumentException();
		}
	for(int i = this.TotalObj-1; i >= position; i -=1 ){
		this.obj[i + 1] = this.obj[i];
		}
		this.obj[position] = o;
		this.TotalObj++;
	}
	// method to take position and show object
	public Object takeObj (int position){
		if (!this.check(position)){
			throw new IllegalArgumentException("invalid position ");
		}
		return this.obj[position];
	}
	// method to remove
	public void remove (int position){
		if(!this.check(position)){
			throw new IllegalArgumentException("invalid position");
		}
		for(int i = position; position < this.TotalObj -1; i++ ){
			this.obj[i] = this.obj[i +1];
		}
		this.TotalObj--;
	}
	public void remove (){
		for (int i = 0; i < this.TotalObj; i++){
			this.obj[i] = this.obj[i + 1];
	}
	this.TotalObj--;
	}

	public int sizetotal(){
		return this.TotalObj;
	}
	public void doubleSize(){
		if (this.TotalObj == this.obj.length) {
		Object[] nwObjec = new Object[this.obj.length *2];
		for (int i = 0; i <this.obj.length; i++){
			nwObjec[i] = this.obj[i];
		}
		this.obj = nwObjec;
		}
	}
	
	// method check position 
	public boolean check (int position){
		return position >= 0 && position < this.TotalObj;  
	}
	
	
	
	
	
	
	
	public String toString(){
		if (this.TotalObj == 0){
			return "[]";
		}
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		for (int i = 0; i < this.TotalObj; i++){
			builder.append(this.obj[i]);
			builder.append(", ");
			}
		builder.append("]");
		return builder.toString();
		}
	
	}
	
	
	
