package hackaton.EVRAZ.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "sintering_machine")
@RequiredArgsConstructor
public class SinteringMachine {

    @Id
    @Column(name = "sm_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "sm_name")
    private String smName;

    @OneToMany
    @JoinColumn(name = "e_sm_id", referencedColumnName = "sm_id")
    private List<Exhauster> exhauster;
}
