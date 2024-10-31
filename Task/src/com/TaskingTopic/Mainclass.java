package com.TaskingTopic;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Mainclass {

	public static void main(String[] args) {
		LinkedHashSet kid = new LinkedHashSet();
		LinkedHashSet mem = new LinkedHashSet();
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number of participants");
		int no = scn.nextInt();
		scn.nextLine();
		for (int i = 1; i <= no; i++) {
			System.out.println("Enter your name");
			String name = scn.nextLine();
			System.out.println("Enter gender");
			String gender = scn.nextLine();
			System.out.println("Enter Project Name");
			String pro = scn.nextLine();
			Project p1 = new Project(name, gender);
			String kyc = p1.generateID(name, gender);
			kid.add(kyc);
			String member = p1.DisplayMemberInfo(pro);
			mem.add(member);
//		System.out.println(kyc+" "+member); 
		}
		System.out.println(kid); 
		System.out.println(mem);
	}
}
