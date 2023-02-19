package com.musinsalogistics.wms.api;

import com.musinsalogistics.wms.dto.CreateInboundScheduleRequest;
import com.musinsalogistics.wms.dto.InboundScheduleDto;
import com.musinsalogistics.wms.service.InboundScheduleServiceFacade;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InboundController {

    private final InboundScheduleServiceFacade inboundScheduleServiceFacade;

    public InboundController(InboundScheduleServiceFacade inboundScheduleServiceFacade) {
        this.inboundScheduleServiceFacade = inboundScheduleServiceFacade;
    }

    @PostMapping("/v1/api/inbound-schedules")
    ResponseEntity<InboundScheduleDto> createInboundSchedule(@RequestBody CreateInboundScheduleRequest request) {
        InboundScheduleDto result =
                inboundScheduleServiceFacade.createInboundSchedule(request);

        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }
}
