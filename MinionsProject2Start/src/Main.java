public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Minion minion1 = new Minion();
		Minion minion2 = new Minion();
		
		minion1.setName("Steve");
		minion2.setName("Stuart");
		minion1.setAge(10);
		minion2.setAge(12);
		minion1.setColor("yellow");
		minion2.setColor("lightYellow");

		System.out.println("name:" + minion1.getName());
		System.out.println("name:" + minion2.getName());

	}

}
