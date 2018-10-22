
 class Animal {
	void print()
	{
		System.out.println("hello from animal");
	}
	void call()
	{
	print();
	}
 }
	class Animals extends Animal
	{
		void print()
		{
			System.out.println("hello from animal1");
		}
		void call()
		{
			print();
		}
	
	
	public static void main(String[] args)
	{
		Animal an = new Animals();
		an.call();
}
	}
