package human.test;

import human.human.Human;
import human.db.HumanDAO;

public class TestRead {
    public static void main(String[] args) throws Exception {
        HumanDAO dao = new HumanDAO();
        Human human1 = dao.readHuman(1);
        printHuman(human1);
        Human human2 = dao.readHuman(2);
        printHuman(human2);
        Human human3 = dao.readHuman(3);
        printHuman(human3);

    }

    public static void printHuman(Human human) {
        String birthDay = human.getBirthday().getYear() + "." + human.getBirthday().getMonth() + "." + human.getBirthday().getDate();
        System.out.println(String.format("Имя: %s\nФамилия: %s\nДата рождения: %s\nДолжность: %s\nЗарплата: $%.2f\n", human.getName(),
                human.getSurname(), birthDay, human.getPosition(), human.getSalary()));
    }
}
