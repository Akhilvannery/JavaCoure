package datedemo;

import java.time.ZonedDateTime;
import java.time.temporal.*;
public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(System.currentTimeMillis());
		ZonedDateTime zdt=ZonedDateTime.now();
		System.out.println(zdt);
		}

}
