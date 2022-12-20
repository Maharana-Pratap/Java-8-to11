package test;

class Block {
	{
		System.out.println("From Block");
	}
	static {
		System.out.println("From Static");
	}
	
	public Block() {
		System.out.println("From Constructor");
	}
}
public class BlockTest {	
	public static void main(String[] args) {
		Block b = new Block();
	}
}
