package com.CollectionsTopic;
import java.util.Scanner;
public class CarParking {

	static int calculateFee(int hrs,int minutes) {
		if(hrs<0 || hrs>23) {
			return -1;
		}
		if(minutes<0 || minutes>59) {
			return -2;
		}
		int totalminutes=hrs*60+minutes;
		if(totalminutes<15) {
			return 0;
		}
		else if(totalminutes<=120) {
			return 5;
		}
		else if(totalminutes<=300) {
			return 10;
		}
		else {
			int extrafee=totalminutes/60;
			extrafee=extrafee-5;
			return 10+extrafee;  
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int hrs=scn.nextInt();
		int minutes=scn.nextInt();
		System.out.println(calculateFee(hrs, minutes));
	}
}
