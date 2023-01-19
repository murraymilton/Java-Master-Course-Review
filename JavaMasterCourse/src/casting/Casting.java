package casting;

public class Casting {

    public static void main(String[]args){
        //Implicit casting smaller -> larger data type automatic type conversion
        //byte > short > int > long
//        short x = 1;
//        int y = x + 4;
//        System.out.println(y);

        //Explicit Casting ---> Okay or expecting data loss
        double x = 1.1;
        int y = (int) x + 2;
        System.out.println(y);

        String d = "239";
        int newValue = Integer.parseInt(d);
        System.out.println(newValue + 239);


    }
}
