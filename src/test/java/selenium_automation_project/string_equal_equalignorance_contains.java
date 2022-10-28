package selenium_automation_project;

public class string_equal_equalignorance_contains {

	public static void main(String[] args) {
		
		String Expectedtitle = "Google";
		
		String Actualtitle =  "google";
		
		//Equal  --- It must and should be the exact match with each and every Character
	    System.out.println(Expectedtitle.equals(Actualtitle));
		
		
		// EqualIgnoranceCase ----- Here it is not necessary to match the exact Characters
		System.out.println(Expectedtitle.equalsIgnoreCase(Actualtitle));
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
