/**
 * Created by kaurk on 7/26/2017.
 */
public class MovieService {
    public static void buy(User user, double price) throws InvalidPriceException {

        if (price < 0 || price < 2000) {
            InvalidPriceException e = new InvalidPriceException("Enter valid price");
            throw e;
        }

    }

    public static void watch(User user) throws InvalidAgeException, InvalidRatingException {
        if (user.getAge() <= 0) {
            InvalidAgeException e1 = new InvalidAgeException("Enter valid age");
            throw e1;
        }
        if (user.getAge() < 10) {
            InvalidAgeException e2 = new InvalidAgeException("age cannot be less than 10");
            throw e2;
        }
        if (user.getAge() < 20) {
            InvalidAgeException e3 = new InvalidAgeException("age cannot be less than 20");
            throw e3;
        }
        if (user.getRating() < 3) {
            InvalidRatingException e4 = new InvalidRatingException("Not a good movie");
            throw e4;
        }

    }
}
