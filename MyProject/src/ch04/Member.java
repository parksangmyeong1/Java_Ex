package ch04;

import java.util.*;

public class Member{	
	public void vaccinCheck(int birthYear) {
		int age = Calendar.getInstance().get(Calendar.YEAR)+1-birthYear;
		if (age<15 || age>=65) {
			System.out.println("무료예방접종이 가능합니다.");
			System.out.println();
		}
		else {
			System.out.println("무료접종 대상이 아닙니다.");
			System.out.println();
		}
	}
	public void healthCheck(int birthYear) {
		int thisYear = Calendar.getInstance().get(Calendar.YEAR);
		int age = thisYear+1-birthYear;
		if(age>=20){
			if(age%2==0 && thisYear%2==0) {
				System.out.println("올해 건강검진 대상자입니다.");
				if(age>=40) {
					System.out.println("추가로 암검사도 무료로 가능합니다.");
				}
			}else {
				System.out.println("올해 건강검진 대상자가 아닙니다.");
				}
		}else {
			System.out.println("건강검진 대상자가 아닙니다.");
			}
		
	}
	public static void main(String[] args) {		
		Member member = new Member();
		System.out.printf("태어난 년도를 입력해주세요 : ");
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		System.out.println("------------------------------");
		
		member.vaccinCheck(input);
		member.healthCheck(input);
	}

}
