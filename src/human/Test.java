package human;

import human.db.HumanDAO;

import java.util.Date;

public class Test {
    public static void main(String[] args){
        HumanDAO dao = new HumanDAO(); //Объект для записи полей Human в БД.

        //Создание даты рождения 3 людей.
        Date vladBDay = new Date(1999,5,24);
        Date maxBDay = new Date(1986,7,12);
        Date kolyaBDay = new Date(1967,11,25);
        //Создание 3 людей.
        Human humanVlad = new Human("Vlad","Butenko",vladBDay,"Developer",0.01);
        Human humanMax = new Human("Maxim","Zaharov",maxBDay,"Team Lead",199.9);
        Human humanKolya = new Human("Kolya","Popov",kolyaBDay,"CEO",100000.0);

        //Запись в БД.
        dao.saveHuman(humanVlad);
        dao.saveHuman(humanMax);
        dao.saveHuman(humanKolya);

    }
}
