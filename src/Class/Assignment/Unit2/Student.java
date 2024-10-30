package Class.Assignment.Unit2;


        public  class Student {

        String name;
        int rollNumber;
        int[] marks;

        public Student(String name, int rollNumber, int[] marks) {
            this.name = name;
            this.rollNumber = rollNumber;
            this.marks = marks;
        }


        public void displayMarkList() {
            System.out.println("Student Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Marks in Subjects:");

            for (int i = 0; i < marks.length; i++) {
                System.out.println("Subject " + (i + 1) + ": " + marks[i]);
            }

            int totalMarks = calculateTotal();
            double averageMarks = calculateAverage();
            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Average Marks: " + averageMarks);
        }

        public int calculateTotal() {
            int total = 0;
            for (int mark : marks) {
                total += mark;
            }
            return total;
        }

        public double calculateAverage() {
            return (double) calculateTotal() / marks.length;
        }
    }

     class StudentMarkList {
        public static void main(String[] args) {

            String studentName = "NIKHIL KUMAR";
            int rollNumber = 10382;
            int[] marks = {100, 78, 90, 98, 76}; // Marks for 5 subject
            Student student = new Student(studentName, rollNumber, marks);
            student.displayMarkList();
        }
    }


