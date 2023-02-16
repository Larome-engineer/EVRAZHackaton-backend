package hackaton.EVRAZ.DTO;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class MainDriveDTO {

    private float mainDriveAmperage;

    private float mainDriveDriveAmperage;

    private float mainDriveRotterVoltage;

    private float mainDriveStaterVoltage;
}
