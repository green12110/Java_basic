package day23_thread;

public class ThreadTest {
	public static void main(String[] args) {
		MyThread mm = new MyThread();
		mm.run();
		mm.run();
		mm.run();
	}

}
