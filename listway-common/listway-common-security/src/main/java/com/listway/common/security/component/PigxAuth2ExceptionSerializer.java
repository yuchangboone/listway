/*
 *    Copyright (c) 2018-2025, lengleng All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 * Neither the name of the pig4cloud.com developer nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 * Author: lengleng (wangiegie@gmail.com)
 */

package com.listway.common.security.component;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.listway.common.security.exception.PigxAuth2Exception;

import java.io.IOException;

/**
 * @author lengleng
 * @date 2018/11/16
 * <p>
 * OAuth2 异常格式化
 */
public class PigxAuth2ExceptionSerializer extends StdSerializer<PigxAuth2Exception> {
	public PigxAuth2ExceptionSerializer() {
		super(PigxAuth2Exception.class);
	}

	@Override
	public void serialize(PigxAuth2Exception value, JsonGenerator gen, SerializerProvider provider) throws IOException {
		gen.writeStartObject();
		gen.writeObjectField("code", 1);
		gen.writeStringField("message", value.getMessage());
		gen.writeStringField("data", value.getOAuth2ErrorCode());
		gen.writeEndObject();
	}
}
