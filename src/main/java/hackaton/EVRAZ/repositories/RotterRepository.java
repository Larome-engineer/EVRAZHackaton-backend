package hackaton.EVRAZ.repositories;

import hackaton.EVRAZ.domain.Rotter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RotterRepository extends JpaRepository<Rotter, Integer> {

    @Query(nativeQuery = true, value = "select rotter_id from rotter where rotter_name=:rotterLpn")
    int findRotterIdByName(@Param("rotterLpn") String rotterLpn);

}
