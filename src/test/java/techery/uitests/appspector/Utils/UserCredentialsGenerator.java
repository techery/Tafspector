package techery.uitests.appspector.Utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserCredentialsGenerator {

    public String createUsername(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
        Date date = new Date();
        String username = "username"+dateFormat.format(date);
        return username;
    }

    public String createEmail(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
        Date date = new Date();
        String email ="test"+dateFormat.format(date)+"@techery.io";
        return email;
    }

}
