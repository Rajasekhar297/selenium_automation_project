package selenium_automation_project;

public class ChartAt {

	
	public static void main(String[] args) {
String Sport[] = {"Kabbadi", "Cricket", "Softball"};
		
		int count = Sport.length;
		
		for(int i=0;i< count; i++) {
			
			if(Sport[i].charAt(0)=='K') {
				
				System.out.println(Sport[i]);
				
				
			}else if(Sport[i].charAt(0)=='S') {
				
				System.out.println(Sport[i]);
			}
				
			
		}

	}

}
