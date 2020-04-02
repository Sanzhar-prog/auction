package kg.megacom.auction.mappers;

import kg.megacom.auction.models.dtos.BetDto;
import kg.megacom.auction.models.dtos.LotDto;
import kg.megacom.auction.models.dtos.CustomerDto;
import kg.megacom.auction.models.entities.Bet;
import kg.megacom.auction.models.entities.Lot;
import kg.megacom.auction.models.entities.Customer;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ClassMapper {

    ClassMapper INSTANCE = Mappers.getMapper(ClassMapper.class);

    @Mapping(source = "customerDto", target = "customer")
    Bet betDtotoBet (BetDto betDto);
    @InheritInverseConfiguration
    BetDto betToBetDto (Bet bet);

    Lot lotDtoToLot (LotDto lotDto);
    @InheritInverseConfiguration
    LotDto lotToLotDto (Lot lot);

    Customer userDtoToUser (CustomerDto userDto);
    @InheritInverseConfiguration
    CustomerDto userToUserDto (Customer user);


}
