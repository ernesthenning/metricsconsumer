package com.example.metricsconsumer.service;

import com.example.metricsconsumer.model.Metric;
import com.example.metricsconsumer.model.MetricEntity;
import com.example.metricsconsumer.repository.MetricsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MetricsService {

    private final MetricsRepository repository;

    public MetricEntity save(Metric metric) {
        MetricEntity metricEntity = new MetricEntity();
        metricEntity.setTag(metric.tag());
        metricEntity.setValue(metric.value().toString());
        return repository.save(metricEntity);
    }

    public List<MetricEntity> getAllMetrics() {
        return repository.findAll();
    }

    public MetricEntity getMetric(long id) {
        return repository.findById(id).orElse(null);
    }

}
