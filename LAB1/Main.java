import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        calCir();
        convertTemp();
        thbToUSD();
        travelTime();

    }

    //Lab 1.1
    static void calCir (){
    Scanner input = new Scanner(System.in);
      double radius = input.nextDouble();
      double area = 3.1416 * radius * radius;
      double circumference = 2*3.1416*radius;
      System.out.println("The are of this circle is " + area);
      System.out.println("The circumference is " + circumference);
    }

    //Lab 1.2
    static  void convertTemp(){
        Scanner input = new Scanner(System.in);
        convertFtoC(input.nextDouble());
        convertCtoF(input.nextDouble());
        
    }
    static void convertFtoC(double tempF){
        double tempC = (tempF - 32) * 5/9;
        System.out.printf(" The temperature in Celsius for Fahrenheit value %.2f is %.2f\n",tempF,tempC);
    }
    static void convertCtoF(double tempC){
        double tempF = (9/5) * tempC + 32;
        System.out.printf(" The temperature in Fahrenheit for Celsius value %.2f is %.2f\n",tempC,tempF);
    }

    //Lab 1.3
    static void thbToUSD(){
        Scanner input = new Scanner(System.in);
        double THB = input.nextDouble();
        double USD = THB * 0.031;
        System.out.printf("The amount of USD for %.2f THB is %.2f\n",THB,USD);
    }

    //Lab 1.4
    //You want to know the traveling time from a city to another city. Identify the inputs, process and output.Write a program in JAVA.
    static void travelTime(){
        Scanner input = new Scanner(System.in);
        double distance = input.nextDouble();
        double speed = input.nextDouble();
        double time = distance / speed;
        System.out.printf("The time for traveling %.2f km at %.2f km/h is %.1f hours.",distance,speed,time);
        }
  }