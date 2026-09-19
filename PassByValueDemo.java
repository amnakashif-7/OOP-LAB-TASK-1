public class PassByValueDemo {

    // Experiment A
    static void changeNumber(int x) {
        x = 99;
    }

    // Experiment B
    static void changeStudent(Student st) {
        st.completedCredits = 99;
    }

    // Experiment C 
    static void replaceStudent(Student st) {
        st = new Student();
        st.name = "Temporary";
    }

    public static void main(String[] args) {
        // Experiment A
        int num = 10;
        System.out.println(" Experiment A ");
        System.out.println("Before: " + num);
        changeNumber(num);
        System.out.println("After: " + num);

        // Experiment B
        Student s1 = new Student();
        s1.name = "Abeer";
        s1.completedCredits = 15;
        System.out.println("\n Experiment B ");
        System.out.println("Before: " + s1.completedCredits);
        changeStudent(s1);
        System.out.println("After: " + s1.completedCredits);

        // Experiment C
        Student s2 = new Student();
        s2.name = "Original";
        System.out.println("\n Experiment C ");
        System.out.println("Before: " + s2.name);
        replaceStudent(s2);
        System.out.println("After: " + s2.name);
    }
}