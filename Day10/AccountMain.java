package Day10;

public class AccountMain {

	public static void main(String[] args) 
	{
		Account accobj=new Account();
		accobj.setAcc_no(2567);
		accobj.setName("Aarohi");
		accobj.setAmount(70000);
		
		System.out.println(accobj.getAcc_no());
		System.out.println(accobj.getName());
		System.out.println(accobj.getAmount());
   

	}

}
