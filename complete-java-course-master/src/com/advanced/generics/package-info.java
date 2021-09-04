/**
 * @author PachputeJayesh
 *Generics :-
 *	 Allows us to store objects of specific type in a collection.
 *	 Before generics we can store heterogeneous object into collection.
 *
 *Meaning of Letters used in Generics:-
 *	E:-Element
 *	K:-Key
 *	N:-Number
 *  T:-Type
 *  V:Value
 *  
 *  Generic Methods:-
 *  	Has it's own type parameter,can be created in non generic class.
 *  	Static and non static generic methods are allowed.
 *  	Generic constructor is also allowed.
 *  
 *  Type Inference:-
 *  	A JAVA compilers ability to simplify generic usage.
 *  	
 *  Type Inference Methods:-
 *  	Util.<Animal>displayToString(myFavouriteAnimal);
 *  	Util.displayToString(myFavouriteAnimal);
 *  
 *  Type Inference - Instance of Generic class:-
 *  	Box<Integer> number=new Box<Integer>();
 *  	Box<Integer> number=new Box<>();
 *  
 *  Type Inference - Target Types:-
 *  	ArrayList<String> toDoList=Collections.<String>emptyList();
 *  	ArrayList<String> toDoList=Collections.emptyList();
 *  
 *  Restrictions On Generics:-
 *  	Cannot instantiate generics types with primitive types.
 *  	 BOx<int> box =new Box<>();// not allowed
 *  
 *  	Cannot create instance of type parameter.
 *  		public static <T> void displayToString(T type){
 *  			T typeObj= new T();// is not allowed.
 *          }
 *          
 *       Cannot create static fie3lds whose type is a type parameter.
 *       	public static <T> void displayToString(T type){
 *  			private static T staticFiled;.// Not allowed
 *          }
 *          
 *       Can not create arrays of parameterized types.
 *       	Bo=x <int>[] box=new Box<>[3];//Not allowed.
 *       	
 *       Can not have methods overloaded where the raw types are same.
 *       	public class OverloadTry{
 *       		void display(Box<Integer> number){}
 *       		void display(Box<Animal> animal){} // Not allowed.
 *       
 *       Can not use cast or instanceOf with parameterized types.
 *       	}
 *              
 */
package com.advanced.generics;