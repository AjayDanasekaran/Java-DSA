package com.browser;

public class BrowserFactory {
	public static Browser getBrowser(int choice) {
		Browser b;
		if(choice==1) {
			b = new Chrome();
		}
		else if(choice==2) {
			b = new Firefox();
		}
		else if(choice==3) {
			b = new Brave();
		}
		else {
			b = null;
		}
		return b;
	}
}
