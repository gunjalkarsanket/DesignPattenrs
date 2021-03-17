
public class Client {

	public static void main(String args[]){
		Factory mercedesfactory=new MercedesFactory();
		System.out.println(mercedesfactory.makeHeadLight());
		System.out.println(mercedesfactory.makeTire());
		Factory audiFactory=new AudiFactory();
		System.out.println(audiFactory.makeHeadLight());
		System.out.println(audiFactory.makeTire());
		
	}
}
