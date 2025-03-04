/*! ******************************************************************************
 *
 * Pentaho
 *
 * Copyright (C) 2024 by Hitachi Vantara, LLC : http://www.pentaho.com
 *
 * Use of this software is governed by the Business Source License included
 * in the LICENSE.TXT file.
 *
 * Change Date: 2029-07-20
 ******************************************************************************/


package org.pentaho.big.data.impl.cluster.tests.hdfs;

import org.junit.Before;
import org.junit.Test;
import org.pentaho.hadoop.shim.api.hdfs.HadoopFileSystemLocator;
import org.pentaho.runtime.test.TestMessageGetterFactory;
import org.pentaho.runtime.test.i18n.MessageGetter;
import org.pentaho.runtime.test.i18n.MessageGetterFactory;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by bryan on 8/24/15.
 */
public class ListHomeDirectoryTestTest {
  private MessageGetterFactory messageGetterFactory;
  private HadoopFileSystemLocator hadoopFileSystemLocator;
  private ListHomeDirectoryTest listHomeDirectoryTest;
  private MessageGetter messageGetter;

  @Before
  public void setup() {
    messageGetterFactory = new TestMessageGetterFactory();
    messageGetter = messageGetterFactory.create( ListHomeDirectoryTest.class );
    hadoopFileSystemLocator = mock( HadoopFileSystemLocator.class );
    listHomeDirectoryTest = new ListHomeDirectoryTest( messageGetterFactory, hadoopFileSystemLocator );
  }

  @Test
  public void testGetName() {
    assertEquals( messageGetter.getMessage( ListHomeDirectoryTest.LIST_HOME_DIRECTORY_TEST_NAME ),
      listHomeDirectoryTest.getName() );
  }
}
