import java.util.Date;
public class Main {

	public static void main(String[] args) {

		StudentGroup stg=new StudentGroup(10);

	Date date=new Date(1996,3,12);
	Student s1=new Student(19,"sai",date,70);

                stg.addFirst(s1);

              System.out.println(stg.getStudent(0).getId());






	}

}
