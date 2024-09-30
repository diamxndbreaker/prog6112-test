/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Abstract
/**
 *
 * @author lab_services_student
 */

    abstract class EstateAgent {
    protected String agentName;
    protected double propertySaleAmount;

    // Constructor
    public EstateAgent(String agentName, double propertySaleAmount) {
        this.agentName = agentName;
        this.propertySaleAmount = propertySaleAmount;
    }

    // Getter methods
    public String getAgentName() {
        return agentName;
    }

    public double getPropertySaleAmount() {
        return propertySaleAmount;
    }

    // Method to calculate commission (20% of property price)
    public double getCommission() {
        return propertySaleAmount * 0.20;
    }

    // Abstract method for printing property report
    public abstract void PrintPropertyReport();
}


