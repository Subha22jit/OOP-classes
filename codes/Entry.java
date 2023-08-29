import java.util.Scanner;

class company{
	int cid;
	String cname,cdept;
	double csalary;
	company(int cid, String cname, String cdept, double csalary){
		this.cid = cid;
		this.cname = cname;
		this.cdept = cdept;
		this.csalary = csalary;
	}
}

public class Entry {
   public static void main(String args[]) {
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter the no data: ");
	   int no = sc.nextInt();
	   company cm[] = new company[no];
	   for(int i =0; i < no; i++) {
		   System.out.println((i+1)+" No of Client Details Enter:- ");
		System.out.print("Enter id: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter name: ");
		String name = sc.nextLine();
		System.out.print("Enter dept: ");
		String dept = sc.nextLine();
		System.out.print("Enter salary: ");
		double salary = sc.nextDouble();
		company n = new company(id,name,dept,salary);
		cm[i] = n;
	   }
	   for(int j = 0; j < no; j++) {
		   System.out.println((j+1)+"No Client Details:- ");
		   System.out.println("Client Id: "+cm[j].cid);
		   System.out.println("Client Name: "+cm[j].cname);
		   System.out.println("Client Dept: "+cm[j].cdept);
		   System.out.println("Client Salary: "+cm[j].csalary);
	   }
   }
}
