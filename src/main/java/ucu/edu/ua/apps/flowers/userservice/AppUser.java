package ucu.edu.ua.apps.flowers.userservice;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.Getter;
import lombok.Setter;

@Entity
public class AppUser {
    @Id @Setter @Getter
    private int id;
    
    @Setter @Getter
    @Column(unique = true)
    private String email;

    @Transient
    private LocalDate dob = LocalDate.now();

    @Getter @Setter
    private int age;

    public String getTimeLogin() {
        return ChronoUnit.DAYS.between(dob, LocalDate.now()) + " days";
    }
    
}
