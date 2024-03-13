package com.browser;

public interface Browser {
	void start();
}
class Chrome implements Browser{
	@Override
	public void start() {
		System.out.println("Chrome Started");
	}
}
class Firefox implements Browser{
	@Override
	public void start() {
		System.out.println("Firefox Started");
	}
}
class Brave implements Browser{
	@Override
	public void start() {
		System.out.println("Brave Started");
	}
}

