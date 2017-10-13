public class ObjetA{
  protected ObjetC obj = new ObjetC();
  protected ObjetD[] objD = new ObjetD[10];
 
  public ObjetC getObject(){
    return obj;
  } 
  public ObjetD[] getObjectD(){
    return objD;
  }
}