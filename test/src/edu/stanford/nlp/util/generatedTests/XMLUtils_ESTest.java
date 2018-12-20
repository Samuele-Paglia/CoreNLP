/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 06 09:44:20 GMT 2018
 */

package edu.stanford.nlp.util;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import edu.stanford.nlp.objectbank.ObjectBank;
import edu.stanford.nlp.sequences.SeqClassifierFlags;
import edu.stanford.nlp.util.Triple;
import edu.stanford.nlp.util.XMLUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.nio.CharBuffer;
import java.util.List;
import java.util.Properties;
import java.util.Stack;
import java.util.Vector;
import javax.xml.parsers.DocumentBuilder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;
import org.w3c.dom.Element;
import org.xml.sax.SAXParseException;
 
public class XMLUtils_ESTest extends XMLUtils_ESTest_scaffolding {

	@Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XMLUtils.XMLTag xMLUtils_XMLTag0 = XMLUtils.parseTag("&sup3;");
      assertNull(xMLUtils_XMLTag0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XMLUtils.XMLTag xMLUtils_XMLTag0 = null;
      try {
        xMLUtils_XMLTag0 = new XMLUtils.XMLTag(")Zt1?)S0<f");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Tag did not start with <
         //
         verifyException("edu.stanford.nlp.util.XMLUtils$XMLTag", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = XMLUtils.escapeAttributeXML("n2N~4LJ(}J!+%IHpWe");
      assertEquals("n2N~4LJ(}J!+%IHpWe", string0);
  }
  @Ignore
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ObjectBank.PathToFileFunction objectBank_PathToFileFunction0 = new ObjectBank.PathToFileFunction();
      MockFile mockFile0 = (MockFile)objectBank_PathToFileFunction0.apply("");
      List<String> list0 = XMLUtils.getTextContentFromTagsFromFile(mockFile0, "");
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ObjectBank.PathToFileFunction objectBank_PathToFileFunction0 = new ObjectBank.PathToFileFunction();
      File file0 = objectBank_PathToFileFunction0.apply("");
      List<Element> list0 = XMLUtils.getTagElementsFromFile(file0, "");
      assertTrue(list0.isEmpty());
  }

  @Ignore
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      List<Triple<String, Element, String>> list0 = XMLUtils.getTagElementTriplesFromFile(mockFile0, "GWhw<} ");
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = XMLUtils.unescapeStringForXML("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      String string0 = XMLUtils.readUntilTag(stringReader0);
      assertEquals("", string0);
  }
  @Ignore
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockFile mockFile0 = new MockFile(")l/:c96", "");
      List<String> list0 = XMLUtils.getTextContentFromTagsFromFile(mockFile0, "~|5]G4Ylj(=q8$w;2Qn");
      assertEquals(0, list0.size());
  }
  @Ignore
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ObjectBank.PathToFileFunction objectBank_PathToFileFunction0 = new ObjectBank.PathToFileFunction();
      MockFile mockFile0 = (MockFile)objectBank_PathToFileFunction0.apply("eCPf+!J|aHtX>N");
      List<Element> list0 = XMLUtils.getTagElementsFromFile(mockFile0, "");
      assertEquals(0, list0.size());
  }
}
