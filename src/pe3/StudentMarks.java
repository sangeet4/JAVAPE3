package pe3;

class InvalidGradeException extends Exception{
    InvalidGradeException(String s){
        super(s);
    }
}

public class StudentMarks {
    int numOfStudents;
    int[] stuGrades;

    public StudentMarks(int numOfStudents){
        this.numOfStudents = numOfStudents;
        this.stuGrades = new int[numOfStudents];
    }

    public int[] addGrades(int[] stuGrades) throws InvalidGradeException{
        for(int i=0; i<numOfStudents; i++){
            if(stuGrades[i] > 100 || stuGrades[i] < 0)
                throw new InvalidGradeException("Grade isn't correct for Student No. "+ i);
            else
                this.stuGrades[i] = stuGrades[i];
        }
        return this.stuGrades;
    }
}
