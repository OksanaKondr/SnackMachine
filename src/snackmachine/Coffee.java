package snackmachine;

public class Coffee extends Drink {
	
	@Override
		public int make(int count) {
	
			if (count <= 0)
				return 0;
	
			return count;
		}
	
	@Override
        public double getCalories(double weight, int t) {
	
		    double cal = 15.0;
	        double k = 5.0;
	        double k1 = 3789.25;
	        
	        if (t <= 0) 
	        	{
	        	k = 300.0;
	        	}
	        else 
	        	{
	        	k = k1*((double)t/((double)t+10));
	        	}
	        cal = k*weight;
	        
	        if (weight <= 0)
				return 0;

	        return cal;
	
        }
	
	public double getCalories() {
		
		double cal = 0.0;
		double weight = 100.0;
		int t = 80;
		
		double k = 5.0;
        double k1 = 3789.25;
        
        if (t <= 0) 
    	{
    	k = 300.0;
    	}
    else 
    	{
    	k = k1*((double)t/((double)t+10));
    	}
    cal = k*weight;
    
    if (weight <= 0)
		return 0;
		
		return cal;
	}

}
