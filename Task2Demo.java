public class Task2Demo {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.studentId = "SP26-BAI-001";
        s1.name = "Aamna Basit";
        s1.completedCredits = 15;

        Student s2 = new Student();
        s2.studentId = "SP26-BAI-002";
        s2.name = "Abdul Rehmaan Awan";
        s2.completedCredits = 30;

       
        s1.addCredits(3);
        s2.addCredits(4);

        System.out.println(s1.summary());
        System.out.println("s1 Remaining Credits for 130 Degree Total: " + s1.remainingCredits(130));

        System.out.println();

        System.out.println(s2.summary());
        System.out.println("s2 Remaining Credits for 130 Degree Total: " + s2.remainingCredits(130));
    }
}