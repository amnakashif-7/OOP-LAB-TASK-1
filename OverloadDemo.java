public class OverloadDemo {

  
    void enroll(String courseCode) {
        System.out.println("Enrolled in course code: " + courseCode);
    }

    
    void enroll(String courseCode, int section) {
        System.out.println("Enrolled in " + courseCode + " Section " + section);
    }

    void enroll(int numericCourseCode) {
        System.out.println("Enrolled in numeric course code: " + numericCourseCode);
    }

    /*
    // INVALID OVERLOAD TEST (Differs only by return type)
    // If un-commented, this causes compile error: method enroll(String) is already defined
    int enroll(String courseCode) {
        return 1;
    }
    */

    public static void main(String[] args) {
        OverloadDemo demo = new OverloadDemo();

        // 3 Valid Calls
        demo.enroll("CSC241");
        demo.enroll("CSC241", 2);
        demo.enroll(241);

        // 2 Invalid Calls (commented out so program compiles)
        // demo.enroll();
        // demo.enroll("241", "2");
    }
}