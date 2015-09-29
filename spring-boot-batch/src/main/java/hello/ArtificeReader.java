package hello;


import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

public class ArtificeReader<T> implements ItemReader<Person>{

	@Override
	public Person read() throws Exception, UnexpectedInputException,
			ParseException, NonTransientResourceException {
		
		return new Person("Tridib", "Chakraborty");
	}

}
