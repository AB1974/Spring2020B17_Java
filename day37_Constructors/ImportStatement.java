package day37_Constructors;
import java.util.Arrays;

/**
 *
 * import static day37_Constructors.Data.staticVariable;//importing static variable//
 * import static day37_Constructors.Data.staticMethod;//we import static method
 */
import static day37_Constructors.Data.*;//it imports all static variable and methods from Data Class

public class ImportStatement {

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(staticVariable);

        staticMethod();
    }
}
