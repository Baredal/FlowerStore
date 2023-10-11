package flower.flowerstore;

public enum FlowerColor {
    RED("#FF0000"), GREEN("#00FF00"), WHITE("#FFFFFF");
    private final String colorString;

    FlowerColor(String colorString) {
        this.colorString = colorString;
    }

    @Override
    public String toString() {
        return colorString;
    }
}
