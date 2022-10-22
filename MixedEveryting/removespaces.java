package MixedEveryting;

public class removespaces {

    public static void main(String[] args) {
        String str = "     Such   a    good   day    today    ";
        String str1 = str.replaceAll("\\s+", " ");
        System.out.println(str1);

        System.out.println("+===========");

        str = str.trim();
        while (str.contains("  ")) {
            str = str.replace("  ", " ");
        }
        System.out.println(str);
        System.out.println("==========");

        String str2 = "10";
        String str3 = "10";
        Integer num = Integer.parseInt(str2);
        Integer num2 = Integer.parseInt(str3);
        System.out.println(num + num2);
    }
}
