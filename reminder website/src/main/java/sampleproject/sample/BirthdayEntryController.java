package sampleproject.sample;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.ModelAttribute;
import java.util.List;
@Controller
public class BirthdayEntryController {
    @Autowired
    private UserRepository userRepo;
    @Autowired
    private BirthdayEntryService entryService;
   @GetMapping("/userlist")
public String showBirthdayList(Model model, HttpSession session) {
    String email = (String) session.getAttribute("userEmail");
    if (email == null) {
        return "login"; // Redirect to login if email not found
    }
    List<BirthdayEntry> list = entryService.getBirthdaysByEmail(email);
    model.addAttribute("birthdays", list);
   return "userlist";

}

    @GetMapping("/addBirthday")
    public String addBirthdayForm(Model model) {
        model.addAttribute("birthdayEntry", new BirthdayEntry());
        return "addBirthday";
    }
   @PostMapping("/addBirthday")
public String saveBirthday(@ModelAttribute BirthdayEntry entry, HttpSession session) {
   String email = (String) session.getAttribute("userEmail");
// Get email from session
    if (email != null) {
        User user = userRepo.findByEmail(email); // Get user from DB
        entry.setUser(user);                     // Set the user
        entryService.addEntry(entry,user.getEmail());            // Save the entry
    }
  return "redirect:/userlist";
 // Redirect or show success page
}




}