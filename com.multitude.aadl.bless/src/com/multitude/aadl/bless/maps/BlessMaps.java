package com.multitude.aadl.bless.maps;

import java.util.HashMap;
import java.util.Map;

import org.osate.aadl2.DataClassifier;

import com.multitude.aadl.bless.bLESS.NamedAssertion;
import com.multitude.aadl.bless.bLESS.TypeDeclaration;
import com.multitude.aadl.bless.bLESS.UnitName;
import com.multitude.aadl.bless.bLESS.Variable;

public class BlessMaps {

  private static Map<String, TypeDeclaration> typeMap;
  private static Map<String, NamedAssertion> assertionMap;
  private static Map<String, Variable> ghostVariableMap;
  private static Map<String, UnitName> unitMap;
  private static Map<String, String> dataComponentMap;  //holds qualified name of data classifier (type or implementstion) matching the BLESS type

  public static void clearMaps()
    {
    typeMap = null;
    assertionMap = null;
    ghostVariableMap = null;
    unitMap = null;
    dataComponentMap = null;
    }

  public static void makeTypeMap()
    {
    typeMap = new HashMap<String, TypeDeclaration>();
    }

  public static void makeTypeMap(Iterable<TypeDeclaration> types)
    {
    typeMap = new HashMap<String, TypeDeclaration>();
    for (TypeDeclaration ty : types)
      typeMap.put(ty.getName(), ty);
    }

  public static void makeAssertionMap()
    {
    assertionMap = new HashMap<String, NamedAssertion>();
    }

  public static void makeGhostVariableMap()
    {
    ghostVariableMap = new HashMap<String, Variable>();
    }

  public static void makeUnitMap()
    {
    unitMap = new HashMap<String, UnitName>();
    }

  public static void makeDataComponentMap()
    {
    dataComponentMap = new HashMap<String, String>();
    }

  public static boolean typeMapIsNull()
    {
    return typeMap == null;
    }

  public static boolean assertionMapIsNull()
    {
    return assertionMap == null;
    }

  public static boolean ghostVariableMapIsNull()
    {
    return ghostVariableMap == null;
    }

  public static boolean unitMapIsNull()
    {
    return unitMap == null;
    }

  public static boolean dataComponentMapIsNull()
    {
    return dataComponentMap == null;
    }

  public static boolean typeMapContainsKey(String key)
    {
    if (typeMapIsNull()) makeTypeMap();
    return typeMap.containsKey(key);
    }

  public static TypeDeclaration typeMapGet(String key)
    {
    if (typeMapIsNull()) makeTypeMap();
    return typeMap.get(key);
    }

  public static boolean assertionMapContainsKey(String key)
    {
    if (assertionMapIsNull()) makeAssertionMap();
   return assertionMap.containsKey(key);
    }

  public static NamedAssertion assertionMapGet(String key)
    {
    if (assertionMapIsNull()) makeAssertionMap();
    return assertionMap.get(key);
    }

  public static boolean ghostVariableMapContainsKey(String key)
    {
    if (ghostVariableMapIsNull()) makeGhostVariableMap();
   return ghostVariableMap.containsKey(key);
    }

  public static Variable ghostVariableMapGet(String key)
    {
    if (ghostVariableMapIsNull()) makeGhostVariableMap();
    return ghostVariableMap.get(key);
    }

  public static boolean unitMapContainsKey(String key)
    {
    if (unitMapIsNull()) makeUnitMap();
    return unitMap.containsKey(key);
    }

  public static UnitName unitMapGet(String key)
    {
    if (unitMapIsNull()) makeUnitMap();
    return unitMap.get(key);
    }

  public static boolean dataComponentMapContainsKey(String key)
    {
    if (dataComponentMapIsNull()) makeDataComponentMap();
    return dataComponentMap.containsKey(key);
    }

  public static String dataComponentMapGet(String key)
    {
    if (dataComponentMapContainsKey(key))
      return dataComponentMap.get(key).replace(".", "_").replace("::", ".");
    else return "";
    }

  public static void unitMapPut(String key, UnitName un)
    {
    if (unitMapIsNull()) makeUnitMap();
    unitMap.put(key, un);
    }

  public static void typeMapPut(String key, TypeDeclaration td)
    {
    if (typeMapIsNull()) makeTypeMap();
    typeMap.put(key, td);
    }

  public static void assertionMapPut(String key, NamedAssertion na)
    {
    if (assertionMapIsNull()) makeAssertionMap();
    assertionMap.put(key, na);
    }

  public static void ghostVariableMapPut(String key, Variable v)
    {
    if (ghostVariableMapIsNull()) makeGhostVariableMap();
    ghostVariableMap.put(key, v);
    }

  public static void dataComponentMapPut(String key, String dc)
    {
    if (dataComponentMapIsNull()) makeDataComponentMap();
    if (!dataComponentMapContainsKey(key))
      dataComponentMap.put(key, dc);
    }

}
