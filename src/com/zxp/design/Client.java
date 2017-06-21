package com.zxp.design;

public class Client {
	public static void main(String[] args){
		//命令接受者
		Tv myTv=new Tv();
		CommandOn on=new CommandOn(myTv);
		CommandOff off=new CommandOff(myTv);
		CommandChange channel=new CommandChange(myTv, 2);
	
		//解耦，执行
		Control control=new Control(on, off, channel);
		
		//请求
		control.turnOn();
		control.changeChannel();
		control.turnOff();
		
		//不是很明白Invoker存在的必要，感觉客户端可以直接调用cmmand.Execute就可以了（还能少写几行代码），为什么要创建一个调用者，然后在客户端再用调用者去调用。
		//如果是单个命令那么你说的那种没错但是如果需要做多个命令的组合、命令队列（包括对队列的操作）、增加命令日志、撤销重做 这些操作的时候就提现出Invoker的作用了命令模式关注的是对命令本身的处理
		
	}
}
