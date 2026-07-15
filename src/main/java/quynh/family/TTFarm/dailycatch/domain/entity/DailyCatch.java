package quynh.family.TTFarm.dailycatch.domain.entity;

import jakarta.persistence.*;
import quynh.family.TTFarm.common.unums.DailyCatchStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="daily_catches")
public class DailyCatch {
    @Id
    @GeneratedValue(strategy=GenerationType.UUID)
    private String id;

    private LocalDate catchDate;

    private LocalDateTime publishedAt;

    @Enumerated(EnumType.STRING)
    private DailyCatchStatus status;

    @OneToMany(mappedBy="dailyCatch",
            cascade=CascadeType.ALL,
            orphanRemoval=true)
    private List<DailyCatchItem> items;
}
