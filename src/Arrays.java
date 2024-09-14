import java.util.Scanner;


public class Arrays {

    public static void main(String[] args) {
       var enteros = new int[5];
       //modify elements
        enteros[0]= 13;
        enteros[1] = 23;
        enteros[3] = 98;
        enteros[2] = 68;
        System.out.println("enteros = " + enteros[4]);

        int[] nums = {23,44,0,12,43};
        System.out.println("values = " + nums[1]);
        for (int num : nums) {
            System.out.println(num);
       }



        //start the console to ask for array values
        var console = new Scanner(System.in);
        //declare the array and ask for length
        System.out.println("give the length of an array: ");

        var arrayLength = Integer.parseInt(console.nextLine());

        //create an array in a dynamic way
        var userArray = new int [arrayLength];

        //ask for array values
        for(var i = 0; i< arrayLength; i++){
            System.out.print("give the values for [" + i + "] index = ");
             userArray[i] = Integer.parseInt(console.nextLine());
        }

        //print the array values
        System.out.println("\nValues in array: ");
        for(var i = 0; i<arrayLength; i++)
            System.out.println("value for index [" + i + "] = " + userArray[i]);
    }
}
