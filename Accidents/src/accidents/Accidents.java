/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package accidents;

/**
 *
 * @author lab_services_student
 */
public class Accidents {
    public static void main(String[] args) {
      String[] City = {"Cape Town", "Johannesburg", "Port Elizabeth"};
      
      int[] carAccidents = {155, 178, 112};
      int[] bikeAccidents = {121, 145, 89};
      
      Object[][] accidentReport = new Object[City.length][2];
      
      int maxDifference = 0;
      String manufacturerWithMaxDifference = "";
      
      System.out.println("Road Accident Report");
      System.out.println("--------------------------");
      
      for (int i = 0; i< City.length; i++){
          
          int accidentTotal = carAccidents[i] + bikeAccidents[i];
          accidentReport[i][0] = City[i];
          accidentReport[i][1] = accidentTotal;
          
          System.out.println("City: " + City[i]);
          System.out.println("Car accidents: " + carAccidents[i]);
          System.out.println("Bike accidents: " + bikeAccidents[i]);
          System.out.println("Accident Total: " + accidentTotal);
          System.out.println("-------------------------------");
          
          if (Math.abs(accidentTotal) > maxDifference){
              maxDifference = Math.abs(accidentTotal);
              manufacturerWithMaxDifference = City[i];
              
              
          }
      }
      System.out.println("Road Accident Total For Each City:");
      for (Object[] report : accidentReport){
          System.out.println("City: " + report[0] + " Total: " + report[1]);
      }
      System.out.println("------------------------------");
      System.out.println("City With The Most Vehicle Accidents:" + manufacturerWithMaxDifference);
    }
    
}
