package hackaton.EVRAZ.services;

import hackaton.EVRAZ.domain.BearingWarnings;
import hackaton.EVRAZ.repositories.BearingWarningsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class BearingWarningsService {

    private final BearingWarningsRepository warningsRepository;

    @Transactional
    public void saveWarnings(BearingWarnings bearingWarnings) {
        warningsRepository.save(bearingWarnings);
    }
}
