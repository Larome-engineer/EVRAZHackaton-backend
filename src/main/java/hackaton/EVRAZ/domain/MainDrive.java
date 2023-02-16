package hackaton.EVRAZ.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@Table(name = "main_drive")
@RequiredArgsConstructor
public class MainDrive {

    @Id
    @Column(name = "md_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "md_amperage")
    private float mainDriveAmperage;
    @Column(name = "md_drive_amperage")
    private float mainDriveDriveAmperage;

    @Column(name = "md_rotter_voltage")
    private float mainDriveRotterVoltage;

    @Column(name = "md_stater_voltage")
    private float mainDriveStaterVoltage;
    
}
