package hackaton.EVRAZ.repositories;

import hackaton.EVRAZ.domain.Exhauster;
import hackaton.EVRAZ.domain.Rotter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface ExhausterRepository extends JpaRepository<Exhauster, Integer> {
    Exhauster findExhausterByEName(String name);

    @Query(nativeQuery = true, value =
            "select rotter_id from exhauster inner join rotter r on r.rotter_id = exhauster.e_rotter where e_name=:lpn"
    )
    int getRotterId(@Param("lpn") String lpn);
}
