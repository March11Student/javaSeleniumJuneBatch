package fundamentals;

public class vehicle {
    //comment

  /*  * line one
    * Line Two
    * */

    public static void main(String[] args) {
    //calculator();
    //  calculator(45,60);

        int value=calculator(70,60,75);
        System.out.println("result from calling method "+value);
    }

    public static void calculator(){
        int fExam=70;
        int sExam=30;
        int t=fExam+sExam;
        System.out.println("result from 1st method: "+t);
    }
    public static void calculator(int fExam,int  sExam ){
        int t=fExam+sExam;
        System.out.println("result from 2nd method: "+t);
    }

    public static int calculator(int fExam,int sExam,int tExam ){

        int result=fExam+sExam+tExam;
        System.out.println("result from calculation: "+result);
        return result;
    }

}
