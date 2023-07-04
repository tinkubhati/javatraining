package com.kvaluent.assignment.eightjuly;

enum Mark {
	Physics(90), Chemistry(95), Maths(98);

	private int value;

	private Mark(int value) {
		this.value = value;
	}

	public int getValue() {
		return (value);
	}
}

final public class Subject {
	public static void main(String... args) {
		int sum = 0;

		for (Mark o : Mark.values()) {
			sum += o.getValue();
		}

		System.out.println("sum  = " + sum);
	}
}