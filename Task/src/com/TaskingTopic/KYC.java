package com.TaskingTopic;

import java.util.Random;

public class KYC {

	String name;
	String gender;
	String kycID = "";

	public KYC(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}
//	public KYC() {
//		generateID(name, gender);
//	}

	String generateID(String name, String gender) {
//		String kycID = "";
		Random random = new Random();
		int num = 100 + random.nextInt(899);
		if (gender.equalsIgnoreCase("Male")) {
			kycID += num + "" + name.length() + "" + 'M'; 
		} else if (gender.equalsIgnoreCase("Female")) {
			kycID += num + "" + name.length() + "" + 'F';
		} else if (gender.equalsIgnoreCase("Other")) {
			kycID += num + "" + name.length() + "" + "Oth";
		} else {
			System.out.println("Invalid Data");
		}
//		System.out.println("KYC[KYCID= " + kycID + ", Name=" + name + ", Gender=" + gender + "]");
		String kyc="KYC[KYCID= " + kycID + ", Name=" + name + ", Gender=" + gender + "]";
		return kyc; 
	}
}
