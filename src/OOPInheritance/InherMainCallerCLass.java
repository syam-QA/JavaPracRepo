package OOPInheritance;

public class InherMainCallerCLass 
{

	public static void main(String[] args) 
	{
     ChildOneClassBMW bmw= new ChildOneClassBMW();
     bmw.start();
     bmw.stop();
     bmw.refuel();
     bmw.autoPark();
     bmw.engine();
     ParentOneClassCar pc =new ParentOneClassCar();
     pc.start();
     
     ChlidTwoClassAudio AU = new ChlidTwoClassAudio();
     AU.start();
     AU.stop();
     AU.refuel();
     AU.antiTheif();
     AU.engine();
     //Child class object can be referred by parent class ref variable it is called Top casting in terms of class to class,By this method only inhertaded and override method can be accessed
     
     ParentOneClassCar pc1 = new ChildOneClassBMW(); 
     pc1.start();
     
	}

}
