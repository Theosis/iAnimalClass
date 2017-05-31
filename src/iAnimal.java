/* There are a number of situations in software engineering
 *  when it is important for disparate groups of programmers
 *   to agree to a "contract" that spells out how their 
 *   software interacts. Each group should be able to write 
 *   their code without any knowledge of how the other group's 
 *   code is written. Generally speaking, interfaces 
 *   are such contracts.
 *   
 *   To use an interface, you write a class that implements the interface. 
 *   When an instantiable class implements an interface, 
 *   it provides a method body for each of the methods 
 *   declared in the interface
 *   
 *   In its most common form, an interface is a 
 *   group of related methods with empty bodies
 *   
 */
public interface iAnimal {
	//Note that the method signatures have no braces and are terminated with a semicolon.
	String sleep();
	String eat();
}
