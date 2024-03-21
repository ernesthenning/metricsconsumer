# Потребитель метрик
Данный сервис получает метрики от сервиса-поставщика с помощью Kafka и сохраняет в базе данных.

### Запуск сервиса
- Запустите Kafka по адресу localhost:9092
- Запустите приложение командами:
   - cd metricsconsumer
   - mvn spring-boot:run
- Альтернативно можно запустить приложение через IDE путем запуска файла MetricsconsumerApplication.java
### Описание API
#### Get
- /metrics - возвращает все записи о метриках, сохраненные в базе данных
- /metrics/{id} - позволяет получить запись по известному id

