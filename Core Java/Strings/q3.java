public class q3 {
    public static void main(String[] args) {
		String str="Java String pool refers to collection of Strings which are stored in heap memory";
		System.out.println("String in Lower case: "+str.toLowerCase());
		System.out.println("String in Upper Case: "+str.toUpperCase());
		System.out.println("Replace a with $: "+str.replace('a', '$'));
		System.out.println("Contains 'collection': "+str.contains("collection"));
		System.out.println("CompareTo: "+str.compareTo("java string pool refers to collection of strings which are stored in heap memory"));
		System.out.println("Equals: "+str.equals("java string pool refers to collection of strings which are stored in heap memory"));
	}
}
