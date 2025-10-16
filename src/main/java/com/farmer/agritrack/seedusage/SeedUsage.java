package com.farmer.agritrack.seedusage;


import com.farmer.agritrack.company.Company;
import com.farmer.agritrack.crop.Crop;
import com.farmer.agritrack.farmer.Farmer;
import com.farmer.agritrack.utilities.BaseEntity;
import com.farmer.agritrack.utilities.SeasonType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "seed_usage")
@Getter
@Setter
public class SeedUsage extends BaseEntity {
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

    @Column(name = "notes", length = 500)
    private String notes;
}
