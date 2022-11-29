package Les3HW_OOP.data;
import Les3HW_OOP.service.StudyingGroup;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudyingGroup> {

    private List<StudyingGroup> studyGroupList;

    @Override
    public Iterator<StudyingGroup> iterator() {
        Iterator<StudyingGroup> iterator = new Iterator<StudyingGroup>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < studyGroupList.size();
            }

            @Override
            public StudyingGroup next() {
                return studyGroupList.get(index++);
            }
        };
        return iterator;
    }

    public Stream(List<StudyingGroup> studyGroupList) {
        this.studyGroupList = studyGroupList;
    }

    public List<StudyingGroup> getStudyGroupList() {
        return studyGroupList;
    }

    public void setStudyGroupList(List<StudyingGroup> studyGroupList) {
        this.studyGroupList = studyGroupList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Группы в потоке: ");
        for (StudyingGroup group :
                this.studyGroupList) {
            sb.append(group.getGroupNumber()).append(" ");
        }
        return sb.toString();
    }
}