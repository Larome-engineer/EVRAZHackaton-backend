package hackaton.EVRAZ.DTO;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class BearingDTO {

    private int bearingName;

    private int bearingTemperature;

    private int bV;

    private int bG;

    private int bO;
}
