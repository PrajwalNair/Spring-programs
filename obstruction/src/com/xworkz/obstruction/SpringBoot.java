package com.xworkz.obstruction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.obstruction.configuration.SpringConfiguration;
import com.xworkz.obstruction.service.FacebookService;
import com.xworkz.obstruction.service.InstagramService;
import com.xworkz.obstruction.service.MilitaryService;
import com.xworkz.obstruction.service.OmegleService;
import com.xworkz.obstruction.service.SavanService;
import com.xworkz.obstruction.service.SnapChatService;
import com.xworkz.obstruction.service.TikTokService;
import com.xworkz.obstruction.service.WeChatService;
import com.xworkz.obstruction.service.WhatsAppService;
import com.xworkz.obstruction.service.WynkService;

public class SpringBoot {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		MilitaryService bean = context.getBean(MilitaryService.class);
		bean.validateAndSave(null);
		FacebookService bean1 = context.getBean(FacebookService.class);
		bean1.validateAndSave(null);
		WhatsAppService bean2 = context.getBean(WhatsAppService.class);
		bean2.validateAndSave(null);
		InstagramService bean3 = context.getBean(InstagramService.class);
		bean3.validateAndSave(null);
		SnapChatService bean4 = context.getBean(SnapChatService.class);
		bean4.validateAndSave(null);
		OmegleService bean5 = context.getBean(OmegleService.class);
		bean5.validateAndSave(null);
		WeChatService bean6 = context.getBean(WeChatService.class);
		bean6.validateAndSave(null);
		TikTokService bean7 = context.getBean(TikTokService.class);
		bean7.validateAndSave(null);
		WynkService bean8 = context.getBean(WynkService.class);
		bean8.validateAndSave(null);
		SavanService bean9 = context.getBean(SavanService.class);
		bean9.validateAndSave(null);

	}

}
