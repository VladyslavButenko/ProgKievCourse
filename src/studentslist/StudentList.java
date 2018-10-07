package studentslist;

import java.util.Date;

public class StudentList {
    private Student[] list = new Student[100];
    private int index = 0;

    public void add(Student s) {
        list[index++] = s;
    }

    public Student get(int i) {
        return list[i];
    }

    public int[] findByName(String... names) { //Метод поиска по именам.
        int length = names.length;
        int[] indexes = new int[length];
        int hit;
        int count = 0;
        for (int a = 0; a < length; a++) {
            hit = -1;
            for (int b = 0; b < index; b++) {
                if (names[a].equalsIgnoreCase(list[b].getName()))
                    hit = b;
            }
            indexes[count++] = hit;
        }
        return indexes;
    }

    public int[] findBySurname(String... surnames) { //Метод поиска по фамилиям.
        int length = surnames.length;
        int[] indexes = new int[length];
        int hit;
        int count = 0;
        for (int a = 0; a < length; a++) {
            hit = -1;
            for (int b = 0; b < index; b++) {
                if (surnames[a].equalsIgnoreCase(list[b].getSurname()))
                    hit = b;
            }
            indexes[count++] = hit;
        }
        return indexes;

    }

    public int[] findByBirth(Date... birthdays) { //Метод поиска по датам рождения.
        int length = birthdays.length;
        int[] indexes = new int[length];
        int hit;
        int count = 0;
        for (int a = 0; a < length; a++) {
            hit = -1;
            for (int b = 0; b < index; b++) {
                if (birthdays[a].equals(list[b].getBirth()))
                    hit = b;
            }
            indexes[count++] = hit;
        }
        return indexes;
    }


}
