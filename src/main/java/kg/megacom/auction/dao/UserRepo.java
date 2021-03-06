package kg.megacom.auction.dao;

import kg.megacom.auction.models.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Customer, Long > {
}
