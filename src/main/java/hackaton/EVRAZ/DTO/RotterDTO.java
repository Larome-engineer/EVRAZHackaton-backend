package hackaton.EVRAZ.DTO;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@Data
@RequiredArgsConstructor
public class RotterDTO {

    private String rotterName;

    private Date rotterProdDate;

    private int isReplace;
}
