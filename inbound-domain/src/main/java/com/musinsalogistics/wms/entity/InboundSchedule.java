package com.musinsalogistics.wms.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class InboundSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String inboundDocumentNumber;

    @Column
    private String inboundDocumentNumberDetail;

    @Column
    private String itemCode;

    @Column
    private String itemName;

    @Builder
    public InboundSchedule(String inboundDocumentNumber,
                           String inboundDocumentNumberDetail,
                           String itemCode,
                           String itemName) {
        this.inboundDocumentNumber = inboundDocumentNumber;
        this.inboundDocumentNumberDetail = inboundDocumentNumberDetail;
        this.itemCode = itemCode;
        this.itemName = itemName;
    }
}
