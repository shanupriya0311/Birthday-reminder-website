package sampleproject.sample;
import java.util.ArrayList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface BirthdayEntryRepository extends JpaRepository<BirthdayEntry, Long> {
    ArrayList<BirthdayEntry> findByUser(User user);
}

