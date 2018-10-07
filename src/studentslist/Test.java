package studentslist;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        final StudentList sl = new StudentList();

        sl.add(new Student("Vova","Ivanov",new Date(1986,1,1)));
        sl.add(new Student("Vasya","Pupkin",new Date(1970,3,28)));
        sl.add(new Student("Masha","Romanenko",new Date(1994,5,25)));

        int[] names = sl.findByName("Masha","Vasya","Vova","Vova"); //Вызов метода поиска по именам.
        int[] surnames = sl.findBySurname("Romanenko"); //Вызов метода поиска по фамилиям.
        int[] birthdays = sl.findByBirth( new Date(1986,1,1),new Date(1970,3,28));
        //Вызов метода поиска по дате рождения

        System.out.println("\nПоиск по именам:");
        for (int a = 0; a < names.length;a++)
            System.out.println(sl.get(names[a]).getSurname());
        System.out.println("\nПоиск по фамилиям:");
        for (int a = 0; a < surnames.length;a++)
            System.out.println(sl.get(surnames[a]).getSurname());
        System.out.println("\nПоиск по дате раждения:");
        for (int a = 0; a < birthdays.length;a++)
            System.out.println(sl.get(birthdays[a]).getSurname());

    }
}
