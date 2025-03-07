
public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String is an object..//String literal
		//String s = "QA";
		String s1 = "QA";
		
		//object
		String s2 = new String("Welcome");
		String s3 = new String("Welcome");
		String s = "QA is Test";
		String[] SplittedString = s.split("is");
		System.out.println(SplittedString[0]);
		System.out.println(SplittedString[1]);
		//System.out.println(SplittedString[2]);
		//System.out.println(SplittedString[1].trim());
		for(int i=s.length()-1;i<s.length();i--)
		{
			System.out.println(s.charAt(i));
		}
	}

}
