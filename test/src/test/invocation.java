package test;

public class invocation {

	@CanRun(packet="F", s=invocation.class)
	public static void ninja()
	{
		System.out.println("ninja");
	}
	
	@CanRun(packet="F", s=invocation.class)
	public static void samourai()
	{
		System.out.println("samourai");
	}
}
