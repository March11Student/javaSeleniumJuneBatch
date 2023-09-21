package fundamentals;

public class JavaDataType {
    //syntax of data
    //data_type <variable name>

    public static int age=20;// declare of variable and assign value
    int count=5,number=10;

    //primitive types of data
    byte bt=2;
    short s;
    int i=5;
    long l=5l;
    //decimal number
    double d=5.3;
    float f =5.3f;


    char ch='A';
    boolean bl=true;

    static int a=10;
    static int b=15;


    public static void main(String[] args) {
        //variable inside a method local variable.
      //  System.out.println(age);
        float f;
        f=5.3f;
       // addition();
      //  subtraction();
       // multiplication();
       // modulus();
      //  assignValue();
      //  relationalOperator();
      //  nestedIfElse(55);
        forLoopExample();
      //  dataValueExample();

    }

    public static void addition(){
        int a=5;
        int b=10;
        int c=a+b;
        System.out.println( "value of a is: "+a);
        System.out.println( "value of b is: "+b);
        System.out.println("addition: "+c);
    }

    public static void subtraction(){
        int c=a-b;
        System.out.println( "value of a is: "+a);
        System.out.println( "value of b is: "+b);
        System.out.println("subtraction: "+c);
    }
    public static void multiplication(){
        int c=a*b;
        System.out.println( "value of a is: "+a);
        System.out.println( "value of b is: "+b);
        System.out.println("Multiplication: "+c);
    }

    public static void modulus(){
        int a=17;
        int b=5;
        int c=a%b;
        System.out.println( "value of a is: "+a);
        System.out.println( "value of b is: "+b);
        System.out.println("Modulus: "+c);
    }
    public static void assignValue(){
        int a=5;
        a+=15;
        int b=10;
        b-=3;
        System.out.println( "value of a is: "+a);
        System.out.println( "value of a is: "+b);
    }

    public  static void relationalOperator(){
            int a=5,b=25,c=15;
            if(b>a && b<c){
                System.out.println("b is in  middle");
              }else{
                System.out.println("b is not in middle");
            };
        System.out.println("Relational :"+c);
    }

    public  static void nestedIfElse(int mark){

        if(mark>0){
            if( mark<30){
                System.out.println("grade: F ");
            }
            else if(mark>30 &&mark<60){
                System.out.println("grade: C ");
            }
            else if(mark>60 &&mark<80){
                System.out.println("grade: B ");
            }
            else if(mark>80 &&mark<100){
                System.out.println("grade: A ");
            }
        }else {
                System.out.println("Please check mark");
        }
    }

    public static void forLoopExample(){
        //int i=0;
        //syntax
        //for(starting point/statement;exit condition;step
       for (int i=0;i<=5;i=i+1){
        //statement,
           System.out.println("value  of i is: "+i);
       }
    }

    public static void dataValueExample(){
        int a=10;
        a=20;
        System.out.println(a);
    }
}
