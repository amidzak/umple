/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.17.0.2716 modeling language!*/

package cruise.umple.compiler;

/**
 * @umplesource UmpleHelper.ump 36
 * @umplesource UmpleHelper_Code.ump 129
 */
// line 36 "../../../../src/UmpleHelper.ump"
// line 129 "../../../../src/UmpleHelper_Code.ump"
public class UmpleParserFactory
{
  @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
  public @interface umplesourcefile{int[] line();String[] file();int[] javaline();int[] length();}

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public UmpleParserFactory()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}
  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  //  @umplesourcefile(line={131},file={"UmpleHelper_Code.ump"},javaline={39},length={50})
  @umplesourcefile(line={132},file={"UmpleHelper_Code.ump"},javaline={40},length={25})
  public static UmpleParser create(String className) 
  {
    
    //FAST THAN REFLECTION, LOAD THE KNOWN IMPLEMENTORS
    if ("cruise.umple.compiler.UmpleInternalParser".equals(className) || "UmpleInternalParser".equals(className))
    {
      return new UmpleInternalParser();
    }
    else if ("cruise.umple.compiler.UmpleXtextParser".equals(className) || "UmpleXtextParser".equals(className))
    {
      return new UmpleXtextParser();
    }
  
    Object object = null;
    try 
    {
      Class<?> classDefinition = Class.forName(className);
      object = classDefinition.newInstance();
      return (UmpleParser)object;
    } 
    catch (Exception e) 
    { 
      return null;
    }
  }
  
  @umplesourcefile(line={158},file={"UmpleHelper_Code.ump"},javaline={67},length={4})
  public static UmpleParser create(String umpleParserName, UmpleModel model)
  {
    return create(umpleParserName,model,false);
  }
  
  @umplesourcefile(line={163},file={"UmpleHelper_Code.ump"},javaline={73},length={4})
  public static UmpleParser create(String umpleParserName, boolean failHardIfInvalid)
  {
    return create(umpleParserName,null,failHardIfInvalid);
  }
  
  @umplesourcefile(line={168},file={"UmpleHelper_Code.ump"},javaline={79},length={13})
  public static UmpleParser create(String umpleParserName, UmpleModel model, boolean failHardIfInvalid)
  {
    UmpleParser p = create(umpleParserName);
    if (p == null && failHardIfInvalid)
    {
      org.junit.Assert.fail("Unknown parser " + umpleParserName);
    }
    if (model != null)
    {
      p.setModel(model);
    }
    return p;
  }

}