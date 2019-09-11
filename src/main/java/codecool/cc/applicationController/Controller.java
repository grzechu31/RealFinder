package codecool.cc.applicationController;

import codecool.cc.DataHandler.UserData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String homePage(){
        return "Home Page";
    }

    @GetMapping("/login")
    public String userLoginPage(){
        return "place for user login template";
    }


    @PostMapping("login")
    public String tryToLogin(@RequestBody UserData user){



        return " place for validation methods and redirect";

    }
    @GetMapping("/search")
    public  String setSearchingPage(){
        return "place for the template with data od search";
    }
}
