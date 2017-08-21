package core.runtime;

import java.lang.reflect.Field;
import java.util.Stack;

import org.apache.commons.lang3.ClassUtils;

import core.annotation.Validable;
import external.exceptions.GeneralValidationException;

public class UniversalValidator{

	public static <T> void validate(T validable) throws GeneralValidationException{
		
		Stack<Class<? extends Object>> classHierarchy = new Stack<Class<? extends Object>>();
		
		Class<? extends Object> clazz = validable.getClass();
		
		classHierarchy = fillValidableStack(clazz, classHierarchy);
		
		if (classHierarchy.isEmpty()){
			//No validable class!!!! Why you call it in the first place?
			throw new GeneralValidationException();
		}
		
		while (classHierarchy.size()>0){
		
			clazz = classHierarchy.pop();
			
			for(Field field:  clazz.getDeclaredFields()){
				
				if (!ClassUtils.isPrimitiveOrWrapper(field.getType())){
					
				}
				
			}
		}
	}
	
	static Stack<Class<? extends Object>> fillValidableStack(Class<? extends Object> clazz, Stack<Class<? extends Object>> classHierarchy){
		
		if (clazz.isAnnotationPresent(Validable.class)){
			
			classHierarchy.push(clazz);
			fillValidableStack(clazz.getSuperclass(), classHierarchy);	
		}		
		return classHierarchy;
	}
}
