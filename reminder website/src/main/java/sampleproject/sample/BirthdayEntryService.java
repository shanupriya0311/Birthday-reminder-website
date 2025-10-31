package sampleproject.sample;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BirthdayEntryService {
     @Autowired
    private UserRepository userRepo;
    @Autowired
    private BirthdayEntryRepository repo;

    @Transactional
    public List<BirthdayEntry> getEntriesByUser(User user) {
        return repo.findByUser(user);
    }
      @Transactional
    public List<BirthdayEntry> getBirthdaysByEmail(String email) {
        User user = userRepo.findByEmail(email);
        if (user == null) {
            return List.of(); // Return empty list if user not found
        }
        return repo.findByUser(user);
    }
   @Transactional
public void addEntry(BirthdayEntry entry, String email) {
    User user = userRepo.findByEmail(email);
    if (user != null && entry != null) {
        entry.setUser(user); // 🔗 Associate entry with user
        repo.save(entry);    // ✅ Save with user info
    }
}



}
