package developer3;

import java.util.Arrays;

public class Test {
    static Developer[] devList = new Developer[9];
    static JuniorDeveloper[] juniors = new JuniorDeveloper[1];
    static SeniorDeveloper[] seniors = new SeniorDeveloper[1];
    static TeamLeadDeveloper[] leads = new TeamLeadDeveloper[1];

    public static void main(String[] args) {


        devList[0] = new JuniorDeveloper("Kolya", 300, 1);
        devList[1] = new JuniorDeveloper("Nastya", 400, 0);
        devList[2] = new JuniorDeveloper("Vasya", 150, 2);
        devList[3] = new SeniorDeveloper("Jora", 800, 5);
        devList[4] = new SeniorDeveloper("Fed9", 340, 8);
        devList[5] = new SeniorDeveloper("Roma", 690, 8);
        devList[6] = new TeamLeadDeveloper("Maks", 1000, 4);
        devList[7] = new TeamLeadDeveloper("Oksana", 930, 5);
        devList[8] = new TeamLeadDeveloper("Vlad", 1090, 12);

        sortArray(devList);
        System.out.println("\nJuniors:\n");
        write(juniors);
        System.out.println("\nSeniors:\n");
        write(seniors);
        System.out.println("\nLeads:\n");
        write(leads);

    }

    static Developer[] getBIggerArray(Developer[] array) {
        return Arrays.copyOf(array, array.length * 3 / 2 + 1);

    }

    static void sortArray(Developer[] devs) {
        int juniorCount = 0;
        int seniorCount = 0;
        int leadCount = 0;

        for (Developer dev : devs) {
            if (dev instanceof JuniorDeveloper) {
                if (juniorCount == juniors.length)
                    juniors = (JuniorDeveloper[]) getBIggerArray(juniors);
                juniors[juniorCount++] = (JuniorDeveloper) dev;

            } else if (dev instanceof SeniorDeveloper) {
                if (seniorCount == seniors.length)
                    seniors = (SeniorDeveloper[]) getBIggerArray(seniors);
                seniors[seniorCount++] = (SeniorDeveloper) dev;

            } else if (dev instanceof TeamLeadDeveloper) {
                if (leadCount == leads.length)
                    leads = (TeamLeadDeveloper[]) getBIggerArray(leads);
                leads[leadCount++] = (TeamLeadDeveloper) dev;
            }

        }
    }

    static void write(Developer[] array) {
        for (Developer dev: array) {
            if (dev == null)
                continue;
            System.out.println(dev.name);
        }
    }
}
