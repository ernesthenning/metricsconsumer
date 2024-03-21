package com.example.metricsconsumer.controller;

import com.example.metricsconsumer.model.MetricEntity;
import com.example.metricsconsumer.service.MetricsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/metrics")
@RequiredArgsConstructor
public class MetricsController {

    private final MetricsService service;
    @GetMapping
    public ResponseEntity<List<MetricEntity>> getAll() {
        return ResponseEntity.ok(service.getAllMetrics());
    }

    @GetMapping("/{id}")
    public ResponseEntity<MetricEntity> get(@PathVariable("id") Long id) {
        return ResponseEntity.ok(service.getMetric(id));
    }


}
