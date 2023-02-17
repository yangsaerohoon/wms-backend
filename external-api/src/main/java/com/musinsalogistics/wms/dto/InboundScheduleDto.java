package com.musinsalogistics.wms.dto;

import lombok.Builder;
import lombok.Data;

@Data
public class InboundScheduleDto {
    private Long id;
    private String inboundDocumentNumber;
    private String inboundDocumentNumberDetail;
    private String itemCode;
    private String itemName;

    @Builder
    public InboundScheduleDto(Long id,
                              String inboundDocumentNumber,
                              String inboundDocumentNumberDetail,
                              String itemCode,
                              String itemName) {
        this.id = id;
        this.inboundDocumentNumber = inboundDocumentNumber;
        this.inboundDocumentNumberDetail = inboundDocumentNumberDetail;
        this.itemCode = itemCode;
        this.itemName = itemName;
    }
}
