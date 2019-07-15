package com.itbank.mvc07;

public class AppleTv implements Tv {

	/* (non-Javadoc)
	 * @see com.itbank.mvc07.Tv#powerOn()
	 */
	@Override
	public void powerOn(){
		System.out.println("애플 TV를 켜다.");
	}
	
	/* (non-Javadoc)
	 * @see com.itbank.mvc07.Tv#powerOff()
	 */
	@Override
	public void powerOff(){
		System.out.println("애플 TV를 끄다.");
	}
	
	/* (non-Javadoc)
	 * @see com.itbank.mvc07.Tv#volumeUp()
	 */
	@Override
	public void volumeUp(){
		System.out.println("애플 TV볼륨  Up");
	}
	
	/* (non-Javadoc)
	 * @see com.itbank.mvc07.Tv#volumnDown()
	 */
	@Override
	public void volumnDown(){
		System.out.println("애플 TV볼륨 Down");
	}
	
	
}
