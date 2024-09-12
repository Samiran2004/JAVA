// Java program to illustrate the
// concept of inheritance

class Bicycle {
	public int gear;
	public int speed;

	public Bicycle(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}

	public void applyBrake(int speedLoss) {
		speed -= speedLoss;
	}

	public void speedUp(int speedIncrement) {
		speed += speedIncrement;
	}

	public String toString() {
		return ("Number of gears are: " + gear + "\n" + "Speed of bicycl is: " + speed);
	}
}

class MountainBike extends Bicycle {
	public int seatHeight;

	public MountainBike(int gear, int speed, int seatHeight) {
		super(gear, speed);
		this.seatHeight = seatHeight;
	}

	public void setSeatHeight(int height) {
		seatHeight = height;
	}

	@Override
	public String toString() {
		return (super.toString() + "\nSeat height is: " + seatHeight);
	}
}

/**
 * Test
 */
public class Test {
	public static void main(String[] args) {
		Bicycle bicycle = new Bicycle(5, 20);
		System.out.println(bicycle.toString());
		MountainBike mountainBike = new MountainBike(8, 35, 30);
		System.out.println(mountainBike.toString());
	}
}