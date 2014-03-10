package jp.leve_five.careerup.sample;

import junit.framework.TestCase;

public class DogTest extends TestCase {
	public void testBow(){
		Dog dog = new Dog();
		String result = dog.bow();
		assertTrue("bow".equals(result));
	}

}
