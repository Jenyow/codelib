package com.codelib.webservice.sample.weather.ws.server;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.com.webxml.ArrayOfString;
import cn.com.webxml.WeatherWS;
import cn.com.webxml.WeatherWSSoap;

public class ClientTest {
	
	private static final Logger logger = LoggerFactory.getLogger(ClientTest.class); 

	public static void main(String[] args) {
		
		WeatherWS weatherWS = new WeatherWS();
		WeatherWSSoap weatherWSSoap = weatherWS.getWeatherWSSoap();
		ArrayOfString weather = weatherWSSoap.getWeather("高州", null);
		List<String> list = weather.getString();
		for (String string : list) {
			logger.info(string);
		}
	}

}
