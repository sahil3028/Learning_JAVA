/*
Topic: StringBuffer and StringBuilder
Definition: StringBuilder and StringBuffer are mutable text containers.
Why / usage: They avoid creating many temporary String objects during repeated changes.
Where to use it: Use StringBuilder for efficient text building; use StringBuffer only when synchronisation is needed.
*/
class Demo {
	public static void main(String[] args) 
	{
		StringBuffer sb= new StringBuffer("Navin");
//		System.out.println(sb.length());
//		System.out.println(sb.capacity());
		sb.append("Reddy");
		System.out.println(sb);
		
//		String str=sb.toString();
		
//		sb.deleteCharAt(2);
//		sb.insert(0,"Java");
//		sb.insert(6,"java");
//		sb.setLength(30);
		sb.ensureCapacity(100);
		
		System.out.println(sb);
	
	}
}