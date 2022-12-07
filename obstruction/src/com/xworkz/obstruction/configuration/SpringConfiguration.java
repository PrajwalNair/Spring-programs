package com.xworkz.obstruction.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.obstruction.repository.FacebookRepository;
import com.xworkz.obstruction.repository.FacebookRepositoryImpl;
import com.xworkz.obstruction.repository.InstagramRepository;
import com.xworkz.obstruction.repository.InstagramRepositoryImpl;
import com.xworkz.obstruction.repository.MilitaryRepository;
import com.xworkz.obstruction.repository.MilitaryRepositoryImpl;
import com.xworkz.obstruction.repository.OmegleRepository;
import com.xworkz.obstruction.repository.OmegleRepositoryImpl;
import com.xworkz.obstruction.repository.SavanRepository;
import com.xworkz.obstruction.repository.SavanRepositoryImpl;
import com.xworkz.obstruction.repository.SnapChatRepository;
import com.xworkz.obstruction.repository.SnapChatRepositoryImpl;
import com.xworkz.obstruction.repository.TikTokRepository;
import com.xworkz.obstruction.repository.TikTokRepositoryImpl;
import com.xworkz.obstruction.repository.WeChatRepository;
import com.xworkz.obstruction.repository.WeChatRepositoryImpl;
import com.xworkz.obstruction.repository.WhatsAppRepository;
import com.xworkz.obstruction.repository.WhatsAppRepositoryImpl;
import com.xworkz.obstruction.repository.WynkRepository;
import com.xworkz.obstruction.repository.WynkRepositoryImpl;

@Configuration
@ComponentScan("com.xworkz")
public class SpringConfiguration {
	@Bean
	public MilitaryRepository militaryRepository() {
		return new MilitaryRepositoryImpl();
	}

	@Bean
	public FacebookRepository facebookRepository() {
		return new FacebookRepositoryImpl();
	}

	@Bean
	public WhatsAppRepository whatsAppRepository() {
		return new WhatsAppRepositoryImpl();
	}

	@Bean
	public InstagramRepository instagramRepository() {
		return new InstagramRepositoryImpl();
	}

	@Bean
	public SnapChatRepository snapChatRepository() {
		return new SnapChatRepositoryImpl();
	}

	@Bean
	public OmegleRepository omegleRepository() {
		return new OmegleRepositoryImpl();
	}

	@Bean
	public WeChatRepository weChatRepository() {
		return new WeChatRepositoryImpl();
	}

	@Bean
	public TikTokRepository tikTokRepository() {
		return new TikTokRepositoryImpl();
	}
	
	@Bean
	public WynkRepository wynkRepository() {
		return new WynkRepositoryImpl();
	}
	
	@Bean
	public SavanRepository savanRepository() {
		return new SavanRepositoryImpl();
	}

}
