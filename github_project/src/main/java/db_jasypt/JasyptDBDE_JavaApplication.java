package db_jasypt;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;

//복호화
public class JasyptDBDE_JavaApplication {

	public static void main(String[] args) {
		SimpleStringPBEConfig config =  new SimpleStringPBEConfig();
		config.setPoolSize(1);
		config.setPassword("1234");
		
		StandardPBEStringEncryptor jasypt = new StandardPBEStringEncryptor();
		jasypt.setConfig(config);
		
		System.out.println(jasypt.decrypt("k/+D9WUWUczB8V7U+qbWP5fGWh9OqyULkRGzT7Er8pGuNjSQjFKPVQ=="));
		System.out.println(jasypt.decrypt("rcGffN2pssAbpvFmL2jVHzsGXGrWsQiCZmpxWNcgRduL7G7ATYUMCZnWkMrkye5h"));
		System.out.println(jasypt.decrypt("OcDnKZ0xpqgGOOP4/norz/V0KkkO+wzG"));
		System.out.println(jasypt.decrypt("frky4j271KxyOR8u7cEDzcx/fblB/kYl"));

	}

}
