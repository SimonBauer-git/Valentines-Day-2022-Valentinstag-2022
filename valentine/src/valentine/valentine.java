package valentine;
import java.util.Scanner;
public class valentine {

	public static void main(String[] args) {
	int error =1;
		while (error==1)
	{String result = "Y";
	Scanner question = new Scanner(System.in);
	System.out.println("Will you be my valentine (Y for yes N for No)");
	result=question.nextLine();
	error = 1;
	if(result.contains("Y")) {
	yes();
	error=0;}

	if(result.contains("N")) {
		no();
		error=0;}
		
	if (error==1)
		{System.out.println("bitte eingabe überprüfen");}}
	}		

public static void yes()
{
System.out.println("___#####_____#####__");
System.out.println("__########_########_");
System.out.println("####################");
System.out.println("####################");
System.out.println("_##################_");
System.out.println("__################__");
System.out.println("___##############___");
System.out.println("____############____");
System.out.println("______########______");
System.out.println("_______######_______");
System.out.println("________####________");
}
public static void no()
{
System.out.println("___#|####_____#####__");
System.out.println("__###|#####_########_");
System.out.println("######|##############");
System.out.println("#######|#############");
System.out.println("_#######|###########_");
System.out.println("__#######|#########__");
System.out.println("___#######|#######___");
System.out.println("____#######|#####____");
System.out.println("______######|##______");
System.out.println("_______######_______");
System.out.println("________####________");
}
}
