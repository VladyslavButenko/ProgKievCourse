package studentslist;

public class StudentList {
    private Student[] list = new Student[100];
    private int index = 0;

    public void add(Student s) {
        list[index++] = s;
    }

    public Student get(int i) {
        return list[i];
    }

    public int findByName(String name) {
        for (int i = 0; i < index; i++) {
            if(list[i].getName().equalsIgnoreCase(name))
                return i;
        }
        return -1;
    }

    public int findBySurname(String surname) { //Поиск по фамилии
        for (int i = 0; i < index; i++) {
            if (list[i].getSurname().equalsIgnoreCase(surname))
                return i;
        }
        return -1;
    }

}
