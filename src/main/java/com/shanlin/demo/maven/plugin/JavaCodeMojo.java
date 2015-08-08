/**
 * 
 */
package com.shanlin.demo.maven.plugin;

import java.io.File;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * @author shanlin
 *
 */
@Mojo(name = "javacode", defaultPhase = LifecyclePhase.PROCESS_SOURCES)
public class JavaCodeMojo extends AbstractMojo {
	
    @Parameter( defaultValue = "${project.build.directory}", property = "outputDir", required = true )
    private File outputDir;
    
    @Parameter(defaultValue="${project.build.sourceDirectory}", property="sourceDir", required=true)
    private File sourceDir;
    
//	@Parameter(defaultValue="${project.build.resources}", property="resourcesDir", required=true)
//    private List<Reso> resourcesDir;
	
	/* (non-Javadoc)
	 * @see org.apache.maven.plugin.Mojo#execute()
	 */
	public void execute() throws MojoExecutionException, MojoFailureException {
		super.getLog().info("outputDir："+outputDir.getAbsolutePath());
	}

}
