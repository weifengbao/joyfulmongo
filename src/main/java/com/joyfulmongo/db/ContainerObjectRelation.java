/*
 * Copyright 2014 Weifeng Bao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
*/
package com.joyfulmongo.db;

import org.json.JSONObject;

import com.joyfulmongo.controller.JSONObjectSupport;

public class ContainerObjectRelation extends JSONObjectSupport implements
    ContainerObject
{
  private String key;
  
  public enum Props
  {
    className,
  }
  
  public ContainerObjectRelation(String classname)
  {
    super(new JSONObject());
    key = null;
    mObj.put(ContainerObjectFactory.TypeProps.__type.toString(),
        ContainerObjectFactory.TypeType.Relation.toString());
    mObj.put(Props.className.toString(), classname);
  }
  
  public ContainerObjectRelation(String key, JSONObject json)
  {
    super(json);
    this.key = key;
  }
  
  public String getClassname()
  {
    return mObj.getString(Props.className.toString());
  }
  
  @Override
  public void onCreate(String colname, JSONObject parseObject)
  {
  }
  
  @Override
  public void onUpdate(String colname, JSONObject parseObject)
  {
  }

  @Override
  public void onQuery(String collectionName, JSONObject parseObject)
  {    
  }
}
