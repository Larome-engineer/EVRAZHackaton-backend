package hackaton.EVRAZ.controllers;

import hackaton.EVRAZ.DTO.ExhausterDTO;
import hackaton.EVRAZ.DTO.SinteringMachineDTO;
import hackaton.EVRAZ.domain.Exhauster;
import hackaton.EVRAZ.domain.SinteringMachine;
import hackaton.EVRAZ.services.SinteringMachineService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class MainPageController {

    private final SinteringMachineService sinteringMachineService;
    private final ModelMapper modelMapper;

    @GetMapping("main-page")
    private List<SinteringMachineDTO> findAll() {
        return sinteringMachineService.findAll().stream().map(this::sinteringMachineDTO).toList();
    }
    private SinteringMachineDTO sinteringMachineDTO (SinteringMachine sinteringMachine) {
        return modelMapper.map(sinteringMachine, SinteringMachineDTO.class);
    }
}
