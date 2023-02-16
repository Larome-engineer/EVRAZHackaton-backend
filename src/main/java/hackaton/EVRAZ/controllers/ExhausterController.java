package hackaton.EVRAZ.controllers;

import hackaton.EVRAZ.DTO.ExhausterDTO;
import hackaton.EVRAZ.services.ExhausterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/exhausters")
@RequiredArgsConstructor
public class ExhausterController {

    private final ExhausterService exhausterService;

    @GetMapping("/{lpn}")
    public ExhausterDTO findByLPN(@PathVariable("lpn") String lpn) {
        return exhausterService.findExhausterByLPN(lpn);
    }
}
