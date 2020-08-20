package JavaSessions;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "this is my first java code";
		
		System.out.println(s.length());
		
		int li = 0;
		int l = s.length();
		int hi = l-1;
		System.out.println(li);
		System.out.println(l);
		System.out.println(hi);
		
		System.out.println(s.charAt(3));
		System.out.println(s.charAt(4));
		
		String s1 = "Hello Selenium";
		String s2 = "Hello selenium";
		
		int a = 100;
		int b = 200;
		
		System.out.println(a==b);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		String h1 = "     hello world     ";
		System.out.println(h1.trim());
		
		System.out.println(h1.replace(" ", ""));
		
		String dob = "01-01-1990"; // 01/01/1990
		
		System.out.println(dob.replace("-", "/"));
		
		String c = "this is java";
		System.out.println(c.toUpperCase());
		System.out.println(c.toLowerCase());
		
	}
	}


