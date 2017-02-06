package day27;

import java.lang.reflect.Field;

public class Tool {
	public void setProperty(Object obj, String propertName, Object value) throws Exception {
		Class clazz = obj.getClass();
		Field f = clazz.getDeclaredField(propertName);
		f.setAccessible(true);
		f.set(obj, value);
		
	}
}
