package converter;
import java.util.*;

//CURRENCY CONVERTER
public class Currency_Converter{
  public static void main(String args[])
  {
      System.out.println("Enter your Rupee:");
      Scanner s=new Scanner(System.in);
      int r=s.nextInt();
      System.out.println("Select in which Currency you want to convert");
      System.out.println("1.USD ");
      System.out.println("2.EUR");
      System.out.println("3.CAD");
      System.out.println("4.CNY");
      int ch=s.nextInt();
      switch(ch)
      {
          case 1:
          System.out.println("United State Dollar="+r*0.0120788997+" USD");
          break;
          case 2:
          System.out.println("EUROPE="+r*0.0113483143+" EUR");
          break;
          case 3:
          System.out.println("Canadian="+r*0.0163675298+" CAD");
          break;
          case 4:
          System.out.println("Chainese="+r*0.0839908106+" CNY");
          break;
          default:
          System.out.println("Invalid Choice...");

      }
  }
}
