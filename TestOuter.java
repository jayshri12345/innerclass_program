package innerclass.com;

public class TestOuter {
	int num1=30;
	class Inner
	{
		String name="ram";
		void m1()
		{
			System.out.println("inside inner class");
		}
		
		
	}
	
	interface Demo
	{
		void m2();
	}
	public void display()
	{
		class Local
		{
			void m3()
			{
				int num2=20;
				System.out.println("inside local inner class");
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		TestOuter to=new TestOuter();
		TestOuter.Inner i=to.new Inner();
		System.out.println(i.name);
		i.m1();
		Demo d1=new Demo()
		{
		public void m2()
		{
			System.out.println("inside anonymous inner class");
		}
		};
		d1.m2();
		to.display();
		
		
	}

}
