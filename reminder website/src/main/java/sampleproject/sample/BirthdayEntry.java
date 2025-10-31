package sampleproject.sample;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class BirthdayEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 
    private String name;
    private LocalDate dob;

    @ManyToOne
    @JoinColumn(name = "user_id") // This will be the foreign key column
    private User user;

    public BirthdayEntry() {
    }

    public BirthdayEntry(Long id, String name, LocalDate dob, User user) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.user = user;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
