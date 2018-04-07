import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("dubbo---provider.xml");
		ctx.start();
		System.out.println("启动了服务方20888");
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		ctx.close();
	}
	
}
