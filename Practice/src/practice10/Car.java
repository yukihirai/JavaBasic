package practice10;

public class Car {

	int serialNo = 0;
	
	String color;
	
	int gasoline = 0;
	
	int run(int count) {
		
		count = new java.util.Random().nextInt(15);
	
		this.gasoline--;
		
		
		if(this.gasoline>0) {
			return count;
		
		}else {
			return -1;
		}
	}
	
}
