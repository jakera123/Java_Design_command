package com.zxp.design;

public class Tv {
	public int currentChannel=0;
	public void turnOn(){
		System.out.println("The television is on");
	}
	public void turnOff(){
		System.out.println("The television is off");
	}
	public void changeChannel(int channel){
		this.currentChannel=channel;
		System.out.println("Now TV channel is"+channel);
	}
	
}
