package employeeproject;

public class Faculty extends Employee {
    private String initial;
    private String rank;

    public Faculty(){
        this.initial=null;
        this.rank=null;
    }

    public Faculty(String initial, String rank) {
        this.initial = initial;
        this.rank = rank;
    }

    public Faculty(String id, String department, double salary, String initial, String rank) {
        super(id, department, salary);
        this.initial = initial;
        this.rank = rank;
    }

    public Faculty(String name, String gender, int age, String id, String department, double salary, String initial, String rank) {
        super(name, gender, age, id, department, salary);
        this.initial = initial;
        this.rank = rank;
    }

    public String getInitial() {
        return initial;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "Name= "+getName()+
                " Gender= "+getGender()+
                " Age= "+getAge()+
                " ID= "+getId()+
                " Department= "+getDepartment()+
                " Salary= "+getSalary()+
                " initial='" + initial + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }
}
