public class Date {

	private int month;
	private int day;
	public int year;
	
	//constructor
	public Date(int month, int day, int year) {
		this.month = month;
		this.day = day;
		
		if (year >= 0) {
			//this determines whether the quantity is positive
			this.year = year;	
			}
			
		if (month >= 0) {
			//this determines whether the quantity is positive
			this.year = year;	
		}
		
		if (day >= 0) {
			//this determines whether the quantity is positive
			this.year = year;	
			}
	}

	
//this SETS year
		public void setYear(int year) {
			if (year >= 0) {
			this.year = year;
			}
		}
//this GETS year
		public int getYear(){
		return year;	
		}
		
		
	
//this SETS day
		public void setDay(int day) {
			if (day >= 0) {
			this.day = day;
			}
				}
//this GETS day
		public int getDay(){
		return day;	
		}	
		
		
		
		
//this SETS day
		public void setMonth(int month) {
			if (month >= 0) {
			this.month = month;
			}
				}
//this GETS day
		public int getMonth(){
		return month;	
		}
		
		

}//end class
