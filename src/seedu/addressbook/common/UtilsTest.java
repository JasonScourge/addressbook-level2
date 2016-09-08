package seedu.addressbook.common;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class UtilsTest {

	@Test
	public void testIsNull() {
		assertTrue(Utils.isAnyNull( (Object) null ));
	}

	@Test
	public void testIsNotNull() {
		assertFalse(Utils.isAnyNull( new Object() ));
	}

	@Test
	public void testIsNotUnique() {
		ArrayList<Integer> test = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++){
			test.add(1);
		}
		assertFalse(Utils.elementsAreUnique(test));
	}

	@Test
	public void testIsUnique() {
		ArrayList<Integer> test = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++){
			test.add(i);
		}
		assertFalse(Utils.elementsAreUnique(test));
	}

}
