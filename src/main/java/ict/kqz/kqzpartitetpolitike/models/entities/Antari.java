package ict.kqz.kqzpartitetpolitike.models.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Antari {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 10,unique = true)
    private String numriPersonal;
    @Column(length = 50)
    private String name;
    @Column(length = 50)
    private String surname;
    private LocalDate datelindja;
    private char gender;
}
