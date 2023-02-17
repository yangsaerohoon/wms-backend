package com.musinsalogistics.wms.service;

import com.musinsalogistics.wms.dto.CreateInboundScheduleRequest;
import com.musinsalogistics.wms.dto.InboundScheduleDto;

public interface InboundScheduleServiceFacade {
    InboundScheduleDto createInboundSchedule(CreateInboundScheduleRequest request);
}
