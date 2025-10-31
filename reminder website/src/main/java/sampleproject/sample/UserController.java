package sampleproject.sample;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
import jakarta.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class UserController {

    @Autowired
    private UserService userService;
   @Autowired
   private BirthdayEntryService birthdayEntryService;
    @GetMapping("/index")
    public String homePage() {
        return "index"; // refers to templates/index.html
    }

    @GetMapping("/login_signup")
    public String loginSignupPage() {
        return "login_signup"; // refers to templates/login_signup.html
    }

    @GetMapping("/signup")
    public String showSignupForm(Model model) {
        model.addAttribute("user", new User());  // important for th:object in form
        return "signup"; // matches signup.html
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }
@PostMapping("/login")
public String loginUser(@RequestParam("email") String email,
                        @RequestParam("password") String password,
                        HttpSession session,
                        Model model) {
    User user = userService.findByEmailAndPassword(email, password);
    if (user != null) {
        session.setAttribute("userEmail", user.getEmail()); // Save email in session
        model.addAttribute("username", user.getName());
        List<BirthdayEntry> list = birthdayEntryService.getBirthdaysByEmail(user.getEmail());
        model.addAttribute("birthdays", list);
        return "userlist";
    } else {
        model.addAttribute("error", "Invalid email or password");
        return "login";
    }
}

    // POST method to handle form submission
    @PostMapping("/signup")
    public String signupUser(@ModelAttribute User user, Model model) {
        userService.saveUser(user);
        model.addAttribute("message", "User saved successfully!");
        return "userlist";  // make sure welcome.html exists
    }


} 