package bubag;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
public class testBackPack {
	
	private BackPack bpk;
	int m = 10;
    int n = 3;
    int w[] = {3, 4, 5};
    int p[] = {4, 5, 6};
	private int expected[][] = 
		{{0,0,4,4,4,4,4,4,4,4},
		 {0,0,4,5,5,5,9,9,9,9},
		 {0,0,4,5,6,6,9,10,11,11}};
	int expectedValue = expected[n-1][m-1];
	public testBackPack(){
	    
	}
	@Before
	public void setup(){
		bpk = new BackPack();
	}
	
	@Test
	public void testBackPack_Solution(){
		assertEquals(expectedValue, bpk.BackPack_Solution(m, n, w, p));
	}


}
