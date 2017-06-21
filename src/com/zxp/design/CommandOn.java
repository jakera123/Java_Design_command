package com.zxp.design;

public class CommandOn implements Command {
	private Tv myTv;
	public CommandOn(Tv Tv){
		myTv=Tv;
	}
	public void execute() {
	  myTv.turnOn();
	}

}
