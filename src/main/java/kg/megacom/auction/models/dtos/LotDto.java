package kg.megacom.auction.models.dtos;

import lombok.Data;
import javax.validation.constraints.*;

import java.util.Date;

@Data
public class LotDto {

    private Long id;
    @Size(min = 3, max = 30)
    private String description;
    @FutureOrPresent
    private Date start_date;
}
