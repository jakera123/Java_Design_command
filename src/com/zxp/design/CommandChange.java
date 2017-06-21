package com.zxp.design;

public class CommandChange implements Command {
	private Tv myTv;
	
	private int channel;
	
	public CommandChange(Tv tv,int channel){
		myTv=tv;
		//这里要加上this,否则不会产生变化！The assignment to variable has no effect
		this.channel=channel;
	}

	public void execute() {
		myTv.changeChannel(channel);

	}

}
