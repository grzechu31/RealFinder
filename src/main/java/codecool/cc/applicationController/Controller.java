package codecool.cc.applicationController;

import codecool.cc.DataHandler.UserData;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/index")
    public String greeting() {
        return "index";
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
