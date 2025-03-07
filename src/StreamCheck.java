import java.util.stream.Stream;

import org.testng.annotations.Test;

public class StreamCheck {

	//public static void main(String[] args) 
		// TODO Auto-generated method stub
	
		@Test
		public void StreamCalc()
		
		{
		
		Long c = Stream.of("kumar","Rama","Alex", "Arun","Jhone").filter(s->s.contains("J")).count();
		System.out.println(c);
		}
@Test
public void StreamCalc2()
{
	Long m =Stream.of("Raju","Rama","Kamal","Shanu","Kumar").filter(s->s.contains("K")).count();
    System.out.println(m);
	}

	}


