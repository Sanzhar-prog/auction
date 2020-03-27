package kg.megacom.auction.dao;

import kg.megacom.auction.models.entities.Bet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BetRepo extends JpaRepository<Bet, Long> {
}
