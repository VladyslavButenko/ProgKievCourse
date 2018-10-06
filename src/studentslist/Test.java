package studentslist;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        final StudentList sl = new StudentList();

        sl.add(new Student("Vova","Ivanov",new Date(1986,1,1)));
        sl.add(new Student("Vasya","Pupkin",new Date(1970,3,28)));

        int n = sl.findByName("Vova");
        int surnameFind = sl.findBySurname("Pupkin"); //Вызов метода поиска по фамилии.

        System.out.println(sl.get(n).getBirth().toString());
        System.out.println(sl.get(surnameFind).getBirth().toString());
    }
}
