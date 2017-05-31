import javax.management.remote.SubjectDelegationPermission;

public class AnimalApplication {

	public static void main(String[] args) {
		
		Animal a = new Animal();
		System.out.println(a.eat());
		System.out.println(a.sleep());
		
		Animal b = new Animal();
		System.out.println(b.eat());
		System.out.println(b.sleep());
		
		
		Bird bird = new Bird("this is my bird overloaded constructor");
		System.out.println(bird.eat());
		System.out.println(bird.sleep());
		System.out.println(bird.fly());
		

		
		Cat c = new Cat();
		System.out.println(c.eat());
		System.out.println(c.sleep());
		System.out.println(c.speak());
		
		
		
	}

}
