package com.zxp.design;

public class Client {
	public static void main(String[] args){
		//���������
		Tv myTv=new Tv();
		CommandOn on=new CommandOn(myTv);
		CommandOff off=new CommandOff(myTv);
		CommandChange channel=new CommandChange(myTv, 2);
	
		//���ִ��
		Control control=new Control(on, off, channel);
		
		//����
		control.turnOn();
		control.changeChannel();
		control.turnOff();
		
		//���Ǻ�����Invoker���ڵı�Ҫ���о��ͻ��˿���ֱ�ӵ���cmmand.Execute�Ϳ����ˣ�������д���д��룩��ΪʲôҪ����һ�������ߣ�Ȼ���ڿͻ������õ�����ȥ���á�
		//����ǵ���������ô��˵������û���������Ҫ������������ϡ�������У������Զ��еĲ�����������������־���������� ��Щ������ʱ������ֳ�Invoker������������ģʽ��ע���Ƕ������Ĵ���
		
	}
}
