package int_and_string_practice.mf;



public class u1_3 {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
	    Integer i1=Integer.valueOf(1);
	    Integer i2= Integer.valueOf(2);
	    i1=i1+1;
		System.out.println(i1==i2);
        String s1= new String("test");
        String s2="testes";
		BankAccount account4Jon= new BankAccount();
		BankAccount account4Ali= new BankAccount();
        System.out.println(account4Jon.getAccountNumber());
        System.out.println(account4Ali.getAccountNumber());
	}


}
