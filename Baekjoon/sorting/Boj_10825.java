import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Student implements Comparable<Student> {
    private String name;
    private int kor;
    private int eng;
    private int math;

    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public String getName() {
        return this.name;
    }

    //정렬기준은 점수가 낮은 순서
    @Override
    public int compareTo(Student o) {
        if (this.kor == o.kor && this.eng == o.eng && this.math == o.math) {
            return this.name.compareTo(o.name);
        }
        if (this.kor == o.kor && this.eng == o.eng) {
            return Integer.compare(o.math, this.math);
        }
        if (this.kor == o.kor) {
            return Integer.compare(this.eng, o.eng);
        }
        return Integer.compare(o.kor, this.kor);
    }
}

public class Boj_10825 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int math = sc.nextInt();
            students.add(new Student(name, kor, eng, math));
        }

        Collections.sort(students);

        // 정렬된 학생 정보에서 이름만 출력
        for (int i = 0; i < n; i++) {
            System.out.println(students.get(i).getName());
        }
    }
}
