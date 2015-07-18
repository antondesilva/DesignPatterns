package design.patterns;

public class MallardDuck extends Duck {
	
	//quackBehavior variable inherited
	//flyBehavior variable inherited
	
	public MallardDuck()
	{
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	public void display()
	{
		System.out.println("I'm a real Mallard duck");
	}
}
