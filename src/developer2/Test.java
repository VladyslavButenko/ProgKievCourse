package developer2;

public class Test {
    public static void main(String[] args) {
        Developer[] devList = new Developer[9];
        devList[0] = new JuniorDeveloper("Kolya",300,1);
        devList[1] = new JuniorDeveloper("Nastya",400,0);
        devList[2] = new JuniorDeveloper("Vasya",150,2);
        devList[3] = new SeniorDeveloper("Jora",800,5);
        devList[4] = new SeniorDeveloper("Fed9",340,8);
        devList[5] = new SeniorDeveloper("Roma",690,8);
        devList[6] = new TeamLeadDeveloper("Maks",1000,4);
        devList[7] = new TeamLeadDeveloper("Oksana",930,5);
        devList[8] = new TeamLeadDeveloper("Maks",1090,12);

        for (Developer dev: devList) {
            if (dev instanceof SeniorDeveloper && dev.getSalary() > 1500)
                System.out.println("Developer " + dev.getName() + " earns " + dev.getSalary() + " per month.");
        }

    }
}
