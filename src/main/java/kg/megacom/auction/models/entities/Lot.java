package kg.megacom.auction.models.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Lot {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "lot_id")
    private Long id;
    private String description;
    private double min_price;
    private double buy_now_price;
    private double step;
    private Date end_date;
    private LotStatus lotStatus;


}
