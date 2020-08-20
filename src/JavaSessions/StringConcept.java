package JavaSessions;

public class StringConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "hello world";
		
		int a = 100;
		int b = 200;
		
		System.out.println(a+b);
		
		System.out.println(a+s);
		
		System.out.println(a+b+s);
		
		System.out.println(s+a+b);
		
		System.out.println(s+(a+b));
		
		String p = "Test";
		String q = "Automation";
		
		System.out.println(p+q);
		System.out.println(p+" "+q);
		
		//ASCII
		char c1 = 'a';//97
		char c2 = 'b';//98
		
		System.out.println(c1+c2);//195
		//a-z --> 97 - 122
		//A-Z --> 65 - 90
		//0-9 --> 48 - 57

	}

}
