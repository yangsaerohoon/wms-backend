package com.musinsalogistics.wms.service;

import com.musinsalogistics.wms.dto.CreateInboundScheduleRequest;
import com.musinsalogistics.wms.dto.InboundScheduleDto;
import com.musinsalogistics.wms.entity.InboundSchedule;
import org.springframework.stereotype.Service;

@Service
public class InboundScheduleServiceFacadeImpl implements InboundScheduleServiceFacade {

    private final InboundScheduleService inboundScheduleService;

    public InboundScheduleServiceFacadeImpl(InboundScheduleService inboundScheduleService) {
        this.inboundScheduleService = inboundScheduleService;
    }

    @Override
    public InboundScheduleDto createInboundSchedule(CreateInboundScheduleRequest request) {
        InboundSchedule createdInboundSchedule =
                inboundScheduleService.createInboundSchedule(
                        mapInboundSchedule(request));

        return generateInboundScheduleDto(createdInboundSchedule);
    }

    private InboundScheduleDto generateInboundScheduleDto(InboundSchedule inboundSchedule) {
        return InboundScheduleDto.builder()
                .id(inboundSchedule.getId())
                .inboundDocumentNumber(inboundSchedule.getInboundDocumentNumber())
                .inboundDocumentNumberDetail(inboundSchedule.getInboundDocumentNumberDetail())
                .itemCode(inboundSchedule.getItemCode())
                .itemName(inboundSchedule.getItemName())
                .build();
    }

    private InboundSchedule mapInboundSchedule(CreateInboundScheduleRequest request) {
        return InboundSchedule.builder()
                .inboundDocumentNumber(request.getInboundDocumentNumber())
                .inboundDocumentNumberDetail(request.getInboundDocumentNumberDetail())
                .itemCode(request.getItemCode())
                .itemName(request.getItemName())
                .build();
    }
}
