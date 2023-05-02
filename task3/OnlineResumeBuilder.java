import java.util.Scanner;

public class OnlineResumeBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Online Resume Builder!");
        
        // Personal Information
        System.out.println("Personal Information");
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();
        System.out.print("Enter your address: ");
        String address = scanner.nextLine();
        System.out.print("Enter your phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter your email address: ");
        String emailAddress = scanner.nextLine();
        
        // Educational Background
        System.out.println("Educational Background");
        System.out.print("Enter your degree: ");
        String degree = scanner.nextLine();
        System.out.print("Enter your school: ");
        String school = scanner.nextLine();
        System.out.print("Enter your graduation date: ");
        String graduationDate = scanner.nextLine();
        
        // Work Experience
        System.out.println("Work Experience");
        System.out.print("Enter your job title: ");
        String jobTitle = scanner.nextLine();
        System.out.print("Enter the company name: ");
        String companyName = scanner.nextLine();
        System.out.print("Enter the dates of employment (start date - end date): ");
        String employmentDates = scanner.nextLine();
        System.out.print("Enter your job description: ");
        String jobDescription = scanner.nextLine();
        
        // Skills
        System.out.println("Skills");
        System.out.print("Enter your top skill: ");
        String topSkill = scanner.nextLine();
        System.out.print("Enter your second top skill: ");
        String secondTopSkill = scanner.nextLine();
        
        // Output the resume
        System.out.println("\n\n");
        System.out.println("=========================================");
        System.out.println("              " + fullName.toUpperCase());
        System.out.println("=========================================");
        System.out.println("Personal Information:");
        System.out.println("- Address: " + address);
        System.out.println("- Phone Number: " + phoneNumber);
        System.out.println("- Email Address: " + emailAddress);
        System.out.println("\nEducational Background:");
        System.out.println("- Degree: " + degree);
        System.out.println("- School: " + school);
        System.out.println("- Graduation Date: " + graduationDate);
        System.out.println("\nWork Experience:");
        System.out.println("- Job Title: " + jobTitle);
        System.out.println("- Company Name: " + companyName);
        System.out.println("- Employment Dates: " + employmentDates);
        System.out.println("- Job Description: " + jobDescription);
        System.out.println("\nSkills:");
        System.out.println("- " + topSkill);
        System.out.println("- " + secondTopSkill);
    }
}