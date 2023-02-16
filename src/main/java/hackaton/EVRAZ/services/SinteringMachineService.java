package hackaton.EVRAZ.services;

import hackaton.EVRAZ.domain.SinteringMachine;
import hackaton.EVRAZ.repositories.SinteringMachineRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SinteringMachineService {

    private final SinteringMachineRepository machineRepository;

    public List<SinteringMachine> findAll() {
        return machineRepository.findAll();
    }

    public SinteringMachine findById(int id) {
        Optional<SinteringMachine> sinteringMachine = machineRepository.findById(id);
        return sinteringMachine.orElse(null);
    }


//    public SinteringMachine find(int id) {
//        return machineRepository.findAllByIdCustom(id);
//    }
}
