public class Main {
    public static void main(String[] args) {
        System.out.println(vod(22,20));
        System.out.println(vod(45,-15));
        System.out.println(vod(14,25));
        System.out.println(vod(17, 0));
        System.out.println(vod(54, 10));

    }
    public static String vod (int age, int temperature){
        if (age>20 && age <40 && temperature >-20 && temperature< 30){
         return "Можно идти гулять";
        } else if (age<20 && temperature > 0 && temperature<25) {
                     return "Можно идти гулять";
        } else if (age>45 && temperature>-10 && temperature < 25 ) {
                     return "Можно идти гулять";

        }
        else {
                     return "Не выходить";

        }


    }
}
