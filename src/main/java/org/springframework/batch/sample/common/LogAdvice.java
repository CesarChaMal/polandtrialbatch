
package org.springframework.batch.sample.common;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Wraps calls for 'Processing' methods which output a single Object to write
 * the string representation of the object to the log.
 * 
 * @author Lucas Ward
 */
public class LogAdvice {
    private static Log log = LogFactory.getLog(LogAdvice.class);

    public void doStronglyTypedLogging(Object item){
    	log.info("Processed: " + item);
    }
}
