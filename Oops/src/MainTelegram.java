public class MainTelegram {
	public static void main(String[] args) {
		Telegramv5 t = new Telegramv5();
		t.chat();
		t.call();
		t.VideoCall();
		t.Status();
//		Telegramv4 t = new Telegramv5();
//		t.Status();
	}
	static class Telegramv1{
		public void chat() {
			System.out.println("Chatting feature is available now");
		}
	}
	static class Telegramv2 extends Telegramv1{
		public void call() {
			System.out.println("Calling feature is available now");
		}
	}
	static class Telegramv3 extends Telegramv2{
		public void VideoCall() {
			System.out.println("Video Call feature is available now");
		}
	}
	static class Telegramv4 extends Telegramv3{
		public void Status() {
			System.out.println("Status feature is available now");
		}
	}
	static class Telegramv5 extends Telegramv4{
		@Override
		public void Status() {
			System.out.println("Pic/Video Status feature is available now");
		}
	}
}
