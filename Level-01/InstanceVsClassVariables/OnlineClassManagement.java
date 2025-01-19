package Instance;

    class Course {
        private String courseName;
        private int duration; // in weeks
        private double fee; // in INR
        private static String instituteName;

        public Course(String courseName, int duration, double fee) {
            this.courseName = courseName;
            this.duration = duration;
            this.fee = fee;
        }

        public void displayCourseDetails() {
            System.out.println("Course Name: " + courseName);
            System.out.println("Duration: " + duration + " weeks");
            System.out.println("Fee: INR " + fee);
            System.out.println("Institute Name: " + instituteName);
        }

        public static void updateInstituteName(String newInstituteName) {
            instituteName = newInstituteName;
        }
        public static void main(String[] args) {
            Course course1 = new Course("Java", 4, 10000);
            course1.displayCourseDetails();
            updateInstituteName("ITI");
            course1.displayCourseDetails();
        }
    }
