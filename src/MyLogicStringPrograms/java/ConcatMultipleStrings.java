package MyLogicStringPrograms.java;

public class ConcatMultipleStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hi";
		String s1="hello";
		String s3="bye";
		System.out.println(s+s1+s3);


		String joined=String.join(" ", s,s1,s3);
		System.out.println(joined);

		System.out.println(s.concat(s1).concat(s3));

		String Str="hi hello welcome";
		System.out.println(Str.contains("hello"));

		String st="hi hello bye";
		System.out.println(st.startsWith("hi"));

		String stri="hi hellow bye";
		System.out.println(stri.endsWith("bye"));

		String s4="hellow";
		System.out.println(s4.isBlank());

		String s5="hello";
		System.out.println(s5.isEmpty());

		String s6="Welcome";
		System.out.println(s6.replace('W', 'w'));

		String s7=" hi hello welcome";
		System.out.println(s7.trim());

		

		String s9="hi hellow welcome";
		String [] s91=s9.split(" ");
		for (int i = 0; i < s91.length; i++) {
			System.out.print(s91[i]);
			
		}
			
			String s10="hi hello welcome";
			System.out.println(s10.replace(" ", ""));
		
	}
}
