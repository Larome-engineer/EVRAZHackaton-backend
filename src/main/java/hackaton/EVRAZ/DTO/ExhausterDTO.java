package hackaton.EVRAZ.DTO;

import hackaton.EVRAZ.domain.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Set;

@Data
@RequiredArgsConstructor
public class ExhausterDTO {

    private String EName;

    private RotterDTO rotter;

    private OilTankDTO oilTank;

    private CoolerDTO cooler;

    private MainDriveDTO mainDrive;

    private Set<BearingDTO> bearings;
}
