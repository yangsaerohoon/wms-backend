package com.musinsalogistics.wms.repository;

import com.musinsalogistics.wms.entity.InboundSchedule;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ActiveProfiles("test")
class InboundScheduleRepositoryTest {

    @Autowired
    InboundScheduleRepository inboundScheduleRepository;

    @Test
    void saveInboundScheduleTest() {
        InboundSchedule savedOne =
                inboundScheduleRepository.save(getInboundSchedule("ib-x1234"));

        assertThat(savedOne).isNotNull();
    }

    @Test
    @Transactional
    void getInboundScheduleByDocumentNumberTest() {
        String documentNumber = "ib-x1234";
        inboundScheduleRepository.save(getInboundSchedule(documentNumber));
        inboundScheduleRepository.flush();

        InboundSchedule foundOne =
                inboundScheduleRepository.findByInboundDocumentNumber(documentNumber);

        assertThat(foundOne).isNotNull();
        assertThat(foundOne.getInboundDocumentNumber()).isEqualTo(documentNumber);
    }

    private InboundSchedule getInboundSchedule(String documentNumber) {
        return InboundSchedule.builder()
                .inboundDocumentNumber(documentNumber)
                .inboundDocumentNumberDetail("inbound-x1234-detail")
                .itemCode("it01012323")
                .itemName("상품 it01012323")
                .build();
    }
}