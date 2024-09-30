/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estateagent;

/**
 *
 * @author lab_services_student
 */
class EstateAgentSales extends EstateAgent {

    // Constructor to accept agent name and property sale amount
    public EstateAgentSales(String agentName, double propertySaleAmount) {
        
    }

    // Implement the abstract method
    public void PrintPropertyReport() {
        System.out.println("Estate Agent Property Sale Commission Report");
        System.out.println("--------------------------------------------");
        System.out.println("Estate Agent Name: " + getAgentName());
        System.out.println("Property Sale Amount: R" + getPropertySaleAmount());
        System.out.println("Commission Amount: R" + getCommission());
    }

    private String getAgentName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String getPropertySaleAmount() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String getCommission() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
