package YK_tasks;

import java.util.Scanner;

 class YK_advanced_1 {
     private String model;
     private String number;
     private double weight;

     public String getModel() {
         return model;
     }
     public void setModel(String model) {
         this.model = model;
     }
     public String getNumber() {
         return number;
     }
     public void setNumber(String number) {
         this.number = number;
     }
     public double getWeight() {
         return weight;
     }
     public void setWeight(double weight) {
         this.weight = weight;
     }}
class Main {
    public static void main(String[] args) {
        YK_advanced_1 iPhone = new YK_advanced_1();
        YK_advanced_1 samsung = new YK_advanced_1();
        YK_advanced_1 huawei = new YK_advanced_1();

        setInput(iPhone, "iPhone");
        setInput(samsung, "Samsung");
        setInput(huawei, "Huawei");

        printInfo(iPhone);
        printInfo(samsung);
        printInfo(huawei);
    }
    public static void setInput(YK_advanced_1 phone, String phoneName) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter " + phoneName + " model:");
        phone.setModel(scanner.nextLine());

        System.out.println("Enter " + phoneName + " number:");
        phone.setNumber(scanner.nextLine());

        System.out.println("Enter " + phoneName + " weight:");
        phone.setWeight(scanner.nextDouble());
    }    public static void printInfo(YK_advanced_1 phone) {
        System.out.println("[" + phone.getModel() + "] :");
        System.out.println("Model: " + phone.getModel());
        System.out.println("Number: " + phone.getNumber());
        System.out.println("Weight: " + phone.getWeight());
        System.out.println();
    }
}
