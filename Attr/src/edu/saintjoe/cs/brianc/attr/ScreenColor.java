package edu.saintjoe.cs.brianc.attr;

public class ScreenColor {
	
	// A ScreenColor object has two fields (data members)
	private int colorValue;
	private String description;

	
	public ScreenColor(Object colorDescription) {
		description = (String) colorDescription;
	    colorValue = encode(colorDescription);
	    }
	  
	  private int encode(Object colorDescription) {
		  if (colorDescription.equals("transparent"))
			  // This is a bogus value!!
			  return (colorValue = 0x000000);
		  else if (colorDescription.equals("crimson"))
			  return (colorValue = 0xff0000);
		  else if (colorDescription.equals("chartreuse"))
			  return (colorValue = 0x64FE2E);
		  // We have to return something; this isn't really the right way to do it!
		  return 0;
	  	  }		
		  public String toString(){
			  return description;
		  
	  }

	}
