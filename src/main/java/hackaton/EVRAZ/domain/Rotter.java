package hackaton.EVRAZ.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@Data
@Entity
@Table(name = "rotter")
@RequiredArgsConstructor
public class Rotter { // Добавить поле isReplace (Date) для расчета врмемени замены в сутках.

    @Id
    @Column(name = "rotter_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rotterId;

    @Column(name = "rotter_name")
    private String rotterName;

    @Column(name = "rotter_production_date")
    private Date rotterProdDate;

    @Column(name = "date_of_rotter_replace")
    private Date dateOfRotterReplace; // dateNow - isReplace

    @Column(name = "rotter_is_replace")
    private int isReplace;
}
