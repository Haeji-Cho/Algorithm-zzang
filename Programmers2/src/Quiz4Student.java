//import java.util.Arrays;
//import java.util.Collection;
//import java.util.Collections;
//
public class Quiz4Student {
//    public static void main(String[] args) {
//        Student[] students = {
//                new Student("홍길동", "남자", 85), new Student("김연아", "여자", 95),
//                new Student("배장화", "여자", 97), new Student("김삿갓", "남자", 94)
//        };
//        System.out.println(Arrays.toString(students));
//
//        Student[] students1 = Arrays.copyOf(students, students.length);
//
//        Arrays.sort(students1, Collections.reverseOrder());
//        System.out.println(Arrays.toString(students1));
//
//
//    }
//}
//
//enum Gender {
//	// 코드 추가
//    남("남자"), 여("여자");
//
//    Gender (String Gender){
//        this.Gender();
//    }
//
//}
//
//// Student 클래스의 수정 및 보완
//class Student implements Comparable<Student>{
//    String name;
//    Gender gender;
//    int score;
//
//    public Student(String name, Gender gender, int score) {
//        this.name = name;
//        this.gender = gender;
//        this.score = score;
//    }
//
//    public String toString(){
//        return "Student(" + name + "," + gender + "," +  score + ")";
//    }
//
//
//    public int compareTo(Student s) {
//        if (this.score < s.score) {
//            return -1;
//        } else if (this.score == s.score) {
//            return 0;
//        } else {
//            return 1;
//        }
//    }
//
}