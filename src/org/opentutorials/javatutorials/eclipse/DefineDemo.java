package org.opentutorials.javatutorials.eclipse;

public class DefineDemo {

	public static void main(String[] args) {
		String[] classGroup = {"최진혁", "최유빈", "한이람", "이고잉"};
		System.out.println(classGroup[0]);
		System.out.println(classGroup[1]);
		System.out.println(classGroup[2]);
		System.out.println(classGroup[3]);
		System.out.println(classGroup.length);
		
		for (int i= 0; i<classGroup.length; i++) {
			String member = classGroup[i];
			System.out.println(member + "이 상담을 받았습니다.");
		}
		for (String s : classGroup) {
			System.out.println(s+"이 상담을 받았습니다.");
		}
	}
}
