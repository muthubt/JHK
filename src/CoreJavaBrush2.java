import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrush2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		//check if arry has multiple of 2
		
		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] % 2 == 0) {
				System.out.println(arr2[i]);
				break;
			}

			else {
				System.out.println(arr2[i] + "is not multiple of 2");
			}

		}
		
		ArrayList<String> a = new ArrayList();
		//create object of the class - object.method
		a.add("Mari");
		a.add("kari");
		a.add("pari");
		a.add("nari");
		//System.out.println(a.get(3));
		for (int j=0; j<a.size(); j++)
		{
		System.out.println(a.get(j));	
		}
		
		System.out.println("***************");
		
		for(String val:a)
		{
			System.out.println(val);
		}
		
		//Item present in arrylist
		System.out.println(a.contains("nari"));
		
		String[] name = {"some", "selenium", "mari"};
		List <String> nameArrayList = Arrays.asList(name);
		nameArrayList.contains("selenium");
		

	}

}
