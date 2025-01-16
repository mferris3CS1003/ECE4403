package int_and_string_practice.mf;

public class BankAccount {
private int accountNumber;
private static int latestNumber=1000;

public BankAccount() {
	accountNumber=latestNumber++;
}
public int getAccountNumber() {
	return accountNumber;
}
}
