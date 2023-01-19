package types;

import java.awt.*;
import java.util.Date;

public class Types {
    public static void main(String[]args){
        /*  Primitive Types to store simple types
        * byte  *Number of Bytes in memory: 1 * Range: [-128, 127]
        * short *Number of Bytes in memory: 2 * Range: [-32K, 32K]
        * int  *Number of Bytes in memory: 4 * Range: [-2B, 2B]
        * long  *Number of Bytes in memory: 8 * Range: [ ]
        * float  *Number of Bytes in memory: 4 * Range: [,]
        * double  *Number of Bytes in memory: 8 * Range: [,]
        * char  *Number of Bytes in memory: 2 * Range: ['A', 'B', 'C']
        * boolean  *Number of Bytes in memory: 1 * Range: [true, false]
         */

        byte age = 30;
        long viewsCount = 3_756_000_000L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = true;


        /*  Reference Types to store complex objects
        *
        * */

        byte ageTwo = 33;
        Date now = new Date();  // Use the new keyword to allocate memory
//        System.out.println(now);

//      point 1 and point 2 are referencing the same object(reference address) in memory
//      Note: Reference types are copied by reference and primitive types are copied by value
        Point point1 = new Point(2,6);
        Point point2 = point1;
        point1.x = 3;
        System.out.println(point2);
    }
}
