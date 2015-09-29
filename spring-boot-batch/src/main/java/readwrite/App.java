package readwrite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class App {
	
	private static final Logger logger = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {

		App obj = new App();
		if(args.length > 0){
			obj.run(args[0]);
		} else {
			logger.info("Invalid format. Please try the following...");
			logger.info("java -jar <jar name> <jobname>");
		}
		
		//obj.run("readMethod");

	}

	private void run(String jobName) {

		String[] springConfig = { "spring/batch/config/context.xml", "spring/batch/jobs/job-read-files.xml" };

		ApplicationContext context = new ClassPathXmlApplicationContext(springConfig);

		JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
		Job job = (Job) context.getBean(jobName);

		try {

			JobExecution execution = jobLauncher.run(job, new JobParameters());
			logger.info("Exit Status : " + execution.getStatus());
			if("FAILED".equalsIgnoreCase(execution.getStatus().toString())){
				logger.error("Exit Status : " + execution.getAllFailureExceptions());
			} else {
				logger.info("Exit Status : " + execution.getAllFailureExceptions());
			}
			

		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getStackTrace().toString());

		}

		logger.info("Done");

	}

}
