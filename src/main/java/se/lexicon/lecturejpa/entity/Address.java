package se.lexicon.lecturejpa.entity;

import jakarta.persistence.*;
import lombok.*;


// https://projectlombok.org/features/

//@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(includeFieldNames = false)
@EqualsAndHashCode()

@Entity
public class Address {

    @Setter(AccessLevel.NONE)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String street;

    private String city;

    @Column(nullable = false, length = 6)
    private String zipCode;


}
