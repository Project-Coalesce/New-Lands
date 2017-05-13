package com.coalesce.newlands.util;

import java.lang.reflect.Field;

public class ReflectionUtil {

	public static void setField(Field field, Object instance, Object value) throws IllegalAccessException {

		field.setAccessible(true);
		field.set(instance, value);
		field.setAccessible(false);

	}

}
