package MkayaMarketCoding;


import java.util.*;

import javax.xml.bind.ParseConversionEvent;

public class CanvasCourses_selfStudy {
	public static void main(String[] args) {
		String url = "https://learn.cybertekschool.com/courses/149";
		String[] urlArr = url.split("/");
		System.out.println(Arrays.toString(urlArr));
		System.out.println(urlArr.length);
		System.out.println(urlArr[urlArr.length-1]);
		
		int classCode = Integer.parseInt(urlArr[urlArr.length-1]);
		switch (classCode) {
		case 149:
			System.out.println("SDLC");
			break;
		case 147:
			System.out.println("Mentoring Sessions");
			break;
		case 148:
			System.out.println("Qa Testing");
			break;

		default:
			System.out.println("Invalid course");
			break;
		}
		
		
		
	}

}
