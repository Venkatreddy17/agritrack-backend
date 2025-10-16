package com.farmer.agritrack.pesticide;

import com.farmer.agritrack.company.Company;
import com.farmer.agritrack.crop.Crop;
import com.farmer.agritrack.farmer.Farmer;
import com.farmer.agritrack.utilities.SeasonType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "pesticide_usage")
@Getter
@Setter
public class PesticideUsage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "farmer_id")
    private Farmer farmer;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "crop_id")
    private Crop crop;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "company_id")
    private Company company;

    @Enumerated(EnumType.STRING)
    private com.farmer.agritrack.utilities.SeasonType season;

    private Integer year;
    private String notes;
}
