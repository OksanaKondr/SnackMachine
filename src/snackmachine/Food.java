package snackmachine;

abstract class Food {
	
	int numberOfItems;
	
		public int make() {
			return 1;
		}
	
		public int make(int count) {
			return count;
		}
		
		public double getCalories(double weight, int t) {
			double cal = 0.0;
			return cal;
		}
		
		public double getCalories(double weight) {
			double cal = 0.0;
			int t = 80;
			return cal;
		}
		
		public double getCalories(int t) {
			double cal = 0.0;
			double weight = 100.0;
			return cal;
		}
		
		public double getCalories() {
			double cal = 0.0;
			double weight = 100.0;
			int t = 80;
			return cal;
		}
}
