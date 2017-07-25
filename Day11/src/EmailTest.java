import org.junit.Test;

/**
 * Created by kaurk on 7/25/2017.
 */
public class EmailTest {
    @Test
    public void testEmail(){
        EmailService.sendEmail("admin","kamal@yahoo.com","email sent");
    }


}
