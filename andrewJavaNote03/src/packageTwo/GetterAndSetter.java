package packageTwo;

public class GetterAndSetter {
	private int age;
	private String name;
	
	public int getage(){
			return age;
			
	}
	
	public void setage(int age){
		if (age > 100){
			this.age = 10;
		}
		else{
			this.age =120;
		}
	}
}
