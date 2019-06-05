/**Created by Parul on 03-06-19
 * This class is responsible for 
 * keeping the track of student
 * name, id, grade and fees 
 */

 public class Student{
     private int id;
     private String name;
     private int grade;
     private int feesPaid;
     private int feesTotal;

     public Student(int id, String name, int grade){
        this.feesPaid = 0; 
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;

     }

     public void setGrade(int grade){
         this.grade = grade;
     }

     public void payFees(int fees){
         feesPaid += fees;
         School.updateTotalMoneyEarned(feesPaid);
     }

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getGrade() {
		return grade;
	}

	public int getFeesPaid() {
		return feesPaid;
	}


	public int getFeesTotal() {
		return feesTotal;
    }
    
    public int getRemainingFees(){
        return feesTotal - feesPaid;
    }

	@Override
	public String toString() {
		return "Student [ Student's name=" + name +  " , feesPaid=" + feesPaid + ", feesTotal=" + feesTotal + ", grade=" + grade + ", id=" + id
				+  "]";
	}

 }