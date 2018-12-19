package 谁拿了最多奖学金;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author YaoWenHao
 * @Title: Main
 * @ProjectName vote
 * @Description: TODO
 * @date 2018/12/13 8:46
 */

class Student {
    int id;
    String name;
    int averageGrade;
    int classGrade;
    String isStudentOfficer;
    String isWesternProvince;
    int paperNum;
    int bonusNum=0;
    int bonus=0;

    public Student(int id, String name, int averageGrade, int classGrade
            , String isStudentOfficer, String isWesternProvince, int paperNum) {
        this.id = id;
        this.name = name;
        this.averageGrade = averageGrade;
        this.classGrade = classGrade;
        this.isStudentOfficer = isStudentOfficer;
        this.isWesternProvince = isWesternProvince;
        this.paperNum = paperNum;
    }
}

class MyComparator implements Comparator<Student> {

    @Override
    public int compare(Student a, Student b) {
        if (a.bonus < b.bonus){
            return 1;
        }
        if (a.bonus == b.bonus && a.id > b.id){
            return 1;
        }
        return -1;
    }
}

public class Main {

    @SuppressWarnings("resource")
	public static void main(String[] args) {
    	int totalBonus = 0;
        Scanner scanner = new Scanner(System.in);
        int studentNum = scanner.nextInt();
        Student[] students = new Student[studentNum];
        for (int i = 0; i < studentNum; i ++) {
            students[i] = new Student(i, scanner.next(), scanner.nextInt()
                    , scanner.nextInt(), scanner.next(), scanner.next(), scanner.nextInt());
        }
        for (Student student:
             students) {
            if (student.averageGrade > 80 && student.paperNum >= 1){
                student.bonusNum += 1;
                student.bonus += 8000;
            }
            if (student.averageGrade > 85 && student.classGrade > 80){
                student.bonusNum += 1;
                student.bonus += 4000;
            }
            if (student.averageGrade > 90){
                student.bonusNum += 1;
                student.bonus += 2000;
            }
            if (student.averageGrade > 85 && "Y".equals(student.isWesternProvince)){
                student.bonusNum += 1;
                student.bonus += 1000;
            }
            if (student.classGrade > 80 && "Y".equals(student.isStudentOfficer)){
                student.bonusNum += 1;
                student.bonus += 850;
            }
        }
        Arrays.sort(students, new MyComparator());
        System.out.println(students[0].name);
        System.out.println(students[0].bonus);
        for (Student student:
            students) {
        	totalBonus += student.bonus;
        }
        System.out.println(totalBonus);
    }
}
