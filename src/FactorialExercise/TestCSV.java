package FactorialExercise;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import org.hamcrest.collection.IsEmptyCollection;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestCSV {

	// Test CSV Read class
	@Test
	public void testAssertReadList() {

		List<Integer> actual = CSVRead.InputValues();
		List<Integer> expected = Arrays.asList(3, 4, 8, -1);

		// Read value is equal to expected.
		assertThat(actual, is(expected));

		// Check if value present in CSV is present in the read list.
		assertThat(actual, hasItems(-1));

		// Check list size
		assertThat(actual, hasSize(4));
		assertThat(actual.size(), is(4));

		// Check order of the list.
		assertThat(actual, contains(3, 4, 8, -1));

		// Check if the list is not empty.
		assertThat(actual, not(IsEmptyCollection.empty()));
	}
}
