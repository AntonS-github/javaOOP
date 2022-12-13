package Les3HW_OOP.controller;

import Les3HW_OOP.data.Stream;
import Les3HW_OOP.service.StreamService;
import Les3HW_OOP.service.StudyingGroup;
import Les3HW_OOP.service.StudyingGroupServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class Controller {
    public static Logger logger = Logger.getAnonymousLogger();

    public void controllerStart() {
        StudyingGroupServiceImpl studyingGroupService = new StudyingGroupServiceImpl ();

        logger.info("Всего групп: " + StudyingGroup.getNumber());
        StudyingGroup group1 = readAndCreateGroup("studyGroup1.txt", studyingGroupService);
        StudyingGroup group2 = readAndCreateGroup("studyGroup2.txt", studyingGroupService);
        StudyingGroup group3 = readAndCreateGroup("studyGroup3.txt", studyingGroupService);
        StudyingGroup group4 = readAndCreateGroup("studyGroup4.txt", studyingGroupService);
        StudyingGroup group5 = readAndCreateGroup("studyGroup5.txt", studyingGroupService);
        logger.info("Всего групп: " + StudyingGroup.getNumber());
        logger.info("Всего групп: " + StudyingGroup.getNumber());

        List<StudyingGroup> groupList1 = new ArrayList<> (Arrays.asList(group1, group2, group3));
        List<StudyingGroup> groupList2 = new ArrayList<>(Arrays.asList(group4, group5));

        Stream stream1 = new Stream(groupList1);
        for (StudyingGroup group :
                stream1) {
            logger.info("TEST For each -> stream1: " + group.toString());
        }
        Stream stream2 = new Stream(groupList2);

        logger.info(String.format("В первом потоке %d групп, во втором - %d групп", stream1.getStudyGroupList().size(),
                stream2.getStudyGroupList().size()));

        List<Stream> streamList = new ArrayList<>(Arrays.asList(stream1, stream2));
        logger.info("Изначальный список потоков:\n" + streamList.get(0) + "\n" + streamList.get(1));
        StreamService streamService = new StreamService ();
        streamService.sortStreamList(streamList);
        logger.info("Отсортированный список потоков:\n" + streamList.get(0) + "\n" + streamList.get(1));

    }

    public StudyingGroup readAndCreateGroup(String file, StudyingGroupServiceImpl studyGroupService) {
        studyGroupService.readAndCreateGroup(file);
        StudyingGroup group = studyGroupService.getStudyGroup();
        logger.info("Создана группа:" + group.toString());
        return group;
    }
}


