package com.zxp.design;

public class CommandChange implements Command {
	private Tv myTv;
	
	private int channel;
	
	public CommandChange(Tv tv,int channel){
		myTv=tv;
		//����Ҫ����this,���򲻻�����仯��The assignment to variable has no effect
		this.channel=channel;
	}

	public void execute() {
		myTv.changeChannel(channel);

	}

}
