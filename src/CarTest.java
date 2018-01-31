public class CarTest {
		// TODO Auto-generated constructor stub

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Car car = new Car("Toyota", 1500, 1992);
			System.out.println(car.CarBrand + ", "+ car.price + ", "+ car.year);
			Car car5 = new Car("Nissan", 1800, 2000);
			System.out.print(car5.CarBrand);
			System.out.println(", "+ car5.price + ", "+ car5.year);
			car5.CarBrand = "Ford";
			car5.price = 2400;
			car5.year = 2005;
			System.out.print(car5.CarBrand + ", "+ car5.price + ", "+ car5.year);



	}

}