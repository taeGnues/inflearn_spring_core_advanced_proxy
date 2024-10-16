package hello.proxy;

import hello.proxy.config.AppV1Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import(AppV1Config.class)
@SpringBootApplication(scanBasePackages = "hello.proxy.app") //주의
public class ProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProxyApplication.class, args);
	}

}

/**
 * Spring Bean을 @Import를 통해 수동등록한다.
 * AppV1Config 자체를 Spring Bean에 알려줘야지,
 * Config 내 Bean들도 인식해서 등록될 수 있다.
 * (현재 scanBasePackages에 의해서 hello.proxy.app 패키지 내만 Component 스캔을 진행함.
 * 즉, hello.proxy.config의 AppV1Config는 스캔을 못하므로 Import를 통해 별도로 등록해야함.
 */