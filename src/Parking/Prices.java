package Parking;

/**
 * This class is describing pricing policy of the parking and counting time of using parking place;
 * @minPrice - it's minimum amount that can be payed;
 * @maxAmount - it's maximum amount that can be payed;
 * @price - this is the charge for one hour stay in the parking;
 * @discount - discount coefficient, which depends on the length os stay;
 * @length - how many hours the car was using parking place;
 */
public class Prices {
    double minPrice;
    double maxPrice;
    double price;
    double discount;
    int length;
}
