package test;

// Deep cloning example
class Bank implements Cloneable {
	
	String name;
	BankAddress address;
	
	public Bank(String name, BankAddress address) {
		this.name=name; this.address=address;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Bank bank = (Bank) super.clone();
		// Deep cloning need below line as well
		bank.address = (BankAddress) address.clone();
		return bank;
	}
	
	public String toString() {
		return String.format("BankName : %s , BankAddress : %s", name,address.address);
	}
}

class BankAddress implements Cloneable {
	String address;
	public BankAddress(String address) {
		this.address=address;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public String toString( ) {
		return String.format("Address : %s", address);
	}
}
public class CloningDeep {

	public static void main(String[] args) throws CloneNotSupportedException {

		Bank b = new Bank("Hdfc", new BankAddress("delhi"));
		Bank b1 = (Bank) b.clone();
		b1.address.address="MaharaniBaagh";
		
		System.out.println(b.toString()+"\n"+b1.toString());
	}

}
