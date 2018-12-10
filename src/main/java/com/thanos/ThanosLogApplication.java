package com.thanos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ThanosLogApplication {

//	@RequestMapping("/log/{level}")
//	public void writeLog(@PathVariable String level){
//		Logger logger = LogManager.getRootLogger();
//		System.out.println("-----------------------------------------current level: "+logger.getLevel());
//		logger.info("------------------------------------------------INFO");
//		logger.debug("-----------------------------------------------DEBUG");
//		logger.error("-----------------------------------------------ERROR");
//
//		Level l = Level.toLevel(level);
//		logger.setLevel(l);
//	}

    private Logger log = LoggerFactory.getLogger(ThanosLogApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ThanosLogApplication.class, args);
    }

}
