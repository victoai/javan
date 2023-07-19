package te;

public class Test {

	public static void main(String[] args) {

		
		 String  str="256";
		
		 int result  =   extracted(str);
		 
		 System.out.println( result);

	}

	private static int extracted(String str) {
		int result = 0;

	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	            int digitValue = c - '0';
	            result = result * 10 + digitValue;
	        }
	        
	        return result;
	}

}



//  0*10 +2      // 2
//  2*10 + 5    // 25
// 25*10  + 6  // 256