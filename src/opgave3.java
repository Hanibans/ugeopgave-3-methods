public class opgave3 {
    double applyDiscount(double price, double discountPercent) {
        return price * (1 - discountPercent / 100);
    }

    double addTax(double price) {
        return price * 1.25;
    }

    double calcutaleFinalPrice(double basePrice, double discount) {
        double priceAfterDiscount = applyDiscount(basePrice, discount);
        double finalPrice = addTax(priceAfterDiscount);
        return finalPrice;
    }

    void main() {
        double finalPrice = calcutaleFinalPrice(500, 20);
        System.out.println("Slutpris med 20% rabat: " + finalPrice + " kr");
    }
}
