package org.example.ontap.baitapvenha.day11.collectionmap.bai1.lamlaibaitap;

import org.example.ontap.baitapvenha.day11.collectionmap.bai1.lamlaibaitap.entities.ExamResult;
import org.example.ontap.baitapvenha.day11.collectionmap.bai1.lamlaibaitap.entities.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainStuExam {
    public static void main(String[] args) {
        //1. Sử dụng Map<Student, List<ExamResult>> để lưu trữ điểm thi của từng sinh viên.
        Map<Student, List<ExamResult>> maps = new HashMap<>();

        Student phamHoangDung = new Student(1, "Pham Hoang Dung", 25);
        Student luuHaPhong = new Student(2, "Luu Ha Phong", 20);
        Student leCongMinh = new Student(3, "Le Cong Minh", 22);
        Student nguyenVanLinh = new Student(4, "Nguyen Van Linh", 21);

        List<Student> students = new ArrayList<>();
        students.add(phamHoangDung);
        students.add(luuHaPhong);
        students.add(leCongMinh);
        students.add(nguyenVanLinh);

        ExamResult Toan = new ExamResult("Toan", 9);
        ExamResult Van = new ExamResult("Van", 10);
        ExamResult Anh = new ExamResult("Anh", 5);
        ExamResult Su = new ExamResult("Su", 8);
        ExamResult Dia = new ExamResult("Dia", 7);
        ExamResult Hoa = new ExamResult("Hoa", 6);
        //2. Thêm một kết quả thi vào danh sách điểm thi của một sinh viên.
        ExamResult Sinh = new ExamResult("Sinh", 6);

        List<ExamResult> toanVanAnh = new ArrayList<>();
        toanVanAnh.add(Toan);
        toanVanAnh.add(Van);
        toanVanAnh.add(Anh);
        //2.
        toanVanAnh.add(Sinh);

        List<ExamResult> diaHoa = new ArrayList<>();
        diaHoa.add(Su);
        diaHoa.add(Dia);
        diaHoa.add(Hoa);

        maps.put(phamHoangDung, toanVanAnh);
        maps.put(luuHaPhong, diaHoa);
        maps.put(leCongMinh, toanVanAnh);
        maps.put(nguyenVanLinh, diaHoa);
//        System.out.println(maps);
        System.out.println("-------------------------------------------------------");
        //3. Tìm kiếm và hiển thị danh sách điểm thi của một sinh viên theo id.
        int id = 4;
        /* keySet() là một phương thức của interface Map trong Java. Phương thức
        này trả về một Set chứa tất cả các khóa (keys) có trong Map. Vì Set không
        cho phép các phần tử trùng lặp, nên mỗi khóa trong Map là duy nhất. */
        for (Student student : maps.keySet()) {
            if (student.getId() == id) {
                System.out.println("Ma sinh vien " + id + " là: " + student);
                /* map.get(Object key) là một phương thức của interface Map trong Java.
                Phương thức này được sử dụng để truy xuất giá trị (value) liên kết
                với một khóa (key) cụ thể trong Map. */
                for (ExamResult examResult : maps.get(student)) {
                    System.out.println(examResult);
                }
            }
        }
        System.out.println("-------------------------------------------------------");

        //4. Tính và hiển thị điểm trung bình của từng sinh viên.
        for (Student student : maps.keySet()) {
            List<ExamResult> examResults = maps.get(student); // lấy danh sách value(giá trị)của student và gán cho danh sách List<ExamResult>
            double totalScore = 0;
            for (ExamResult examResult : examResults) {
                totalScore += examResult.getScore();//examResult.getScore() lấy ra điểm từng học sinh
            }
            double dTB = totalScore / examResults.size();
            System.out.println(student + " - Điểm trung bình: " + dTB);
        }
        System.out.println("-------------------------------------------------------");
        //5. Tìm và hiển thị sinh viên có điểm trung bình cao nhất.
        Student topStudent = null;
        double topDTB = 0.0;
        for (Student student : maps.keySet()) {
            List<ExamResult> examResults = maps.get(student);// lấy giá trị của object ExamResult theo từng key của Obj student
            double totalScore = 0;
            for (ExamResult examResult : examResults) {
                totalScore += examResult.getScore();
            }
            double dTB = totalScore / examResults.size();
            System.out.println("DTB " + dTB);
            if (topStudent == null || dTB > topDTB) {
                topStudent = student;
                topDTB = dTB;
            }
        }
        if (topStudent != null) {
            System.out.println("Sinh viên có điểm trung bình cao nhất:");
            System.out.println(topStudent + " - Điểm trung bình: " + topDTB);
        } else {
            System.out.println("Không có sinh viên nào trong danh sách.");
        }
    }

}
