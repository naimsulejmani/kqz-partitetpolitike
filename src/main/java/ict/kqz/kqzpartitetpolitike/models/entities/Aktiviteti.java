package ict.kqz.kqzpartitetpolitike.models.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
public class Aktiviteti {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String emri;
    private String pershkrimin;
    private LocalDate data;
    private LocalDateTime fillonMe;
    private LocalDate mbarenMe;
    private String lokacioni;
}
