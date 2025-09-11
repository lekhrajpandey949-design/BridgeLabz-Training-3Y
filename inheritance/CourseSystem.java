package inheritance;
// CourseSystem.java
class Course {
    String courseName;
    int duration;

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
}

class OnlineCourse extends Course {
    String platform;

    OnlineCourse(String courseName, int duration, String platform) {
        super(courseName, duration);
        this.platform = platform;
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double price;

    PaidOnlineCourse(String courseName, int duration, String platform, double price) {
        super(courseName, duration, platform);
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Course: " + courseName + " | Duration: " + duration + " weeks");
        System.out.println("Platform: " + platform + " | Price: ₹" + price);
    }
}

public class CourseSystem {
    public static void main(String[] args) {
        PaidOnlineCourse poc = new PaidOnlineCourse("Java Mastery", 10, "Udemy", 499.0);
        poc.displayDetails();
    }
}
