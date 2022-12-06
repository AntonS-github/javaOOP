package Les2HW_OOP.service;

import Les2HW_OOP.data.Student;
import Les2HW_OOP.data.Teacher;
import Les2HW_OOP.utils.ReaderFromTxt;
import Les3HW_OOP.service.DataService;

import java.util.ArrayList;
import java.util.List;

public class StudyingGroupServiceImpl implements DataService {

    @Override
    public void readAndCreateGroup(String file) {
        ReaderFromTxt readerFromTxt = new ReaderFromTxt ();
        String[] group = readerFromTxt.getGroup(file).split("\n");

        List<Student> studentList = new ArrayList<> ();
        StudyingGroup studyGroup = new StudyingGroup();
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
}
