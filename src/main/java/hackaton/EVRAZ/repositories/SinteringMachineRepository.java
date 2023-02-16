package hackaton.EVRAZ.repositories;

import hackaton.EVRAZ.domain.SinteringMachine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SinteringMachineRepository extends JpaRepository<SinteringMachine, Integer> {

}
