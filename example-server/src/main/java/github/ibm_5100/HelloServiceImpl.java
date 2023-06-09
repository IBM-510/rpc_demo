package github.ibm_5100;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author shuang.kou
 * @createTime 2020年05月10日 07:52:00
 */
public class HelloServiceImpl implements HelloService {
    private static final Logger logger = LoggerFactory.getLogger(HelloServiceImpl.class);

    @Override
    public String Hello(Hello hello) {
        logger.info("HelloServiceImpl收到: {}.", hello.getMessage());
        String result = "Hello description is " + hello.getDescription();
        logger.info("HelloServiceImpl返回: {}.", result);
        return result;
    }
}
