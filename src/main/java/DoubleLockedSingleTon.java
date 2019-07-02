
public class DoubleLockedSingleTon {
	static DoubleLockedSingleTon instance;

	private DoubleLockedSingleTon() {}
	
	private static DoubleLockedSingleTon getInstance() {
		synchronized(DoubleLockedSingleTon.class)  {
			
		
		if(instance ==null)
		{
			 instance = new DoubleLockedSingleTon();
		}
		return instance;
		}
	}
	
}
