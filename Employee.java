import java.util.Scanner;
class Employee
{
String empName,address,mailId,mobileNo;
int empId;
double basicpay,da,hra,pf,staffClub,grossSalary,netSalary;
Scanner sc=new Scanner(System.in);
void getDetails()
{
System.out.println("Enter Employee ID:");
empId=sc.nextInt();
sc.nextLine();
System.out.println("Enter Employee Name:");
empName=sc.nextLine();
System.out.println("Enter Address:");
address=sc.nextLine();
System.out.println("Enter Mail ID:");
mailId=sc.nextLine();
System.out.println("Enter Mobile Number:");
mobileNo=sc.nextLine();
System.out.println("Enter Basic Pay:");
basicpay=sc.nextDouble();
}
void display(String designation){
System.out.println("\n=====PAY SLIP=====");
System.out.println("Designation:"+designation);
System.out.println("Employee ID:"+empId);
System.out.println("Employee Name:"+empName);
System.out.println("Address:"+address);
System.out.println("Mail ID:"+mailId);
System.out.println("Mobile No:"+mobileNo);
System.out.println("\nBasic Pay:"+basicpay);
System.out.println("DA:"+da);
System.out.println("HRA:"+hra);
System.out.println("PF:"+pf);
System.out.println("Staff Club:"+staffClub);
System.out.println("-------------");
System.out.println("Gross Salary:"+grossSalary);
System.out.println("Net Salary:"+netSalary);
}
}
class Programmer extends Employee
{
void calculateSalary()
{
da=basicpay*97/100;
hra=basicpay*10/100;
pf=basicpay*12/100;
staffClub=basicpay*1/100;
grossSalary=basicpay+da+hra;
netSalary=grossSalary-pf-staffClub;
}
}
class AssistantProfessor extends Employee
{
void calculateSalary()
{
da=basicpay*110/100;
hra=basicpay*20/100;
pf=basicpay*12/100;
staffClub=basicpay*5/100;
grossSalary=basicpay+da+hra;
netSalary=grossSalary-pf-staffClub;
}
}
class AssociateProfessor extends Employee
{
void calculateSalary()
{
da=basicpay*130/100;
hra=basicpay*30/100;
pf=basicpay*12/100;
staffClub=basicpay*10/100;
grossSalary=basicpay+da+hra;
netSalary=grossSalary-pf-staffClub;
}
}
class Professor extends Employee
{
void calculateSalary()
{
da=basicpay*140/100;
hra=basicpay*40/100;
pf=basicpay*12/100;
staffClub=basicpay*15/100;
grossSalary=basicpay+da+hra;
netSalary=grossSalary-pf-staffClub;
}
}
public class EmployeePayroll
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("1.Programmer");
System.out.println("2.Assistant Professor");
System.out.println("3.Associate Professor");
System.out.println("4.Professor");
System.out.println("Enter your choice:");
int choice=sc.nextInt();
switch(choice)
{
case 1:
  Programmer p=new Programmer();
  p.getDetails();
  p.calculateSalary();
  p.display("Programmer");
  break;
case 2:
   AssistantProfessor ap=new AssistantProfessor();
   ap.getDetails();
   ap.calculateSalary();
   ap.display("Assistant Professor");
   break;
case 3:
   AssociateProfessor asp=new AssociateProfessor();
   asp.getDetails();
   asp.calculateSalary();
   asp.display("Associate Professor");
   break;
case 4:
   Professor prof=new Professor();
   prof.getDetails();
   prof.calculateSalary();
   prof.display("Professor");
   break;
default:
   System.out.println("Invalid Choice");
}
}
}

