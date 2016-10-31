package test;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Method> lst = new ArrayList<Method>();
		
		addonMethod(lst, element.class.getMethods());
		addonMethod(lst, invocation.class.getMethods());
		
		for (Method m :lst)
		{
			CanRun annos = m.getAnnotation(CanRun.class);
			
			if (annos != null && annos.packet().equalsIgnoreCase("F"))
            {
                try {
                    m.invoke(annos.s());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
		}
    }
	
	public static void addonMethod(ArrayList<Method> tab, Method[] add)
	{
		for (Method a : add)
		{
			tab.add(a);
		}
	}
}
