import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("===== Student Management System =====");

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> marks = new ArrayList<>();

        names.add("Lasya");
        names.add("Rahul");
        names.add("Priya");
        names.add("Arjun");
        names.add("Sneha");

        marks.add(85);
        marks.add(72);
        marks.add(91);
        marks.add(68);
        marks.add(78);

        displayStudents(names, marks);

        int total = calculateTotal(marks);
        double average = calculateAverage(marks);

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);

        int highest = findHighest(marks);
        int lowest = findLowest(marks);

        System.out.println("Highest Mark: " + highest);
        System.out.println("Lowest Mark: " + lowest);

        System.out.println("\nStudent Results:");
        for (int i = 0; i < names.size(); i++) {
            String result = getResult(marks.get(i));
            System.out.println(names.get(i) + " : " + result);
        }

        System.out.println("\nGrade Details:");
        for (int mark : marks) {
            System.out.println(mark + " -> Grade " + getGrade(mark));
        }

        System.out.println("\nSearching for student...");
        String searchName = "Priya";
        int index = names.indexOf(searchName);

        if (index >= 0) {
            System.out.println(searchName + " found.");
            System.out.println("Marks: " + marks.get(index));
        } else {
            System.out.println(searchName + " not found.");
        }

        System.out.println("\nStudents scoring above 80:");
        for (int i = 0; i < marks.size(); i++) {
            if (marks.get(i) > 80) {
                System.out.println(names.get(i) + " - " + marks.get(i));
            }
        }

        System.out.println("\nSorted Marks:");
        ArrayList<Integer> sortedMarks = new ArrayList<>(marks);
        Collections.sort(sortedMarks);

        for (int mark : sortedMarks) {
            System.out.println(mark);
        }

        System.out.println("\nProgram completed successfully.");
    }

    static void displayStudents(ArrayList<String> names,
                                ArrayList<Integer> marks) {

        System.out.println("\nStudent List:");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(
                (i + 1) + ". " +
                names.get(i) +
                " - " +
                marks.get(i)
            );
        }
    }

    static int calculateTotal(ArrayList<Integer> marks) {

        int total = 0;

        for (int mark : marks) {
            total = total + mark;
        }

        return total;
    }

    static double calculateAverage(ArrayList<Integer> marks) {

        int total = calculateTotal(marks);

        return (double) total / marks.size();
    }

    static int findHighest(ArrayList<Integer> marks) {

        int highest = marks.get(0);

        for (int mark : marks) {
            if (mark > highest) {
                highest = mark;
            }
        }

        return highest;
    }

    static int findLowest(ArrayList<Integer> marks) {

        int lowest = marks.get(0);

        for (int mark : marks) {
            if (mark < lowest) {
                lowest = mark;
            }
        }

        return lowest;
    }

    static String getResult(int mark) {

        if (mark >= 40) {
            return "PASS";
        }

        return "FAIL";
    }

    static char getGrade(int mark) {

        if (mark >= 90) {
            return 'A';
        } else if (mark >= 80) {
            return 'B';
        } else if (mark >= 70) {
            return 'C';
        } else if (mark >= 60) {
            return 'D';
        } else if (mark >= 40) {
            return 'E';
        }

        return 'F';
    }
}
