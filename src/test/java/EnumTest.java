public class EnumTest {
    public static void main(String[] args) {
        Seasons arg = Seasons.FALL;

        switch (arg) {
            case WINTER:
                System.out.println("It's winter!");
                break;
            case SUMMER:
                System.out.println("It's summer!");
                break;
            case SPRING:
                System.out.println("It's spring!");
                break;
            case FALL:
                System.out.println("It's fall!");
                break;
        }

        System.out.println(Seasons.valueOf("SUMMER"));

        System.out.println(Seasons.SPRING.compareTo(Seasons.FALL));
        System.out.println(Seasons.SPRING.compareTo(Seasons.SPRING));

        for (Seasons seasons : Seasons.values()) {
            System.out.println(seasons + " " + seasons.weather);
        }

    }
}