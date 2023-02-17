package com.musinsalogistics.wms.service;

import com.musinsalogistics.wms.dto.CreateInboundScheduleRequest;
import com.musinsalogistics.wms.dto.InboundScheduleDto;
import org.springframework.stereotype.Service;

@Service
public class InboundScheduleServiceFacadeImpl implements InboundScheduleServiceFacade {

    private final InboundScheduleService inboundScheduleService;

    public InboundScheduleServiceFacadeImpl(InboundScheduleService inboundScheduleService) {
        this.inboundScheduleService = inboundScheduleService;
    }

    @Override
    public InboundScheduleDto createInboundSchedule(CreateInboundScheduleRequest request) {
        return null;
    }
}
