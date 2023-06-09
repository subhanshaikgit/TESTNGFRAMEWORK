package utilities;

import java.util.Date;

public class utils {
	
	
	
	public static String generateemailwithtimestamp() { 
		 
		Date date=new Date(0); 
		String timpstamp=date.toString().replace(" ","-").replace(":", "-"); 
		return "sksub456"+timpstamp+"@gmail.com"; 
		 
		}
		

}
