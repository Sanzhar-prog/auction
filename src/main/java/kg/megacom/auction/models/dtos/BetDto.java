package kg.megacom.auction.models.dtos;

import lombok.Data;

@Data
public class BetDto {

    private Long id;
    private LotDto lotDto;
    private CustomerDto customerDto;
}
