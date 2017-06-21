package com.zxp.design;

public class CommandOff implements Command {
	private Tv myTv;
	public CommandOff(Tv tv){
		myTv=tv;
	}

	public void execute() {
		myTv.turnOff();
	}

}
