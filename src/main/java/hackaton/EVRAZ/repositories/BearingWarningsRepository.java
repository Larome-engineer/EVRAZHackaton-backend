package hackaton.EVRAZ.repositories;

import hackaton.EVRAZ.domain.BearingWarnings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BearingWarningsRepository extends JpaRepository<BearingWarnings, Integer> {
}
