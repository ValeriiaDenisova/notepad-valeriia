public enum Seasons {
    WINTER("cold"),
    SUMMER("hot"),
    SPRING("warm"),
    FALL("wet");

    String weather;

    Seasons(String weather) {
        this.weather = weather;
    }
}
