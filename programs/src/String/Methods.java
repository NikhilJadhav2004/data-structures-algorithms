package String;

public class Methods {

	public static void main(String[] args) {
		
		String p="nnikhil jadhav";
		System.out.println(p);
		
		
		System.out.println("methods on string");
		
		System.out.println(p.length());
		
		System.out.println(p.charAt(0));
		
		System.out.println(p.indexOf('j'));
		
		
		String s1="Nikhil";
		
		String s2="Manish";
		
		String s3="Nikhil";
		
		String s4="Lion";
		System.out.println(s1.compareTo(s2));
		
		System.out.println(s1.compareTo(s3));
		
		System.out.println(s1.compareTo(s4));
		
		System.out.println(s1.toLowerCase());
		
		System.out.println(s1.toUpperCase());
		
		System.out.println(s1.concat(s4));
		
		System.out.println(s1.contains("ilpp"));
		
		System.out.println(s1.startsWith("Nik"));
		
		System.out.println(s1.endsWith("il"));
		
		System.out.println(s1.substring(0, 3));
		
		System.out.println(s1.substring(0));
		
	}
}
