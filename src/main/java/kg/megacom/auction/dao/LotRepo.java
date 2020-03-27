package kg.megacom.auction.dao;

import kg.megacom.auction.models.entities.Lot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LotRepo extends JpaRepository<Lot, Long> {
}
