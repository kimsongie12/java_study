package ch05;
//문자열 길이 length()
public class Test3_2 {
    public static void main(String[] args){
        String ssn = "0012204123123";
        int length = ssn.length();
        if(length ==13){
            System.out.println("right");
        }else{
            System.out.println("wrong");
        }
    }
}