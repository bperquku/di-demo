package guru.springframework.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

import guru.springframework.examplebeans.FakeDataSource;
import guru.springframework.examplebeans.FakeJmsBroker;

@Configuration
//@PropertySource({"classpath:datasource.properties","classpath:jms.properties"})
//@PropertySources({
//	@PropertySource("classpath:datasource.properties"),
//	@PropertySource("classpath:jms.properties")
//})
public class PropertyConfig {

	@Value("${guru.username}")
	String user;

	@Value("${guru.password}")
	String password;

	@Value("${guru.dburl}")
	String dburl;

	@Value("${guru.jms.username}")
	String jmsUsername;

	@Value("${guru.jms.password}")
	String jmsPassword;

	@Value("${guru.jms.url}")
	String jmsUrl;

	@Bean
	public FakeDataSource fakeDataSource() {
		FakeDataSource fakeDataSource = new FakeDataSource();
		fakeDataSource.setUser(user);
		fakeDataSource.setPassword(password);
		fakeDataSource.setUrl(dburl);
		return fakeDataSource;
	}

	@Bean
	public FakeJmsBroker fakeJmsBroker() {
		FakeJmsBroker jmsBroker = new FakeJmsBroker();
		jmsBroker.setUsername(jmsUsername);
		jmsBroker.setPassword(jmsPassword);
		jmsBroker.setUrl(jmsUrl);
		return jmsBroker;
	}

}
