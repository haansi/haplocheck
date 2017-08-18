package genepi.mitolib;

import java.lang.reflect.InvocationTargetException;

import genepi.base.Toolbox;
import genepi.mitolib.contChecker.ContaminatonChecker;
import genepi.mitolib.splitter.HeteroplasmySplitter;


public class Tools extends Toolbox {

	public Tools(String command, String[] args) {
		
		super(command, args);
		
	}
	
	public static void main (String[] args){
		
		if (args.length == 0) {
	        System.out.println("No arguments provided");
	      }else if (args.length > 0) {
	    	Tools tools = new Tools("java -jar mitolib.jar", args);
			
			tools.addTool("splitter", HeteroplasmySplitter.class);
			tools.addTool("contChecker", ContaminatonChecker.class);
			
			try {
				tools.start();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	
	}

}
