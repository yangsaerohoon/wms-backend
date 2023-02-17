package com.musinsalogistics.wms.repository;

import com.musinsalogistics.wms.entity.InboundSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InboundScheduleRepository extends JpaRepository<InboundSchedule, Long> {

    InboundSchedule findByInboundDocumentNumber(String inboundDocumentNumber);
}
