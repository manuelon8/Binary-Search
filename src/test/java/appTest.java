import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import app.main.developments.OrderIntArrrays;

public class appTest {
	

	 int[] array = {5,6,7,8,9,10};
	 private OrderIntArrrays orderIntArrrays = new OrderIntArrrays(array);
	
	
		
	public appTest() {
		super();
		 
	}

	@Test
	public void firstTest() {
			Assert.assertEquals(array[0], orderIntArrrays.first());
	}
	
	@Test
	public void findTest() {
		for(int i = 0; i < array.length; ++i) {
			Assert.assertEquals(i, orderIntArrrays.findValue(i+array[0]));
		}
	}
	
	@Test
	public void lastTest() {
		Assert.assertEquals(10, orderIntArrrays.last());
	}
	
	@Test
	public void deleteTest() {
		Assert.assertTrue(orderIntArrrays.delete(9));	
		
	}
 
}
