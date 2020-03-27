package kg.megacom.auction.models.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Bet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "bet_id")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "lot_id")
    private Lot lot;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

}
