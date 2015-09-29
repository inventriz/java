package hello;

import java.util.List;


import org.springframework.batch.item.ItemWriter;


public class ArtificeWriter<T> implements ItemWriter<Person>{

	@Override
	public void write(List<? extends Person> arg0) throws Exception {
		for(Person p : arg0 ){
			System.out.println(p.toString());
		}
		
	}

}
