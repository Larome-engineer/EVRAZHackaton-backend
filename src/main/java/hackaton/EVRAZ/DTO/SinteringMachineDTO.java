package hackaton.EVRAZ.DTO;

import hackaton.EVRAZ.domain.Exhauster;
import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
public class SinteringMachineDTO {

    private String smName;

    private List<ExhausterDTO> exhauster;
}
