import java.util.Scanner;
public class Sample{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hellow World");
		System.out.println("Enter number to Check Your Grade: ");
		float num = sc.nextFloat();
		if (num >=70){System.out.println("Your marks is "+num+" & your grade is A");}
		else if (num <70 && num>=50){System.out.println("Your marks is "+num+" & your grade is B");}
		else if (num <50 && num>=33){System.out.println("Your marks is "+num+" & your grade is C");}
		else{System.out.println("Your marks is "+num+" & your are Fail : grade is D");}
	}
}

class loop{
	public static void main(String arg[]){
		System.out.println("Get average of Your marks");
		System.out.println("press '123' of exit");
		int count=1;
		float marks1 = 0;
	
		while(count >0){
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter marks of subject "+count+" : ");
			float marks= sc.nextFloat(); 
			if (marks==123){
				count = count-1;
				break;}
			else {marks1 =marks1 + marks;}
				count =count+1;
			
			
		}
		System.out.println("Your avg marks is "+ marks1/count);
		
	}
}


class LudoKing{
	public static void main(String[] arg){
	Scanner sc = new Scanner(System.in);
	

	System.out.println("Enter Alex points");
	int alex_point = sc.nextInt();
	if (alex_point< 0 || alex_point>50){
		System.out.println(""+alex_point+" is an invalid number");
		return;
	}
	System.out.println("Enter nikil points");
	int nikil_point = sc.nextInt();
	if (nikil_point< 0 || nikil_point>50){
		System.out.println(""+nikil_point+" is an invalid number");
		return;
	}
	System.out.println("Enter sam points");
	int sam_point = sc.nextInt();
	if (sam_point< 0 || sam_point>50){
		System.out.println(""+sam_point+" is an invalid number");
		return;
	}
		
	if (alex_point>nikil_point){
		if (alex_point>sam_point){
			System.out.println("Alex scores "+alex_point+ " points and wins the game");}
		else{
			System.out.println("Sam scores "+sam_point+ " points and wins the game");
		}	 
		
	}
	else {
		if (nikil_point>sam_point){
		System.out.println("Nikil scores "+nikil_point+ " points and wins the game");}
		else {
			System.out.println("Sam scores "+sam_point+ " points and wins the game");
		}
	}
} }

	
class oxygen{
	public static void main(String[] arg){
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter the floor area of the room(m*m)");
		float l = sc.nextFloat();
		float b = sc.nextFloat();
		
		System.out.println("Enter the plant area of a single plant(in cm2)");
		float plant_area = sc.nextFloat();
		
		plant_area = plant_area/10000;
		
		float total_plant = (l*b)/plant_area;
		
		if ((int)total_plant%10!=0){
			total_plant = total_plant-((float)(total_plant%10));
		}
		else if (total_plant<10){total_plant = 0;}
		
		float oxygen = total_plant*(float)0.9;
		
		System.out.println("Total plants placed on floor area  %.2f"l"* %.2f"b" is "+total_plant+" plants produces "+oxygen+" litres of oxygen in a day");
		
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	