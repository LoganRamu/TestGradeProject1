package Learning.Log4j;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class PropertyConfiguratorLearning {

   static Logger logger= Logger.getLogger(PropertyConfiguratorLearning.class);//pageFactory method




   public static void main(String[] args) {
      PropertyConfigurator.configure("C:\\Users\\Admin\\IdeaProjects\\TestGradeProject1\\src\\test\\resources\\Log4j.properties");
       logger.debug("This is Debug");
       logger.info("This is info message");
       logger.warn("This is WARN message");
       logger.error("This is error message");
       logger.fatal("This is fatal message");



   }
}

