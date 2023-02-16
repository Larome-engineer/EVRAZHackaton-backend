package hackaton.EVRAZ.controllers;

import hackaton.EVRAZ.domain.Rotter;
import hackaton.EVRAZ.services.RotterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rotters")
@RequiredArgsConstructor
public class RotterController {

    private final RotterService rotterService;

    @PatchMapping("/update/{rotterLpn}")
    public ResponseEntity<HttpStatus> updateRotter(@RequestBody Rotter rotter,
                                                   @PathVariable("rotterLpn") String rotterLpn) {
        rotterService.updateRotter(rotter, rotterLpn);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
