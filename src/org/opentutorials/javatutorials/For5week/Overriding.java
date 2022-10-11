package org.opentutorials.javatutorials.For5week;

class Weapon {
	protected int fire() {
		return 1;
	}
}

class Cannon extends Weapon {
	protected int fire() {
		return 10;
	}
}
public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Weapon weapon;
		weapon = new Weapon();
		System.out.println("기본 문기의 살상 능력은 " + weapon. fire());
		
		weapon = new Cannon();
		System.out.println("대포의 살상 능력은 " + weapon.fire());

	}

}
