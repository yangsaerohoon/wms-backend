package com.musinsalogistics.wms.service;

import com.musinsalogistics.wms.dto.CreateInboundScheduleRequest;
import com.musinsalogistics.wms.dto.InboundScheduleDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class InboundScheduleServiceFacadeImplTest {

    @Autowired
    InboundScheduleServiceFacade inboundScheduleServiceFacade;

    @Test
    void createInboundScheduleTest() {
        CreateInboundScheduleRequest request = CreateInboundScheduleRequest.builder().build();
        InboundScheduleDto createdInboundSchedule =
                inboundScheduleServiceFacade.createInboundSchedule(request);

        assertThat(createdInboundSchedule).isNotNull();
        assertThat(createdInboundSchedule.getInboundDocumentNumber())
                .isEqualTo(request.getInboundDocumentNumber());
    }
}