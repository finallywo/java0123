package java0123;
import abcd.Person;


public class A {
	public static int add(int a,int b){
		int c=a+b;
		return c;
	}
	public static void fun(int a){
		a=100;
	}
	public static void fun2(Person person){
		person.setAge(100);
	}
	public static void main(String[] args){
		int a=0;
		a=a++;
		System.out.println(a);
	/*	switch (i){
			case 1:
				System.out.println("111");
				break;
			case 2:
				System.out.println("222");
				break;
			case 3:
				System.out.println("333");
				break;
			default:
				System.out.println("4444");
		
		}*/
		/*int a=10;
		fun(a);
		Person person=new Person();
		System.out.println(person);
		person.setAge(10);
		fun2(person);
		System.out.println(a);
		System.out.println(person.getAge());*/
		/*Person p1=new Person();
		Person p2=new Person();
		p1.setName("p1");
		p2.setName("p2");

		System.out.println(p1.getName());
		System.out.println(p2.getName());*/
		/*if(表达式(结果是boolean类型)){
			代码块1
		}
		如果表达式为真 则运行代码块1
		if(表达式(结果是boolean类型)){
			代码块1
		}else{
			代码块2
		}
		如果表达式为真 则运行代码块1 如果表达式为假运行代码块2
		if(表达式(结果是boolean类型)){
			代码块1
		}else if(表达式(结果是boolean类型)){
		
		}else if(表达式(结果是boolean类型)){
		
		}else{
		
		}
		*/
		/*
		 * 循环和我们的js写法也是一致的
		 * while(表达式){
		 * 	当表达式值为真的时候  会执行代码块
		 * }
		 * 
		 * 
		 * 
		 * */
		
		// 循环三要素   1 循环变量(计数器) 2 循环条件  3 更新计数器
		/*int i=1;
		while(i<=25){
			System.out.println("跑了"+i);
			i++;
		}*/
		/*for(int i=1;i<=25;i++){
			System.out.println("跑了"+i);
		}*/
		/*
		 * 通过类创建对象的方式   
		 * 
		 * 数据类型  变量名=new 构造方法();
		 * 
		 * 
		 * */
		
	}
}
