package org.tefreestone.CloudConfigServer;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Profile("local")
public class CloudConfigServerApplicationTests {

	@Test
	@Ignore
	public void contextLoads() {
	}

}
