import java.util.*;

class WishlistRegistrationSystem {
    private List<Student> students = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();

    public void registerStudent(int studentId, String studentName) {
        Student student = new Student(studentId, studentName);
        students.add(student);
    }

    public void registerCourse(int courseId, String courseName) {
        Course course = new Course(courseId, courseName);
        courses.add(course);
    }

    public void addToWishlist(int studentId, int courseId) {
        try {
            Student student = getStudent(studentId);
            Course course = getCourse(courseId);
            student.addToWishlist(course);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void viewRegisteredCourses(int studentId) {
        try {
            Student student = getStudent(studentId);
            List<Course> wishlist = student.getWishlist();
            System.out.println("Courses registered by Student " + studentId + ":");
            for (Course course : wishlist) {
                System.out.println("Course ID: " + course.getCourseId() + ", Course Name: " + course.getCourseName());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void viewCourseRegistrations() {
        courses.sort(Comparator.comparingInt(Course::getRegistrations).reversed());

        System.out.println("Course ID and Total Registrations (Descending Order):");
        for (Course course : courses) {
            System.out.println("Course ID: " + course.getCourseId() + ", Total Registrations: " + course.getRegistrations());
        }
    }

    private Student getStudent(int studentId) throws Exception {
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                return student;
            }
        }
        throw new Exception("Student not found with ID: " + studentId);
    }

    private Course getCourse(int courseId) throws Exception {
        for (Course course : courses) {
            if (course.getCourseId() == courseId) {
                return course;
            }
        }
        throw new Exception("Course not found with ID: " + courseId);
    }
}

class Student {
    private int studentId;
    private String studentName;
    private List<Course> wishlist = new ArrayList<>();

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public List<Course> getWishlist() {
        return wishlist;
    }

    public void addToWishlist(Course course) {
        wishlist.add(course);
        course.registerStudent();
    }
}

class Course {
    private int courseId;
    private String courseName;
    private int registrations = 0;

    public Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void registerStudent() {
        registrations++;
    }

    public int getRegistrations() {
        return registrations;
    }
}

public class error {
    public static void main(String[] args) {
        WishlistRegistrationSystem system = new WishlistRegistrationSystem();

        // Register Students
        system.registerStudent(1, "Student1");
        system.registerStudent(2, "Student2");

        // Register Courses
        system.registerCourse(101, "CourseA");
        system.registerCourse(102, "CourseB");
        system.registerCourse(103, "CourseC");

        // Add Courses to Wishlist
        system.addToWishlist(1, 101);
        system.addToWishlist(1, 102);
        system.addToWishlist(2, 101);

        // View Registered Courses for a Student
        system.viewRegisteredCourses(1);

        // View Course Registrations
        system.viewCourseRegistrations();
    }
}