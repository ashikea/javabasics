package oops;

interface  whatsapp
{
	int a=90;
	void mute();
	void calls();
	void disconnect();
}

class videocall implements whatsapp
{

	@Override
	public void mute() {
		// TODO Auto-generated method stub
		System.out.println("This funtion mute for videocall");
		
	}

	@Override
	public void calls() {
		// TODO Auto-generated method stub
		System.out.println("This funtion calls for videocall");
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("This funtion disconnect for videocall");
	}
	
}

class audiocall implements whatsapp
{

	@Override
	public void mute() {
		// TODO Auto-generated method stub
		System.out.println("This funtion mute for audiocall");
		
	}

	@Override
	public void calls() {
		// TODO Auto-generated method stub
		System.out.println("This funtion calls for audiocall");
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("This funtion disconnect for audiocall");
		
	}
	
}

public class Interface_pgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		videocall v=new videocall();
//		v.calls();
//		v.disconnect();
//		v.mute();
//		
//		audiocall a=new audiocall();
//		a.calls();
//		a.disconnect();
//		a.mute();
		
		whatsapp w=new videocall();
		w.calls();
		w.disconnect();
		w.mute();
		w=new audiocall();
		w.calls();
		w.disconnect();
		w.mute();
		

	}

}
