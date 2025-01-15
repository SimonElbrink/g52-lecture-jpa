package se.lexicon.lecturejpa.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

// https://projectlombok.org/features/
//@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode
@ToString

// https://thorben-janssen.com/key-jpa-hibernate-annotations/
@Entity(name = "students")
public class Student {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY) // For Number Sequence
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false,length = 100)
    private String firstName;

    @Column(nullable = false,length = 100)
    private String lastName;

    @NonNull
    @Column(nullable = false, unique = true)
    private String email;

    @Column(name = "is_active")
    private boolean active;

    @ToString.Exclude
//    @Column(columnDefinition = "DEFAULT NOW()")
    private LocalDateTime createDate;

    @OneToOne
    private Address address;

    public Student(String firstName, String lastName, @NonNull String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.active = true;
        this.createDate = LocalDateTime.now();
    }

}
