  import java.util.ArrayList;

import com.alok.minions.Minion;

public class Main {

	public static void main(String[] args) {
		
				// Minion minion1 = new Minion();
				// Minion minion2 = new Minion("Stuart",12);
				ArrayList <Minion> minionsList1 = new ArrayList<Minion>();
				
				//For Loop
				int i ;
				for(i = 1 ; i <= 100 ; i++)
				{
					Minion tempMinion = new Minion("Minion" + i , (int) Math.floor(Math.random()*101));
					minionsList1.add(tempMinion);
					Minion.totalMinions = Minion.totalMinions  + 1 ;
				}
				
				System.out.println("Total minions created: " + Minion.totalMinions);
				
				//while  loop
				i= 125 ;
				while (i <= 150 ) {
					Minion minion = new Minion("Minion" + i , (int) Math.floor(Math.random()*101));
					minionsList1.add(minion);
					Minion.totalMinions = Minion.totalMinions  + 1 ;
					
					i++ ;
				}
				
				System.out.println("Total minions created: " + Minion.totalMinions);
				
				// Do while loop
				i = 200 ;
				do
				{
					Minion minion = new Minion("Minion" + i , (int) Math.floor(Math.random()*101));
					minionsList1.add(minion);
					Minion.totalMinions = Minion.totalMinions  + 1 ;
					
					i++ ;
				}while(i <= 225 );
				
				System.out.println("Total minions created: " + Minion.totalMinions);
				
				
				//Print the values using for loop
				for(int j = 0 ; j < minionsList1.size() ; j++)
				{ 
					Minion tempMinion = minionsList1.get(j);
					System.out.println("Minion name: " + tempMinion.getName() + " age: " +  tempMinion.getAge()) ;
				}
				
				for (Minion tempMinion : minionsList1) {
					System.out.println(" new loop Minion name: " + tempMinion.getName() + " age: " +  tempMinion.getAge()) ;
				}
				
				/*
				minion1.setName("Steve");
				//minion2.setName("Stuart");
				minion1.setAge(10);
				//minion2.setAge(12);
				minion1.setColor("yellow");
				minion2.setColor("lightYellow");

				System.out.println("name:" + minion1.getName());
				System.out.println("name:" + minion2.getName());
				*/
	}

}
