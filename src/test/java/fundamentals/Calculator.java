package fundamentals;

public class Calculator {
    //comment

  /*  * line one
    * Line Two
    * */

    public static void main(String[] args) {
    //calculator();
    //  calculator(45,60);


        addition(30, 70);
    }

    public static void calculator(){
        int fExam=70;
        int sExam=30;
        int t=fExam+sExam;
        System.out.println("result from 1st method: "+t);
    }
    public static void addition(int a,int  b ){
        int result=a+b;
        System.out.println("result from 2nd method: "+result);
    }

    public static int calculator(int fExam,int sExam,int tExam ){
        int result=fExam+sExam+tExam;
        System.out.println("result from calculation: "+result);
        return result;
    }



}
