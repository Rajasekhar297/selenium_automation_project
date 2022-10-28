package selenium_automation_project;

import org.testng.annotations.Test;

public class Find_the_starts_C_usingStartswith_charAt {

	
	@Test
	public static void find_the_starts_C_usingStartswith_charAt() {
		String Sport[] = {"Kabbadi", "Cricket", "Football", "Baseball"};
		
		int count = Sport.length;
		
		//System.out.println(count);
		
		
		for(int i=0; i< count; i++) {
			
			if(Sport[i].startsWith("K")) {
				
				System.out.println(Sport[i]);
			}else if(Sport[i].startsWith("C")) {
				System.out.println(Sport[i]);
			}else
			{
			System.out.println("Fail");
			
			
			}
			
			
		}
		
		
		}
	
		
		
		

	}


