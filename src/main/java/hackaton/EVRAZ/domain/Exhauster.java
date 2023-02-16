package hackaton.EVRAZ.domain;

import com.sun.tools.javac.Main;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Date;
import java.util.Set;

@Data
@Entity
@Table(name = "exhauster")
@RequiredArgsConstructor
public class Exhauster  {

    @Id
    @Column(name = "e_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "e_name")
    private String EName;

    @OneToOne
    @JoinColumn(name = "e_rotter", referencedColumnName = "rotter_id")
    private Rotter rotter;

    @OneToOne
    @JoinColumn(name = "e_oil_level", referencedColumnName = "oil_tank_id")
    private OilTank oilTank;

    @OneToOne
    @JoinColumn(name = "e_cooler", referencedColumnName = "cooler_id")
    private Cooler cooler;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "e_md_id", referencedColumnName = "md_id")
    private MainDrive mainDrive;

    @OneToMany
    @JoinColumn(name = "exhauster_id", referencedColumnName = "e_id")
    private Set<Bearing> bearings;

    @OneToOne
    @JoinColumn(name = "e_bw_id", referencedColumnName = "bw_id")
    private BearingWarnings bearingWarnings;



}
