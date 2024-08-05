package com.kh.test;

import java.util.ArrayList;
import com.kh.test.model.vo.Student;

public class Test {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		
//		Student s1 = new Student();
//		s1.setName("강건강");
//		s1.setScore(84);
//		list.add(s1);
		
		list.add(new Student("강건강", 84));
		list.add(new Student("남나눔", 78));
		list.add(new Student("도대담", 96));
		list.add(new Student("류라라", 67));
		
		for(int i = 0 ; i < 4; i++) {
			Student s = list.get(i);
//			System.out.println(s.toString());
			
			System.out.printf("%s 학생의 점수 : %d점\n", 
					s.getName(), s.getScore());
		}
		
		System.out.printf("%s 학생의 점수 : %d점\n", 
				list.get(0).getName(), list.get(0).getScore());
		System.out.printf("%s 학생의 점수 : %d점\n", 
				list.get(1).getName(), list.get(1).getScore());
		System.out.printf("%s 학생의 점수 : %d점\n", 
				list.get(2).getName(), list.get(2).getScore());
		System.out.printf("%s 학생의 점수 : %d점\n", 
				list.get(3).getName(), list.get(3).getScore());
		
		
		
//		for(Student s : list) {
//			System.out.println(s);
//		}
//		
		
	}
}