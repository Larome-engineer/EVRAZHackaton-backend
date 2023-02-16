package hackaton.EVRAZ.services;

import hackaton.EVRAZ.DTO.BearingDTO;
import hackaton.EVRAZ.DTO.ExhausterDTO;
import hackaton.EVRAZ.domain.Bearing;
import hackaton.EVRAZ.domain.BearingWarnings;
import hackaton.EVRAZ.domain.Exhauster;
import hackaton.EVRAZ.domain.Rotter;
import hackaton.EVRAZ.repositories.ExhausterRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.TimeUnit;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ExhausterService {

    private final ExhausterRepository exhausterRepository;

    private final RotterService rotterService;

    private final BearingWarningsService bearingWarningsService;

    private final ModelMapper modelMapper;


    @Transactional
    public ExhausterDTO findExhausterByLPN(String lpn) { // LPN - License plate number (Номерной знак)
        Exhauster foundEx = exhausterRepository.findExhausterByEName(lpn);
        Rotter rotter = rotterService.findById(exhausterRepository.getRotterId(lpn));

        int isReplaceAgo = (int) TimeUnit.MILLISECONDS.toDays(
                new Timestamp(System.currentTimeMillis()).getTime()
                        -
                        foundEx.getRotter().getDateOfRotterReplace().getTime());

        BearingWarnings bearingWarnings = new BearingWarnings();

        for (Bearing b : foundEx.getBearings()) {

            if (b.getBV() > 4) {
                bearingWarnings.setBwV(5);
                b.setBearingWarnings(bearingWarnings);
            } else if (b.getBearingTemperature() > 200) {
                bearingWarnings.setBwT(201);
                b.setBearingWarnings(bearingWarnings);
            } else if (b.getBG() > 15) {
                bearingWarnings.setBwO(16);
                b.setBearingWarnings(bearingWarnings);
            } else if (b.getBO() > 3) {
                bearingWarnings.setBwO(4);
                b.setBearingWarnings(bearingWarnings);
            } else {
                b.setBearingWarnings(bearingWarnings);
            }
        }

        bearingWarningsService.saveWarnings(bearingWarnings);

        rotter.setIsReplace(isReplaceAgo);
        rotterService.saveRotter(rotter);

        return convertExhausterToDTO(foundEx);
    }

    @Transactional
    public void updateExhauster(Exhauster exhauster, String lpn) {

    }

    @Transactional
    public void deleteExhauster(String lpn) {

    }

    private ExhausterDTO convertExhausterToDTO(Exhauster exhauster) {
        return modelMapper.map(exhauster, ExhausterDTO.class);
    }

}
