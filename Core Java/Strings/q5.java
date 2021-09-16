public class q5 {
    public static void main(String[] args) {
		String s1="insert text";
		String s2="It is used to  at the specified index postion";
		StringBuffer sb=new StringBuffer(s2);
		sb.insert(14, s1);
		System.out.println("New string -- "+sb);
	}
}
