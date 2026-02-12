public class opgave2 {
    int assignmentPoints;
    int examPoints;
    int projectPoints;

    void addAssignmentsPoints(int points) {
        assignmentPoints += points;
    }

    void addExamPoints(int points) {
        examPoints += points;
    }

    void addProjectPoints(int points) {
        projectPoints += points;
    }

    void printTotal() {
        int total = assignmentPoints + examPoints + projectPoints;
        System.out.println("Total: " + total);
        }

    void main() {
        addAssignmentsPoints(25);
        addExamPoints(40);
        addProjectPoints(30);
        printTotal();
    }
}
