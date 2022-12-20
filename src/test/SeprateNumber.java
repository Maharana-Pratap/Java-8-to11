package test;

public class SeprateNumber {

	public static void main(String[] args) {
		int no = 12321;
		String str = "";
		int backup = no;
		
		while(no > 0) {
			str = str + (no % 10);
			no = no / 10;
		}
		
		int n1 = Integer.parseInt(str);
		if(Integer.compare(backup, n1) == 0) {
			System.out.println("same");
		} else {
			System.out.println("not same");
		}
		
	}
}
