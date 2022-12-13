package Les3HW_OOP.service;

import Les3HW_OOP.data.Student;
import Les3HW_OOP.data.Teacher;

import java.util.List;

public class StudyingGroup {
    private static int number;
    private Teacher teacher;
    private List<Student> studentList;
    private int groupNumber;

    public StudyingGroup (Teacher teacher, List<Student> studentList) {
        this.teacher = teacher;
        this.studentList = studentList;
        number++;
        this.groupNumber = number;
    }

    public StudyingGroup () {
        this.groupNumber = ++number;
    }

    public StudyingGroup(boolean b) {
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void addStudent (Student student) {
        this.studentList.add (student);

    }
    public void removeStudent (Student student) {
        for (int i = 0; i < this.studentList.size (); i++) {
            if (this.studentList.get (i).name.equals (student)) {
                this.studentList.remove (i--);
            }
        }
    }
    public static int getNumber() {
        return number;
    }

    public static void setNumber(int number) {
        StudyingGroup.number = number;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }
}
