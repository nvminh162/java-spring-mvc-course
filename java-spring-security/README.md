## Required Library @nvminh162 for Spring Security

To use Spring Boot's web features, add the following dependency to your `pom.xml`:

```xml
<!-- spring-boot-starter-web: Thư viện cốt lõi để xây dựng ứng dụng web và RESTful API
     - Tự động cấu hình Spring MVC và máy chủ Tomcat nhúng
     - Hỗ trợ xử lý HTTP request/response và chuyển đổi JSON
     - Sử dụng: Thêm @Controller/@RestController và các annotation như @GetMapping, @PostMapping
     - Không cần cấu hình thêm, hoạt động ngay sau khi thêm vào pom.xml -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
```

```xml
<!-- spring-boot-devtools: Công cụ hỗ trợ phát triển, tăng hiệu quả coding
     - Tự động khởi động lại ứng dụng khi code thay đổi
     - Live reload: Tự động làm mới trình duyệt khi resources/templates thay đổi
     - Vô hiệu hóa cache trong quá trình phát triển
     - Thuộc tính optional=true đảm bảo devtools không được đưa vào môi trường production
     - Sử dụng: Không cần cấu hình gì thêm, đặt breakpoints trong IDE để debug -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-devtools</artifactId>
    <optional>true</optional>
</dependency>
```
