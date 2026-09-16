import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("EMPLOYEE SALARY CALCULATOR\n");

        System.out.print("Employee Name: ");
        String name = input.nextLine();

        System.out.print("Employee ID: ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Position: ");
        String position = input.nextLine();

        System.out.print("Employment Type (F/P): ");
        char employmentType = input.next().charAt(0);

        System.out.print("Active Employee (true/false): ");
        boolean activeEmployee = input.nextBoolean();

        System.out.print("Number of Days Worked: ");
        int daysWorked = input.nextInt();

        System.out.print("Daily Rate: ");
        double dailyRate = input.nextDouble();

        System.out.print("Overtime Hours: ");
        double overtimeHours = input.nextDouble();

        System.out.print("Allowance: ");
        double allowance = input.nextDouble();

        System.out.print("Deductions: ");
        double deductions = input.nextDouble();

        double grossSalary = dailyRate * daysWorked;
        double hourlyRate = dailyRate / 8;
        double overtimeRate = hourlyRate * 1.25;
        double overtimePay = overtimeRate * overtimeHours;
        double totalEarnings = grossSalary + overtimePay + allowance;
        double netSalary = totalEarnings - deductions;

        System.out.println("\nEMPLOYEE SALARY DETAILS");

        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Position: " + position);
        System.out.println("Employment Type: " + employmentType);
        System.out.println("Active Employee: " + activeEmployee);
        System.out.println("Days Worked: " + daysWorked);

        System.out.println();

        System.out.printf("Daily Rate: PHP %.2f%n", dailyRate);
        System.out.printf("Gross Salary: PHP %.2f%n", grossSalary);
        System.out.printf("Hourly Rate: PHP %.2f%n", hourlyRate);
        System.out.printf("Overtime Rate: PHP %.2f%n", overtimeRate);
        System.out.printf("Overtime Hours: %.2f%n", overtimeHours);
        System.out.printf("Overtime Pay: PHP %.2f%n", overtimePay);
        System.out.printf("Allowance: PHP %.2f%n", allowance);
        System.out.printf("Total Earnings: PHP %.2f%n", totalEarnings);
        System.out.printf("Deductions: PHP %.2f%n", deductions);
        System.out.printf("Net Salary: PHP %.2f%n", netSalary);

        input.close();
    }
}