public class Coffee{
	public static void main(String args[]){

		Beverage beverage2 = new HouseBlend();
		beverage2 = new Milk(beverage2);
		beverage2 = new Milk(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Soy(beverage2);
		System.out.println(beverage2.getDescription()+ " = $ " + beverage2.cost() );
		
		// Beverage beverage3 = new DarkRoast();
		// beverage3 = new Soy(beverage3);
		// System.out.println(beverage3.getDescription() + " $ " + beverage3.cost() );
	}
}