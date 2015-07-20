import java.util.Scanner;//importing scanner library that is used to get keyboard input
public class Moringa {//defining the class that hold the entire program
public static void main(String args[]){//main method header
System.out.println(" 1:ngong 2:waiyaki 3:MombasaRoad 4:mbagathi 5:Jogoo");
//int 1=NgongRoad,2="WaiyakiRoad",C="MombasaRoad",D="MbagathiRoad",E="JogooRoad";
System.out.println(" enter letter the road you wish to check traffic status:");
Scanner road=new Scanner(System.in);
int baro=road.nextInt();
switch(baro){
case 1:
	System.out.println("There is traffic along ngongroad");
	break;
case 2:
	System.out.println("There is no traffic along Waiyaki road");
	break;
case 3:
	System.out.println("There is traffic along Mombasa road");
	break;
case 4:
	System.out.println("There is no traffic along Mbagathi road");
	break;
case 5:
	System.out.println("There is no traffic along jogoo road");
	break;

default:
	System.out.println("Please Enter the available roads.");
    break;
}}
}
 