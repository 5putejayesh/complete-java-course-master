/**
 * Final keyword can be applied to variable, method and class. 
 * final member cannot be changed,overridden or inherited.
 * 
 * Final variable:-
 * 		Value of a final variable can't be changed.
 * 		
 * 		Used to declare constants.
 * 		
 * 		Final variables must be initialized.
		
		All interface variables are by default public,final  and static.
		
		Final variable can be initialized at the time of declaration or it can be 
		initialized in constructor / inside instance block.
		
		accessModifier final dataType VARIABLE_NAME =value;
		
 *Final Method:-
 *		Final methods can not be overridden,so child classes can't have their own version.
 *		Means implementation of final method is complete.		
 *		
 *		Changing string to integer then such methods can be declared as Final,
		means for methods which implementation is not going to change then declare 
		them as final.
		
 *Final Class:-
			All methods of final class are final by default.
			
 			Final class can not be extended / can not be sub classed.
 			Can be instantiated means we can create object of final class.
 			
 			We can create final inner class but can't create final outer class.
 			
 			We can not create final constructor.
 			
 			We can not create final interface.
 			
 			Local variables can not be static but can be final.
 			
 			Wrapper classes are the example of final class.
 			
 			We can create a  reference of a class as final although it's class is not final,
 			means we can not assign another reference/ object to that final reference.		
 */
/**
 * @author PachputeJayesh
 *
 */
package com.intermediate.finalkeyword;