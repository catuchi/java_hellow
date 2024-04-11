
public class LeapYear {
	
	int year;
	
	public LeapYear(int y) {
		this.year = y;
	}
	
	public void checkLeapYear() {
		
		if (check()) {
			System.out.println(year + " is a leap year.");
		} else {
			System.out.println(year + " is not a leap year.");
		}
	}
	
	public boolean check() {
		if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeapYear a = new LeapYear(2024);
		a.checkLeapYear();
	}

}
