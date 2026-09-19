public class Task1Demo {
    public static void main(String[] args) {
       
        Student s1 = new Student();

        s1.studentId = "SP26-BAI-001";
        s1.name = "Aamna Basit";
        s1.completedCredits = 15;

        Student s2 = new Student();
        s2.studentId = "BAI-002";
        s2.name = "Abdul Rehmaan Azam";
        s2.completedCredits = 30;

        Student s3 = new Student();
        s3.studentId = "BAI-003";
        s3.name = "Abdul Rehman Basit";
        s3.completedCredits = 45;

       
        System.out.println(" Before Change");
        System.out.println(s1.name + ": " + s1.completedCredits + " credits");
        System.out.println(s2.name + ": " + s2.completedCredits + " credits");
        System.out.println(s3.name + ": " + s3.completedCredits + " credits");

        
        s2.completedCredits = 36;

        // Two-line comment explaining why s1 and s3 did not change:
        // Each object created with 'new' gets its own separate memory block.
        // Changing s2.completedCredits updates s2's memory only, leaving s1 and s3 untouched.

        //after change
        System.out.println("\n--- After Change (Only s2 modified) ---");
        System.out.println(s1.name + ": " + s1.completedCredits + " credits");
        System.out.println(s2.name + ": " + s2.completedCredits + " credits");
        System.out.println(s3.name + ": " + s3.completedCredits + " credits");
    }
}