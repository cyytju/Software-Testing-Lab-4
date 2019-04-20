package bubag;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Before;
import org.junit.Test;

public class testBubbleSort {
	
    private BubbleSort bus;
	private int temp[] = {4,7,2,6,8,1};
	private int expected[] = {1,2,4,6,7,8};
	public testBubbleSort(){
	    
	}
	@Before
	public void setup(){
		bus = new BubbleSort();
	}
	
	@Test
	public void testSort(){
		assertArrayEquals(expected, bus.sort(temp));
	}

}
