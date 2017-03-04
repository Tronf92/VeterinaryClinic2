package veterinaryClinic;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCatList {
	private Address testAddress = new Address("firstName", "surname","004207756871");
	private Cat testCat = new Cat(1, 3.3, 7, "long description", testAddress);
	
	
	@Test
	public void testAddCatThrowException() {
		CatList testCatList = new CatList();
		try {
			testCatList.addCat(testCat);
			testCatList.addCat(testCat);
			fail("It did not generated exception as it should.");
		} catch (Exception e) {
			assertEquals(e.getMessage(),"Cat is already in list!");
		}
		
	}

	@Test
	public void testGetCat() throws Exception {
		CatList testCatList = new CatList();
		testCatList.addCat(testCat);
		assertEquals(testCat, testCatList.getCat(testCat.getID()));
	}

	@Test
	public void testGetCats() throws Exception {
		Address anothertestAddress = new Address("Name", "Surname","004207798751");
		Cat anothertestCat = new Cat(2, 2.4, 5, "another description", anothertestAddress);
		CatList testCatList = new CatList();
		testCatList.addCat(testCat);
		testCatList.addCat(anothertestCat);
		
		CatList expectedCatList = new CatList();
		expectedCatList.addCat(anothertestCat);
		
		assertEquals(expectedCatList, testCatList.getCats(anothertestAddress));
	}

}
