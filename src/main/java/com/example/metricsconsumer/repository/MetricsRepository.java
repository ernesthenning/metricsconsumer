package com.example.metricsconsumer.repository;

import com.example.metricsconsumer.model.MetricEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MetricsRepository extends JpaRepository<MetricEntity, Long> {
}
