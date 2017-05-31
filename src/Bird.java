
public class Bird extends Animal {

public Bird(){
	System.out.println("The bird has been created");
}
public Bird(String message){
	//if you want your overloaded constructor to call 
	//the parent's constructor then use keyword super()
	super();//must be the first line in the constructor
	System.out.println(message);
}
@Override	
public String sleep(){
	
	//if I want to call the method that's actually in the parent class
	String animalSleep = super.sleep();
	return "Bird Class: " + animalSleep;
}

@Override
public String eat(){
	return "A bird eats...";
}

public String fly(){
	return "A bird flies...";
}
}
