package percobaan4;

import java.util.Date;

class employee {
    private static final double BASE_SALARY = 15000.00;
    private String Name = "";
    private double Salary = 0.0;
    private Date birthDate;
   
    public employee(String name, double salary, Date DoB){
        this.Name=name;
        this.Salary=salary;
        this.birthDate=DoB;
 }
    public employee(String name,double salary){
        this(name,salary,null);
 }
    public employee(String name, Date DoB){
        this(name,BASE_SALARY,DoB);
 }
    public employee(String name){
        this(name,BASE_SALARY);
 }
    public String GetName(){ return Name;}
    public double GetSalary(){ return Salary; }
    public Date GetbirthDate(){return birthDate; }
}
class Manager extends employee {
//tambahan attribrute untuk kelas manager
    private String department; 

    public Manager(String name, double salary, String dept) {
        super(name, salary);
        department=dept;
    }
    public Manager(String n,String dept){
        super(n);
        department=dept;
 }
    public Manager(String dept, int par, String financial){
        super(dept);
        department=dept;
 }
    public String GetDept(){
        return department;
 }
}
public class Percobaan4 {
    public static void main(String[] args) {
        Manager Utama = new Manager("John",5000000,"Financial");
        System.out.println("Name:"+ Utama.GetName());
        System.out.println("Salary:"+ Utama.GetSalary());
        System.out.println("Department:"+ Utama.GetDept());
        
        Utama = new Manager("Michael","Accounting");
        System.out.println("Name:"+ Utama.GetName());
        System.out.println("Salary:"+ Utama.GetSalary());
        System.out.println("Department:"+ Utama.GetDept());
 }
}