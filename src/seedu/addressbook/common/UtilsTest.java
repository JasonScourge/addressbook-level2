package seedu.addressbook.common;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class UtilsTest {
	@Test
	public void isAnyNull_noNullArgs() {
		assertFalse(Utils.isAnyNull(new Object(), new Object(), new Object()));
	}

	@Test
	public void isAnyNull_nullArgExists() {
		assertTrue(Utils.isAnyNull(new Object(), null, new Object()));
	}
	
	@Test
	public void elementsAreUnique_allUniqueElements() {
		final List<String> testData = Arrays.asList("Test 1", "Test 2", "Test 3");
		assertTrue(Utils.elementsAreUnique(testData));
	}
	
	@Test
	public void elementsAreUnique_notAllUnique() {
		final List<String> testData = Arrays.asList("Test 1", "Test 1", "Test 3");
		assertFalse(Utils.elementsAreUnique(testData));
	}
}
