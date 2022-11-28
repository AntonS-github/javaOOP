package Les2HW_OOP.controller;

import Les2HW_OOP.service.StudyingGroup;
import Les2HW_OOP.service.StudyingGroupServiceImpl;

import java.util.logging.Logger;

public class Controller {
    public static Logger logger = Logger.getAnonymousLogger();

    public void controllerStart() {
        StudyingGroupServiceImpl studyingGroupService = new StudyingGroupServiceImpl ();

        logger.info("Всего групп: " + StudyingGroup.getNumber());
        logger.info("Создана группа:" + studyingGroupService.readAndCreateGroup("studyGroup1.txt").toString());
        logger.info("Создана группа:" + studyingGroupService.readAndCreateGroup("studyGroup2.txt").toString());
        logger.info("Всего групп: " + StudyingGroup.getNumber());
    }
}

