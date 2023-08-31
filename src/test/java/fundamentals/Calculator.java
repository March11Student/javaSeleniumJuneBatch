package fundamentals;

public class Calculator {

    public static void main(String[] args) {
    validateWhileLoop();
    validateDoWhileLoop();
    }



    public static void validateWhileLoop(){
        int count=11;
        while(count==10){
            System.out.println("output from while loop: "+count);
        }
    }
    public static void validateDoWhileLoop(){
        int count=11;
        do{
            System.out.println("output from do-while loop: "+count);
        }while (count==10);
    }


}
