//package com.pjm.boot3demo1.feign;
//
//import com.pjm.boot3demo1.common.CommonResponse;
////import com.pjm.boot3demo1.feign.fallback.DemoFeignClientFallback;
//import com.pjm.boot3demo1.model.UserInfo;
//import org.springframework.cloud.openfeign.FeignAutoConfiguration;
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.stereotype.Component;
//import org.springframework.web.bind.annotation.PostMapping;
//
//@FeignClient(name = "DemoFeignClient",contextId = "DemoFeignClient",
//        url = "http://127.0.0.1:11000"
////        , path = "user", fallback = DemoFeignClientFallback.class, configuration = FeignAutoConfiguration.class
//)
//public interface DemoFeignClient {
//
//    @PostMapping("/demo/1")
//    String getUserInfo();
//}
