package arrays;

public class Arrays {

    public static void main(String[]args){
//        int [] numbers = {9911, 1111, 2223, 239, 789};
//        for(int k = 0; k < numbers.length; k++){
//            System.out.println(numbers[k]);
//        }
//        System.out.println(numbers[0]);
//
//        int [] ages = new int[6];
//        ages[0]= 19;
//        ages[1]= 22;
//        ages[2]= 32;
//        ages[3]= 42;
//        ages[4]= 52;
//        ages[5]= 62;
//        for(int i = 0; i < ages.length; i++){
//            System.out.println(ages[i]);
//        }

        int [] countDown = {5, 4, 3, 2, 1};
        String [] lift = {"Ignition sequence started!","Liftoff!"};

        for(int j = 0 ; j < countDown.length; j++){
            if(j == 0){
                System.out.println(lift[0]);
            }
            System.out.println(countDown[j]);
         if(j == 4){
             System.out.println(lift[1]);
         }
        }

        int [] luckNumbers = new int[5];
        luckNumbers[0] = 239;
        luckNumbers[1] = 2222;
        luckNumbers[2] = 1515;
        luckNumbers[3] = 9556;
        luckNumbers[4] = 2399;

        for(int l = 0; l < luckNumbers.length; l++){
            System.out.println(luckNumbers[l]);
        }
        int bus = 3;
        while( bus < 8) {
            System.out.println(bus);
            bus++;
        }

        int bus2 = 0;
        do{
            System.out.println("Bus preparing to stop");
            bus2++;
        }while(bus2 < 5);

        int whileNumb = 0;
        int[] numbersFixed = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("For Loop Example:");
        for(int u = 0; u < numbersFixed.length; u++){

            System.out.println(numbersFixed[u]);
        }
        System.out.println("While Loop Example:");
        while(whileNumb < numbersFixed.length){
            System.out.println(numbersFixed[whileNumb]);
            whileNumb++;
        }
        System.out.println("Do While Loop:");
        int doNumb = 0;
        do{
            System.out.println(numbersFixed[doNumb]);
            doNumb++;
        }while (doNumb < numbersFixed.length);

    }


}
