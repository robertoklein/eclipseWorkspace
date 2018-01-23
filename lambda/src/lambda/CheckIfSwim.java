package lambda;

public class CheckIfSwim implements CheckTrait{

	@Override
	public boolean test(Animal a) {
		return a.canSwimM();
	}

}
