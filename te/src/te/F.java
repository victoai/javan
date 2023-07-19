package te;

public class F {

	public static void main(String[] args) {


		
		int su=255;
		
		char[] result  = new char[8];
		
		int i=7;
		while( true) {		
			
			int remain = su/16; 
			su %=16;
			 
			
			System.out.println( remain);
			result[i]=  (char)( remain +48);
			i--;
			if( su ==1) break; 
			
		}
		
		
		//System.out.println( result);
		System.out.println( result[0] );
		System.out.println( result[1] );
		System.out.println( result[2] );
		System.out.println( result[3] );
		System.out.println( result[4] );
		System.out.println( result[5] );
		System.out.println( result[6] );

	}

}
