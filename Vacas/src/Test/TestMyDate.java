package Test;

import com.uptc.livestock.model.entity.MyDate;

public class TestMyDate {
	
	public static void main(String[] args) {
		System.out.println(MyDate.passToDays(new MyDate((short)2, (short)06, (short)2017)));
		System.out.println(MyDate.passToDays(new MyDate((short)1, (short)06, (short)2017)));
		System.out.println(MyDate.passToDays(new MyDate((short)1, (short)06, (short)2016)));
		System.out.println(MyDate.passToDays(new MyDate((short)28, (short)05, (short)1999)));
		System.out.println(MyDate.passToDays(new MyDate((short)12, (short)12, (short)2017)));
		System.out.println(MyDate.passToDays(new MyDate((short)12, (short)5, (short)2017)));
		System.out.println(MyDate.passToDays(new MyDate((short)12, (short)4, (short)2017)));
		System.out.println(MyDate.passToDays(new MyDate((short)12, (short)3, (short)2017)));
		System.out.println(MyDate.passToDays(new MyDate((short)12, (short)7, (short)2017)));
		System.out.println(MyDate.passToDays(new MyDate((short)29, (short)5, (short)2017)));
	}

}
