package hackaton.EVRAZ.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@Table(name = "cooler")
@RequiredArgsConstructor
public class Cooler {

    @Id
    @Column(name = "cooler_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int coolerId;

    @Column(name = "cooler_temperature")
    private int temperature;
}
