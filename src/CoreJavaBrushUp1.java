import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		String website = "Testing";
		char letter ='m';
		//float sum = 2.99;
		double count = 2.34;
		boolean state = true;
		System.out.println(num+" is your value");
		System.out.println(website+" is your value");
		
		//Arrays
//		int[] arr = new int[5];
//		arr[0]=1;
//		arr[1]=2;
//		arr[2]=3;
//		arr[3]=4;
//		arr[4]=5;
//
//		int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
//		System.out.println(arr2[2]);
		
		//for loop
//		for(int i=0; i<arr.length; i++)
//		{
//			 System.out.println(arr[i]);
//			
//		}
//		for(int i=0; i<arr2.length; i++)
//		{
//			 System.out.println(arr2[i]);
//			
//		}
		String[] name = {"Mari", "Hemu", "Jay"};
//		for(int i=0; i<name.length; i++)
//		{
//			System.out.println(name[i]);
//		}
		
		for(String s: name)
			
		{
			System.out.println(s);
		}
		
	}

}
