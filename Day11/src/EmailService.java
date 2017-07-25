/**
 * Created by kaurk on 7/25/2017.
 */
class EmailService{

   // private final LocationService locationService = new LocationService();
   // private final CheckService checkService = new CheckService();

   static void sendEmail(String user, String email, String message){
        if(LocationService.checkLocation(LocationService.retrieveLocation(email))){
            if(CheckService.checkPermission(user)){
                if(exists(email)){
                    System.out.println("Email is sent to "+email+ " with message : "+message);
                }
            }
        }
    }

   static  boolean exists(String email){
        //20 loc to check in DB
        if(email.endsWith("@yahoo.com")) {
            return true;
        }else{
            return false;
        }
    }


}
