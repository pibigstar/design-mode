package com.pibigstar.备忘录模式;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 遍历集合中的值
 * @author pibigstar
 *
 */
public class BeanUtils {
	public static Map<String, Object> backupProp(Object bean){  
		Map<String, Object> result = new HashMap<String, Object>();  
		try{  
			BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());  
			PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();  
			for(PropertyDescriptor des: descriptors){  
				String fieldName = des.getName();  
				Method getter = des.getReadMethod();  
				Object fieldValue = getter.invoke(bean, new Object[]{});  
				if(!fieldName.equalsIgnoreCase("class")){  
					result.put(fieldName, fieldValue);  
				}  
			}  

		}catch(Exception e){  
			e.printStackTrace();  
		}  
		return result;  
	}  

	public static void restoreProp(Object bean, Map<String, Object> propMap){  
		try {  
			BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());  
			PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();  
			for(PropertyDescriptor des: descriptors){  
				String fieldName = des.getName();  
				if(propMap.containsKey(fieldName)){  
					Method setter = des.getWriteMethod();  
					setter.invoke(bean, new Object[]{propMap.get(fieldName)});  
				}  
			}  
		} catch (Exception e) {  
			e.printStackTrace();  
		}  
	}  
}
