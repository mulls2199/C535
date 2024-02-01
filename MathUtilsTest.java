package junit5class;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void testadd() {
		MathUtils mathutils = new MathUtils();
		int expected = 8;
		int actual = mathutils.add(5, 3);
		assertEquals(expected, actual);
		
	}
@Test 
void testMultiply() {
	MathUtils mathUtils = new MathUtils();
	int expected = 49;
	int actual = mathUtils.multiply(7,7);
	assertEquals(expected, actual);
	
}

@Test 
void testsubtract() {
	MathUtils mathUtils = new MathUtils();
	int expected = 0;
	int actual = mathUtils.subtract(7,7);
	assertEquals(expected, actual);
}

@Test 
void testdivide() {
	MathUtils mathUtils = new MathUtils();
	int expected = 5;
	int actual = mathUtils.divide(10,2);
	assertEquals(expected, actual);
}
}

