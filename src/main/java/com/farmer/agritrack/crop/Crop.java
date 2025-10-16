package com.farmer.agritrack.crop;
import com.farmer.agritrack.utilities.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "crops")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Crop extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
}
