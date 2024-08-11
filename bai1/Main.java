package org.example.ontap.baitapvenha.day11.collectionmap.bai1;

import java.util.*;

public class Main {
    private Map<Student, List<ExamResult>> studentExamMap = new HashMap<>();

    // Thêm một kết quả thi vào danh sách điểm thi của một sinh viên
    public void addExamResult(Student student, ExamResult examResult) {
        studentExamMap.putIfAbsent(student, new ArrayList<>());
        studentExamMap.get(student).add(examResult);
    }

    // Tìm kiếm và hiển thị danh sách điểm thi của một sinh viên theo id
    public void displayExamResultsById(int studentId) {
        for (Student student : studentExamMap.keySet()) {
            if (student.getId() == studentId) {
                System.out.println("Danh sách điểm thi của sinh viên " + student + ":");
                for (ExamResult result : studentExamMap.get(student)) {
                    System.out.println(result);
                }
                return;
            }
        }
        System.out.println("Sinh viên có ID " + studentId + " không tồn tại.");
    }

    // Tính và hiển thị điểm trung bình của từng sinh viên
    public void displayAverageScores() {
        for (Student student : studentExamMap.keySet()) {
            List<ExamResult> results = studentExamMap.get(student);
            double totalScore = 0;
            for (ExamResult result : results) {
                totalScore += result.getScore();
            }
            double averageScore = results.isEmpty() ? 0 : totalScore / results.size();
            System.out.println(student + " có điểm trung bình: " + averageScore);
        }
    }

    // Tìm và hiển thị sinh viên có điểm trung bình cao nhất
    public void displayTopStudent() {
        Student topStudent = null;
        double highestAverageScore = -1;

        for (Student student : studentExamMap.keySet()) {
            List<ExamResult> results = studentExamMap.get(student);
            double totalScore = 0;
            for (ExamResult result : results) {
                totalScore += result.getScore();
            }
            double averageScore = results.isEmpty() ? 0 : totalScore / results.size();
            if (averageScore > highestAverageScore) {
                highestAverageScore = averageScore;
                topStudent = student;
            }
        }

        if (topStudent != null) {
            System.out.println("Sinh viên có điểm trung bình cao nhất là " + topStudent + " với điểm trung bình: " + highestAverageScore);
        } else {
            System.out.println("Danh sách sinh viên trống.");
        }
    }

    public static void main(String[] args) {
        Main manager = new Main();

        // Tạo các sinh viên
        Student s1 = new Student(1, "A", 1);
        Student s2 = new Student(2, "B", 2);
        Student s3 = new Student(3, "C", 3);

        // Thêm điểm thi
        manager.addExamResult(s1, new ExamResult("Toan", 85));
        manager.addExamResult(s1, new ExamResult("Van", 90));
        manager.addExamResult(s2, new ExamResult("Toan", 75));
        manager.addExamResult(s2, new ExamResult("Van", 80));
        manager.addExamResult(s3, new ExamResult("Toan", 95));
        manager.addExamResult(s3, new ExamResult("Van", 85));

        // Hiển thị điểm thi của sinh viên
        manager.displayExamResultsById(1);

        // Hiển thị điểm trung bình
        manager.displayAverageScores();

        // Hiển thị sinh viên có điểm trung bình cao nhất
        manager.displayTopStudent();
    }
}
