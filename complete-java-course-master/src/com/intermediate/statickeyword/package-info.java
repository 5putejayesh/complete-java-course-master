/**
 * Static keyword can be applied to variables,methods,inner class and blocks.
 * Keyword used for memory management.
 * By using non-static member we can access static members, 
	but by using static member we cannot access non-static members as non static members 
	are object dependent and static members are object independent.
			
 * Static Variables:-
 * 		Static means single copy storage for variable.
 * 		Can be created at class level only.
 * 		Static members belongs to class rather than instance/object of class.
 * 		The static variable gets memory only once in the class area at the time of class loading.
 * 		A single copy of variable is created and shared among all objects at class level.
 * 		Initialized before any object is created.
 * 		Static and non static methods can use it.
 * 
 * Static Method:-
 * 		If you apply static keyword with any method, it will be treated as static method.
		Static method belongs to a class rather than object of a class.
		Static method can be invoked without creating instance of the class.
		Static method can access static data member and can change its value.
		Static methods also load into memory before object creation.
		Can only directly call other static methods.
		Can only directly access static data.
		Can not refer to this or super keywords in any way.
		
 *Static Block:-
 *		Java's static block is the group of statements that gets executed 
		when the class is loaded into memory by Java ClassLoader.
		
		It is used to initialize static variables of the class. 
		Mostly it's used to create static resources when the class is loaded.
		We can't access non-static variables in static block.
		We can have multiple static blocks in a class, although it doesn't make much sense.
		Static block code is executed only once when the class is loaded into memory.
		Static block always get executed first because they get stored into the memory 
		at the time of class loading or before object creation.	
		
 *Static Class:-
		Static outer class is not allowed but static inner class is allowed.
			
 *Static Import:-
		Import all static members.
 */
/**
 * @author PachputeJayesh
 *
 */
package com.intermediate.statickeyword;