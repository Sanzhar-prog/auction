package kg.megacom.auction.models.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "admins")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "admin_id")
    private Long id;
    private String name;
}
