package Exercise;

import java.util.Random;

public class TryCatchExamples {

    public static void main(String[] args) {
        NewExeptions newExeptions = new NewExeptions(3);

       // MyExeption myExeption = new MyExeption("Error!");
       // System.out.println(myExeption.printMessage());

        try {
            newExeptions.doing();
        } catch (MyExeption myExeption1) {
            System.out.println("Exeption is done!");
            myExeption1.printStackTrace();
        }


//        try {
//            newExeptions.remove();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }


}



class NewExeptions {
    int num;

    public NewExeptions(int num) {
        this.num = num;
    }

    void doing() throws MyExeption {
        moving();

    }

    void moving() throws MyExeption {
        if(num % 2 == 0){
            System.out.println("Ok");
        }
        else {
            throw new MyExeption("Warning!", new MyExeption().getCause());
        }

    }

    void remove() throws Exception {
        throw new Exception("Divide 0");
    }
}



class MyExeption extends Throwable{
    @Override
    public synchronized Throwable getCause() {
        System.out.println("Stupid Programmer");
        return super.getCause();
    }

    public MyExeption(String message, Throwable cause) {
        super(message, cause);
    }

    private String message;

    public MyExeption(String message) {
        this.message = message;
    }

    public MyExeption() {
    }

    String printMessage(){
        return this.message;
    }
}