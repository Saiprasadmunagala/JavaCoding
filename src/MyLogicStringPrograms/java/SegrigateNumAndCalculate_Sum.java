package MyLogicStringPrograms.java;

public class SegrigateNumAndCalculate_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="12bc11";
		int tsum=0;
		int sum=0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				int n=s.charAt(i)-48;
				tsum=tsum*10+n;
				
			}
			else {
			sum=sum+tsum;
			tsum=0;
			}
		}
		sum=sum+tsum;
		System.out.println(sum);
	}

}
