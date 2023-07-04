/**
 * 
 */
package com.prodapt.package2.singleton;

/**
 * @author tinkubhati
 *
 */
public class SingletonClass {
	//Static member holds only one instance of the SingletonClass class.
	//here SingletonClass is basically defining the return type of variable singletonClass coz we want to have only one return.
	private static SingletonClass singletonClass;
	
	
	//private constructor.
	private SingletonClass() {
		
	}
	
	//Now we are going to provide access
	
	public static SingletonClass getInstance() {
		if(singletonClass == null) {
			singletonClass = new SingletonClass();
		
		}
		return singletonClass;
	}

}
