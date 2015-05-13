package snackmachine;

public class Toast extends Food {
	
	@Override
		public int make(int count) {
	
			if (count <= 0)
				return 0;
	
			return count;
		}
	
	@Override
	    public double getCalories(double weight) {
		
		    double cal = 0.0;
		    double k = 3323.43;
		    
		    cal = k*weight;
		    
		    if (weight <= 0)
				return 0;
		   
	        return cal;
		
	    }	

}
