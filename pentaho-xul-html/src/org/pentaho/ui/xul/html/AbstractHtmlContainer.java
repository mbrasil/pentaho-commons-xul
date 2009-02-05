package org.pentaho.ui.xul.html;

import org.pentaho.ui.xul.XulComponent;
import org.pentaho.ui.xul.XulContainer;
import org.pentaho.ui.xul.html.tags.transmenu.HtmlElement;
import org.pentaho.ui.xul.util.Align;

public abstract class AbstractHtmlContainer extends HtmlElement implements XulContainer{

  protected Align alignment;
  
  public AbstractHtmlContainer(String tagName){
    super(tagName);
  }

  public Align getAlign() {
    return this.alignment;
  }

  public void setAlign(String align) {
    try{
      this.alignment = Align.valueOf(align.toUpperCase());
    } catch(Exception e){
      System.out.println("could not parse ["+align+"] as Align value"); 
    }  
  }



  @Deprecated
  public void addComponent(XulComponent component) {
    this.addChild(component);
  }
  
  @Deprecated
  public void addComponentAt(XulComponent component, int idx) {
    this.addChildAt(component, idx);  
  }

  @Deprecated
  public void removeComponent(XulComponent component) {
    this.removeChild(component);
  }
}

  