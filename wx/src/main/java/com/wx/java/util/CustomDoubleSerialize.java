package com.wx.java.util;

import java.io.IOException;
import java.text.DecimalFormat;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

/**
 * Double格式化
 */
public class CustomDoubleSerialize extends JsonSerializer<Double> {

	private DecimalFormat df = new DecimalFormat("##.00");
	
	@Override
	public void serialize(Double value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
		gen.writeString(df.format(value));
	}

}
