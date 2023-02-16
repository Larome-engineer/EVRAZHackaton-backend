package hackaton.EVRAZ.services;

import hackaton.EVRAZ.DTO.RotterDTO;
import hackaton.EVRAZ.domain.Rotter;
import hackaton.EVRAZ.repositories.RotterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class RotterService {

    private final RotterRepository rotterRepository;

    public Rotter findById(int id) {
        Optional<Rotter> rotter = rotterRepository.findById(id);
        return rotter.orElse(null);
    }

    @Transactional
    public void saveRotter(Rotter rotter) {
        rotterRepository.save(rotter);
    }

    @Transactional
    public void updateRotter(Rotter rotter, String rotterLpn){
        rotter.setRotterId(rotterRepository.findRotterIdByName(rotterLpn));
        enrichRotter(rotter);
        rotterRepository.save(rotter);

    }

    private void enrichRotter(Rotter rotter) {

        int isReplaceAgo = (int) TimeUnit.MILLISECONDS.toDays(
                new Timestamp(System.currentTimeMillis()).getTime()
                        -
                        rotter.getDateOfRotterReplace().getTime());

        rotter.setIsReplace(isReplaceAgo);
    }
}
