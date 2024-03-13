package Collections;

import java.util.ArrayList;

class FacultyMain {
    public static void main(String[] args) {
        ArrayList<Faculty> al = new ArrayList<>();
        al.add(new Faculty(1, "Raghul", "java", 100000.0d));
        al.add(new Faculty(2, "Akshay", "java", 200000.0d));
        al.add(new Faculty(3, "Naviya", "SQL", 20000.0d));
        al.add(new Faculty(4, "Chandreleka", "SQL", 100000.0d));
        al.add(new Faculty(5, "Anupama", "java", 300000.0d));

        System.out.println("Faculties whose subject is SQL:");
        displayFacultyBySubject(al, "SQL");
        System.out.println("\nFaculties whose id is between 20 and 30:");
        displayFacultyByIdRange(al, 20, 30);
        System.out.println("\nFaculties whose salary is between 1 lakh and 1.5 lakh:");
        displayFacultyBySalaryRange(al, 100000, 150000);
    }

    private static void displayFacultyBySubject(ArrayList<Faculty> facultyList, String subject) {
        for (Faculty faculty : facultyList) {
            if (faculty.subject.equalsIgnoreCase(subject)) {
                System.out.println("ID: " + faculty.id + ", Name: " + faculty.name +
                        ", Subject: " + faculty.subject + ", Salary: " + faculty.salary);
            }
        }
    }

    private static void displayFacultyByIdRange(ArrayList<Faculty> facultyList, int startId, int endId) {
        for (Faculty faculty : facultyList) {
            if (faculty.id >= startId && faculty.id <= endId) {
                System.out.println("ID: " + faculty.id + ", Name: " + faculty.name +
                        ", Subject: " + faculty.subject + ", Salary: " + faculty.salary);
            }
        }
    }

    private static void displayFacultyBySalaryRange(ArrayList<Faculty> facultyList, double startSalary, double endSalary) {
        for (Faculty faculty : facultyList) {
            if (faculty.salary >= startSalary && faculty.salary <= endSalary) {
                System.out.println("ID: " + faculty.id + ", Name: " + faculty.name +
                        ", Subject: " + faculty.subject + ", Salary: " + faculty.salary);
            }
        }
    }
}

