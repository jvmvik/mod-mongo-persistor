package org.vertx.mods.tests;

/*
 * Copyright 2011-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.junit.Test;
import org.vertx.java.framework.TestBase;

/**
 *
 *
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
public class JavaScriptPersistorTest extends TestBase {

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    startApp("test_client.js");
  }

  @Override
  protected void tearDown() throws Exception {
    super.tearDown();
  }

  @Test
  public void testSave() throws Exception {
    startTest(getMethodName());
  }

  @Test
  public void testFind() throws Exception {
    startTest(getMethodName());
  }

  @Test
  public void testFindOne() throws Exception {
    startTest(getMethodName());
  }

  @Test
  public void testDelete() throws Exception {
    startTest(getMethodName());
  }

  @Test
  public void testFindWithLimit() throws Exception {
    startTest(getMethodName());
  }

  @Test
  public void testFindWithSkipAndLimit() throws Exception {
      startTest(getMethodName());
  }

  @Test
  public void testFindWithSort() throws Exception {
    startTest(getMethodName());
  }
  
  @Test
  public void testFindWithKeys() throws Exception {
    startTest(getMethodName());
  }

  @Test
  public void testFindBatched() throws Exception {
    startTest(getMethodName());
  }

  @Test
  public void testCount() throws Exception {
     startTest(getMethodName());
  }

}

