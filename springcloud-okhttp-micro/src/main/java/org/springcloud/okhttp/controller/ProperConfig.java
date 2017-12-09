package org.springcloud.okhttp.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="singleton")
public class ProperConfig {

	// config 要与配置相同
	private ConfigBean config = new ConfigBean();

	public ConfigBean getConfig() {
		return config;
	}

	public void setConfig(ConfigBean config) {
		this.config = config;
	}
	
}
