package org.cg.StringbufferAndBuilders;

public class StringBufferInbuilt {

	public static void main(String[] args) {
		// append
		StringBuffer a=new StringBuffer("hello im ");
		System.out.println(a.capacity());
		a.append("tippareddy");
		System.out.println(a +" "+ a.capacity()) ;
		//insert
		a.insert(2, "hi");
		System.out.println(a+" "+a.capacity());
		//replace
		StringBuffer str1=new StringBuffer("tippareddy");
		str1.replace(0,3,"my");//start,end,strin
		System.out.println(str1);
		//delete
		str1.delete(2,5);
		System.out.println(str1);
		StringBuffer ab=new StringBuffer(" ");
		ab.ensureCapacity(64);
		System.out.println(ab.capacity());
		System.out.println(str1.charAt(5));
		System.out.println(str1.length());
		StringBuffer str2=new StringBuffer("tippareddy");
		String str3=str2.substring(2, 5);
		System.out.println(str3);
		System.out.println(str2.reverse());
		

		
		

	}

}
