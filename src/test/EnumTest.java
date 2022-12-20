package test;

enum Msg {
	GET_ENUM;
	public void display(){
	       System.out.println("Thread-safe singleton Display");
	   }
}
public class EnumTest {
	public static void main(String[] args) {
		Msg.GET_ENUM.display();
		
		 Integer num1 = 128, num2 = 128;  //Integer objects ranging from -128 to 127
	       System.out.println(num1 == num2);//1
	       Integer num3 = 20, num4 = 20;  
	       System.out.println(num3 == num4);//2
	}
}
