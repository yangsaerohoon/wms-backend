package com.musinsalogistics.wms.dto;

import lombok.Builder;
import lombok.Data;

@Data
public class CreateInboundScheduleRequest {
    private String inboundDocumentNumber;
    private String inboundDocumentNumberDetail;
    private String itemCode;
    private String itemName;

    @Builder
    public CreateInboundScheduleRequest(String inboundDocumentNumber,
                                        String inboundDocumentNumberDetail,
                                        String itemCode,
                                        String itemName) {
        this.inboundDocumentNumber = inboundDocumentNumber;
        this.inboundDocumentNumberDetail = inboundDocumentNumberDetail;
        this.itemCode = itemCode;
        this.itemName = itemName;
    }
}
