public class Program1 {
    public static void main(String[] args) {
        // Hardcoding marks (change this value as needed)
        int marks = 85; // Example value

        char grade;
        switch (marks / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }

        System.out.println("The student's grade is: " + grade);
    }
}
