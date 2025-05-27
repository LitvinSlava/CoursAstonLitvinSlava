package src.main.lecture_9;
import java.util.Collection;
import java.util.Arrays;
import java.util.Objects;
import java.util.List;
import java.util.stream.Collectors;

/*4.1 ���������� ������ ������� ������� ��������� �������� ����;
  4.2. ���� �� ��������� ������ ��������� �������� � ���� ���� ���
  �������, ��� ��������� ������� ���������� � ��������� �� 18 �� 27 ���;*/

public class StudentPool {
    private final Collection<Student> students = Arrays.asList(
            new Student("�������", 17, Gender.MAN),
            new Student("������", 20, Gender.MAN),
            new Student("���������", 20, Gender.WOMAN),
            new Student("������", 28, Gender.MAN)
    );

    // 4.1 ������� ������� ������
    public double getAverageMaleAge() {
        return students.stream()
                .filter(s -> s.getGender() == Gender.MAN)
                .mapToInt(Student::getAge)
                .average()
                .orElse(0.0);
    }

    // 4.2 ������ �����������
    public List<Student> getDraftStudents() {
        return students.stream()
                .filter(s -> s.getGender() == Gender.MAN)
                .filter(s -> s.getAge() >= 18 && s.getAge() <= 27)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        StudentPool pool = new StudentPool();

        System.out.println("������� ������� ������: " + pool.getAverageMaleAge());
        System.out.println("����������: " + pool.getDraftStudents());
    }

    private enum Gender {
        MAN, WOMAN
    }

    private static class Student {
        private final String name;
        private final Integer age;
        private final Gender gender;

        public Student(String name, Integer age, Gender gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        // �������, equals, hashCode � toString
        public String getName() { return name; }
        public Integer getAge() { return age; }
        public Gender getGender() { return gender; }

        @Override
        public String toString() {
            return String.format("%s (%d)", name, age);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Student)) return false;
            Student student = (Student) o;
            return Objects.equals(name, student.name) &&
                    Objects.equals(age, student.age) &&
                    gender == student.gender;
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age, gender);
        }
    }
}
