package com.TaskingTopic;

import java.util.Random;
import java.util.Scanner;

public class Project extends KYC {

	public Project(String name, String gender) {
		super(name, gender);
	}

	String DisplayMemberInfo(String project_name) {
		Random random = new Random();
		int projectID = random.nextInt(899);
		String memberID = project_name.substring(0, 2) + "" + random.nextInt(899);
		String member="Project[Project ID= " + projectID + ", Project Name=" + project_name + ", Member ID=" + memberID + "]";
		return member;
	} 
}
