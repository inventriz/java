package readwrite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class ArtificeTasklet implements Tasklet{
	
	private static final Logger logger = LoggerFactory.getLogger(ArtificeTasklet.class);

	@Override
	public RepeatStatus execute(StepContribution arg0, ChunkContext arg1)
			throws Exception {

		logger.info("Processing tasklet");
		
		return RepeatStatus.FINISHED;
	}
	
	public void copyImageFromFTP() throws Exception {
		logger.info("Image is copied from FTP to Processed folder");
		throw new Exception("test exception to test logging");
	}
	
	public void getTcinFormage() {
		logger.info("TCIN is fetched for an Image");
	}

}
