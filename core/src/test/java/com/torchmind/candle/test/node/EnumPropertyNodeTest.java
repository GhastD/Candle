/*
 * Copyright 2015 Johannes Donath <johannesd@torchmind.com>
 * and other copyright owners as documented in the project's IP log.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.torchmind.candle.test.node;

import com.torchmind.candle.Candle;
import com.torchmind.candle.node.property.EnumPropertyNode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Provides test cases for {@link com.torchmind.candle.node.property.EnumPropertyNode}.
 * @author Johannes Donath
 */
@RunWith (MockitoJUnitRunner.class)
public class EnumPropertyNodeTest {
        @Mock
        private Candle candle;

        /**
         * Tests {@link com.torchmind.candle.node.property.EnumPropertyNode#value(Enum)} and {@link com.torchmind.candle.node.property.EnumPropertyNode#EnumPropertyNode(com.torchmind.candle.api.IDocumentNode, String, Enum)}.
         */
        @Test
        public void testConversion () {
                EnumPropertyNode node1 = new EnumPropertyNode (this.candle, "testProperty", "VALUE2");
                EnumPropertyNode node2 = new EnumPropertyNode (this.candle, "testProperty", TestEnum.VALUE2);

                Assert.assertEquals ("VALUE2", node1.value ());
                Assert.assertEquals (TestEnum.VALUE2, node1.value (TestEnum.class));

                Assert.assertEquals (TestEnum.VALUE2, node2.value (TestEnum.class));
                Assert.assertEquals ("VALUE2", node2.value ());
        }

        public enum TestEnum {
                VALUE1,
                VALUE2,
                VALUE3
        }
}
