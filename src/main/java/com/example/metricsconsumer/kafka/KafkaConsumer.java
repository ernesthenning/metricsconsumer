package com.example.metricsconsumer.kafka;

import com.example.metricsconsumer.model.Metric;
import com.example.metricsconsumer.service.MetricsService;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;


@Slf4j
@Component
@RequiredArgsConstructor
public class KafkaConsumer {

    private final MetricsService service;
    @KafkaListener(topics="metrics-topic", groupId="metrics-consumer")
    public void listenTopic(Metric metric) {
        log.info("Metric {} successfully read", metric);
        service.save(metric);
    }
}
