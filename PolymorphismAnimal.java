package july;

public class PolymorphismAnimal 
{
	
		  public void animalSound() {
		    System.out.println("The animal makes a sound");
		  }
		

		class Pig extends PolymorphismAnimal {
		  public void animalSound() {
		    System.out.println("The pig says: wee wee");
		  }
		}

		class Dog extends PolymorphismAnimal {
		  public void animalSound() {
		    System.out.println("The dog says: bow wow");
		  }
		}
		public static void main(String []args)
		{
			PolymorphismAnimal anil= new PolymorphismAnimal();
			anil.animalSound();
			PolymorphismAnimal sound=new PolymorphismAnimal();
			sound.animalSound();
			PolymorphismAnimal mydog= new PolymorphismAnimal();
			mydog.animalSound();
			
			

}
}