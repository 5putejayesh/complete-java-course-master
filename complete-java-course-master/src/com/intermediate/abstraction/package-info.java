/**
 * 
 */
/**
 * @author PachputeJayesh
 *Abstraction:-
 		Is a process of hiding implementation details from users while letting them 
 		utilities the services or functions.
 		Therefore, the user will know what an object does, but not how it does it.
 		Used to maintain standard of coding.
 		Exposing required details.
 		
 *Abstraction can be done in two ways:-
 		1.Abstract class.
 		2.Interface
 		
*Abstract Class:-
 		If any method is abstract in a class then that class must be declared as abstract.
 		
 		Abstract Class can Have:-
 				1.Constructor (to initialize data members and to maintain parent-child relationship.)
 				2.Abstract methods or concrete methods or both or nothing.
 		
 		To use abstract methods of class, we must extend the abstract class with ordinary class
 		or must implements all abstract methods in that ordinary class.
 		If we don't want to implement or override that abstract method, make those 
 		methods as abstract.
 		
 		We cannot instantiate abstract class.
 		
 		Multiple inheritance is not allowed in abstract class but allowed in interface.
 		
 		Abstract classes are useful if we want others to not call our class directly
 		but through  inheritance.
 		
 		Abstract static final combinations are not allowed in java.
 		
 		It can have constructors and static methods also.
		
		It can have final methods which will force the subclass not
		to change the body of the method.
		
		Can have instance variables and constants.
		
		Can have static block and instance block.
		
*Why Constructor in Abstract class		
		An abstract class can only be extended by class and that class will have it's 
		own constructor and that constructor will have super();which is calling constructor 
		of abstract class.
		If the abstract class doesn't have constructor then class extending that abstract 
		class will not get compiled.Thyerefore, abstract classes have constructor.
		 
*Abstract Methods:-
		Can only be used in abstract class.(declare only)
		Does not have any body /implementation.
		Implementation is provided by subclass.
		All abstract methods must be declare to create object.
		
		Syntax:-
		accessModifier abstract returnType methodName(parameters if any);
		
*Interface:-
		An interface in Java is a blueprint of a class. 
	 	
	 	It has static constants and abstract methods.
	 	
	 	Used to achieve 100% abstraction.
	 	
	 	Does not have any concrete methods.
	 	
	 	All methods are public abstract and all variables/fields are 
	 	public static and final and act as a final that's why 
	 	interface does not have constructor.
	 	
	 	We cannot instantiate Interface but we can create reference variables.
	 	
	 	It can be compiled but cannot run.
	 	
	 	Interface can extends interface.
	 	
	 	The interface can extend multiple interfaces.
	 	
	 	The interface doesn't have a constructor.
	 	
	 	It doesn't have instance variables.
	 	
	 	It doesn't have static block and instance block.	
	 	
*Encapsulation Vs Abstraction:-
 		1.Encapsulation is information(data) hiding.It is more about controlling the 
 		accessibility of member variables and methods.
 		
 		Abstraction is hiding implementation details of methods in sub classes.
 		
 		2.Encapsulation groups together data and methods and shows the necessary but hides the rest.
 		 
 		 Abstraction exposing the functions and hiding implementation.

 */
package com.intermediate.abstraction;