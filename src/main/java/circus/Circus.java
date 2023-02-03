package circus;

import circus.animals.Duck;
import circus.animals.Parrot;
import circus.stuff.Cannon;
import circus.stuff.Equipment;
import circus.stuff.Ladder;

public class Circus {
	private static Animal[] animals = {
			new Duck(),
			new Parrot()
	};
	private static Equipment[] equipments = {
			new Ladder(50),
			new Cannon(5),
			new Cannon(100)
	};
	
	private static void makeAnimalsTalk() {
		for (Animal a : animals) {
			System.out.println(a);
			System.out.println(a.speak());
		}
	}
	
	private static int calculateValue(Asset[] assets) {
		int total = 0;
		for (Asset e : assets) {
			if (e.getValue() <= 5) {
				// guard clauses
				System.out.println("Ignoring low value item: " + e.getValue());
				continue;
			} else {
				total += e.getValue();
				System.out.println("Adding item value: " + e.getValue());
				// some
				// more
				// code
				// here ...
			}
		}
		return total;
	}
	
	public static void main(String[] args) {
		makeAnimalsTalk();
		System.out.println("Total value of animals: " + calculateValue(animals));
		System.out.println("Total value of equipments: " + calculateValue(equipments));
	}
}