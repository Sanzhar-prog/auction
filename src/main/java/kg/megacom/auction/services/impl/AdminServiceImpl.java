package kg.megacom.auction.services.impl;

import kg.megacom.auction.dao.LotRepo;
import kg.megacom.auction.mappers.ClassMapper;
import kg.megacom.auction.models.dtos.LotDto;
import kg.megacom.auction.models.entities.Lot;
import kg.megacom.auction.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private LotRepo lotRepo;

    @Override
    public LotDto createLot(LotDto lotDto) {
        Lot lot = ClassMapper.INSTANCE.lotDtoToLot(lotDto);
        lotRepo.save(lot);
        return ClassMapper.INSTANCE.lotToLotDto(lot);
    }
}
