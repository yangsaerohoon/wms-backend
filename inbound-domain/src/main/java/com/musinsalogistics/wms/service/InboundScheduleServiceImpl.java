package com.musinsalogistics.wms.service;

import com.musinsalogistics.wms.entity.InboundSchedule;
import com.musinsalogistics.wms.repository.InboundScheduleRepository;
import org.springframework.stereotype.Service;

@Service
public class InboundScheduleServiceImpl implements InboundScheduleService {

    private final InboundScheduleRepository inboundScheduleRepository;

    public InboundScheduleServiceImpl(InboundScheduleRepository inboundScheduleRepository) {
        this.inboundScheduleRepository = inboundScheduleRepository;
    }

    @Override
    public InboundSchedule createInboundSchedule(InboundSchedule inboundSchedule) {
        return inboundScheduleRepository.save(inboundSchedule);
    }
}
