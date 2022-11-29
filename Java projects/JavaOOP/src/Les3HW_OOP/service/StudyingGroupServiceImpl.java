package Les3HW_OOP.service;

import Les3HW_OOP.data.Student;
import Les3HW_OOP.data.Teacher;
import Les3HW_OOP.utils.ReaderFromTxt;

import java.util.ArrayList;
import java.util.List;

public class StudyingGroupServiceImpl implements DataService {
    private StudyingGroup studyGroup;

    public StudyingGroupServiceImpl(StudyingGroup studyGroup) {
        this.studyGroup = studyGroup;
    }

    public StudyingGroupServiceImpl() {
        this.studyGroup = new StudyingGroup(false);
    }

    @Override
    public void readAndCreateGroup(String file) {
        ReaderFromTxt readerFromTxt = new ReaderFromTxt ();
        String[] group = readerFromTxt.getGroup(file).split("\n");

        List<Student> studentList = new ArrayList<> ();
        StudyingGroup studyGroup = new StudyingGroup ();
        for (String item :
                group) {
            String[] current = item.split(" ");
            if (current[0].equals("Teacher")) {
                studyGroup.setTeacher(new Teacher (current[1]));
            } else if (current[0].equals("Student")) {
                studentList.add(new Student (current[1]));
            }
        }
        studyGroup.setStudentList(studentList);
    }

    public StudyingGroup getStudyGroup() {
        return studyGroup;
    }

    public void setStudyGroup(StudyingGroup studyGroup) {
        this.studyGroup = studyGroup;
    }

}
