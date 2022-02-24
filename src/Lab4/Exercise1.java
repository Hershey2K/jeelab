package Lab4;

public class Exercise1 {
	
	public static class Person
	{
		String name;
		float age;
		
		public Person() { }
		
		public Person(String name,float age)
		{
			this.name=name;
			this.age=age;
		}
		
		public void setName(String name)
		{
			this.name=name;
		}
		public void setAge(float age)
		{
			this.age=age;
		}
		
		public String getName()
		{
			return this.name;
		}
		public float getAge()
		{
			return this.age;
		}
	}
	
	public static class Account
	{
		long accNum;
		double balance;
		Person accHolder;
		
		public Account() { }
		
		public void setAccNum()
		{
			this.accNum=(long)Math.random()*1000000;
		}
		
		public long getAccNum()
		{
			return this.accNum;
		}
		
		public Account(long accNum,double balance,Person accHolder)
		{
			this.accNum=accNum;
			this.balance=balance;
			this.accHolder=accHolder;
		}
		
		public void setBalance(double balance)
		{
			this.balance=balance;
		}
		
		public double getBalance()
		{
			return this.balance;
		}
		
		public void deposit(double amt)
		{
			this.balance=this.balance+amt;
			System.out.println("DEPOSIT SUCCEED");
		}
		public boolean withdraw(double amt)
		{
			if(amt>this.balance)
				return false;
			else {
				this.balance=this.balance-amt;
				System.out.println("WITHDRAWAL SUCCEED");}
				return true;
		}
		
	}
	
	public class SavingsAccount extends Account
	{
		final double minBalance=2000;
		public SavingsAccount() {}
		
		public SavingsAccount(long accNum,double balance,Person accHolder)
		{
			super();
		}
		
		@Override
		public boolean withdraw(double withdrawAmt)
		{
			if(this.balance>=this.minBalance) {
				this.balance=this.balance-withdrawAmt;
				return true;
			}
			else
				return false;
		}
	}
	
	public class CurrentAccount extends Account
	{
		double overdraftLimit=20000;
		
		public CurrentAccount() {}
		
		public CurrentAccount(long accNum,double balance,Person accHolder)
		{
			super();
		}
		
		@Override
		public boolean withdraw(double withdrawAmt)
		{
			if(this.balance<this.overdraftLimit) {
			this.balance=this.balance-withdrawAmt;
			return true; }
			else
				return false;
		}
	}
	
	public static void main(String args[])
	{
		Person kathy = new Person();
		Person smith = new Person();
		
		kathy.setName("Kathy");
		kathy.setAge(45);
		smith.setName("Smith");
		smith.setAge(25);
		
		Account smithAcc = new Account();
		smithAcc.setAccNum();
		Account kathyAcc = new Account();
		kathyAcc.setAccNum();
		
		smithAcc.setBalance(2000);
		kathyAcc.setBalance(3000);
		
		smithAcc.deposit(2000);
		kathyAcc.withdraw(2000);
		
		System.out.println(smithAcc.getBalance());
		System.out.println(kathyAcc.getBalance());
		
		
	}

}
