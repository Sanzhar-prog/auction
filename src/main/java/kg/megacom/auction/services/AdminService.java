package kg.megacom.auction.services;

import kg.megacom.auction.models.dtos.LotDto;
import kg.megacom.auction.models.entities.Lot;

public interface AdminService {

    LotDto createLot (LotDto lotDto);
}
