package programs;

public class SecondMaxWithOutBublesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {20,30,10,50,40};
		
	    int fmax=a[0];
	    int smax=0;
	    for (int i = 1; i < a.length; i++) {
	    	
	    	if(fmax<a[i]) {
	    			
	    		smax=fmax;
	    		fmax=a[i];
	    	}
	    	
		}
	    System.out.println(smax);
	    
	}
	
}
