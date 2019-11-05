import java.util.Arrays;

public class Rand {
    public static void main(String[] args) {
int Arr1[]=new int[10];
int i=0;
for( i=0;i<Arr1.length;i++) {
    Arr1[i] = -3 * i;
    System.out.print( Arr1[i]+" ");

}
System.out.println();
        for( i=0;i<Arr1.length;i++) {

            Arrays.sort(Arr1);
            System.out.print( Arr1[i]+" ");

        }
        System.out.println();
        for( i=0;i<Arr1.length;i++) {

            Arrays.sort(Arr1);
            System.out.print( Arr1[i]+" ");

        }

        System.out.println();
        for( i=0;i<Arr1.length;i++) {

            Arrays.fill(Arr1,1,6,30);
            System.out.print( Arr1[i]+" ");

        }








    }
}
