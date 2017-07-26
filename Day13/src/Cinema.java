/**
 * Created by kaurk on 7/26/2017.
 */
public class Cinema {
    public static void main(String[] args) {
        User user = new User(101, "xyz", 8, 4);
        try {
            MovieService.buy(user, 1500.0);
            MovieService.watch(user);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (InvalidPriceException e) {
            System.out.println(e.getMessage());
        } catch (InvalidRatingException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
