package developer;

public class QAEngineerDeveloper extends Developer{

    public QAEngineerDeveloper(String name, double basicSalary, int experience) {
        super(name, basicSalary, experience);
    }

    @Override
    public double getSalary() {
        return basicSalary*(experience/basicSalary+1);
    }
}
