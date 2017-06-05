
public class Animal implements iAnimal {
	
	//Default constructors -- public constructors with out arguments
	//(either declared or implied) -- are inherited by default. 
	
	/* The idea of inheritance is simple but powerful: 
	 * When you want to create a new class and there is already a class
	 *  that includes some of the code that you want, you can derive 
	 *  your new class from the existing class. 
	 *  In doing this, you can reuse the fields and methods of the existing
	 *   class without having to write (and debug!) them yourself.
	 */

	/* A subclass inherits all the members (fields, methods, and nested classes) 
	 * from its superclass. Constructors are not members, so they are not inherited 
	 * by subclasses, but the constructor of the superclass 
	 * can be invoked from the subclass.
	 */
	public Animal(){
		//the constructor is where you would initialize variables 
		//or otherwise set up the class
		System.out.println("The Animal Constructor has run");
	}
	
	public String sleep(){
		return "An animal sleeps...";
	}
	public String eat(){
		return "An animal eats...";
	}
	
	/* You can declare some or all of a class's methods final. 
	 * You use the final keyword in a method declaration to 
	 * indicate that the method cannot be overridden by subclasses. 
	 */
	
}
