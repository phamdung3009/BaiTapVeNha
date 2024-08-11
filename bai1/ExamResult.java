package org.example.ontap.baitapvenha.day11.collectionmap.bai1;

public class ExamResult {
    private String subject;
    private double score;

    public ExamResult(String subject, double score) {
        this.subject = subject;
        this.score = score;
    }

    // Getter và Setter
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "ExamResult{subject='" + subject + "', score=" + score + "}";
    }
}
