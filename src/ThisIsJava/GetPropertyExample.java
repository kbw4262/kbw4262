package ThisIsJava;
import java.util.Properties;
import java.util.Set;


public class GetPropertyExample {

	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		
		System.out.println("운영체제 : " + osName);
		System.out.println("사용자이름 : " + userName);
		System.out.println("사용자 홈디렉토리 : " + userHome);
		
		
		System.out.println("------------------------");
		System.out.println("[Key] value");
		System.out.println("------------------------");
		Properties props = System.getProperties();
		Set keys = props.keySet();
		for(Object obj : keys) {
			String key = (String)obj;
			String value = System.getProperty(key);
			System.out.println("["+key+"] "+value);
		}
		
		/*
		 *  자바 키
[java.specification.version] 16 // 버전
[sun.cpu.isalist] amd64 // CPU 아키텍쳐
[sun.jnu.encoding] MS949
[java.class.path] C:\Users\KBW\eclipse-workspace\Hello\bin;C:\Users\KBW\.p2\pool\plugins\org.junit.jupiter.api_5.7.1.v20210222-1948.jar;C:\Users\KBW\.p2\pool\plugins\org.junit.jupiter.engine_5.7.1.v20210222-1948.jar;C:\Users\KBW\.p2\pool\plugins\org.junit.jupiter.migrationsupport_5.7.1.v20210222-1948.jar;C:\Users\KBW\.p2\pool\plugins\org.junit.jupiter.params_5.7.1.v20210222-1948.jar;C:\Users\KBW\.p2\pool\plugins\org.junit.platform.commons_1.7.1.v20210222-1948.jar;C:\Users\KBW\.p2\pool\plugins\org.junit.platform.engine_1.7.1.v20210222-1948.jar;C:\Users\KBW\.p2\pool\plugins\org.junit.platform.launcher_1.7.1.v20210222-1948.jar;C:\Users\KBW\.p2\pool\plugins\org.junit.platform.runner_1.7.1.v20210222-1948.jar;C:\Users\KBW\.p2\pool\plugins\org.junit.platform.suite.api_1.7.1.v20210222-1948.jar;C:\Users\KBW\.p2\pool\plugins\org.junit.vintage.engine_5.7.1.v20210222-1948.jar;C:\Users\KBW\.p2\pool\plugins\org.opentest4j_1.2.0.v20190826-0900.jar;C:\Users\KBW\.p2\pool\plugins\org.apiguardian_1.1.0.v20190826-0900.jar;C:\Users\KBW\.p2\pool\plugins\org.junit_4.13.0.v20200204-1500.jar;C:\Users\KBW\.p2\pool\plugins\org.hamcrest.core_1.3.0.v20180420-1519.jar
[java.vm.vendor] Oracle Corporation
[sun.arch.data.model] 64
[user.variant] 
[java.vendor.url] https://java.oracle.com/
[java.vm.specification.version] 16
[os.name] Windows 10
[sun.java.launcher] SUN_STANDARD
[user.country] KR
[sun.boot.library.path] C:\Program Files\Java\jdk-16.0.1\bin
[sun.java.command] ThisIsJava.GetPropertyExample
[jdk.debug] release
[sun.cpu.endian] little
[user.home] C:\Users\KBW
[user.language] ko
[java.specification.vendor] Oracle Corporation
[java.version.date] 2021-04-20
[java.home] C:\Program Files\Java\jdk-16.0.1
[file.separator] \
[java.vm.compressedOopsMode] Zero based
[line.separator] 

[java.vm.specification.vendor] Oracle Corporation
[java.specification.name] Java Platform API Specification
[user.script] 
[sun.management.compiler] HotSpot 64-Bit Tiered Compilers
[java.runtime.version] 16.0.1+9-24
[user.name] KBW
[path.separator] ;
[os.version] 10.0
[java.runtime.name] Java(TM) SE Runtime Environment
[file.encoding] MS949
[java.vm.name] Java HotSpot(TM) 64-Bit Server VM
[java.vendor.url.bug] https://bugreport.java.com/bugreport/
[java.io.tmpdir] C:\Users\KBW\AppData\Local\Temp\
[java.version] 16.0.1
[user.dir] C:\Users\KBW\eclipse-workspace\Hello
[os.arch] amd64
[java.vm.specification.name] Java Virtual Machine Specification
[sun.os.patch.level] 
[java.library.path] C:\Program Files\Java\jdk-16.0.1\bin;C:\Windows\Sun\Java\bin;C:\Windows\system32;C:\Windows;C:/Program Files/Java/jdk-16.0.1/bin/server;C:/Program Files/Java/jdk-16.0.1/bin;C:\Program Files\Common Files\Oracle\Java\javapath;C:\Windows\system32;C:\Windows;C:\Windows\System32\Wbem;C:\Windows\System32\WindowsPowerShell\v1.0\;C:\Windows\System32\OpenSSH\;C:\Program Files (x86)\NVIDIA Corporation\PhysX\Common;C:\Program Files\NVIDIA Corporation\NVIDIA NvDLISR;C:\Program Files\Java\jdk-16.0.1\bin;C:\Program Files\Git\cmd;C:\Users\KBW\AppData\Local\Microsoft\WindowsApps;C:\Program Files\Bandizip\;C:\Users\KBW\AppData\Local\Programs\Microsoft VS Code\bin;C:\Windows\System32;;.
[java.vm.info] mixed mode, sharing
[java.vendor] Oracle Corporation
[java.vm.version] 16.0.1+9-24
[sun.io.unicode.encoding] UnicodeLittle
[java.class.version] 60.0
		 * 
		 */
		
	}
}
