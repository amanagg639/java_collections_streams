package java_streams;

import java.io.*;

public class StudentDataStream {
    private static final String FILE_NAME = "students.dat";

    public static void main(String[] args) {

        writeStudentData();

        readStudentData();
    }

    // Method to write student data
    private static void writeStudentData() {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(FILE_NAME))) {
            // Writing multiple student records
            dos.writeInt(101);  // Roll number
            dos.writeUTF("Alice");
            dos.writeDouble(3.8);  // GPA

            dos.writeInt(102);
            dos.writeUTF("Bob");
            dos.writeDouble(3.6);

            dos.writeInt(103);
            dos.writeUTF("Charlie");
            dos.writeDouble(3.9);

            System.out.println("Student data written successfully!");

        } catch (IOException e) {
            System.out.println("Error writing data: " + e.getMessage());
        }
    }

    // Method to read student data
    private static void readStudentData() {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(FILE_NAME))) {
            System.out.println("\nRetrieving Student Data:");

            while (dis.available() > 0) {
                int rollNumber = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();

                System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", GPA: " + gpa);
            }

        } catch (IOException e) {
            System.out.println("Error reading data: " + e.getMessage());
        }
    }
}

