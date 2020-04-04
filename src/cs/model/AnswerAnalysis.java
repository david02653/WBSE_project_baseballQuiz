package cs.model;

public class AnswerAnalysis {
    public static boolean ifCorrect(String ans){
        switch(ans){
            case "Babe Ruth":
                System.out.println("wrong answer, 1");
                return false;
            case "Hank Aaron":
                System.out.println("wrong answer, 2");
                return false;
            case "Barry Bonds":
                System.out.println("correct answer, 3");
                return true;
            case "Alex Rodriguez":
                System.out.println("wrong answer, 4");
                return false;
            case "Albert Pujols":
                System.out.println("wrong answer, 5");
                return false;
            case "Mike Trout":
                System.out.println("wrong answer, 6");
                return false;
            default:
                System.out.println("error input");
                return false;
        }
    }

    public static void main(String args[]){
        if(ifCorrect("Barry Bonds"))
            System.out.println("correct");
        else
            System.out.println("wrong");
    }
}
