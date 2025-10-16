package com.farmer.agritrack.farmer;
import com.farmer.agritrack.user.User;
import com.farmer.agritrack.utilities.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "farmers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Farmer extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String phone;
    private String village;
    private String district;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;
}
