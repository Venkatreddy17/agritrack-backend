package com.farmer.agritrack.fertilizer;

import com.farmer.agritrack.company.Company;
import com.farmer.agritrack.crop.Crop;
import com.farmer.agritrack.farmer.Farmer;
import com.farmer.agritrack.utilities.BaseEntity;
import com.farmer.agritrack.utilities.SeasonType;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "fertilizer_usage")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Fertilizer extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "farmer_id", nullable = false)
    private Farmer farmer;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "crop_id", nullable = false)
    private Crop crop;

    @Enumerated(EnumType.STRING)
    @Column(name = "season", nullable = false)
    private SeasonType season;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "company_id", nullable = false)
    private Company company; // company providing fertilizer

    @Column(name = "year", nullable = false)
    private Integer year;

    @Column(name = "fertilizer_name", nullable = false)
    private String fertilizerName;

    @Column(name = "quantity")
    private Double quantity; // in kg or liters

    @Column(name = "cost")
    private Double cost; // cost of fertilizer

    @Column(name = "purchase_slip_url")
    private String purchaseSlipUrl; // store path or URL of the slip image

    @Column(name = "notes", length = 500)
    private String notes;

}
